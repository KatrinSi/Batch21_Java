package day43_Inheritance.restaurantTask;

import day43_Inheritance.PersonTask.Employee;

public class Chef extends Employee { //IS relation with Employee

public Chef(String name, char gender, int age, double hourlyRate, String jobTitle, String ID){
    setInfo(name, gender, age, hourlyRate, jobTitle, ID);
}

public void makeOrder(){
    System.out.println(jobTitle+" "+name+ " is making an order.");
}
public void cooking(){
    System.out.println(jobTitle+" "+name+ " is cooking.");
}


}
