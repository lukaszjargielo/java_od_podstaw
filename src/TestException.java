public class TestException extends Exception{
    public TestException() {
        System.out.println("That is our own exception");
    }

    public TestException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Exception from our TestException class occured.";
    }
}
