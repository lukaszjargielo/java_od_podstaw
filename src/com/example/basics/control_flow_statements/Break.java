package com.example.basics.control_flow_statements;

public class Break {
    public static void main(String[] args) {

        for(int i=0; i < 20; i++) {
            System.out.println(i);

            if (i > 5) break;
        }
        System.out.println("Code behind the loop, after break");

        int a = 10;
        while (a > 0) {
            System.out.println(a);
            a--;
            if (a == 5) break;
        }
        System.out.println("Code behind the loop, after break");
 
    }
}
