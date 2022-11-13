public class CarFactory {

    String carColors[] = {"white", "black", "red"};

    public Car buildCar() {
       //Car car = new Car();
       // car.color = car.getColor();
        int randIndex = (int)(Math.floor(Math.random() * carColors.length));
        String randColor = carColors[randIndex];
        return new Car("Ford", "Mustang", randColor);
    }
}
