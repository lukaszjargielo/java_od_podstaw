package com.example.basics.control_flow_statements;

public class ForEach {
    public static void main(String[] args) {

        String strArr[] = {"Ola", "Adam", "Kasia", "Natalia"};

        for (String str: strArr) {
            if (str.equalsIgnoreCase("Kasia")) {
                continue;
            }
            System.out.println(str);

        }
    }
}
