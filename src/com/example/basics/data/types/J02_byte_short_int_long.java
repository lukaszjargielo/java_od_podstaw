package com.example.basics.data.types;

public class J02_byte_short_int_long {
    public static void main(String[] args) {
        byte small = -128;
        short numShort = -32_768;
        int number = -2_147_483_648;
        long big = -9_223_372_036_854_775_808L;
        System.out.println("Najmniejsza liczba mo�liwa do zapisania w byte to " +
                 small + " a najwi�ksza to " + (-small-1));
        System.out.println("Najmniejsza liczba mo�liwa do zapisania w short to " +
                numShort + " a najwi�ksza to " + (-numShort-1));
        System.out.println("Najmniejsza liczba mo�liwa do zapisania w int to " +
                number + " a najwi�ksza to " + (-number-1));
        System.out.println("Najmniejsza liczba mo�liwa do zapisania w long to " +
                big + " a najwi�ksza to " + (-big-1));
    }
}
