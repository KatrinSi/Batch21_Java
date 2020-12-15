package day41_Encapsulation;

import java.time.LocalDate;

public class PersonObject {
    public static void main(String[] args) {

        Person person1 = new Person("Muhtar", 19,'M');

        person1.getName();
        person1.setName("Asiya");
        person1.setAge(13);
       // person1.setGender('F');


        System.out.println(person1);


    }
}
