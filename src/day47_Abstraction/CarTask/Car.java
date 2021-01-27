package day47_Abstraction.CarTask;

public abstract class Car {//generic

    public String brand, model, color;
    public int year;
    public int price;
    static boolean hasEngine;

    public Car(String brand, String model, String color, int year, int price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public abstract void start();

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
