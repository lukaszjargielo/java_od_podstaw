package com.example.basics.date;


import java.util.Date;

public class PrintfExample {
    public static void main(String[] args) {

        System.out.printf("%b %f %n %d %s %n", false, 11.8, 18, "Janusz");
        System.out.printf("%tc %f %d %n", new Date(), 11.8f, 18);
        System.out.printf("Hello %s %2$tY.%2$td.%2$tm ", "World", new Date());
        String str = String.format("%n %1$tT", new Date());
        System.out.println(str);

        str = String.format("%n %1$tH-%1$tM-%1$tS", new Date());
        System.out.println(str);
    }
}
