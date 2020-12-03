package Day35_CustomClass;

import java.time.LocalDate;
import java.util.Scanner;

public class Students {
    Scanner scan = new Scanner(System.in);
    public String name;
    public int age;
    public char gender;
    public String ID;


    public void setInfo(String studentName, int studentAge, char studentGender, String studentID){
        name = studentName;
        age = studentAge;
        gender = studentGender;
        ID = studentID;
    }
    public void getInfo(){
        System.out.println("Name of the student: "+name+"\nStudent's age: "+age+"\nStudent's gender: "+gender+"\nStudent's ID: "+ID);
    }
    public void study(String subject){
        System.out.println(name+" studies "+subject);
    }
    public void hasBreaks(boolean brakes){
        System.out.println("Does "+name+" have breaks? "+brakes);
    }
    public void averageGrade (char grade){
        System.out.println(name+"'s average grade is: "+grade);
    }


}
/*
1. Student:
            Attributes:
                    name, age, gender, ID
            Actions:
                setInfo
                getInfo
                study
                sleep
                ...

 */