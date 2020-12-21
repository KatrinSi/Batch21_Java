package day42_Inheritance.AnimalTask;

public class Animal {
    public String breed,color,name, size;
    public char gender;
    public int age;

    public void setInfo(String breed, String color, String name, char gender, String size, int age) {
        this.breed = breed;
        this.color = color;
        this.name = name;
        this.gender = gender;
        this.size = size;
        this.age = age;
    }

    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }

    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }

    public void sleep(){
        System.out.println(name+" is sleeping ");
    }


    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", size=" + size +
                ", age=" + age +
                '}';
    }
}
