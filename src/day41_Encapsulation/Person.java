package day41_Encapsulation;

import java.time.LocalDate;

public class Person {

    private String name;
    private int age;
    private final char gender; //FINAL means CONSTANT variable, we cannot re-set it, we cannot have setter if the variable is final

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    public char getGender() {
        return gender;
    }

    //public void setGender(char gender){
    //this.gender = gender;
    //}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
