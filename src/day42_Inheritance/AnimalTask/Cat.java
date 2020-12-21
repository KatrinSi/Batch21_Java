package day42_Inheritance.AnimalTask;

public class Cat extends Animal{

    public Cat(String breed, String color, String name, char gender, String size, int age){
        setInfo(breed, color, name, gender, size, age);
    }

    public void meow(){
        System.out.println(name+" is meowing");
    }
}
