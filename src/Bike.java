public class Bike {
    public String brand;
    protected String name;
    private String type;

    public Bike() {
    }

    public Bike (String brand, String name) {
        this.brand = brand;
        this.name = name;
        this.type = "bike";
    }

    public void setType(String type) {
        this.type = type;
    }

    public void printInfo() {
        System.out.println("Bike brand: " + this.brand +
                "\nBike name: " + this.name + "\nBike type: " +
                this.type);
    }
}
