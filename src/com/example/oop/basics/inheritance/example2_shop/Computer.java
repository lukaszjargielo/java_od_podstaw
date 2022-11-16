package com.example.oop.basics.inheritance.example2_shop;

public class Computer extends Product{
    String mouse;
    String monitor;
    String keyboard;

    Computer() {
//        super();
        mouse = "optic";
        monitor = "flat";
        keyboard = "gaming";
        System.out.println("mouse: " + this.mouse+ "\nmonitor: " + this.monitor + "\nkeyboard: "+ this.keyboard);
    }
}
