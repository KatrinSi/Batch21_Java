package day38_StaticKeyword.ScrumTask;

public final class Tester {
    public String name, ID, jobTitle, companyName;
    public double salary;
    public char gender;
    public static boolean isHuman, isCybertekStudent;

    public void setInfo(String name, String ID, String jobTitle, String companyName, double salary, char gender) {
        this.name = name;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
        this.gender = gender;
    }

    public void smokeTesting(){
        System.out.println(name+" does Smoke testing");
    }

    public void creatingTicket(){
        System.out.println(name+" creates Tickets on Jira");
    }


    public final String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
