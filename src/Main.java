import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        for (int i = 0; i < 30; i++) {
            int num =(int)Math.floor(Math.random()*101);
            numbers.add(num);
        }

        Iterator<Integer> iter = numbers.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
