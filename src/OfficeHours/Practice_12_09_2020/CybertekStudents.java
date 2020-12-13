package OfficeHours.Practice_12_09_2020;

import com.sun.xml.internal.bind.v2.model.core.ID;

public class CybertekStudents {
    public String name;
    public char gender;
    public int age;

    public static String schoolName = "Cybertek School", dreamJob = "SDET";

    public static boolean hasReplit = true, hasFlipgrid = true;

    public void setInfo (String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public String toString() {
        return "The student's name: "+name+"\nThe student's age: "+age+"\nThe student's gender: "
                +gender+"School name: "+schoolName+"\nDream job: "+dreamJob+"\nDoes the student have any Replits to do? "+hasReplit+"\nDoes the student have any Flipgrids to do? "+hasFlipgrid;
    }


}
