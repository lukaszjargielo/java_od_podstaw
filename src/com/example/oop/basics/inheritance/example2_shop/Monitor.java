package com.example.oop.basics.inheritance.example2_shop;

public class Monitor extends Product{
    String resolution;

    Monitor () {
//        super();
        resolution = "1080";
        System.out.println("resolution: " + this.resolution);
    }
}
