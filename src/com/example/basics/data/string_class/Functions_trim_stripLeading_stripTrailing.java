package com.example.basics.data.string_class;

public class Functions_trim_stripLeading_stripTrailing {
    public static void main(String[] args) {

        {
            String str = "\" \t \n Hi IT World!  \t \n               \"";
            System.out.println(str);
            String str2 = str.trim();
            System.out.println(str2);
        }

        {
            String str = " \t \n Hi IT World!  \t \n               ";
            System.out.println("\"" + str + "\"");
            String str2 = str.trim();
            System.out.println("\"" + str2 + "\"");

        }

        {
            String str = " \t \n Hi IT World!  \t \n               ";
            System.out.println("\"" + str + "\"");
            String str2 = str.stripLeading();
            System.out.println("\"" + str2 + "\"");

        }

        {
            String str = " \t \n Hi IT World!  \t \n               ";
            System.out.println("\"" + str + "\"");
            String str2 = str.stripTrailing();
            System.out.println("\"" + str2 + "\"");

        }



    }
}
