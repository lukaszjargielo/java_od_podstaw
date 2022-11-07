public class Main {
    public static void main(String[] args) {

        int number[] = {1, 2, 3, 4, 5, 6};

        int count = 0;
        while (count < number.length) {
            System.out.println("number[" + count + "]: " + number[count] * 2);
            count++;
        }
    }
}
