package com.example.basics.control_flow_statements;

public class WhileLoop {
    public static void main(String[] args) {

        int i = 5;

        while (i > 0) {
            System.out.println(i);
            i--;
        }

        i = 0;
        System.out.println();

        while (i < 6) {
            System.out.println(i);
            i++;
        }
    }
}
