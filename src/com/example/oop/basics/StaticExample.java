package com.example.oop.basics;

class PlaneWithStatic {

    static int nextId = 1;

    int id;
    int x, y;

    PlaneWithStatic() {
        id = PlaneWithStatic.nextId;
        nextId++;
    }

    static int getNextId() {
        return nextId++;
    }
}

public class StaticExample {

    public static int add(int a, int b) {
        return a + b;
    }

    public int substract (int a, int b) {
        return a - b;
    }

    //StaticExample.main(args);

    public static void main(String[] args) {

        PlaneWithStatic plane1 = new PlaneWithStatic();
        PlaneWithStatic plane2 = new PlaneWithStatic();
        PlaneWithStatic plane3 = new PlaneWithStatic();
        PlaneWithStatic plane4 = new PlaneWithStatic();


        System.out.println("plane1.nextId: " + plane1.nextId);
        System.out.println("PlaneWithStatic.nextId: " + PlaneWithStatic.nextId);
        System.out.println("plane3.nextId: " + plane3.nextId);

        plane2.nextId = 7;

        System.out.println("plane1.nextId: " + plane1.nextId);
        System.out.println("PlaneWithStatic.nextId: " + PlaneWithStatic.nextId);
        System.out.println("plane3.nextId: " + plane3.nextId);

        System.out.println("plane1.id:" + plane1.id);
        System.out.println("plane2.id:" + plane2.id);
        System.out.println("plane3.id:" + plane3.id);

         plane4.id = PlaneWithStatic.getNextId();
        System.out.println(plane4.id);

        System.out.println(StaticExample.add(10,20));

        StaticExample example1 = new StaticExample();
        System.out.println(example1.substract(8,4));
    }
}
