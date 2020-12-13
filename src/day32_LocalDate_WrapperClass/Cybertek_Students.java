package day32_LocalDate_WrapperClass;

import day35_CustomClass.Students;

public class Cybertek_Students {
    public static void main(String[] args) {
        Students student1 = new Students();
        Students student2 = new Students();
        Students student3 = new Students();

        student1.setInfo("Muhtar", 28, 'M', "12345");
        student1.getInfo();
        student1.study("Java");
        student1.hasBreaks(false);
        student1.averageGrade('A');
        System.out.println();

        student2.setInfo("Asiya", 23, 'F', "123456");
        student2.getInfo();
        student2.study("Soft Skills");
        student2.hasBreaks(true);
        student2.averageGrade('A');
        System.out.println();

        student3.setInfo("Gurhan", 27, 'M', "1234567");
        student3.getInfo();
        student3.study("HTML and Selenium");
        student3.hasBreaks(true);;
        student3.averageGrade('A');

    }
}
