public class Main {
    public static void main(String[] args) {

        int numbers[] = {0, 1, 2, 3, 4, 5};

        int score = 0;
        for (int num: numbers) {
            score += num;

        }
        System.out.println("Sum of array elements: " + score);
    }
}
