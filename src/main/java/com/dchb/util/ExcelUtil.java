package com.dchb.util;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Title: Excel工具类
 * @Description: Excel工具类
 * @param
 * @return
 * @author caichunde
 * @date 2018-09-29
 */
public class ExcelUtil {
    /**
     * @Title: 解析excel文件方法
     * @Description: 解析excel文件方法返回一个sheet
     * @param MultipartFile multipartFile
     * @return Sheet sheet
     * @author caichunde
     * @date 2018-09-29
     */
    public static Sheet parseExcel2Sheet(MultipartFile multipartFile) {
        //1.  使用HSSFWorkbook 打开或者创建 “Excel对象”
        //2.  用HSSFWorkbook返回对象或者创建sheet对象并返回
        Workbook workbook = null;
        String fileName = multipartFile.getOriginalFilename();//  获取文件名
        try {
            if (fileName.endsWith("XLS") || fileName.endsWith("xls")) {
                workbook = new HSSFWorkbook(multipartFile.getInputStream());//  2003版本
            }
            if (fileName.endsWith("XLSX") || fileName.endsWith("xlsx")) {
                workbook = new XSSFWorkbook(multipartFile.getInputStream());//  2007版本
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Sheet sheet = workbook.getSheet("sheet1");
        return sheet;
    }
    /**
     * @Title: 获取单元格值方法
     * @Description: 获取单元格值的方法
     * @param Cell cell
     * @return String string
     * @author caichunde
     * @date 2018-09-29
     */
    public static String getCellValue(Cell cell) {
        String value = "";
        if (cell != null) {
            switch (cell.getCellType()) {
                case HSSFCell.CELL_TYPE_NUMERIC:// 数字
                    value = cell.getNumericCellValue() + " ";
                    if (HSSFDateUtil.isCellDateFormatted(cell)) {
                        Date date = cell.getDateCellValue();
                        if (date != null) {
                            value = new SimpleDateFormat("yyyy-MM-dd").format(date); //  日期格式化
                        } else {
                            value = "";
                        }
                    } else {
                        //  解析cell时候 数字类型默认是double类型的 但是想要获取整数类型 需要格式化
                        value = new DecimalFormat("0").format(cell.getNumericCellValue());
                    }
                    break;
                case HSSFCell.CELL_TYPE_STRING: //  字符串
                    value = cell.getStringCellValue();
                    break;
                case HSSFCell.CELL_TYPE_BOOLEAN:   //  Boolean类型
                    value = cell.getBooleanCellValue() + "";
                    break;
                case HSSFCell.CELL_TYPE_BLANK:   // 空值
                    value = "";
                    break;
                case HSSFCell.CELL_TYPE_ERROR: // 错误类型
                    value = "非法字符";
                    break;
                default:
                    value = "未知类型";
                    break;
            }

        }
        return value.trim();
    }
}
