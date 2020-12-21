package day43_Inheritance.PersonTask;

public class Employee extends Person{
    public double hourlyRate;
    public String jobTitle, ID;

    public void setInfo(String name, char gender, int age, double hourlyRate, String jobTitle, String ID){
        setInfo(name, gender, age);
        this.hourlyRate = hourlyRate;
        this.jobTitle = jobTitle;
        this.ID = ID;
    }
    public void work(){
        System.out.println(jobTitle+" "+name+" is working");
    }

    public double calcSalary(){
        return hourlyRate*40*52;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID='" + ID + '\'' +
                ", hourlyRate=$" + hourlyRate +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + (int)calcSalary() +
                '}';
    }

    public static String publicVar = "Public";
    protected static String protectedVar = "Protected";
    static String defaultVar = "Default";

}
/*
Employee extends Person:
        name, age, gender, hourlyRate, jobTitle, ID
        setInfo, eat(), sleep(), work()
 */