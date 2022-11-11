package com.example.basics.data.string_class;

public class Functions_toCharArray_split_toString {
    public static void main(String[] args) {

        {
            String s = "Table";
            char arr[] = s.toCharArray();
            System.out.println(arr.length);
            System.out.println(arr[0]);
        }
        {
            String s = "Table chair bench footrest";
            String arr[] = s.split(" ");
            System.out.println(arr.length);
            System.out.println(arr[0]);
            System.out.println(arr.toString());
        }
        Integer i = new Integer(123);
        System.out.println(i.toString());

        String text = "Number " + i;
        System.out.println(text);

    }
}
