package OfficeHours.Practice_12_09_2020;


import day38_StaticKeyword.CybertekStudent;

public class StudentObjects {
    public static void main(String[] args) {

        CybertekStudents student1 = new CybertekStudents();
        CybertekStudents student2 = new CybertekStudents();

        System.out.println(student1);

        student1.setInfo("Edress", 23,'M');
        student2.setInfo("Muhtar", 25,'M');

        System.out.println(student2);



    }
}
