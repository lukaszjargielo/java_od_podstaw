public class DoWhile {
    public static void main(String[] args) {

        int num = 0;

        do {
            if(num % 2 != 0) {

                System.out.println(num);
            }
            num++;
        } while (num <=20);
    }
}
