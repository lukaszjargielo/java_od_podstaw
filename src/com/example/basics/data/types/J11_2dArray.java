package com.example.basics.data.types;

public class J11_2dArray {
    public static void main(String[] args) {
        //kolumny                 1    2    3
        //index         `         0    1    2
        String strArr[][] = {   {"1", "2", "3"}, //wiersz 1 index 0
                                {"4", "5", "6"}};//wiersz 2 index 1
        System.out.println(strArr[0][1]);
        System.out.println(strArr[1][0]);

        // dwa wiersze po 3 kolumny

        int[][] numArr = new int[3][4];
        numArr[1][2] = 100;
        System.out.println();

        int numRows = 10;
        int numCols = 15;

        int[][] arr = new int[numRows][numCols];

    }
}
