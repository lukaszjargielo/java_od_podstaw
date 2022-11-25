package com.example.basics.date;

import java.util.Calendar;
import java.util.Date;

public class DateInFutureAndPast {
    public static void main(String[] args) {

        Date dateNow = new Date();
        System.out.println(dateNow);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateNow);
        System.out.println(calendar);

        calendar.add(Calendar.MONDAY, 2);
        calendar.add(Calendar.YEAR, 1);
        calendar.add(Calendar.DAY_OF_MONTH,2);
        calendar.add(Calendar.HOUR, 1);
        calendar.add(Calendar.MINUTE, 1);
        calendar.add(Calendar.SECOND,30);

        Date dateInFuture = calendar.getTime();
        System.out.println(dateInFuture);

        calendar.setTime(dateNow);

        calendar.add(Calendar.MONDAY, -2);
        calendar.add(Calendar.YEAR, -1);
        calendar.add(Calendar.DAY_OF_MONTH,-2);
        calendar.add(Calendar.HOUR, -1);
        calendar.add(Calendar.MINUTE, -1);
        calendar.add(Calendar.SECOND,-30);

        Date dateInPast = calendar.getTime();
        System.out.println(dateInPast);

    }
}
