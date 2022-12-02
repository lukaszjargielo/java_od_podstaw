import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Ola");
        set.add("Kasia");
        set.add("Daniel");
        set.add("Ola");
        set.add("Kasia");
        set.add("Adam");

        Iterator<String> iter = set.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

        HashSet<Car> set2 = new HashSet<>();
        Car car1 = new Car("Dodge");
        set2.add(car1);
        set2.add(car1);
        Car car2 = new Car("Citroen");
        set2.add(car2);
        Car car3 = new Car("Oper");
        set2.add(car3);
        set2.add(car3);

        Iterator<Car> iter2 = set2.iterator();
        while (iter2.hasNext()) {
            System.out.println(iter2.next());
        }

    }
}
