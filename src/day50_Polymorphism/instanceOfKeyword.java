package day50_Polymorphism;

import day48_Abstraction.AnimalTask.Animal;
import day48_Abstraction.AnimalTask.Dog;
import day48_Abstraction.AnimalTask.Lion;

public class instanceOfKeyword {

    public static void main(String[] args) {

        Animal animal = new Lion("q", "v", "f", 'f',2);

        boolean isLion = animal instanceof Lion;
        System.out.println("isLion = " + isLion);

    }
}
