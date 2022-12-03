package com.example.collections;

import java.util.PriorityQueue;

public class PriorityQueueExampleBasics {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(99);
        queue.add(56);
        queue.add(88);
        queue.add(14);

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        System.out.println(queue);
        queue.add(100);
        queue.add(45);
        queue.add(74);
        System.out.println(queue.peek());
        System.out.println(queue.peek());

    }
}
