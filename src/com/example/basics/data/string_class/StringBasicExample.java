package com.example.basics.data.string_class;

public class StringBasicExample {
    public static void main(String[] args) {

        String s1 = "Example";
        char c = 'c';
        String s2 = new String("String passed to constructor");
        String s3 = "Test".repeat(3);
        System.out.println(s3);
        String s4 = String.join(".","First","Two","3","4");
        System.out.println(s4);
        char arr[] = {'E','x','a','m','p','l','e'};
        String s5 = new String(arr);
        System.out.println(s5);
    }
}
