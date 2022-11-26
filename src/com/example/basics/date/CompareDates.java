package com.example.basics.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CompareDates {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2022, 11, 26);
        LocalDate date2 = LocalDate.of(2021, 12, 04);

        System.out.println(date1.isAfter(date2));
        System.out.println(date1.isBefore(date2));
        System.out.println(date1.isEqual(date2));
        System.out.println();

        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = LocalDateTime.of(2023,12,04,12,00,00);

        System.out.println(localDateTime1.isAfter(localDateTime2));
        System.out.println(localDateTime1.isBefore(localDateTime2));
        System.out.println(localDateTime1.isEqual(localDateTime2));


    }
}
