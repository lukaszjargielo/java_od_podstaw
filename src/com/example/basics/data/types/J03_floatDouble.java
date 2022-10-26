package com.example.basics.data.types;

public class J03_floatDouble {
    public static void main(String[] args) {
        float number = 10.5f;
        double bigNumber = 23.546665d;
        System.out.println("Przyk³adowa liczba typu float:" + number);
        System.out.println("Przyk³adowa liczba typu double:" + bigNumber);
        float number1 = Float.MIN_VALUE;
        float number2 = Float.MAX_VALUE;
        System.out.println("Zakres typu float to:" + number1 + " do " + number2);
        double bigNumber1 = Double.MIN_VALUE;
        double bigNumber2 = Double.MAX_VALUE;
        System.out.println("Zakres typu double to:" + bigNumber1 + " do " + bigNumber2);
    }
}
