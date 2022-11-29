package com.example.collections;

import java.util.ArrayList;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class ArrayListMethods {
    public static void main(String[] args) {

        Person p1 = new Person("Jack");
        Person p2 = new Person("Ralph");
        Person p3 = new Person("Sonia");
        Person p4 = new Person("Betty");

        ArrayList<Person> arr1 = new ArrayList<>();
        arr1.add(p1);
        arr1.add(p2);
        arr1.add(p3);
        arr1.add(p4);

        System.out.println(arr1);

        Person p5 = new Person("Bart");
        Person p6 = new Person("Marc");

        ArrayList<Person> arr2 = new ArrayList<>();
        arr2.add(p5);
        arr2.add(p6);

        arr1.addAll(arr2);

        System.out.println(arr1);

        if(arr1.contains(p4)) {
            System.out.println("arr1 contains p4");
        }

        if (arr1.containsAll(arr2)) {
            System.out.println("arr1 contains all elements"
            + " from arr2");
        }

        Person p7 = new Person("Daniel");
        arr2.add(p7);

        if (arr1.containsAll(arr2)){
            System.out.println("arr1 contains all elements"
                    + " from arr2");
        } else {
            System.out.println("arr1 not contains all elements"
                    + " from arr2");
        }

        arr2.remove(p7);

        if (arr1.containsAll(arr2)){
            System.out.println("arr1 contains all elements"
                    + " from arr2");
        } else {
            System.out.println("arr1 not contains all elements"
                    + " from arr2");
        }

        System.out.println(arr1);
        System.out.println(arr1.size());
        arr1.removeAll(arr2);
        System.out.println(arr1);
        System.out.println(arr1.size());

        Person people[] = new Person[arr1.size()];
        people = arr1.toArray(people);
        for (Person person: people) {
            System.out.println(person);
        }

        arr1.clear();
        if(arr1.isEmpty()) {
            System.out.println(arr1);
        }
    }
}
