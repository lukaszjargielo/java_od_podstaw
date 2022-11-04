package com.example.basics.operators;

public class Op5_logical_operator_or {
    public static void main(String[] args) {

        System.out.print( (10 > 5) + " || " + (10 == 10) + " = ");
        System.out.println( (10 > 5)  ||  (10 == 10) );
        System.out.print( (10 > 5) + " || " + (10 != 10) + " = ");
        System.out.println( (10 > 5)  ||  (10 == 10) );
        System.out.print( (10 < 5) + " || " + (10 == 10) + " = ");
        System.out.println( (10 < 5)  ||  (10 == 10));
        System.out.print( (10 < 5) + " || " + (10 != 10) + " = ");
        System.out.println( (10 < 5)  || (10 != 10));

    }
}
