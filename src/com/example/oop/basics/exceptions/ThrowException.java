package com.example.oop.basics.exceptions;

class TestException extends Exception {
    public TestException() {
        super("TestException happened.");
    }

    public TestException(String message) {
        super(message);
    }
}

public class ThrowException {
    public int divide(int number, int divisor) throws ArithmeticException {
        return number / divisor;
    }

    public int test(int number) throws TestException {
        if (1 == 1) throw new TestException();
        return 1;
    }

    public static void main(String[] args) {

        try {
            int numArr[] = {0, 1, 2, 3, 4, 5};
            int a = numArr[2];
            int divisor = numArr[0];

            if (divisor == 0) throw new ArithmeticException("Dividing by zero");
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("Program works after exception");
        System.out.println();
        System.out.println();

//        try {
//            int numArr[] = {0, 1, 2, 3, 4, 5};
//            int a = numArr[2];
//            int result = a / numArr[0]; //here we have got Arithmetic Exception occuration
//        } catch (ArrayIndexOutOfBoundsException e) { // here we catch another type of exception
//            e.printStackTrace(); // so our programm will stop working
//        }
//        System.out.println("Program works after exception");
        try {
            int numArr[] = {0, 1, 2, 3, 4, 5};
            int a = numArr[2];
            int result = a / numArr[0];
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("Program works after second exception");

        try {
            int numArr[] = {0, 1, 2, 3, 4, 5};
            int a = numArr[2];
            int result = a / numArr[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("Program works after third exception");

        try {
            int numArr[] = {0, 1, 2, 3, 4, 5};
            int a = numArr[12];
            int result = a / numArr[0];
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Program works after fourth exception");

        try {
            int numArr[] = {0, 1, 2, 3, 4, 5};
            int a = numArr[12];
            int result = a / numArr[0];
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("This finally clause will always be executed, " +
                    "regardless of the exception");
        }
        System.out.println("Program works after fifth exception");

        ThrowException throwException = new ThrowException();
        try {
            throwException.divide(10, 0);

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Program continues after probably the last one exception");

        try {
            throwException.test(2);
        } catch (TestException e) {
            e.printStackTrace();
        }

        System.out.println("Program continues after the last one exception");


    }


}

