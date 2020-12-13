package day37_CustomClass;

import day35_CustomClass.Students;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class CybertekSchool {

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        Student student6 = new Student();
        Student student7 = new Student();
        Student student8 = new Student();
        Student student9 = new Student();
        Student student10 = new Student();

        ArrayList<Student> list = new ArrayList<>(Arrays.asList(student1,student2,student3,student4,student5,student6,student7,student8,student9,student10));

        student1.setInfo("Aaron", 'M', LocalDate.of(2000,11,2), "A01", 1.5);
        student2.setInfo("Daniel", 'M', LocalDate.of(1990, 10, 25), "B123", 3.2);
        student3.setInfo("Vanya", 'M', LocalDate.of(1998, 10, 12), "C324", 3.3);
        student4.setInfo("Jessica", 'F', LocalDate.of(1999, 8,19), "G345", 5.3);
        student5.setInfo("Jennifer", 'F', LocalDate.of(1990, 12,13), "F435", 2.3);
        student6.setInfo("Kostya", 'M', LocalDate.of(2000, 9,7), "J09", 2.5);
        student7.setInfo("Adel", 'F', LocalDate.of(1999, 1,20), "L092", 6.5);
        student8.setInfo("Bob", 'M', LocalDate.of(1989, 6,29), "Y45", 1.3);
        student9.setInfo("John", 'M', LocalDate.of(2001, 7,12), "L05", 1.3);
        student10.setInfo("Sanya", 'M', LocalDate.of(1990, 3,29), "P93", 3.9);


        //finding youngest student
        LocalDate youngest = list.get(0).dOfB;
        LocalDate oldest = list.get(0).dOfB;

        Student oldestStudent = null;
        Student youngestStudent = null;

        for(Student each:list){
            if(each.dOfB.isAfter(youngest)){
                youngest = each.dOfB;
                youngestStudent = each;
            }
            if(each.dOfB.isBefore(oldest)){
                oldest=each.dOfB;
                oldestStudent = each;
            }
        }
        System.out.println(youngest);
        System.out.println(youngestStudent);
        System.out.println("================================");

        System.out.println(oldest);
        System.out.println(oldestStudent);
        System.out.println("================================");

        double highestGPA = list.get(0).gpa;
        double lowestGPA = list.get(0).gpa;


        for (Student each: list){
            double eachGPA = each.gpa;
            highestGPA = Math.max(eachGPA, highestGPA);
            lowestGPA = Math.min(eachGPA,lowestGPA);
        }
        System.out.println("Highest GPA: "+highestGPA);
        System.out.println("Lowest GPA: "+ lowestGPA);
        System.out.println("================================");

        ArrayList<Student> femail = new ArrayList<>(list);
        ArrayList<Student> male = new ArrayList<>(list);

        femail.removeIf(p-> p.gender =='M');
        male.removeIf(p-> p.gender == 'F');

        System.out.println("===============================");

        System.out.println("total num of male students: "+male.size());
        System.out.println("total num of female students: "+femail.size());

    }
}
