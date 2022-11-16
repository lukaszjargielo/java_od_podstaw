package com.example.oop.basics.inheritance.example2_shop;

public class Keyboard extends Product{
    byte numKeys;

    Keyboard() {
//        price = 50.0f;
//        name = "unknown";
//        manufacturer = "unknown";
//        productionYear = 2022;
//        super();
        numKeys = 104;
        System.out.println("number of keys: " +
                this.numKeys);

    }
}
