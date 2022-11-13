public class CarFactory {
    public Car buildCar() {
        Car car = new Car();
        car.color = car.getColor();
        return car;
    }
}
