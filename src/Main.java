import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Default date format: " + date);
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE dd LLLL y G hh:mm:ss:SS a zzzz");
        System.out.println("My own date format: "+ dateFormat.format(date));
    }
}
