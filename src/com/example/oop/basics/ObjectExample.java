package com.example.oop.basics;

class CarObject {
    private String manufacturer;
    private String model;
    private int year;

    public CarObject(String manufacturer, String model, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "CarObject{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}

public class ObjectExample {
    public static void main(String[] args) {
        CarObject carObject = new CarObject("Ford","T",1920);

        System.out.println(carObject);
        System.out.println(carObject.hashCode());

        CarObject carObject2 = new CarObject("Dodge","Challenger", 2022);
        System.out.println(carObject.equals(carObject2));

        System.out.println(carObject);
    }
}
