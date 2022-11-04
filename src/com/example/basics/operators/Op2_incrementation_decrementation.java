package com.example.basics.operators;

public class Op2_incrementation_decrementation {
    public static void main(String[] args) {
        int a = 10;
        a++;
        System.out.println("a++:" + a);

        --a;
        System.out.println("--a:" + a);

        int b = 5;
        int c = 10 + b++;
        System.out.println("c:" + c + " b:" + b);

        int d = 5;
        int e = 10 + ++d;
        System.out.println("e:" + e + " d:" + d );

        int f = 5;
        int g = 5;
        System.out.println("++f:" + ++f + " g++:" + g++ );

    }
}
