package com.example.oop.basics.access_modifiers.protected_example.package2;

import com.example.oop.basics.access_modifiers.protected_example.package1.Product;

public class Computer extends Product  {
    public Computer() {
        name = "Computer"; //protected variable
//        model = "Optilex"; //private variable
        price = 123.21f; // public variable
//        productionYear = 2022; // no modifier
    }

}
