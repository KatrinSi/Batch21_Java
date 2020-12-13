package day40_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class MySalary {
    public static void main(String[] args) {
        SalaryCalculator salary1 = new SalaryCalculator(40,55,9,20);
        SalaryCalculator salary2 = new SalaryCalculator(45,35,8,21);
        SalaryCalculator salary3 = new SalaryCalculator(43,32,8,20);
        SalaryCalculator salary4 = new SalaryCalculator(45,30,9,22);
        SalaryCalculator salary5 = new SalaryCalculator(40, 60,8,20);

        ArrayList<SalaryCalculator> salaries = new ArrayList<>();
        salaries.addAll(Arrays.asList(salary1,salary2,salary3,salary4,salary5));
        double maxSalaryAfterTax = salaries.get(0).salaryAfterTax;
        double minSalaryAfterTax = salaries.get(0).salaryAfterTax;
        double maxTotalTax = salaries.get(0).totalTax;
        double minTotalTax = salaries.get(0).totalTax;

        for (SalaryCalculator each:salaries){

            maxSalaryAfterTax = Math.max(each.salaryAfterTax, maxSalaryAfterTax);
            minSalaryAfterTax = Math.min(each.salaryAfterTax,minSalaryAfterTax);

            maxTotalTax = Math.max(each.totalTax, maxTotalTax);
            minTotalTax = Math.min(each.totalTax,minTotalTax);

        }
        System.out.println("Max salary after tax: "+maxSalaryAfterTax);
        System.out.println("Min salary after tax: "+minSalaryAfterTax);

        System.out.println("Min total after tax: "+minTotalTax);
        System.out.println("Max total after tax: "+maxTotalTax);

        System.out.println("=================================================");







    }
}
