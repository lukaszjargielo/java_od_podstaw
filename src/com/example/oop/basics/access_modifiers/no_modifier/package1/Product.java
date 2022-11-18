package com.example.oop.basics.access_modifiers.no_modifier.package1;

public class Product {
    String name;
    private String model;
    public float price;
    int productionYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
