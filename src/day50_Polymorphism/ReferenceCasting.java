package day50_Polymorphism;

import day42_Inheritance.AnimalTask.Animal;
import day42_Inheritance.AnimalTask.Cat;
import day42_Inheritance.AnimalTask.Dog;
import day47_Abstraction.ShapeTask.Circle;
import day47_Abstraction.ShapeTask.Shape;
import day49_Abstraction.ShapeTask.Cylinder;
import javafx.scene.AmbientLight;

public class ReferenceCasting {
    public static void main(String[] args) {

        Circle circle = new Circle(3);
        Shape shape  = circle; //upcasting


        //DownCasting!!:

        Animal animal = new Dog("njkv", "hihob", "hnvkn", 'f', "hb", 3);
        Dog dog = (Dog) animal;
        dog.bark();

        Animal animal1 = new Cat("njkv", "hihob", "hnvkn", 'f', "hb", 3);
        ((Cat) animal1).meow();

        System.out.println("---------------------------");



    }
}
