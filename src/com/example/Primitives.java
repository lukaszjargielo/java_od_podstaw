package com.example;

public class Primitives {
    public static void main(String[] args) {
        Student jola = new Student();
        jola.imie = "Jola";
        jola.wiek = 21;

        Student ela = new Student();
        ela.imie = "Ela";
        ela.wiek = 15;

        System.out.println("Jola ma " + jola.wiek);
        System.out.println("Ela ma " + ela.wiek);

        zamianaWieku(jola, ela);

        System.out.println("Jola ma " + jola.wiek);
        System.out.println("Ela ma " + ela.wiek);
    }

    private static void zamianaWieku(Student a, Student b) {
        int c = a.wiek;
        a.wiek = b.wiek;
        b.wiek = c;
    }

    static class Student {
        String imie;
        int wiek;
    }
}
