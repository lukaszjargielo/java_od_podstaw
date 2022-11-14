package com.example.oop.basics.methods;

class PointWithConstants {
    int x, y, z;
    final int WIDTH = 13;
    final int HEIGHT;

    PointWithConstants() {
        HEIGHT = 20;
    }

    PointWithConstants(int x, int y) {
        this();
        this.x = x;
        this.y = y;
    }
    PointWithConstants(int x, int y, int z) {
        this();
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void changePosition(final int x, final int y) {
        //x = 12;
        this.x = x;
        this.y = y;
    }


    public void changePosition(/*final*/ int x, /*final*/ int y, final int z) {
        x = 12;
        y = 13;
        //z = 14;

        this.x = x;
        this.y = y;
        this.z = z;
         //z = y;
    }
}

public class FinalConstantsExample {
    public static void main(String[] args) {

        PointWithConstants point = new PointWithConstants(33,34);
        point.changePosition(55,56);
        System.out.println("x: " + point.x + " y: " + point.y);
        point.x = 57;
        System.out.println("x: " + point.x + " y: " + point.y);
        point.changePosition(59,60);
        System.out.println("x: " + point.x + " y: " + point.y);
        PointWithConstants point2 = new PointWithConstants(1,2,3);
        System.out.println("x: " + point2.x + " y: " + point2.y + " z: " + point2.z);
        point2.changePosition(4,5,6);
        System.out.println("x: " + point2.x + " y: " + point2.y + " z: " + point2.z);
        point2.z = 110;
        System.out.println("x: " + point2.x + " y: " + point2.y + " z: " + point2.z);

    }
}
