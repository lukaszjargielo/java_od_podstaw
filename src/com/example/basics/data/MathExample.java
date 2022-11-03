package com.example.basics.data;
import java.lang.*;

public class MathExample {
    public static void main(String[] args) {

        double d = 16.0;
        int i = 5;
        double sqrt = Math.sqrt(d);
        System.out.println("The square root of 16 is: " + sqrt);

        double power = Math.pow(d, 2);
        System.out.println("d squared is: " + power);

        double b = d / i;
        System.out.println(b);
        int j = (int)d / i;
        System.out.println(j);


    }
}
