package OfficeHours.Practice_01_13_2021.ZooTask;

public class Cat extends Animal{
    public Cat(String name, String size, String breed, char gender, int age) {
        super(name, size, breed, gender, age);
    }

    @Override
    public void speak() {

    }

    @Override
    public String toString() {
        return "Cat" + super.toString();
    }
}
