package com.example.basics.data.string_class;

public class Functions_substring {
    public static void main(String[] args) {

        String str = "We are the champions!";

        String part1 = str.substring(7);
        System.out.println(part1);

        String part2 = str.substring(3,9);
        System.out.println(part2);
    }
}
