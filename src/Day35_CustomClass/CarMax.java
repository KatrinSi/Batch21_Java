package Day35_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarMax {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();

        car1.setInfo("Tesla", "X", "black", 2020, 100000);
        car1.getInfo();
        car2.setInfo("Honda", "Civic", "pink", 1999, 1300);
        car2.getInfo();
        System.out.println(car2.color);

        Car[] cars = {car1, car2, car3, car4, car5};
        for(Car each:cars){
            each.getInfo();
        }
        System.out.println("========================================");
        ArrayList<Car> cars1 = new ArrayList<>(Arrays.asList(cars));

        cars1.removeIf(p -> p.price < 25000);

        for(int i = 0; i < cars1.size(); i++){
            cars1.get(i).getInfo();
        }




    }
}
