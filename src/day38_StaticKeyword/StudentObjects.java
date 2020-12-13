package day38_StaticKeyword;

public class StudentObjects {
    public static void main(String[] args) {
        CybertekStudent student1 = new CybertekStudent();
        CybertekStudent student2 = new CybertekStudent();

        //System.out.println(student1.schoolName);
        //System.out.println(student2.schoolName);

        System.out.println(CybertekStudent.schoolName);//preferred

        student1.setInfo("Muhtar", 21, 5, 'M');
        student2.setInfo("Kate", 33, 6,'F');

        System.out.println(student1);
        System.out.println(student2);
        CybertekStudent student3 = new CybertekStudent();
        student3.setInfo("Afrooz", 23, 7,'F');

        CybertekStudent.getSchoolInfo();

    }
}
