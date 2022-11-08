package com.example.basics.data.string_class;

public class StringsComparison {
    public static void main(String[] args) {

        String str = "Word";
        String txt = "Word";
        System.out.println(str == txt);
        //We get a false positive, because of StringPool and Java
        //code optimization. We compare object's adress in memory.
        //It's the same, because contents is the same and Java doesn't
        //create separate objects. Both variables have got shared object.

        String s1 = "Word";
        String s2 = "Wo";
        String s3 = s2 + "rd";
        System.out.println(s1 == s2);
        //We get false negative, because of concatenation operator
        //which forces creation of new String, so adresses in memory
        //are different.

        System.out.println(s1.equals(s3));
        System.out.println(str.equals(txt));
        System.out.println(str.equalsIgnoreCase(txt));
        //This is the correct value and method which compare contents
        //of both objects.

        String strSmall = "small String";
        String strBig = "SMALL String";
        System.out.println(strBig.equals(strSmall));
        System.out.println(strBig.equalsIgnoreCase(strSmall));

    }
}
