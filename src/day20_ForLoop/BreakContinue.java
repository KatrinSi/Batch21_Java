package day20_ForLoop;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i--) { // i: 1; 0...

            if (i < 1) {
                break; //exits loop immediatly
            } else {
                System.out.println("Hello Batch21");
            }
        }
        System.out.println("================================");
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i == 0; ) {
            System.out.println("Enter two numbers: ");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();


            System.out.println("Enter math operator: ");
            char o = scan.next().charAt(0);

            switch (o){
                case '*':
                    System.out.println("Result is "+(num1*num1));
                    break;
                case '/':
                    System.out.println("Result is "+(num1/num2));
                    break;
                case '%':
                    System.out.println("Result is "+(num1%num2));
                    break;
                default:
                    System.err.println("Invalid operator");
            }

            System.out.println("Would you like to continue? yes, no");
            String answer = scan.next();
            if (answer.equalsIgnoreCase("no")){
                System.out.println("Thank you for using our calculator");
                break;
            }
            }

        }

    }

