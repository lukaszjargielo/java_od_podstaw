package com.example.basics.programs;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double startCapital = 0.0;
        double yearlyInterest = 0.0;
        int numYears = 0;

        double finalCapital;

        System.out.println("Enter the amount of start capital: " );
             //startCapital =  Double.valueOf(scanner.nextLine()).doubleValue();
              startCapital = scanner.nextDouble();
        System.out.println("Enter yearly interest in format [5% -> 5]: ");
           // yearlyInterest = Double.valueOf(scanner.nextLine()).doubleValue();
            yearlyInterest = scanner.nextDouble();
        System.out.println("Enter number of investment years ");
            numYears = scanner.nextInt();

            finalCapital = startCapital * Math.pow((1 + (yearlyInterest) / 100.0), numYears);

        System.out.println("After " + numYears + " years of saving "
                + startCapital + "$ with compound interest in the amount of "
                + yearlyInterest + "% \nyou got " + Math.round(finalCapital) + "$" );
    }
}
