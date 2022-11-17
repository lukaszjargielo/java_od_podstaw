public class Main {
    public static void main(String[] args) {

        Bike bike = new Bike();
        Bike bike2 = new Bike("Electra", "Bravo");
        System.out.println("Bike");
        bike.printInfo();
        System.out.println("Bike");
        bike2.printInfo();
        MotorBike motorBike = new MotorBike("Suzuki", "Cross");
        motorBike.printInfo();



    }

}
