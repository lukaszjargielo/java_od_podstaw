package com.example.basics.data.string_class;

public class Functions_isBlank_isEmpty {
    public static void main(String[] args) {

        {
            String str = "   ";
            System.out.println(str.length());
            System.out.println(str.isEmpty());
            System.out.println(str.isBlank());
        }
        {
            String str = "";
            System.out.println(str.length());
            System.out.println(str.isEmpty());
            System.out.println(str.isBlank());
        }
        {
            String str = " a";
            System.out.println(str.length());
            System.out.println(str.isEmpty());
            System.out.println(str.isBlank());
        }
        {
            String str = "\n";
            System.out.println(str.length());
            System.out.println(str.isEmpty());
            System.out.println(str.isBlank());
        }
        {
            String str = "a\t ";
            System.out.println(str.length());
            System.out.println(str.isEmpty());
            System.out.println(str.isBlank());
        }
        {
            String str = "  \t  \n  ";
            System.out.println(str.length());
            System.out.println(str.isEmpty());
            System.out.println(str.isBlank());
        }




    }
}
