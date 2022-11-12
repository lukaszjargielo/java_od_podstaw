package com.example.oop.basics;

class Car {
    String manufacturer;
    String name;
    int year;
    String color;
    float topSpeed;

    public void printInfo() {
        System.out.println(this.manufacturer + " " + this.name
        + " " + this.year);
    }

}

public class CarExample {
    public static void main(String[] args) {

        Car ford = new Car();
        ford.manufacturer = "Ford";
        ford.name = "Mustang";
        ford.color = "red";
        ford.year = 1967;
        ford.topSpeed = 200.00f;
        ford.printInfo();

        Car chevrolet = new Car();
        chevrolet.manufacturer = "Chevrolet";
        chevrolet.name = "Camaro";
        chevrolet.color = "black";
        chevrolet.year = 2020;
        chevrolet.topSpeed = 300.00f;
        chevrolet.printInfo();
    }
}
