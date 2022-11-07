package com.example.basics.control_flow_statements;

public class ForLoop {
    public static void main(String[] args) {

        {
            int arr[] = {1, 5, 10, 15};

            for (int i = 0; i < arr.length; i++) {
                int value = arr[i];
                System.out.println("arr: " + value);

            }
        }
        System.out.println();
        {
            int arr[] = {1, 5, 10, 15};

            for (int i = 1; i < arr.length; i++) {
                int value = arr[i];
                System.out.println("arr: " + value);

            }
        }
        System.out.println();
        {
            int arr[] = {1, 5, 10, 15};

            for (int i = 0; i < arr.length; i+=2) {
                int value = arr[i];
                System.out.println("arr: " + value);

            }
        }
        System.out.println();
        {
            String strArr[] =  {"Ola", "Adam", "Kasia"};
            for (int i = strArr.length -1 ; i >= 0; i--) {
                String str = strArr[i];
                System.out.println("strArr[" + i + "]: " + str);
            }
        }
    }
}
