package com.example.basics.date;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalTime localTime2 = LocalTime.now();
        System.out.println(localTime2);
        System.out.println(localTime2.getHour());
        System.out.println(localTime2.getMinute());
        System.out.println(localTime2.getSecond());

        localTime2 = localTime2.plusHours(3);
        System.out.println(localTime2);

        localTime2 = localTime2.plusNanos(1);
        System.out.println(localTime2);
        System.out.println(localTime2.plusNanos(1));
        System.out.println(localTime2);

    }
}
