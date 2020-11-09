package day22_JavaRecap;

import java.util.Scanner;

public class DivideNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numerator = scan.nextInt();
        int denominator = scan.nextInt();

        int result = 0;

        while (numerator >= denominator) {
            numerator -= denominator;
            result++;
        }
        System.out.println(result + " with a reminder: " + numerator);

        System.out.println("=====================================");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int count = 0;
        while (num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println(count);
        System.out.println("====================================");

        int one = scan.nextInt();
        int two = scan.nextInt();
        scan.close();

    }

}


/*
write a program that can divide two numbers without using / & % operators and returns the division and remainder
            ex:
                input:  10
                        3
                0utput:
                        3 with a remainder of 1
 */