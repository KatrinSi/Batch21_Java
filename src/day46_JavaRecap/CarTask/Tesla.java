package day46_JavaRecap.CarTask;

public final class Tesla extends Car {

    public Tesla(String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Starting "+brand + " " + model + " by calling from Phone");
    }

    public void autoPilot(){
        System.out.println(brand+" "+model+" has an Autopilot");
    }
}
