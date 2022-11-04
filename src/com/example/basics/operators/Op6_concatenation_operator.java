package com.example.basics.operators;

public class Op6_concatenation_operator {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = s1 + " IT World!";
        System.out.println(s2);
        int i = 1;
        String s3 = i + "";
        System.out.println(s3.length());
        String s4 = "" + i;
        System.out.println(s4.length());
        String s5 = 1 + "";
        System.out.println(s5.length());
        String s6 = "" + 1;
        System.out.println(s6.length());
        String s7 = "" + 1 + 2;
        System.out.println(s7);
        String s8 = 1 + 2 + "";
        System.out.println(s8);
    }
}
