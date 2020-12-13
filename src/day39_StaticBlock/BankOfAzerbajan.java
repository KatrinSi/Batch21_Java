package day39_StaticBlock;

import day37_CustomClass.Employee;

import java.util.ArrayList;

public class BankOfAzerbajan {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(HumanResources.employee1);
        employees.add(HumanResources.employee2);
        employees.add(HumanResources.employee3);


        System.out.println(employees.get(0));

    }

}
