public class Main {
    public static void main(String[] args) {
        Flat homes[] = new Flat[10];

        for (int i = 0; i < homes.length; i++) {
            int index = (int)Math.floor(Math.random() * 3);
            if(index == 0) {
                homes[i] = new Flat("Leszczyny", "Pojdy");
            } else if (index == 1) {
                homes[i] = new House ("Kamieñ", "Klimka",1000.0f);
            } else {
                homes[i] = new Residence("Palowice", "Wiejska",
                        1500.0f, 40.0f);
            }
        }

        for (int i = 0; i < homes.length; i++) {
            if(homes[i] instanceof Residence) {
                Residence r = (Residence) homes[i];
                System.out.println("Garage size: " + r.getGarageSize());
                System.out.println(r.toString());
            } else if (homes[i] instanceof House) {
                House h = (House) homes[i];
                System.out.println("Parcel size: " + h.getParcelSize());
                System.out.println(h.toString());
            } else {
                System.out.println(homes[i].toString());
            }
        }
    }
}
