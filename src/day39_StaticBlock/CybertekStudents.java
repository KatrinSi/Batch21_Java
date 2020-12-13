package day39_StaticBlock;

public class CybertekStudents {
    public String name, gender;
    public int age;


    public static String schoolName, dreamJob;
    public static boolean hasReplits, hasFlipGrids;


    static {
        schoolName = "Cybertek School";
        dreamJob = "SDET";
        hasReplits = true;
        hasFlipGrids = true;
    }

    public void setInfo(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }


    public String toString() {
        return "CybertekStudents{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age= " + age +
                ", schoolName= "+schoolName+
                '}';
    }
}
