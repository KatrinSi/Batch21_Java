package OfficeHours.Practice_12_23_2020;

public class Developer extends Employee {
    public final static boolean isCool;

    static {
        isCool = false;
    }

    public Developer(String name, String jobTitle, String ID, char gender, double salary, boolean isFullTime) {
        super(name, jobTitle, ID, gender, salary, isFullTime);
    }


    public void FixingBug() {
        System.out.println(jobTitle+" "+name+ " is fixing bugs");
    }
}
