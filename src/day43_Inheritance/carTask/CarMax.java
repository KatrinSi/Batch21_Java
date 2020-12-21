package day43_Inheritance.carTask;

public class CarMax {
    public static void main(String[] args) {
        Toyota toyota = new Toyota("Camry","red",2018, 235000,10000);
        BMW bmw = new BMW("X5", "black", 2020, 100000, 50000);


        System.out.println(toyota);
        System.out.println(bmw);
    }
}
