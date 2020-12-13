package day36_CustomClass;

import day32_LocalDate_WrapperClass.Date;
import day35_CustomClass.Employees;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Employee {
    public String name, jobTitle, ID, companyName;

    double salary;
    LocalDate hireDate;
    char gender;

    public void setInfo(String name, char gender, String jobTitle, String companyName, double salary, String ID, LocalDate hireDate) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.companyName = companyName;
        this.salary = salary;
        this.hireDate = hireDate;
        this.gender = gender;
    }

    public void getInfo() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM-dd-yyyy");
        DecimalFormat decimal = new DecimalFormat("0.00");
        System.out.println("Employee's name: " + name + "\nGender: " + gender + "\nID: " + ID + "\nCompany name: "
                + companyName + "\nJob title: " + jobTitle + "\nSalary: $" + decimal.format(salary) + "\nHire date: " + df.format(hireDate));
    }

    public void working() {
        System.out.println(name + " is working");
    }

    public static void main(String[] args) {
        String companyName = "Bank of America";
        Employee[] employees = {
                new Employee(),
                new Employee(),
                new Employee(),
        };

        employees[0].setInfo("Angelina Jolie", 'F', "Developer", companyName, 400_000, "0001", LocalDate.of(2018, 04, 15));
        employees[2].setInfo("Mr. Bean", 'M', "Comedian", companyName, 99_000, "0002", LocalDate.of(2005, 12, 03));
        employees[1].setInfo("Brad Pitt", 'M', "Scrum Master", companyName, 140_000, "0003", LocalDate.of(2016, 9, 14));

        for( Employee each : employees){
            each.getInfo();
        }
        System.out.println("===============================================================");
        ArrayList<Employee> SDEtsAndDev = new ArrayList<>( Arrays.asList(employees) );

        SDEtsAndDev.removeIf( p -> !( p.jobTitle.equalsIgnoreCase("SDET") || p.jobTitle.equalsIgnoreCase("Developer") )    );
        // removes the employees IF job tile of the employee is not SDET or not Developer

        for(Employee each : SDEtsAndDev ){
            System.out.println(  each.name +" : "+each.jobTitle+", $"+ each.salary );
        }

        System.out.println("=================================================================");
        ArrayList<Employee> richPeople = new ArrayList<>();
        richPeople.addAll(  Arrays.asList(employees) );
        // for(Employee each : employees)  richPeople.add(each);

        richPeople.removeIf( p ->  p.salary < 200000 ); // remove the employee, if the employee salary is less than 200K

        System.out.println("=================================================================");

        double maxSalary = employees[0].salary ;  // assume that first employee' salary is max
        String name = "";

        for( Employee each: employees){
            // maxSalary = Math.max(maxSalary,  each.salary );
            if(each.salary > maxSalary  ){  // if any employee has more lsalary
                maxSalary = each.salary;
                name = each.name;
            }
        }

        System.out.println(name+" : "+maxSalary);

        double minSalary = employees[0].salary;
        for(Employee each: employees){
            if (each.salary < minSalary){
                minSalary = each.salary;
                name = each.name;
            }
        }
        System.out.println(name+" : "+minSalary);






        /*
        employee4.setInfo("Kevin Spacey", 'M', "123 459", "0004", "Manual tester", "Government", 64_000);
        employee5.setInfo("Scarlett Johansson", 'F', "123 460", "0005", "Product Owner", "Google", 450_000);
         */


    }
}
