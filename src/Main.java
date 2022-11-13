public class Main {

    public static void main(String[] args) {

        {
            CarFactory car = new CarFactory();
            Car c1 = car.buildCar();
            c1.printInfo();
            System.out.println("Drawn color: " + c1.getColor());
        }
        {
            CarFactory car = new CarFactory();
            Car c1 = car.buildCar();
            c1.printInfo();
            System.out.println("Drawn color: " + c1.getColor());

        }
        {
            CarFactory car = new CarFactory();
            Car c1 = car.buildCar();
            c1.printInfo();
            System.out.println("Drawn color: " + c1.getColor());

        }
        {
            CarFactory car = new CarFactory();
            Car c1 = car.buildCar();
            c1.printInfo();
            System.out.println("Drawn color: " + c1.getColor());

        }
    }
}
