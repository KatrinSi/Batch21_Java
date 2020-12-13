package day38_StaticKeyword;

public class SalaryCalculator {

    public double hourlyRate, weeklyHours, stateTaxRate, federalTaxRate, salary, salaryAfterTax;

    public void setInfo(double hourlyRate, double weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = (stateTaxRate > 1) ? stateTaxRate / 100 : stateTaxRate;//if it's 8, will be 0.08
        this.federalTaxRate = (federalTaxRate > 1) ? federalTaxRate / 100 : federalTaxRate;
        salary = calculateSalary();
        salaryAfterTax = calculateSalaryAfterTax();
    }

    public double calculateSalary() {
        return hourlyRate * weeklyHours * 52;//per a year
    }

    public double calculateStateTax() {
        return calculateSalary() * stateTaxRate;//or salary*...
    }

    public double calculateFederalTax() {
        return salary * federalTaxRate;//or calculateFederalTax()*...
    }

    public double calculateTotalTax() {
        return calculateFederalTax() + calculateStateTax();
    }

    public double calculateSalaryAfterTax() {
        return salary - calculateTotalTax();
    }


    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate= $" + hourlyRate +
                ", salary= $" + salary +
                ", salaryAfterTax= $" + salaryAfterTax +
                '}';
    }

    public boolean equals(SalaryCalculator s1){
       return this.salary==s1.salary;
    }
}

/*
 2. Create a custom class called SalaryCalculator
                    Attributes:
                        hourlyRate, weeklyHours, stateTaxRate, federalTaxRate, salary, salaryAfterTax
                    Methods:
                        calculateSalary: returns the annual salary
                        calculateStateTax: returns the total tax
                        calculateFederalTax: returns the total tax
                        calculateTotalTax: returns the total tax
                        calculateSalaryAfterTax: returns the salary after calculator
                        setInfo: accepts four arguments (hourlyRate, weeklyHours, stateTax, federalTax) and iitializes all instances
                        toString() method

 */