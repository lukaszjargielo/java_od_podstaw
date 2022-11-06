public class Main {
    public static void main(String[] args) {

        {
            int num = 1;
            String s = (num % 2) == 0 ? "even" : "odd";
            System.out.println("The number: " + num + " is " + s);
        }

        {
            int num = 2;
            String s = (num % 2) == 0 ? "even" : "odd";
            System.out.println("The number: " + num + " is " + s);
        }

        {
            int num = 0;
            String s = (num % 2) == 0 ? "even" : "odd";
            System.out.println("The number: " + num + " is " + s);
        }
    }
}
