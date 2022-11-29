package com.example.collections;

import java.util.ArrayList;
import java.util.Iterator;

class Car {
    private String name;
    private String manufacturer;
    private int yearOfProduction;

    public Car(String name, String manufacturer, int yearOfProduction) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.yearOfProduction = yearOfProduction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}

public class ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Charger","Dodge",2020));
        cars.add(new Car("T","Ford",1920));
        cars.add(new Car("Viper","Dodge",1997));

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println();
        for (Car car: cars) {
            System.out.println(car);
        }
        System.out.println();
        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
