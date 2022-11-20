package com.example.oop.basics.inheritance.abstract_classes;

public class Employee extends Person{
    @Override
    public void printInfo() {
        System.out.println("Employee " + this.getName());
    }

    public Employee() {
    }

    public Employee(String name, String surname, int age) {
        super(name, surname, age);
    }
}
