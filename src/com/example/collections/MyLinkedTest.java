package com.example.collections;

import java.util.LinkedList;

public class MyLinkedTest {
    public static void main(String[] args) {
            String h1 = "my";
            String h2 = "favorite";
            String h3 = "book";
            LinkedList<String> linkedList = new LinkedList();
            linkedList.add(h1);
            linkedList.add(h2);
            linkedList.add(h3);
            System.out.println(linkedList);
            System.out.println("Reversed LinkedList:");
            System.out.println(reverseLinkedList(linkedList));
        }
        public static LinkedList<String> reverseLinkedList(LinkedList<String> list)
        {
            LinkedList<String> LinkedList = new LinkedList<String>();
            for (int i = list.size() - 1; i >= 0; i--) {
                LinkedList.add(list.get(i));
            }
            return LinkedList;
        }
    }

