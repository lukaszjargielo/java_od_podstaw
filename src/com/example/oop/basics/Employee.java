package com.example.oop.basics;

public class Employee {
    String name;
    String surname;
    String jobTitle;

    public Employee() {
        this.name = "unkown";
        this.surname = "unknown";
        this.jobTitle = "unkown";
    }

    public Employee(String name, String surname, String jobTitle) {
        this.name = name;
        this.surname = surname;
        this.jobTitle = jobTitle;
    }

    public void printInfo() {
        System.out.println(this.name + " " + this.surname
                        + " " + this.jobTitle);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Lucas";
        e1.surname = "Jargielo";
        e1.jobTitle = "Programmer";
        e1.printInfo();

        Employee e2 = new Employee();
        e2.name = "Natalia";
        e2.surname = "Jargielo";
        e2.jobTitle = "Graphic artist";
        e2.printInfo();

        Employee e3 = new Employee("Alicja", "Jargielo",
                "Pediatrician");
        e3.printInfo();
    }
}
