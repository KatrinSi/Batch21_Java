package day38_StaticKeyword;

public class CybertekStudent {
    public String name;
    public int age,groupName;
    public char gender;
    public static String schoolName = "Cybertek School";
    public static boolean isOnlineStudent = true;

    public void setInfo(String name, int age, int groupName, char gender) {
        this.name = name;
        this.age = age;
        this.groupName = groupName;
        this.gender = gender;
    }

    public void study(){ // because ihe name is instance
        System.out.println(name+" is studying Java");
    }

    public static void getSchoolInfo(){
        System.out.println("School name is: "+schoolName);//because the school name is static
    }


    public String toString() {
        return "CybertekStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", groupName=" + groupName +
                ", gender=" + gender +
                ", isOnline: "+isOnlineStudent+
                ", School name is: "+schoolName+
                '}';
    }
}
