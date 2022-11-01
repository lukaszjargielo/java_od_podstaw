package com.example.basics.data.types;

import java.util.Locale;

public class J09_string {
    public static void main(String[] args) {
        String s1 = "String #1";
        String s2 = new String("String #2");

        String s3 = s1 + s2;
        System.out.println(s3.toUpperCase());
        System.out.println(s3.length());

        String s4 = "wiersz #1 \n \t wiersz #2 \\ \" \u263a ";
        System.out.println(s4);
    }
}
