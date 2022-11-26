package com.example.basics.date;

import java.util.Date;

public class TimeCode {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date.getTime());
        long start = System.currentTimeMillis();
        System.out.println(start);

    }
}
