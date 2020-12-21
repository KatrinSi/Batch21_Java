package day42_Inheritance.AnimalTask;

public class Dog extends Animal {


    public Dog(String breed, String color, String name, char gender, String size, int age) {
        setInfo(breed, color, name, gender, size, age);
    }

     public void bark(){
         System.out.println(name+" is barking");
     }


}




