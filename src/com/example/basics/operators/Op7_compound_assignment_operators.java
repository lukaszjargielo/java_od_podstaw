package com.example.basics.operators;

public class Op7_compound_assignment_operators {
    public static void main(String[] args) {

        int a = 5;
        a += 10;
        System.out.println(a);
        a += a;
        System.out.println(a);
        a *= a;
        System.out.println(a);
        a %= 7;
        System.out.println(a + " because 7 time s 128 plus 4 equals 900  ");
    }
}
