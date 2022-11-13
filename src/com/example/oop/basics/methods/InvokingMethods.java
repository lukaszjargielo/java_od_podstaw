package com.example.oop.basics.methods;

class Triangle {
    float a;
    float h;
    float surfaceArea;

   Triangle (float base, float height) {
         a = base;
         h = height;
    }

   public void countSurfaceArea () {
       surfaceArea = (a * h / 2);
       System.out.println("Triangle surface area equals: " +
               surfaceArea);
       a = 20.0f;
   }
}

class MyMath  {

    public void add(int a, int b) {
        int result = a*2 + b;
        System.out.println("result: " + result);
        a = 20;
    }
        }

public class InvokingMethods {
    public static void main(String[] args) {

        MyMath math = new MyMath();
        int a = 10;
        int b = 7;
        System.out.println("a before calling by value " + a);
        math.add(a, b);
        System.out.println("a after calling by value " +  a);

        Triangle triangle = new Triangle(10.0f,5.0f);
        System.out.println("'a' before calling by reference " + triangle.a);
        triangle.countSurfaceArea();
        System.out.println("'a' after calling by reference, changed" +
                " by method " + triangle.a);
    }
}
