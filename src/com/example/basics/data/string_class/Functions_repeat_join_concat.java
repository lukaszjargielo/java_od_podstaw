package com.example.basics.data.string_class;

public class Functions_repeat_join_concat {
    public static void main(String[] args) {

        {
            String str = "FizzBuzz";
            String result = str.repeat(2);
            System.out.println("result:" + result);
        }
        {
            String str = "FizzBuzz";
           String result = str.repeat(0);
            System.out.println("result:" + result);
        }
        {
            String str = "";
            String result = str.repeat(3);
            System.out.println("result:" + result);
        }
        {
            String str = "FizzBuzz";
            String result = str.join("-","FizzBuzz","FizzBuzz");
            System.out.println(result);
        }
        {
            String str = "FizzBuzz";
            String result = str.join("-","FizzBuzz",null);
            System.out.println(result);
        }
        {
            String str = "FizzBuzz";
            String result = str.join("-","FizzBuzz");
            System.out.println(result);
        }
        {
            String str = "FizzBuzz";
            String result = str.join("-","FizzBuzz","");
            System.out.println(result);
        }
        {
            String result = String.join("-","FizzBuzz","FizzBuzz");
            System.out.println(result);
        }
        {
            String result = String.join("-","FizzBuzz", null);
            System.out.println(result);
        }
        {
            String result = String.join("-","FizzBuzz");
            System.out.println(result);
        }
        {
            String result = String.join("-","FizzBuzz","");
            System.out.println(result);
        }
        {
          System.out.println(String.join("-","FizzBuzz","FizzBuzz"));
        }
        {
            String str = "FizzBuzz";
            String result = str.concat("FizzyBuzzy");
            System.out.println(result);
        }
        {
            String str = "FizzBuzz";
            String result = str.concat("FizzyBuzzy");
            System.out.println(result);
        }
        {
            String str = "FizzBuzz";
            String result = str.concat("FizzyBuzzy").concat("CocoLoco");
            System.out.println(result);
        }
        {
            String result = "word".concat("FizzyBuzzy");
            System.out.println(result);
        }
        {
            System.out.println("word".concat("FizzyBuzzy"));
        }
        {
            System.out.println("word".concat("FizzyBuzzy").concat("otherWord"));
        }

    }
}
