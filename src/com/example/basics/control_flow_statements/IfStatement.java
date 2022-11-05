package com.example.basics.control_flow_statements;

public class IfStatement {
    public static void main(String[] args) {

        int a = 1;
        if(a > 5) {
            System.out.println("a is greater than 5");
        } else if (a == 2) {
            System.out.println("a equals 2");
        } else {
            System.out.println("a equals " + a);
        }

        if (9 < 20)
            System.out.println("9 is less than 20");
        else
            System.out.println("9 is greater than 20");
    }
}
