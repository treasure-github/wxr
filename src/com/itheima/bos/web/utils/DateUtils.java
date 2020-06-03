package com.itheima.bos.web.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

    public static String  getLastMonth(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c = Calendar.getInstance();

        //过去一月
        c.setTime(new Date());
        c.add(Calendar.MONTH, -1);
        Date m = c.getTime();
        String mon = format.format(m);
        return mon;
    }
    public static String  getLastTenDay(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c = Calendar.getInstance();
        //过去一月
        c.setTime(new Date());
        c.add(Calendar.DATE,-10);
        Date m = c.getTime();
        String mon = format.format(m);
        return mon;
    }
    /**
     * 获得最近三个月的时间
     */
    public static String  getRecentThreeMonth(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c = Calendar.getInstance();
        //过去三个月
        c.setTime(new Date());
        c.add(Calendar.MONTH, -3);
        Date m = c.getTime();
        String mon = format.format(m);
        return mon;
    }
    /**
     * 获得最近半年的时间
     */
    public static String  getRecentSixMonth(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c = Calendar.getInstance();
        //过去三个月
        c.setTime(new Date());
        c.add(Calendar.MONTH, -6);
        Date m = c.getTime();
        String mon = format.format(m);
        return mon;
    }
    /**
     * 获得最近一年的时间
     */
    public static String  getRecentLastYear(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c = Calendar.getInstance();
        //过去三个月
        c.setTime(new Date());
        c.add(Calendar.MONTH, -12);
        Date m = c.getTime();
        String mon = format.format(m);
        return mon;
    }
    public static String  getCrudate(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c = Calendar.getInstance();
        Date m = c.getTime();
        String mon = format.format(m);
        return mon;
    }
/**
          * 根据年 月 获取对应的月份 天数
          */
    public static int getDaysByYearMonth(int year, int month) {
        Calendar a = Calendar.getInstance();
        a.set(Calendar.YEAR, year);
        a.set(Calendar.MONTH, month - 1);
        a.set(Calendar.DATE, 1);
        a.roll(Calendar.DATE, -1);
        int maxDate = a.get(Calendar.DATE);
        return maxDate;
    }

    /**
     * 获得当前月
     * @param
     */
    public static int getCurrMonth(){
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.MONTH)+1;
    }
    /**
     * 获得当前年
     * @param
     */
    public static int getCurrYear(){
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.YEAR);
    }

    /**
     * 获得当前月的第一天
     * @param
     */
    public static String getCurrMonthFirstDay(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        Calendar cale = Calendar.getInstance();
        cale.add(Calendar.MONTH, 0);
        cale.set(Calendar.DAY_OF_MONTH, 1);
        return  format.format(cale.getTime());
    }

    /**
     * 获得当前月的第一天
     * @param
     */
    public static String getCurrMonthLastDay(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd 23:59:59");
        Calendar cale = Calendar.getInstance();
        cale.add(Calendar.MONTH, 1);
        cale.set(Calendar.DAY_OF_MONTH, 0);
        return format.format(cale.getTime());
    }
    public static void main(String[] args) {
        System.out.println(getLastTenDay());

    }


}
