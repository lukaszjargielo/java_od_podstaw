package com.example.basics.data.types;

public class J10_arrays {
    public static void main(String[] args) {
        int numArr[] = new int[10];
        numArr[1] = 7;
        System.out.println("numArr[1]:" + numArr[1]);
        System.out.println("numArr.length:" + numArr.length);

        //float flArr[] = new float[5]; albo inicjalizacja ogólna albo ta poniżej,szczegółowa wartościami, nigdy obie naraz
        float flArr[] = {2.0f, 12.9f, -99.9f, 128.45f, 1234.1234f};
        System.out.println("flArr[0]:" + flArr[0]);
        flArr[0] = 1.0f;
        System.out.println("flArr[0]:" + flArr[0 ]);

        System.out.println("flArr[1]:" + flArr[1] + " flArr.length:" +
                flArr.length);

        String strArr[] = new String[2];
        System.out.println("strArr[1]:" + strArr[1]);
        String namesArr[] = {"Ola", "ma", "kota"};

    }
}
