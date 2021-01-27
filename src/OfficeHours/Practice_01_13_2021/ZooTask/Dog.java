package OfficeHours.Practice_01_13_2021.ZooTask;

public class Dog extends Animal{
    public Dog(String size, String breed, char gender, int age) {
        super("Dog", size, breed, gender, age);
    }

    @Override
    public void speak() {
        System.out.println(name+" is barking");
    }

}
