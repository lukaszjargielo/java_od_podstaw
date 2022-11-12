package com.example.oop.basics;

class Car {
    String manufacturer;
    String name;
    int year;
    String color;
    float topSpeed;

    public Car() {
        this.manufacturer = "unknown";
        this.name = "unknown";
        this.year = 0000;
        this.color = "unknown";
        this.topSpeed = 000.00f;
    }

    public Car(String manufacturer, String name, int year, String
                color, float topSpeed) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.year = year;
        this.color = color;
        this.topSpeed = topSpeed;
    }

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

        Car volkswagen = new Car("Volkswagen","Passat b5",
                2005,"purple",190.00f);
        volkswagen.printInfo();
    }
}
