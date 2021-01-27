package day46_JavaRecap.CarTask;

public class CarMax {
    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes("G Class", "black", 2021, 80_000);
        Lexus lexus = new Lexus("RX 350", "White", 2018, 20_000);
        BMW bmw = new BMW("X6","Red", 2019, 40_000);
        Tesla tesla = new Tesla("Model 3", "Blue", 2020, 50_000);

        mercedes.start();
        mercedes.driving();
        tesla.autoPilot();


    }
}
