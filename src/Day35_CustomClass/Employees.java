package Day35_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Employees {

    public String name;
    public char gender;
    public String SSN;
    public String ID;
    public String jobTitle;
    public String companyName;
    public double salary;

    public void setInfo(String Name, char Gender, String empSSN, String empID, String JobTitle, String CompanyName, double Salary){
        name=Name;
        gender = Gender;
        SSN = empSSN;
        ID = empID;
        jobTitle = JobTitle;
        companyName = CompanyName;
        salary = Salary;
    }
    public void getInfo(){
        System.out.println("Employee's name: "+name+"\nGender: "+gender+"\nEmployee's SSN: "+SSN
                +"\nEmployee's ID: "+ID+"\nJob title: "+jobTitle+"\nCompany name: "+companyName+"\nSalary: "+salary);
    }
    public void attendMeeting(boolean meetings){
        System.out.println("Does the employee attend meetings? "+meetings);
    }
    public void working(int hours){
        System.out.println(name+" works "+hours+" hours a week");
    }

    public static void main(String[] args) {
        Employees employee1 = new Employees();
        Employees employee2 = new Employees();
        Employees employee3 = new Employees();
        Employees employee4 = new Employees();
        Employees employee5 = new Employees();

        employee1.setInfo("Angelina Jolie", 'F', "123 456", "0001", "Developer", "Apple", 400_000);
        employee2.setInfo("Mr. Bean", 'M', "123 457","0002", "Joker", "Joker&Co", 99_000);
        employee3.setInfo("Brad Pitt", 'M',"123 458", "0003", "Scrum Master", "Amazon", 140_000);
        employee4.setInfo("Kevin Spacey", 'M', "123 459", "0004", "Manual tester", "Government", 64_000);
        employee5.setInfo("Scarlett Johansson", 'F', "123 460", "0005", "Product Owner", "Google", 450_000);

        ArrayList<Employees> list = new ArrayList<>(Arrays.asList(employee1, employee2, employee3, employee4, employee5));
        for(Employees each:list){
            each.getInfo();
            System.out.println("==========================");
        }

        list.removeIf(p -> p.salary < 100000);

        for(Employees each:list){
            each.getInfo();
            System.out.println("==========================");
        }
    }




}
/*
2. Employees:
            Attributes:
                name, gender, SSN, ID, jobTitle, companyName, salary
            Actions:
                setInfo
                getInfo
                attendMeeting
                working
        BankOfAmerica
        create an arraylist of Emplooyees and store 5 employee objects
        remove all employees from the list who are making less than 100K
        NO seperate classes
 */