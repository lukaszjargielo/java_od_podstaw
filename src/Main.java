public class Main {
    public static void main(String[] args) {

        Roadster roadster1 =  new Roadster(180.0f, 9.0f);

        Roadster roadster2 = new Roadster(180.0f,9.0f,
                240.0f,5.0f);

        System.out.println(roadster1.getTopSpeed());
        System.out.println(roadster1.getTopSpeed(true));
        System.out.println(roadster1.getTopSpeed(false));

        System.out.println(roadster2.getTopSpeed());
        System.out.println(roadster2.getTopSpeed(true));
        System.out.println(roadster2.getTopSpeed(false));

        System.out.println(roadster1.getAcceleration());
        System.out.println(roadster1.getAcceleration(true));
        System.out.println(roadster1.getAcceleration(false));

        System.out.println(roadster2.getAcceleration());
        System.out.println(roadster2.getAcceleration(true));
        System.out.println(roadster2.getAcceleration(false));


    }
}
