package com.example.basics.data.string_class;

public class BlankStringAndNull {
    public static void main(String[] args) {

        String s1 = "";
        System.out.println(s1.length());
        s1 = s1.concat("Real content");
        System.out.println(s1.length());

        String s2 = null;
        System.out.println(s2);
        //System.out.println(s2.length()); //It causes error.

        s2 = "some words";
        System.out.println(s2);

        s2 = null;
// info for garbage collector - it free up memory occupied by variable
        //s2, because it is blank and useless
    }
}
