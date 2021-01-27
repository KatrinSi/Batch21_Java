package day38_StaticKeyword.ScrumTask;

public final class Developers {
    public String name, ID, jobTitle, companyName;
    public int salary;
    public char gender;
    public static boolean codingSkills = true;

    public void setInfo(String name, String ID, String jobTitle, String companyName, int salary, char gender) {
        this.name = name;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
        this.gender = gender;
    }

    public void coding(){
        System.out.println(jobTitle+" "+name+" is coding");
    }
    public void fixingBug(){
        System.out.println(jobTitle+" "+name+" is fixing bugs");
    }


    public final String toString() {
        return "Developers{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
