package OfficeHours.Practice_01_13_2021.ZooTask;

public abstract class Animal {//only for common features
    public String name, size;
    public final String breed;
    public final char gender;
    public int age;

    public static boolean isAnimal;
    static {
        isAnimal = true;
    }

    public Animal(String name,String size, String breed, char gender, int age) {
        this.name = name;
        this.size = size;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
    }

    public abstract void speak();

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
