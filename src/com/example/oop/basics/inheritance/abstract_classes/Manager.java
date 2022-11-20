package com.example.oop.basics.inheritance.abstract_classes;

public class Manager extends Employee{
    private String departmentName;

    public Manager() {
    }

    public Manager(String name, String surname, int age, String departmentName) {
        super(name, surname, age);
        this.departmentName = departmentName;
    }
}
