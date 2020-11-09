package day06_ArithmeticOperations;

public class SalaryCalculator {
    public static void main(String[] args) {
        int salary = 100000;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.21;
        double stateTax = salary*stateTaxRate;
        double federalTax = salary*federalTaxRate;
        double totalTax = stateTax+federalTax;
        double salaryAfterTax = salary-totalTax;

        System.out.println("Your salary is: $"+salary);
        System.out.println("Your state tax is: $"+stateTax);
        System.out.println("Your federal tax is: $"+federalTax);
        System.out.println("Your total tax is: $"+totalTax);
        System.out.println("Your salary after tax is: $"+salaryAfterTax);
    }

}

/*
SalaryCalculatorvariables:
salary,
stateTaxRate,
federalTaxRate,
stateTax,
federalTax,
totalTax,
salaryAfterTax 100000
0.08
0.21
output:Your salary is:YourSalary
Your State Tax: YourStateTax
Your federal Tax: federalTax
your total tax: TotalTax
your salary after tax: YourSalaryAfterTax
 */