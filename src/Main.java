public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        double falseAverage = (a + b + c + d) / 4;
        double trueAverage = (a + b + c + d) / 4.0;
        System.out.println("False average equals:" + falseAverage);
        System.out.println("True average equals:" + trueAverage);

        System.out.println("Operation postincrementation in the same line like print operation: trueAverage++: " + trueAverage++);
        trueAverage--;
        System.out.println("Operation preincrementation in the same line like print operation: ++trueAverage: " + ++trueAverage);
        trueAverage--;
        System.out.println("Operation prestdecrementation in the same line like print operation: --trueAverage: " + --trueAverage);
        trueAverage++;
        System.out.println("Operation postdecrementation in the same line like print operation: trueAverage--: " + trueAverage--);

    }
}
