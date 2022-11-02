import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String names[] = { "Ania", "Micha³", "Daniel", "Kasia", "Jan"};

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write a number of array index, maximum value is:" + (names.length - 1));
        int index = Integer.parseInt(reader.readLine());
        System.out.println("Wybrano numer " + index + " zawieraj±cy: " + names[index]);

    }
}
