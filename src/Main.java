public class Main {
    public static void main(String[] args) {

        String name[] = {"Ania", "Kasia", "Ola", "Olek", "Daniel", "Tomek"};

        {
            for (int i = 0; i < name.length; i++) {
                String str = name[i];
                System.out.println("name[" + i + "]: " + str);
            }
        }
        System.out.println();
        {
            for (int i = name.length - 1; i >= 0; i--) {
                String str = name[i];
                System.out.println("name[" + i + "]: " + str);
            }
        }
    }
}
