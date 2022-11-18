package com.example.oop.basics.inheritance.super_example;

public class SuperTest {
    public static void main(String[] args) {
        Student student = new Student("Anita","Kosztowny",5);
        Teacher teacher = new Teacher("Wiesław","Wantulok","Math");
        Director director = new Director("Elżbieta", "Szachniewicz", 108);
        System.out.println(teacher.getTeachingSubject());
    }
}
