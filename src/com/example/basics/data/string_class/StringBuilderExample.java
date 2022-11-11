package com.example.basics.data.string_class;

public class StringBuilderExample {
    public static void main(String[] args) {

        {
            String ex1 = "First String";
            StringBuilder builder = new StringBuilder();
            builder.append(ex1).append("Second String");
            System.out.println(builder);
            System.out.println(ex1 == builder.toString());
        }
        {
            StringBuilder builder = new StringBuilder("First String");
            builder.append("Second String");
            System.out.println(builder);
            System.out.println(builder.toString());
            String txt = builder.toString();
            System.out.println(txt.equals(builder));
        }
        {
            StringBuilder builder = new StringBuilder("First String");
            builder.insert(6,"Second ");
            System.out.println(builder);
        }
        {
            StringBuilder builder = new StringBuilder("First String");
            builder.insert(6,"Second ");
            builder.delete(6,13);
            System.out.println(builder);
        }
        {
            StringBuilder builder = new StringBuilder("First String");
            builder.replace(6,12,"Second ");
            System.out.println(builder);
        }
        {
            StringBuilder builder = new StringBuilder("First String. Second string. Third String");
            int index = builder.indexOf("string");
            System.out.println(builder.delete(index, builder.length()));
        }
        {
            StringBuilder builder = new StringBuilder("First String. Second string. Third String");
            int index = builder.lastIndexOf("String");
            System.out.println(builder.delete(index, builder.length()));
        }

    }
        }
