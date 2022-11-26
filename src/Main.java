import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        LocalDateTime date1 = LocalDateTime.now();
        System.out.println(date1);
        LocalDateTime date2 = LocalDateTime.of(2023,3,4,8,00,01,1);
        System.out.println(date2);

        if (date2.isAfter(date1)) {
            System.out.println("This is the future date of your birthsday!\n" +
                    "You're just starting your first day in your first IT job!\n" +
                    "We wish you all the best buddy!");
        }
    }
}
