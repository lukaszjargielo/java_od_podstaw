package com.example.oop.basics.access_modifiers.no_modifier.package2;

import com.example.oop.basics.access_modifiers.no_modifier.package1.Product;

public class Computer extends Product {
    public Computer() {
        //name = "Computer"; //no modifier
//        model = "Optilex"; //private variable
        price = 123.21f; // public variable
//        productionYear = 2022; // no modifier
    }

}
