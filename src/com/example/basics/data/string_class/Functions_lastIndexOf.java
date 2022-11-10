package com.example.basics.data.string_class;

public class Functions_lastIndexOf {
    public static void main(String[] args) {

        {
            String str = "One two three four. One two";
            int index = str.lastIndexOf("two");
            System.out.println(index);
            System.out.println(str.substring(index));
        }
        {
            String str = "One two three four. One two";
            int index = str.indexOf("two");
            System.out.println(index);
            System.out.println(str.substring(index));
        }
    }
}
