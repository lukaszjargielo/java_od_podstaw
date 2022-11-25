import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date dateNow = new Date();
        System.out.println("Date now: " + dateNow);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateNow);

        calendar.add(Calendar.YEAR,10);
        calendar.add(Calendar.DAY_OF_MONTH,3);
        calendar.add(Calendar.HOUR,10);
        calendar.add(Calendar.MINUTE,25);
        calendar.add(Calendar.SECOND,6);


        //String dateInFuture = String.valueOf(calendar.getTime());
        Date dateInFuture = calendar.getTime();
        System.out.println("Date in future: " + dateInFuture);
    }
}
