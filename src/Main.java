public class Main {
    public static void main(String[] args) {

        String txt = "Ola ma kota".repeat(3);
        System.out.println(txt);
        txt = txt.replaceAll("Ola","Kasia");
        System.out.println(txt);
        txt = txt.replaceFirst("Kasia", "Monika");
        System.out.println(txt);
        int index = txt.indexOf("Kasia");
        System.out.println(index);
        index = txt.lastIndexOf("Kasia");
        System.out.println(index);
        System.out.println(txt.substring(14));
    }
}
