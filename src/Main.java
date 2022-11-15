public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            Item item = Item.getItem();
            item.printId();


        }

        Item.printNumItems();

    }
}
