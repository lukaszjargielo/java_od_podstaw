package com.example.basics.data.string_class;

public class Functins_replaceAll_replaceFirst {
    public static void main(String[] args) {

        {
            String str = "FizzBuzz fizz buzz fizzbuzz";
            System.out.println(str.replaceAll("fizz","kiss"));
        }
        {
            String str = "FizzBuzz fizz buzz fizzbuzz";
            System.out.println(str.replaceFirst("fizz","kiss"));
        }
        {
            String str = "FizzBuzz fizz buzz fizzbuzz";
            System.out.println(str.replaceAll("F izz","kiss"));
        }
        {
            String str = "FizzBuzz fizz buzz fizzbuzz";
            System.out.println(str.replaceAll("lizz","kiss"));
        }
        {
            String str = "FizzBuzz  fizz  buzz  fizzbuzz";
            System.out.println(str.replaceAll(" ","_"));
        }
        {
            String str = "FizzBuzz  fizz  buzz  fizzbuzz";
            System.out.println(str.replace(" ","_"));
        }
        {
            String str = "FizzBuzz  fizz  buzz  fizzbuzz";
            System.out.println(str.replaceFirst(" ","_"));
        }
        {
            String str = "FizzBuzz  fizz  buzz  fizzbuzz";
            System.out.println(str.replace("z","s"));
        }
    }
}
