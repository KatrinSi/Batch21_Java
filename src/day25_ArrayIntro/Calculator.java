package day25_ArrayIntro;

import com.sun.tools.javac.comp.Enter;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the first num");
            double num1 = scan.nextDouble();
            System.out.println("Enter the math operator");
            char operator = scan.next().charAt(0);

            System.out.println("Enter the second num");
            double num2 = scan.nextDouble();

            switch (operator) {
                case '+':
                    System.out.println("Addition :" + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Subtraction: " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Multiplication: " + (num1 * num2));
                    break;
                case '/':
                    System.out.println("Division: " + (num1 / num2));
                    break;
                default:
                    System.out.println("Invalid operator");
            }
            System.out.println("Would you like to continue?");
            String answer = scan.next().toLowerCase();

            while (!answer.equals("yes") || answer.equals("no")) {         // asking re enter
                System.out.println("Invalid Input, Please Re-Enter");
                System.out.println("Would you like to continue?");
                answer = scan.next().toLowerCase();
            }

            if (answer.equals("no")) {
                break;
            }

        }
        scan.close();
    }
}
