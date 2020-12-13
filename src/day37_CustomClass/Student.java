package day37_CustomClass;

import java.time.LocalDate;

public class Student {

    public String name, ID;
    public char gender;
    public LocalDate dOfB;
    public int age;
    public double gpa;

    public void setInfo(String name, char gender, LocalDate dOfB, String ID, double gpa) {
        this.name = name;
        this.gender = gender;
        this.dOfB = dOfB;
        age = LocalDate.now().getYear() - dOfB.getYear();
        this.ID = ID;
        this.gpa = gpa;
    }

    public String toString() {

        return "Student name: " + name + "\nStudent ID: " + ID + "\ngpa:" + gpa + "\nAge:" + age + "\nGender:" + gender;

    }

}
