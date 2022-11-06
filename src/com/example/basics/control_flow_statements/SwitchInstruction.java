package com.example.basics.control_flow_statements;

public class SwitchInstruction {

    enum CarVariant {COMBI, SEDAN, SPORT};

    public static void main(String[] args) {

        int num = 10;



        switch (num) {
            case 1:
                System.out.println("Value of num is 1");
                break;
            case 10:
                System.out.println("Value of num is 10");
                break;
            case 11:
                System.out.println("Value of num is 11");
                break;
            default:
                System.out.println("Value of num is another number");
        }

        String name = "Lucas";

        switch (name) {
            case "Ania":
                System.out.println("Value of name is Ania");
                break;
            case "Lucas":
                System.out.println("Value of name is Lucas");
        }



        CarVariant car = CarVariant.COMBI;

        switch (car) {
            case COMBI:
                System.out.println(car);
                break;
            case SEDAN:
                System.out.println(car);
                break;
            case SPORT:
                System.out.println(car);
                break;
            default:
                System.out.println("Another type of car");

        }
    }
}
