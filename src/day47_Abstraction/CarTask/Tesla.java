package day47_Abstraction.CarTask;

public class Tesla extends Car{
    public Tesla(String model, String color, int year, int price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println(brand+model+" is starting by..");
    }
}
