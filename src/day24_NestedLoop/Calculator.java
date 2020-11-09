package day24_NestedLoop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 0;
        while (true){
            System.out.println("Enter a num");
            int n1 = scan.nextInt();
            System.out.println("Enter a num");
            int n2 = scan.nextInt();
            result = n1 + n2;
            System.out.println("Result = "+result);
            scan.nextLine();
            System.out.println("Would you like to continue?");
            String answer = scan.nextLine();

            while (!answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no")){
                System.out.println("Invalid Entry, Please Re-enter");
                System.out.println("Would you like to continue?");
                answer = scan.nextLine();
            }

            if (answer.equalsIgnoreCase("no")){
                break;
            }



        }


    }
}

/*
1. write a program that ill ask user to enter two numbers and calculates the sum of those two numbers. then it asks the user if he/she wants to continue
                    if the answer is yes, repeat the whole process again
                    if the answer is no, only return the addition
                    but while the anser is neither yes or no, the the program should repeatedly ask the user re-enter
            HINT: nested loop task, outter loop need to be an infinite loop

 */
