package com.example;


public class References {

    public static void main(String[] args) {

    int m = 5, n = 6;

        System.out.println("m: " + m + " n: " + n);
        zamiana(m, n);
        System.out.println("m: " + m + " n: " + n);
        int a = m, b = n;
        System.out.println("m: " + m + " n: " + n);
        int c = a;
        a = b;
        b = c;
        System.out.println("m: " + m + " n: " + n);


    }

    private static void zamiana(int a, int b) {
        int c = a;
        a = b;
        b = c;
    }
}