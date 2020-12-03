package OfficeHours.Practice_11_26_2020;

import java.util.Scanner;

public class LoopPractice2 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        double hourlyRate = 0;
        int weeklyHour = 0;

        String answer = "";


         while (!answer.equalsIgnoreCase("no")){
             System.out.println("Enter your hourly rate");
             hourlyRate = scan.nextDouble();
             System.out.println("Enter your weekly hours");
             weeklyHour = scan.nextInt();
             double salary = weeklyHour*hourlyRate*52;

             System.out.println("Your salary is: "+salary);
             double totalTax = salary*0.3;
             System.out.println("Your tax is: "+totalTax);
             double salaryAfterTax = salary-totalTax;
             System.out.println("Your salary after tax: "+ salaryAfterTax);

             System.out.println("Would you like to continue?");
             answer = scan. next();

             while (!(answer.equalsIgnoreCase("yes")|| answer.equalsIgnoreCase("no"))){
                 System.out.println("Would you like to continue?");
                 answer = scan.next();
             }

         }


    }
}
/*
salary calculator

hourlyRate
weeklyHour
taxRate

continue?
 */