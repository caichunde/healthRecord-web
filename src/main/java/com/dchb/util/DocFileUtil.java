package com.dchb.util;

import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class DocFileUtil {
    /**
     * @param
     * @return ReturnMsg
     * *@Description: 保存上传文件
     * @author caichunde
     * @date 2018-11-21
     */
    public static Map<String, String> batchUploadFiles(MultipartFile[] files, String filePath) {
        Map<String, String> resMap = new HashMap();
        String fileNames = "", msg = "";
        if (!StringUtils.isEmpty(files)) {
            try {
                fileNames = saveUploadedFiles(Arrays.asList(files), filePath);
            } catch (Exception e) {
                msg = e.getMessage();
            }
        }
        resMap.put("fileNames", fileNames);
        resMap.put("msg", msg);
        return resMap;
    }

    /**
     * @param
     * @return ReturnMsg
     * @Description: 保存上传文件
     * @author caichunde
     * @date 2018-11-21
     */

    private static String saveUploadedFiles(List<MultipartFile> files, String filePath) throws Exception {
        String fileNames = "";
        for (MultipartFile file : files) {
            if (file.isEmpty()) {
                continue;
            }
            byte[] bytes = file.getBytes();
            String fileName = file.getOriginalFilename();
            String wjmc = fileName.substring(0, fileName.lastIndexOf("."));
            String wjgs = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
            String uuid = UUID.randomUUID().toString().replace("-", "");
            Path path = Paths.get(filePath + wjmc + "_" + uuid + "." + wjgs);  //保存上传文件的访问路径
            Files.write(path, bytes);
            fileNames += "," + wjmc + "_" + uuid + "." + wjgs;
        }
        if (!StringUtils.isEmpty(fileNames)) {
            fileNames = fileNames.substring(1, fileNames.length() - 1);
        }
        return fileNames;
    }

    /**
     * 将服务器中的文件下载到本地
     *
     * @author caichunde
     * @date 创建时间 2018-11-26
     * @since V1.0
     */
    public static void writeFileToResponse(String filepath, String filename,
                                           HttpServletResponse response) throws Exception {
        FileInputStream inputstream = null;
        File file = new File(filepath);
        try {
            inputstream = new FileInputStream(file);
            DocFileUtil.writeStreamToResponse(inputstream, filename, response);
        } catch (IOException e) {
            throw new Exception("文件读取异常：" + e.getMessage());
        } finally {
            try {
                if (inputstream != null) {
                    inputstream.close();
                }
            } catch (Exception e) {
                throw new Exception("文件读取异常，可能是文件损坏或不存在!错误信息为："
                        + e.getMessage());
            }
        }
    }

    /**
     * 将inputString输出到response中
     *
     * @return
     * @author caichunde
     * @date 创建时间 2018-11-26
     * @since V1.0
     */
    public static void writeStreamToResponse(InputStream inputstream,
                                             String filename, HttpServletResponse response) throws Exception {
        OutputStream outputstream = null; // 下载流
        try {
            filename = URLEncoder.encode(filename, "UTF-8");
            response.reset();
            response.setContentType("application/x-download");
            response.addHeader("Content-Disposition", "attachment;filename="
                    + filename);
            outputstream = response.getOutputStream(); // 得到向客户端输出二进制数据的对象

            byte[] byteValue = new byte[1024];
            int tempValue = 0;
            while ((tempValue = inputstream.read(byteValue)) > 0) {
                outputstream.write(byteValue, 0, tempValue);
            }
            outputstream.flush();
        } catch (IOException e) {
            throw new Exception("文件读取异常：" + e.getMessage());
        } finally {
            try {
                if (outputstream != null) {
                    outputstream.close();
                }
            } catch (Exception e) {
                throw new Exception("输出流存在异常，可能是文件损坏或不存在!错误信息为："
                        + e.getMessage());
            }
        }
    }

    /**
     * 删除单个文件
     *
     * @param sPath 被删除文件的文件名
     * @return 单个文件删除成功返回true，否则返回false
     * @author caichunde
     * @date 创建时间 2018年11月26日
     * @since V1.0
     */
    public static boolean deleteFile(String sPath) throws Exception {
        if (StringUtils.isEmpty(sPath)) {
            throw new Exception("文件路径为空");
        }
        boolean flag = false;
        File file = new File(sPath);
        // 路径为文件且不为空则进行删除
        if (file.isFile() && file.exists()) {
            file.delete();
            flag = true;
        }
        return flag;
    }

    /**
     * 根据wjid下载文件
     *
     * @author caichunde
     * @date 创建时间 2018-11-26
     * @since V1.0
     */
    public static void downloadFile(HttpServletResponse response, String path, String wjmc) throws Exception {
        DocFileUtil.writeFileToResponse(path, wjmc, response);
    }

    /**
     * 创建目录
     *
     * @author yjc
     * @date 创建时间 2017-6-8
     * @since V1.0
     */
    public static void createPath(String path) {
        File pathFile = new File(path);
        if (!pathFile.exists()) {
            pathFile.mkdirs();
        }
    }
}
