package day35_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;

public class DogPark {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.setInfo("Tima", "York", "small", 'M',
                "multicolor", LocalDate.of(2010, 01, 19));

        dog2.setInfo("Balli", "Maltese", "small", 'F',
                "white", LocalDate.of(2019, 12, 01));

        dog3.setInfo("Misha", "Chow Chow", "big", 'M',
                "chocolate", LocalDate.of(2015, 06, 14));

        dog2.eat("Beef");
        dog3.drink("Beer");

        Dog[] dogs = {dog1, dog2, dog3};
        ArrayList<Dog> chow = new ArrayList<>();
        ArrayList<Dog> Maltese = new ArrayList<>();

        for (Dog eachDog : dogs) {
            if (eachDog.breed.contains("Chow")) {
                chow.add(eachDog);
            } else if (eachDog.breed.contains("Maltese")) {
                Maltese.add(eachDog);
            }

        }
        System.out.println(chow.size());
        System.out.println(Maltese.size());
    }
}
