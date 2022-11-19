package com.example.oop.basics.inheritance.instanceof_operator;

class Animal {
    protected String name;
    protected float weight;
    protected int numLegs;
}

class Dog extends Animal {
    protected void bark() {
        System.out.println("Wof!");
    }
}

class Bird extends Animal {
    protected void fly() {
        System.out.println("Bird is flying. ");
    }
}

class Parrot extends Bird {
    protected void learnWord() {
        System.out.println("Parrot is learning word.");
    }
}

public class InstanceOfExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        boolean result = dog instanceof Animal;
        System.out.println(result);

        Animal animal = new Animal();
        System.out.println(animal instanceof Dog);

        Bird bird = new Bird();
        System.out.println(bird instanceof Animal);
        System.out.println(bird instanceof Bird);

//        System.out.println(bird instanceof Dog); // error - incompatible type

        Parrot parrot = new Parrot();
        System.out.println(parrot instanceof Parrot);
        System.out.println(parrot instanceof Bird);
        System.out.println(parrot instanceof Animal);
    }
}
