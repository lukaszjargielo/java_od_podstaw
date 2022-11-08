package com.example.basics.data.string_class;

public class Functions_length_toLowerCase_toUpperCase_charAt {
    public static void main(String[] args) {

        String str = "You got it!";
        System.out.println("Number of signs: " + str.length());

        char c = str.charAt(str.length()-1);
        System.out.println("Char at index 11: " + c);

        String strUp = str.toUpperCase();
        System.out.println(strUp);

        String strDown = str.toLowerCase();
        System.out.println(strDown);
    }
}
