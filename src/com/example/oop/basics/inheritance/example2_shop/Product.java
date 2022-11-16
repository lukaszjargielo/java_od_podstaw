package com.example.oop.basics.inheritance.example2_shop;

public class Product {
    float price;
    String name;
    String manufacturer;
    int productionYear;

    Product() {
//        price = 0.0f;
        name = "unknown";
        manufacturer = "unknown";
//        productionYear = 2022;
//        System.out.println("#######################");
        if (this instanceof Computer) {
            System.out.println("#######################");
        }
        System.out.println("\n" + getClass().getSimpleName() +
                " has been created" + "\nname: " + this.name +
                "\nmanufacturer: " + this.manufacturer + "\nprice: " +
                this.price + "\nyear of production: " + productionYear);
//        System.out.println("######################");

    }
}
