package com.example.basics.data;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime() + " miliseconds passed from 1 January 1970 00:00:00");
        Date date2 = new Date();


        SimpleDateFormat dataFormat = new SimpleDateFormat("HH:mm:ss dd.MM.YY");
        System.out.println("Actual date and time in changed format:");
        System.out.println(dataFormat.format(date));

        System.out.print("Day of year: ");
        SimpleDateFormat dataFormat2 = new SimpleDateFormat("D, EEEE dd.LL.YYYY G hh:mm:ss a zzzz ");
        System.out.println(dataFormat2.format(date2));

        SimpleDateFormat dataFormat3 = new SimpleDateFormat("u w W XXX ");
        System.out.println(dataFormat3.format(date2));
    }
}
