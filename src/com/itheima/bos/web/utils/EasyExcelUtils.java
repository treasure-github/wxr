package com.itheima.bos.web.utils;

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.itheima.bos.web.VO.TaoBaoVO;
import com.itheima.bos.web.pojo.DsTborder;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Test;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class EasyExcelUtils {

    public static List<Object> readExcel(InputStream inputStream,String type){
        try {
            // 解析每行结果在listener中处理
            ExcelListener listener = new ExcelListener();
            Object excelType = null;
            if ("xlsx".equals(type)) {
                excelType = ExcelTypeEnum.XLSX;
            }else{
               excelType =  ExcelTypeEnum.XLS;
            }
            ExcelReader excelReader = new ExcelReader(inputStream, ExcelTypeEnum.XLS,null, listener);
            excelReader.read(new Sheet(1, 1,TaoBaoVO.class));
            List<Object> datas = listener.getDatas();

            return datas;

        } catch (Exception e) {

        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Test
    public void test(){
        try {
            List<Object> xlsx = readExcel(new FileInputStream(new File("D:\\123.xls")), "xls");
            TaoBaoVO  taoBaoVO = (TaoBaoVO) xlsx.get(0);
            SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
            try {
                System.out.println(format.parse(""));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
