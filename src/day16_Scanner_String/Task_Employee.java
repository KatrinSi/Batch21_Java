package day16_Scanner_String;

import java.util.Scanner;

public class Task_Employee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = input.next();

        System.out.println("Enter your last name:");
        String lastName = input.next();

        System.out.println("Are you currently employed? true/false");
        boolean employed = input.nextBoolean();

        if (employed){
            System.out.println("Enter your salary");
            double salary = input.nextDouble();
            System.out.println("Full name is: "+firstName+" "+lastName+ "\nEmployed: "+employed+"\nSalary: $"+salary);

        }else{
            System.out.println("You are not currently employed.");
        }
input.close();

    }
}
