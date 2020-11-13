package day29_Methods;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        calculator(2,'*',2);

        calculator(scan.nextDouble(), scan.next().charAt(0), scan.nextDouble());
    }

    public static void calculator(double num1, char operator, double num2){
        boolean isValid = operator == '+' || operator == '-' || operator =='*' || operator == '/' || operator == '%';
        if (isValid) {
            System.out.println((operator == '+')? "Addition is "+ (num1+num2) : (operator == '-')? "Subtraction is "+ (num1-num2) :
                    (operator == '*')? "Multiplication is "+ (num1*num2) : (operator == '/')? "Division is "+ (num1/num2) :
                            "Remainder is "+ (num1%num2));

           /* switch (operator){
                case '+':
                    System.out.println("Addition is: "+ (num1+num2));
                    break;
                case '-':
                    System.out.println("Substraction is: "+(num1-num2));
                    break;
                case '*':
                    System.out.println("Multiplication is: "+(num1*num2));
                    break;
                case '/':
                    System.out.println("Division is: "+(num1/num2));
                    break;
                default:
                    System.out.println("Remainder is: "+(num1%num2));
                    break;

            }

            */

        }else{
            System.err.println("Invalid operator");
        }


        }

    }

