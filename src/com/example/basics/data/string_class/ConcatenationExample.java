package com.example.basics.data.string_class;

public class ConcatenationExample {
    public static void main(String[] args) {

        String s1 = "1967";
        String s2 = " Mustang ";
        String s3 = s1 + s2 + " - the great car! ";
        System.out.println(s3);

        int i = 1967;
        String s4 = i + s2;
        System.out.println(s4);

        String s5 = s1.concat(s2);
        System.out.println(s5);

        String s6 = s2.concat(
                Integer.toString(i));
        System.out.println(s6);
    }
}
