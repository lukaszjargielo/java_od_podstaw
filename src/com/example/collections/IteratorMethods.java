package com.example.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMethods {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Mercedes");
        arr.add("BMW");
        arr.add("VW");

        arr.iterator().forEachRemaining(el -> {
            System.out.println(el);
        });

        Iterator<String> iterator = arr.iterator();

        while (iterator.hasNext()) {
            String s = iterator.next();
            if(s.equalsIgnoreCase("BMW")) {
                iterator.remove();
            }
        }

        System.out.println(arr);
    }
}
