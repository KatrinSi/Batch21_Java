package day37_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class ParkingLot {
    public static void main(String[] args) {
        Car[] cars = {new Car(), new Car(), new Car(), new Car(), new Car()};

        cars[0].setInfo("BMW", "i8", "black", LocalDate.of(2015, 5, 20), 20000, 10000);
        cars[1].setInfo("BMW", "m4", "black", LocalDate.of(2016, 6, 20), 20000, 10000);
        cars[2].setInfo("BMW", "m4", "black", LocalDate.of(2017, 7, 20), 20000, 10000);
        cars[3].setInfo("BMW", "i8", "black", LocalDate.of(2018, 8, 20), 20000, 10000);
        cars[4].setInfo("BMW", "x5", "black", LocalDate.of(2019, 9, 20), 20000, 10000);

        ArrayList<Car> recall1 = new ArrayList<>();
        for (Car each : cars) {
            if (each.year < 2017) {
                recall1.add(each);
            }
        }
        System.out.println(recall1.size());

        ArrayList<Car> recall2 = new ArrayList<>();
        for (Car each:cars){
            if(each.brand.equals("BMW")){
                if(each.model.equals("i8")&&each.year<2016){
                    recall2.add(each);
                }
            }
        }
        System.out.println(recall2);

        cars[0].driver();

        System.out.println("=================================");

        ArrayList<Car> myCollection = new ArrayList<>();

        myCollection.addAll(Arrays.asList(cars));

        myCollection.removeIf(p->!p.equals("m4"));

        System.out.println(myCollection.size());

    }
}
