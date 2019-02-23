package com.zelda.malldemo.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Link
 * @Company http://www.zelda.com
 */
public class DateUtils {

    //日期转换为字符串
    public static String dateToString(Date date,String pattern){
        try {
            return new SimpleDateFormat(pattern).format(date);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    //字符串转换为date
    public static Date stringToDate(String date, String pattern){
        try {
            return new SimpleDateFormat(pattern).parse(date);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
