package com.example.oop.basics.inner_class;

class Car {
    private String modelName;
    private String manufacturer;
    private int productionYear;

    public static class CarBuilder {
        private Car car = new Car();

        public CarBuilder setModelName(String modelName) {
            car.modelName = modelName;
            return this;
        }

        public CarBuilder setManufacurer(String manufacturer) {
            car.manufacturer = manufacturer;
            return this;
        }

        public CarBuilder setProductionYear(int year) {
            car.productionYear = year;
            return this;
        }

        public Car getCar() {
            return this.car;
        }
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + modelName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }
}

public class PublicStaticInnerClass {
    public static void main(String[] args) {
        Car someCar = new Car.CarBuilder().setModelName("Charger")
                .setManufacurer("Ford").setProductionYear(2022).getCar();

        System.out.println(someCar.getModelName());
        System.out.println(someCar.getManufacturer());
        System.out.println(someCar.getProductionYear());
        System.out.println(someCar);
    }
}
