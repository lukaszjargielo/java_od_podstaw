package com.example.oop.basics.inheritance.example2_shop;

public class Mouse extends Product{
    byte numButtons;

    Mouse() {
//        super();
        numButtons = 3;
        System.out.println("number of buttons: " + this.numButtons);
    }
}
