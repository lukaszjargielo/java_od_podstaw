import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        long timestamp = date.getTime();
        System.out.println(timestamp);

        int milisecondInMinute = 60 * 1000;
        int day = 3;
        int hours = 10;
        int minutes = 25;
        int dayInMiliseconds = day * 24 * 60 * milisecondInMinute;
        int hoursInMiloseconds = hours * 60 * milisecondInMinute;
        int minutesInMiliseconds = minutes * milisecondInMinute;

        timestamp = timestamp + dayInMiliseconds +
                hoursInMiloseconds + minutesInMiliseconds;

        System.out.println(timestamp);
        Date date2 = new Date(timestamp);
        System.out.println(date2);
    }
}
