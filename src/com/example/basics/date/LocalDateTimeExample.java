package com.example.basics.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String str = dateTimeFormatter.format(localDateTime);
        System.out.println(str);

        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getHour());
        localDateTime =  localDateTime.plusHours(1);
        String str2 = dateTimeFormatter.format(localDateTime);
        System.out.println(str2);
    }
}
