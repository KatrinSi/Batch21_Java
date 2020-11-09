package day16_Scanner_String;

import java.util.Scanner;

public class Scanner_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1 = input.nextInt();

        System.out.println("Enter the second number");
        int num2 = input.nextInt();

        System.out.println("Enter the operator");
        String operator = input.next();

        input.close();
        double result = 0;


        switch (operator){
            case "+":
                result = num1+num2;
                break;
            case "*":
                result = num1*num2;
                break;
            case "/":
                result = num1/num2;
                break;
            case "-":
                result = num1-num2;
                break;
            case "%":
                result = num1%num2;
                break;
            default:
                System.out.println("Invalid number");


        }
        System.out.println(result);

    }
}
