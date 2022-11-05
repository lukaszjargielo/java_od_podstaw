package com.example.basics.control_flow_statements;

public class CodeBlock {
    public static void main(String[] args) {

        int b = 12;
        int num = 100;

        if (5 < 10) {
//            long num = 1000; // conflict of variable names, another types
            //don't matter
            int a = 5;
            System.out.println("a: " + a);
            System.out.println("Variable b before block: " + b );
//            System.out.println(c); // Instruction doesn't now anything about c,
            // because the block was ended.
        }
        int c = 5;
        int a = 8; // variable with the same name behind the block
        //doesn't cause error

        {
            int  outerVar = 10;
            {
                int innerVar = 20;
                {
                    System.out.println("outerVar: " + outerVar);
                    System.out.println("innerVar: " + innerVar);
                    System.out.println("c out of block: " + c);
                }
            }
        }
    }
}
