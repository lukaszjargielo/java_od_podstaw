import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<Animal> animal = new LinkedList<>();
        String arr[] = {"Dog", "Cat", "Tiger", "Lion", "Panda"};
        for (int i = 0; i < 20; i++) {
            int index = (int) Math.floor(Math.random() * arr.length);
            Animal a1 = new Animal(arr[index]);
            animal.add(a1);
            //or String randEl = arr[(int)Math.floor(Math.random() * arr.length)];
            //animal.add(new Animal(randEl));
        }
        System.out.println(animal);
        animal.removeFirst();
        animal.removeLast();
        System.out.println(animal);
        animal.addFirst(new Animal("Tiger"));
        animal.addLast(new Animal("Lion"));

        ListIterator<Animal> iter = animal.listIterator();
        while (iter.hasNext()) {
            Animal animal1 = iter.next();
            System.out.println(animal1);
        }
    }
}
