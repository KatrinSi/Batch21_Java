package day47_Abstraction.EmployeeTask;

public class Developer extends Employee {
    public Developer(String name, int age, char gender, String jobTitle, String ID, double salary) {
        super(name, age, gender, jobTitle, ID, salary);
    }

    @Override
    void work() {
        System.out.println("Developer is writhing code");
    }

    @Override
    protected void sleep() {
        System.out.println("Developer is sleeping 6 hours");
    }
}
