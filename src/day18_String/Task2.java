package day18_String;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first numbers: ");
        double num1 = scan.nextDouble();

        System.out.println("Enter the math operator: ");//*;/;+;-..
        char operator = scan.next().charAt(0);

        System.out.println("Enter second number: ");
        double num2 = scan.nextDouble();
        //switch (operator){
        // case '/':
        // }
        boolean isValid = operator == '*' || operator == '/' || operator == '-' || operator == '+' || operator == '%';
        if (isValid) {
            if (operator == '*'){
                System.out.println("Multiplication: "+ (num1*num2));
            }else if (operator == '/'){
                System.out.println("Division: "+ (num1/num2));
            }else if (operator == '%'){
                System.out.println("Remainder: "+(num1%num2));
            }else if (operator == '+'){
                System.out.println("Addition: "+ (num1+num2));
            }else{
                System.out.println("Substraction: "+ (num1-num2));
            }
        }else{
            System.err.println("Invalid operator");
        }
    }
}
