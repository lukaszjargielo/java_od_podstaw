package com.example.basics.data.string_class;

public class Functions_startsWith_endsWith {
    public static void main(String[] args) {

        {
            String str = "We are the champions!";
            System.out.println(str.startsWith("We"));
        }
        {
            String str = "We are the champions!";
            System.out.println(str.startsWith("we"));
        }
        {
            String str = "We are the champions!";
            System.out.println(str.endsWith("!"));
        }
        {
            String str = "We are the champions!";
            System.out.println(str.startsWith("We",0));
        }
        {
            String str = "We are the champions!";
            System.out.println(str.startsWith("We",1));
        }
        {
            String str = "We are the cham(We)pions!";
            System.out.println(str.startsWith("We",16));
        }
    }
}
