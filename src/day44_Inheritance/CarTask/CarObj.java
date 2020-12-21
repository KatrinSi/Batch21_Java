package day44_Inheritance.CarTask;

import day44_Inheritance.WebDriverTask.Test;

public class CarObj {
    public static void main(String[] args) {
        Honda honda = new Honda("Civic", "red", 8000, 2016);
        honda.start();
        System.out.println(honda);

        Mercedes mercedes = new Mercedes("GLA", "black", 68000, 2020);
        mercedes.start();
        System.out.println(mercedes);

        Jeep jeep = new Jeep("Grand Cherokee", "blue", 33000, 2019);
        jeep.start();

        Tesla tesla = new Tesla("Model Y", "red", 50000, 2020 );
        tesla.start();
        System.out.println(tesla);
    }
}
