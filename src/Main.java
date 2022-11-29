import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Olga");
        names.add("Kathrine");
        names.add("Daniel");
        System.out.println(names);

        System.out.println(names.get(0));

        names.set(2, "Alex");
        System.out.println(names);


        names.add(1, "Karol");
        System.out.println(names);

        names.remove(0);
        System.out.println(names);

        for (String s: names) {
            System.out.println(s);
        }
    }
}
