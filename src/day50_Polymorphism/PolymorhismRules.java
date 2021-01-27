package day50_Polymorphism;

import day42_Inheritance.AnimalTask.Animal;
import day42_Inheritance.AnimalTask.Dog;

public class PolymorhismRules {
    public static void main(String[] args) {

        Dog dog = new Dog("njb", "nnkv", "nvj", 'f', "njfnv", 3);
        dog.bark();
        Animal dog1 = new Dog("njb", "nnkv", "nvj", 'f', "njfnv", 3);
        //dog1.bark(); - not possible

        dog1.eat("Dog food");

    }
}
