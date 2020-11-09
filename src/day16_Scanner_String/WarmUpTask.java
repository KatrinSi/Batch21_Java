package day16_Scanner_String;

import java.util.Scanner;

public class WarmUpTask {

    public static void main(String[] args) {
        Scanner calculator = new Scanner(System.in);

        System.out.println("Enter your salary:");
        double salaryYear= calculator.nextDouble();
        System.out.println("How many hours you work a week?");
        int hoursAweek = calculator.nextInt();

        System.out.println("Your salary is: "+salaryYear+"\nYou work "+hoursAweek+" a week");
        double hourRate = (int)salaryYear / (hoursAweek*52);


        System.out.println("Your hourly rate is: "+hourRate);

    }
}
/*
1.  write a program for a rate calculator: RateCalculator
            1. asks the user to enter a salary (double)
            2. asks the user how many hours he/she works in a week (as int)
            3. print the hourly rate of the employee
            assume that one year has 52 weeks
            hourRate = salary / (weeklyHour * 52)
-----------------------------------

 */