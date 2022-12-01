package com.example.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListBasics {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Adam");
        String p1 = "Olga";
        list.add(p1);
        list.addFirst("Raphael");
        list.addLast("Alex");
        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.removeLast();
        list.removeFirst();
        System.out.println(list);

        System.out.println(list.contains(p1));

        list.add("Daniel");
        list.add("Jacoob");
        list.add(p1);
        list.add("Anne");
        System.out.println(list);

        list.removeFirstOccurrence(p1);
        System.out.println(list);
        list.removeLastOccurrence("Olga");
        System.out.println(list);

        list.add(2,"Zenon");
        System.out.println(list);
        list.set(0,"Katie");
        System.out.println(list.size());
        System.out.println(list);

        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String str = listIterator.next();
            System.out.println(str);
        }
        System.out.println();

        ListIterator<String> listIterator2 = list.listIterator(list.size());
        while (listIterator2.hasPrevious()) {
            String str = listIterator2.previous();
            System.out.println(str);
        }

    }
}
