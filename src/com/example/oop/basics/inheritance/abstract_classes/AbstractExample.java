package com.example.oop.basics.inheritance.abstract_classes;

public class AbstractExample {
    public static void main(String[] args) {
        Employee employee = new Employee("Josh", "Marker", 32);
        employee.printInfo();

        Manager manager = new Manager("Tim","Balance",41, "R&I");
        manager.printInfo();

        Person person = manager;
        System.out.println(person.getName());

//        Person person1 = new Person(); not allowed to intiantiate abstract class Person!
    }
}
