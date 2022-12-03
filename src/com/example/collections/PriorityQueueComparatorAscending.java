package com.example.collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.PriorityQueue;

class AscendingComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer x, Integer y) {
        if (x == y)
            return 0;
        else if (x > y)
            return 1;
        else
            return -1;
    }
}

public interface PriorityQueueComparatorAscending {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>(new AscendingComparator());
        queue.add(99);
        queue.add(56);
        queue.add(88);
        queue.add(14);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
