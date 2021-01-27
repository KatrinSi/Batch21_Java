package day48_Abstraction.AnimalTask;

public class Eagle extends Animal implements Predator, Flyable{
    public Eagle(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Eagle sleeps 6 hours");
    }

    @Override
    public void hunt() {
        System.out.println("Eagle hunts snakes");
    }


    @Override
    public void fly() {
        System.out.println("Eagle can fly");
    }
}
