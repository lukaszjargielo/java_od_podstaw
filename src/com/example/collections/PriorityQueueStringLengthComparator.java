package com.example.collections;

import java.util.Comparator;
import java.util.PriorityQueue;

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}

public class PriorityQueueStringLengthComparator {
    public static void main(String[] args) {

        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Daniel");
        queue.add("Ola");
        queue.add("Adam");
        queue.add("Zuzanna");

        System.out.println("Default order priority");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        System.out.println("Order priority by word length");

        PriorityQueue<String> queue2 = new PriorityQueue<>(new StringLengthComparator());
        queue2.add("Daniel");
        queue2.add("Ola");
        queue2.add("Adam");
        queue2.add("Zuzanna");

        while (!queue2.isEmpty()) {
            System.out.println(queue2.poll());
        }
    }
}
