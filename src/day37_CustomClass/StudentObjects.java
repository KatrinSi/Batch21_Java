package day37_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        String str = new String("Batch 21");
        Student student1 = new Student();
        student1.setInfo("Muhtar", 'M', LocalDate.of(1977,03,12), "A012", 3.5);

        System.out.println(student1);

        Student student2 = new Student();
        student2.setInfo("Asiya", 'F', LocalDate.of(1988,02,14),"A013", 4.4);
        System.out.println(student2);

        Student student3 = new Student();
        student3.setInfo("Inna", 'F', LocalDate.of(1986,03,17),"A014",4.5);

        System.out.println("===========================");

        System.out.println(student3);

        System.out.println("======================");

        ArrayList<Student> list1 = new ArrayList<>(Arrays.asList(student1,student2,student3));

        System.out.println(list1);
        Student[] students = {student1,student2,student3};

        System.out.println("===========================");



    }
}
