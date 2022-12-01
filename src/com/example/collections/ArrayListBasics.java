package com.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Maja");
        arrayList.add(1);
        arrayList.add(1.1);
        String s = "Kasia";
        int i = 2;
        double d = 2.2;
        arrayList.add(s);
        arrayList.add(i);
        arrayList.add(d);

        System.out.println(arrayList.get(0).getClass());
        System.out.println(arrayList.get(0) instanceof Object);
        System.out.println(arrayList.get(0) instanceof String);

        System.out.println(arrayList.get(1).getClass());
        System.out.println(arrayList.get(2).getClass());
        System.out.println(arrayList.get(3).getClass());
        System.out.println(arrayList.get(4).getClass());
        System.out.println(arrayList.get(5).getClass());

        Object obj0 = arrayList.get(0);
        String s0_Get = (String) obj0;
//        String s0_Get = arrayList.get(0);
        Object obj1 = arrayList.get(1);
        int i1 = (Integer) obj1;
        System.out.println(i1);


        System.out.println(arrayList);
        System.out.println();

        ArrayList<String> arr = new ArrayList<>();
        arr.add("String");
        arr.add("Next");
        String str = arr.get(0);
        System.out.println(arr.size());

        ArrayList basicList = new ArrayList();
        basicList.add(new String("Text"));
        basicList.add("Text");

//        String strEl0 = basicList.get(0);
        String strEl0 = (String) basicList.get(0);
        System.out.println(strEl0);

        ArrayList<String> arrStr = new ArrayList<>();
        arrStr.add("Kathrine");
        arrStr.add("Alice");
        arrStr.add("George");
        arrStr.remove(1);
        arrStr.add("Michael");

        System.out.println("We use ListIterator now");
        System.out.println(arrStr.size());
        ListIterator<String> listIterator = arrStr.listIterator(arrStr.size());
        while(listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
            listIterator.set("String swap");
        }

        System.out.println("We use for-each loop now");
        for (String s1 : arrStr
        ) {
            System.out.println(s1);
        }
        /*
        Kathrine
        George
        Micheal
        */

        arrStr.add(0, "Suzzy");

        System.out.println(arrStr);

        /*
        Suzzy
        Kathrine
        George
        Micheal
        */

        arrStr.set(1,"Barbra");

        System.out.println(arrStr);
        Collections.sort(arrStr);
        System.out.println(arrStr);


        arrStr.remove(0);
        System.out.println(arrStr);
    }
}
