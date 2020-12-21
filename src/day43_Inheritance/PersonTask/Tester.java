package day43_Inheritance.PersonTask;

public class Tester extends Employee {

    public Tester(String name, char gender, int age, double hourlyRate, String jobTitle, String ID){
        setInfo(name, gender, age, hourlyRate, jobTitle, ID);
    }


    public void testing(){
        System.out.println(jobTitle+" "+name+" is testing");
    }


}
/*
Tester extends Employee:
        name, age, gender, hourlyRate, jobTitle, ID
        Constructor
        eat(), sleep(), work(), testing(),...
 */