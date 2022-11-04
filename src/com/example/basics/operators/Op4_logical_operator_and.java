package com.example.basics.operators;

public class Op4_logical_operator_and {
    public static void main(String[] args) {

        System.out.print( (5 < 10) + " && " + (20 >= 15) + " = ");
        System.out.println( (5 < 10)  &&   (20 >= 15));
        System.out.print( (5 < 10) + " && " + (20 == 11) + " = ");
        System.out.println( (5 < 10) && (20 == 11));
        System.out.print( (5 != 5) + " && " + (20 >= 11) + " = ");
        System.out.println( (5 != 5) && (20 >= 11));
        System.out.print( (5 != 5) + " && " + (20 <= 11) + " = ");
        System.out.print( (5 != 5) && (20 <= 11));

    }
}
