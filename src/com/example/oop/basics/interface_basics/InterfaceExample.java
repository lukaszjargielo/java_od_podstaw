package com.example.oop.basics.interface_basics;


public class InterfaceExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();

        Vehicle vehicle = car;
        System.out.println(vehicle.getTopSpeed());

        Vehicle vehicle2 = new Car();
        vehicle2.turn();
        Car car2 = (Car)vehicle2;
        System.out.println(car2.getTopSpeed());

        Plane plane = new Plane();
        Vehicle vehicle3 = plane;
        System.out.println(vehicle3.getTopSpeed());

        Vehicle vehicles[] = new Vehicle[3];
        vehicles[0] = car;
        vehicles[1] = car2;
        vehicles[2] = plane;

        vehicles[2].move();

        if(vehicles[2] instanceof Plane) {
            Plane plane1 = (Plane) vehicles[2];
            System.out.println(plane1.getTopSpeed());

            Flying flying = plane;
            flying.increaseHeight();
        }
    }
}
