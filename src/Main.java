import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Write your name:");
        String name = reader.readLine();
        System.out.println("Your name is: " + name);

        System.out.println("Write your place of residence:");
        String city = reader.readLine();

        String fullInfo = name + " lives in " + city;
        System.out.println(fullInfo);
         System.out.println("The upper sentence is " + fullInfo.length() + " character's long");
    }


}
