import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        int number = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (;;) {
            System.out.println("Write number or 'quit' to exit");
            String str = reader.readLine();
            if(str.equalsIgnoreCase("quit")) {
                break;
            }
            int num = Integer.parseInt(str);
            number += num;
            System.out.println("Score: " + number);
        }
    }
}
