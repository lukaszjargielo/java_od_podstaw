package com.example.basics.control_flow_statements;

public class InfiniteLoop {
    public static void main(String[] args) {
        for (;;) {
            int random = (int)Math.round(20 * Math.random());
            System.out.println("random: " + random);

            if(random == 1 || random == 2) {
                System.out.println("Exit from the infinite for loop " + random);
                break;
            }
        }
        System.out.println();
        while(true) {
            int random = (int)Math.round(10 * Math.random());
            System.out.println(random);

            if (random == 10) {
                System.out.println("Exit from the infinite while loop " + random);
                break;
            }
        }
    }
}
