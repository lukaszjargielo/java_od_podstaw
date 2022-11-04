package com.example.basics.data;

public class MathRoundCeilFloor {
    public static void main(String[] args) {

        System.out.println(Math.round(5.51));
        System.out.println(Math.round(5.49));

        System.out.println("\n" + (int)5.45);

        System.out.println("\n" + Math.ceil(5.51));
        System.out.println(Math.ceil(5.11));
        System.out.println(Math.ceil(5.81));

        System.out.println("\n" + Math.floor(5.81));
        System.out.println(Math.floor(5.51));
        System.out.println(Math.floor(5.11));
    }
}
