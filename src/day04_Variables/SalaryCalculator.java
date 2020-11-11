package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        int salary = 100000;
        double tax = 0.28;
        double totalTax = salary * tax;
        double salaryAfterTax = salary - totalTax;

        System.out.println("$" + salaryAfterTax);



    }
}



/*

write a program that can calculate the salary after tax based on the salary and tax rate
			Ex:
				if salary = 100000
				   tax = 0.28

				   salary after tax = 72000



for numbers: byte, short, int, long, float, double

	Integers(whole): int
	Decimals: double


char: for single characters
		A, z, 1, ! ...

boolean: True/False expressions
 */