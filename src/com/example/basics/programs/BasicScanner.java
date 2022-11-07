package com.example.basics.programs;

import java.util.Scanner;

public class BasicScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write your name:");
        String name = scanner.nextLine();
        System.out.println("Your name is: " + name);
    }
}
