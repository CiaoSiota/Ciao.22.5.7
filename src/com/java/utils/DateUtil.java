package com.java.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public static Date strToDate(String dateStr) {

        Date parse = null;
        try {
            parse = sdf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parse;

    }


    public static String dateToString(Date bookDate) {

        return sdf.format(bookDate);
    }
}
