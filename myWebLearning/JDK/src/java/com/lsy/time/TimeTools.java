package com.lsy.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeTools {

    private static final String DATE_FORMAT ="yyyy-MM-dd";

    public static void main(String[] args) {
//        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
//        System.out.println(sdf.format(date));
//
//        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar.getTime());
//        System.out.println(sdf.format(calendar.getTime()));
//        System.out.println();
//
//        calendar.add(Calendar.DAY_OF_MONTH,1);
//        System.out.println(calendar.getTime());
//        System.out.println(sdf.format(calendar.getTime()));
//        System.out.println();
//
//        calendar.add(Calendar.DAY_OF_MONTH,30);
//        System.out.println(calendar.getTime());
//        System.out.println(sdf.format(calendar.getTime()));
//        System.out.println();

        Calendar calendar1 = Calendar.getInstance();
        Date date1 = calendar1.getTime();
        calendar1.add(Calendar.DAY_OF_MONTH,5);
        System.out.println(sdf.format(calendar1.getTime()));
        Date date2 = calendar1.getTime();


        System.out.println(date1+"   "+date2);
        System.out.println(date1.compareTo(date2));//-1
        System.out.println(date1.compareTo(date1));//0
        System.out.println(date2.compareTo(date1));//1
    }

}
