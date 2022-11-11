public class Main {
    public static void main(String[] args) {

        String names[] = {"Ala", "Anita", "£ukasz", "Natalia"};
        StringBuilder builder = new StringBuilder();
        for (String s: names
             ) {
            builder.append(s);
            builder.append(" ");
        }
        System.out.println(builder);
    }
}
