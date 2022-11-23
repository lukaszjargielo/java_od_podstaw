public class Main {
    public static void main(String[] args) {
        try {
            int a = 1;
            int b = 0;
            int result = a / b;
        } catch (ArithmeticException e) {
            e.printStackTrace();

        } finally {
            System.out.println("Code from finally");
        }

        try {
           throw new TestException();
        } catch (TestException e) {
            e.printStackTrace();

        } finally {
            System.out.println("Code from finally");
        }
    }
}
