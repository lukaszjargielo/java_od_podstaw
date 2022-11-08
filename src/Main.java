public class Main {
    public static void main(String[] args) {

        {
            String names[] = {"Anita", "Alicja", "£ukasz", "Natalia"};

            String s1 = "";
            String s2 = " ";

            for (String s : names
            ) {
                s1 = s1.concat(s) + s2;

            }
            System.out.println(s1);
        }

        {
            String names[] = {"Anita", "Alicja", "£ukasz", "Natalia"};

            String s1 = "";
            String s2 = " ";

            for (String s : names
            ) {
                s1 = s1 + s + s2;

            }
            System.out.println(s1);
        }

        {
            String names[] = {"Anita", "Alicja", "£ukasz", "Natalia"};

            String s1 = null;
            System.out.println(s1);

            s1 = "";
            System.out.println(s1);


            for (String s : names
            ) {
                s1 = s1.concat(s);
                s1 += " ";

            }
            System.out.println(s1);
        }


    }
}
