import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Animal> map = new HashMap<>();
        String names[] = {"Kot", "Pies", "Koza", "Puma"};
        for (int i = 0; i < names.length; i++) {
            map.put(names[i],new Animal(names[i]));
        }

        System.out.println(map.get("Puma"));

        for (Map.Entry<String, Animal> me : map.entrySet()) {
            String name = me.getKey();
            Animal animal = me.getValue();

            System.out.println(name + " - " + animal);
        }


    }
}
