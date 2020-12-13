package day40_Constructor;

import java.text.DecimalFormat;

public class SalaryCalculator {
    public static int weekDays, weeksInYear;
    public double weeklyHours, hourlyRate, stateTaxRate, federalTaxRate, salary, salaryAfterTax, totalTax;

    static {
        weekDays = 5;
        weeksInYear = 52;
    }

    public SalaryCalculator(double weeklyHours, double hourlyRate, double stateTaxRate, double federalTaxRate) {
        if (stateTaxRate > 1) {
            stateTaxRate /= 100;
        }

        if (federalTaxRate > 1) {
            federalTaxRate /= 100;
        }
        this.weeklyHours = weeklyHours;
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        salary = hourlyRate * weeklyHours * weeksInYear;
        totalTax = (stateTaxRate + federalTaxRate) * salary;
        salaryAfterTax = salary - totalTax;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "SalaryCalculator{" +
                "weeklyHours=" + weeklyHours +
                ", hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", salary=$" + df.format(salary) +
                ", salaryAfterTax=$" + df.format(salaryAfterTax) +
                ", totalTax=$" + df.format(totalTax) +
                '}';
    }
}

