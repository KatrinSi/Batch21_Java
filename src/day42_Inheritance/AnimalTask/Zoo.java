package day42_Inheritance.AnimalTask;

public class Zoo { //HAS A tiger
    public static void main(String[] args) {

        Tiger tiger = new Tiger("Siberian", "black", "Tima", 'M', "large", 6);
        System.out.println(tiger);
        tiger.eat("meat");


        Cat cat = new Cat("Bengal cat", "multicolor", "Lenny", 'M', "large", 1);
        System.out.println(cat);
        cat.meow();
        cat.eat("tuna");

        Dog dog = new Dog("York dog", "multicolor", "Timka", 'M', "small", 10);
        System.out.println(dog);
        dog.bark();

    }
}
