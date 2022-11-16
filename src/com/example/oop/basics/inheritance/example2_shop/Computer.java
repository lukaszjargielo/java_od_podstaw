package com.example.oop.basics.inheritance.example2_shop;

public class Computer extends Product{
//    String mouse;
//    String monitor;
//    String keyboard;

    public Mouse mouse;
    public Monitor monitor;
    public Keyboard keyboard;


    Computer() {
//        System.out.println("########################");

//        super();
//        mouse = "optic";
//        monitor = "flat";
//        keyboard = "gaming";
//        System.out.println("########################");
       mouse = new Mouse();
       monitor = new Monitor();
       keyboard = new Keyboard();
        System.out.println("########################");


       // System.out.println("mouse: " + this.mouse+ "\nmonitor: " + this.monitor + "\nkeyboard: "+ this.keyboard);
    }
}
