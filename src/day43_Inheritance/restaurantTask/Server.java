package day43_Inheritance.restaurantTask;

import com.sun.tools.doclets.internal.toolkit.SerializedFormWriter;
import day43_Inheritance.PersonTask.Employee;

public class Server extends Employee {
    public Server(String name, char gender, int age, double hourlyRate, String jobTitle, String ID){
        setInfo(name, gender, age, hourlyRate, jobTitle, ID);
    }

    public void takeOrder(){
        System.out.println(jobTitle+" "+name+" is taking an order.");
    }

    public void cleanTable(){
        System.out.println(jobTitle+" "+name+" is cleaning a table.");
    }
}
