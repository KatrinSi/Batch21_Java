package day43_Inheritance.PersonTask;

public class Developer extends Employee {

    public Developer(String name, char gender, int age, double hourlyRate, String jobTitle, String ID){
        setInfo(name, gender, age, hourlyRate, jobTitle, ID);
    }

    public void coding(){
        System.out.println(jobTitle+name+" is coding");
    }

}
