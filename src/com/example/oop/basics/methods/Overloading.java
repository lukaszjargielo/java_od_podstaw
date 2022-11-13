package com.example.oop.basics.methods;

class RectangleOverloading {

    float side1, side2;

    RectangleOverloading() {
        this(5.0f);
    }

    RectangleOverloading(float v) {
        side1 = side2 = v;
    }

    RectangleOverloading(float side1, float side2) {
        this.side1 = side1;
        this.side2 = side2;
    }
}

class MathOverloading {

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(int a, int b) {
        return  a + b;
    }

    public float add(float a, float b) {
        return a + b;
    }
}

public class Overloading {
    public static void main(String[] args) {

        MathOverloading math = new MathOverloading();

        int a = 12;
        int b = 3;
        int c = 5;
        float d = 15.0f;
        float e = 25.f;

        System.out.println(math.add(a, b));
        System.out.println(math.add(d, e));
        System.out.println(math.add(a, b, c));

        RectangleOverloading rect = new RectangleOverloading();
        System.out.println("Default rectangle with side equals: " + rect.side1);

        RectangleOverloading rect2 = new RectangleOverloading(15.0f);
        System.out.println("We made a rectangle with fixed side length " + rect2.side1);

        RectangleOverloading rect3 = new RectangleOverloading(5.0f, 10.0f);
        System.out.println("We made a rectangle with both fixed sides length " + rect3.side1 + "*" + rect3.side2);

    }
}
