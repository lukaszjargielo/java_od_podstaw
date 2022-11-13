public class Car {
    String brand;
    String model;
    String color;
    String carColor[] = {"white", "black", "red"};

    public Car() {
        this.brand = "Volkswagen";
        this.model = "Passat B5";
        this.color = "indefinite";
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
//        this.color = this.getColor();

    }

    public String getColor() {
        int c = (int) (Math.floor(Math.random() * 3));
        return this.color = carColor[c];

    }

    public void printInfo() {
        System.out.println(this.brand + " " + this.model + " " + this.color);
    }
}
