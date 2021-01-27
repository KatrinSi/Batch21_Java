package day47_Abstraction.EmployeeTask;

public class Tester extends Employee{
    public Tester(String name, int age, char gender, String jobTitle, String ID, double salary) {
        super(name, age, gender, jobTitle, ID, salary);
    }

    @Override
    public void work() {
        System.out.println("Tester catches bugs");

    }


    @Override
    public void sleep() {
        System.out.println("Tester sleeps 8 hours");
    }
}
