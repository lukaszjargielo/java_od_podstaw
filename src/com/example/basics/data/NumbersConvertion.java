package com.example.basics.data;

public class NumbersConvertion {
    public static void main(String[] args) {

        //classified conversion promoting int to double
        int i = 5;
        double d = 20.0 / i;
        System.out.println(d);

        double dd = 5.5;
        double scoreD = 10 * dd;
        System.out.println(scoreD);

        //evident conversion narrowing double down to int
        double b = 5.0;
        int j = 20 / (int)b;
        System.out.println(j);

        double bb = 5.5;
        int scoreB = 10 * (int)bb;
        System.out.println(scoreB);

        byte small = (byte)128;
        System.out.println("small after type casting is: " + small);

        Double d1 = Double.MAX_VALUE;
        System.out.println(d1 + "this is max double's value");
        Integer i1 = Integer.MAX_VALUE;
        System.out.println(i1 + "this is max integer's value");
        i1 = (int)Math.pow(2.0,63.0);
        System.out.println(i1);

        byte small2 = (byte)200; //casting
        System.out.println(small2 + " This value result from crossing" +
                " byte's range." + " The modulo division operation of 200 takes place. 200(value)%256(range) = 200-256 " +
                "equals -56");

        byte small3 = 127;
        System.out.println(small3);
        byte small4 = (byte)400; // 400%256 = 144%256 = 144-256 = -112
        System.out.println(small4);

        double buble = 100.11;
        int srint2 = (int)buble; //cutting of the number's fraction
        System.out.println(srint2);

        byte srajt;
        int srint = 257;
        double srable = 323.142;
        System.out.println("\nConvertion from int to byte");
        srajt = (byte)srint;
        System.out.println("int flint: " + srint + " and byte srajt saving the same number: " + srajt);

        System.out.println("\nConvertion from double to int");
        srint = (int)srable;
        System.out.println("double srable: " + srable + " and int srint saving the same number: " + srint);

        System.out.println("\nConertion from double to byte");
        srajt = (byte)srable;
        System.out.println("double srable: " + srable + " and byte srajt saving the same number: " + srajt);

        byte bajcik = 50;
        //bajcik = bajcik  * 2; // it causes error because byte value is automatically promote to int
        //clear version of expression above

        bajcik = (byte)(bajcik * 2);
        System.out.println("The value saved in byte variable " + bajcik);
        bajcik = 50;
        int intigerek = bajcik * 2;
        System.out.println("The same value saved in int variable without " +
                "visible conversion " + intigerek);

        byte bite = 42;
        char c = 'a';
        short szort = 1024;
        int ind = 50000;
        float flout = 5.67f;
        double doble = .1234;
        double result = (flout * bite) + (ind / c) - (doble * szort);
        System.out.println((flout * bite) + "+" + (ind / c) + "-" + (doble * szort));
        System.out.println("result equals: " + result);
    }
}
