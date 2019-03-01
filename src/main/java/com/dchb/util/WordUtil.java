package com.dchb.util;

import com.artofsolving.jodconverter.DocumentConverter;
import com.artofsolving.jodconverter.openoffice.connection.OpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.connection.SocketOpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.converter.StreamOpenOfficeDocumentConverter;
import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.ComThread;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.hwpf.usermodel.Range;
import org.artofsolving.jodconverter.OfficeDocumentConverter;
import org.artofsolving.jodconverter.office.DefaultOfficeManagerConfiguration;
import org.artofsolving.jodconverter.office.OfficeManager;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordUtil {
    /**
     * word转图片
     * wordFile word文件保存路径、pdfFile pdf文件保存路径、templetPath 模板路径，map替换数据
     *
     * @throws
     * @author caichunde
     * @date 2018年12月18日
     */
    public static void wordToImg(HttpServletResponse response, String wordFile, String pdfFile, String templetPath, String imgFormat, Map<String, Object> map) throws Exception {
        WordUtil.replaceDoc(wordFile, templetPath, map);
        //word转成pdf和图片
        wordToPdfOpenOffice(wordFile, pdfFile);
        PDFToImg(response, pdfFile, wordFile, imgFormat);
    }

    /**
     * 读取word模板并替换变量
     *
     * @param templatePath 模板路径
     * @param contentMap   要替换的内容
     * @return word的Document
     * @date 2018年12月18日
     * @author caichunde
     */
    private static void replaceDoc(String wordFile, String templatePath, Map<String, Object> contentMap) throws Exception {
        // 源文件目录
        File inputFile = new File(templatePath);
        if (!inputFile.exists()) {
            throw new Exception("模板不存在！");
        }
        FileOutputStream outputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        FileInputStream tempFileInputStream = null;
        HWPFDocument document = null;
        try {
            // 读取模板
            tempFileInputStream = new FileInputStream(inputFile);
            document = new HWPFDocument(tempFileInputStream);
            // 读取文本内容
            Range bodyRange = document.getRange();
            // 替换内容
            replaceText(inputFile, contentMap, bodyRange);
            // 写出
            byteArrayOutputStream = new ByteArrayOutputStream();
            document.write(byteArrayOutputStream);
            outputStream = new FileOutputStream(wordFile);
            outputStream.write(byteArrayOutputStream.toByteArray());
            // 关闭
            tempFileInputStream.close();
            document.close();
            outputStream.flush();
            outputStream.close();
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                tempFileInputStream.close();
                document.close();
                outputStream.flush();
                outputStream.close();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 解析所有的key值字符串--循环替换内容
     * inputFile 需要处理的word文件， contentMap替换的数据， word文件文本内容
     *
     * @throws
     * @author caichunde
     * @date 2018年12月18日
     */
    private static void replaceText(File inputFile, Map<String, Object> contentMap, Range range) throws IOException {
        InputStream is = new FileInputStream(inputFile);
        WordExtractor ex = new WordExtractor(is);
        String buffer = ex.getText();
        Pattern pattern = Pattern.compile("@\\{(.+?)\\}");
        Matcher matcher = pattern.matcher(buffer);
        HashMap<String, Object> map = new HashMap();// 将key值解析出来-并去除重复
        while (matcher.find()) {
            String key = matcher.group();
            map.put(key, null);
        }
        // 替换内容
        Object[] keyArr = map.keySet().toArray();
        for (int j = 0, m = keyArr.length; j < m; j++) {
            String one_key = (String) keyArr[j];
            String key = one_key.substring(2, one_key.length() - 1);
            if (contentMap.containsKey(key)) {
                range.replaceText("@{" + key + "}", contentMap.get(key).toString());
            } else {
                range.replaceText("@{" + key + "}", "");
            }
        }
        is.close();
        ex.close();
    }

    /**
     * word 转成pdf
     * 通过工具Microsoft Office Word 2010
     * 需要在C:\Windows\System32目录放入jacob-1.14.3-x64.dll文件
     *
     * @throws
     * @author caichunde
     * @date 2018年12月18日
     */
    public static void wordToPdfOffice(String docfile, String pdffile) {
        // 启动word应用程序(Microsoft Office Word 2010)
        ActiveXComponent app = null;
        try {
            ComThread.InitSTA(true);
            app = new ActiveXComponent("Word.Application");
            app.setProperty("Visible", false);
            System.out.println("*****正在转换...*****");
            Dispatch docs = app.getProperty("Documents").toDispatch();
            // 打开要转换的word文件
            DocFileUtil.deleteFile(pdffile);
            Dispatch doc = Dispatch.call(
                    docs,
                    "Open",
                    docfile,
                    false,
                    true).toDispatch();
            // 调用Document对象的saveAs方法,将文档保存为pdf格式
            Dispatch.call(doc, "ExportAsFixedFormat", pdffile, 17);
            // 关闭word文件
            Dispatch.call(doc, "Close", false);
        } catch (Exception e) {
            ComThread.Release();
            e.printStackTrace();
        } finally {
            //关闭word应用程序
            app.invoke("Quit", new Variant[]{});
            ComThread.Release();
        }
        System.out.println("*****转换完毕********");
    }

    /**
     * PDF转图片 根据页码一页一页转
     *
     * @throws IOException imgType:转换后的图片类型 jpg,png
     * @author caichunde
     * @date 2018年12月18日
     */
    public static void PDFToImg(HttpServletResponse response, String fileUrl, String docfile, String imgFormat) throws
            IOException {
        PDDocument pdDocument = null;
        FileInputStream inputStream = null;
        // dpi越大转换后越清晰，相对转换速度越慢
        int dpi = 200;
        try {
            File file = new File(fileUrl);
            inputStream = new FileInputStream(file);
            pdDocument = PDDocument.load(inputStream);
            PDFRenderer renderer = new PDFRenderer(pdDocument);
            int pages = pdDocument.getNumberOfPages();
            BufferedImage[] images = new BufferedImage[pages];
            for (int page = 0; page < pages; page++) {
                BufferedImage image = renderer.renderImageWithDPI(page, dpi);
                images[page] = image;
            }
            BufferedImage bufferedImage = mergeImage(false, images);
            writeImgToPage(bufferedImage, imgFormat, response);
            inputStream.close();
            pdDocument.close();
            DocFileUtil.deleteFile(docfile);// 删除临时doc文件
            DocFileUtil.deleteFile(fileUrl);// 删除临时文件
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            inputStream.close();
            pdDocument.close();
            if (pdDocument != null) {
                pdDocument.close();
            }
        }
    }

    /**
     * 写出图片到前台页面
     *
     * @return
     * @throws IOException
     * @author caichunde
     * @date 2018年12月21日
     */
    public static void writeImgToPage(BufferedImage image, String imgFormat, HttpServletResponse response) throws
            IOException {
        ImageIO.write(image, imgFormat, response.getOutputStream());
    }

    /**
     * 写出图片到服务器
     *
     * @return
     * @throws IOException
     * @author caichunde
     * @date 2018年12月21日
     */
    public static void writeImgToServer(BufferedImage image, String imgFormat, String path) throws Exception {
        DocFileUtil.deleteFile(path);
        File file = new File(path);
        ImageIO.write(image, imgFormat, file);
    }

    /**
     * word 转成pdf
     * 通过工具OpenOffice
     *
     * @throws
     * @author caichunde
     * @date 2018年12月18日
     */
    public static void wordToPdfOpenOffice(String startFile, String overFile){
        // 源文件目录
        File inputFile = new File(startFile);
        if (!inputFile.exists()) {
            System.out.println("源文件不存在！");
            return;
        }
        // 输出文件目录
        File outputFile = new File(overFile);
        if (!outputFile.getParentFile().exists()) {
            outputFile.getParentFile().exists();
        }
        // 调用openoffice服务线程
        OpenOfficeConnection connection = new SocketOpenOfficeConnection("10.10.2.131", 8100);
        try {
            connection.connect();
            // 转换
            DocumentConverter converter = new StreamOpenOfficeDocumentConverter(connection);
            converter.convert(inputFile, outputFile);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭连接
            connection.disconnect();
        }

    }

    /**
     * 合并任数量的图片成一张图片
     *
     * @param isHorizontal true代表水平合并，fasle代表垂直合并
     * @param imgs         待合并的图片数组
     * @return BufferedImage
     * @throws IOException
     * @author caichunde
     * @date 2018年12月21日
     */
    public static BufferedImage mergeImage(boolean isHorizontal, BufferedImage... imgs) throws IOException {
        // 生成新图片
        BufferedImage newImage = null;
        // 计算新图片的长和高
        int allw = 0, allh = 0, allwMax = 0, allhMax = 0;
        // 获取总长、总宽、最长、最宽
        for (int i = 0; i < imgs.length; i++) {
            BufferedImage img = imgs[i];
            allw += img.getWidth();
            allh += img.getHeight();
            if (img.getWidth() > allwMax) {
                allwMax = img.getWidth();
            }
            if (img.getHeight() > allhMax) {
                allhMax = img.getHeight();
            }
        }
        // 创建新图片
        if (isHorizontal) {
            newImage = new BufferedImage(allw, allhMax, BufferedImage.TYPE_INT_RGB);
        } else {
            newImage = new BufferedImage(allwMax, allh, BufferedImage.TYPE_INT_RGB);
        }
        // 合并所有子图片到新图片
        int wx = 0, wy = 0;
        for (int i = 0; i < imgs.length; i++) {
            BufferedImage img = imgs[i];
            int w1 = img.getWidth();
            int h1 = img.getHeight();
            // 从图片中读取RGB
            int[] ImageArrayOne = new int[w1 * h1];
            ImageArrayOne = img.getRGB(0, 0, w1, h1, ImageArrayOne, 0, w1); // 逐行扫描图像中各个像素的RGB到数组中
            if (isHorizontal) { // 水平方向合并
                newImage.setRGB(wx, 0, w1, h1, ImageArrayOne, 0, w1); // 设置上半部分或左半部分的RGB
            } else { // 垂直方向合并
                newImage.setRGB(0, wy, w1, h1, ImageArrayOne, 0, w1); // 设置上半部分或左半部分的RGB
            }
            wx += w1;
            wy += h1;
        }
        return newImage;
    }

    /**
     * 转换libreoffice支持的文件为pdf
     *
     * @param startFile
     * @param overFile
     */
    public static void libreOfficeToPDF(String startFile, String overFile) {
        // String libreOffice_HOME = "C:\\Program Files\\LibreOffice";
        String libreOffice_HOME = "/opt/libreoffice6.1";
        // 源文件目录
        File inputFile = new File(startFile);
        // 输出文件目录
        File outputFile = new File(overFile);
        DefaultOfficeManagerConfiguration configuration = new DefaultOfficeManagerConfiguration();
        // libreOffice的安装目录
        configuration.setOfficeHome(new File(libreOffice_HOME));
        // 端口号
        configuration.setPortNumber(8100);
        configuration.setTaskExecutionTimeout(1000 * 60 * 25L);
        // 设置任务执行超时为10分钟
        configuration.setTaskQueueTimeout(1000 * 60 * 60 * 24L);
        // 设置任务队列超时为24小时
        OfficeManager officeManager = configuration.buildOfficeManager();
        officeManager.start();
        OfficeDocumentConverter converter = new OfficeDocumentConverter(officeManager);
        converter.getFormatRegistry();
        try {
            converter.convert(inputFile, outputFile);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            officeManager.stop();
        }
    }

    /**
     * word转图片
     * wordFile word文件保存路径、pdfFile pdf文件保存路径、templetPath 模板路径，map替换数据
     *
     * @throws
     * @author caichunde
     * @date 2018年12月18日
     */
    public static void wordToImg2(HttpServletResponse response, String wordFile, String pdfFile, String templetPath, String imgFormat, Map<String, Object> map) throws Exception {
        WordUtil.replaceDoc(wordFile, templetPath, map);
        //word转成pdf和图片
        libreOfficeToPDF(wordFile, pdfFile);
        PDFToImg(response, pdfFile, wordFile, imgFormat);
    }
}
