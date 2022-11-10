package com.example.basics.data.string_class;

public class Functions_indexOf {
    public static void main(String[] args) {

        {
            String str = "Somewhereinthistextwehavesecretpassword:aceofcodebase!";
            int passwordIndex = str.indexOf("password");
            System.out.println("Index of password in that huge word is:" + passwordIndex);
            String password = str.substring(passwordIndex);
            System.out.println("Secret password: '" + password + "' Don't show anybody!");
        }
        {
            String str = "FizzBuzz  fizz  buzz  fizzbuzz";
            System.out.println(str.indexOf("zz"));
        }
        {
            String str = "FizzBuzz  fizz  buzz  fizzbuzz";
            System.out.println(str.indexOf("zz",3));
            System.out.println(str.substring(6));
        }
    }
}
