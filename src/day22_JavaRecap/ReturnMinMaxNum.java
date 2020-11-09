package day22_JavaRecap;

import java.util.Scanner;

public class ReturnMinMaxNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//1.  write a program that asks user to enter 5 numbers and returns the maximum number
        int max = -2147483648;// should be the minimum possible number

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a number: ");
            int n = scan.nextInt();

            if (n > max) {
                max = n;
            }
        }
        System.out.println("max = " + max);

        System.out.println("=============================");

//2.  write a program that asks user to enter 5 numbers and returns the minimum number
        int min = 2147483647; //should be the maximum possible number

        for (int j = 1; j <= 5; j++) {
            System.out.println("Enter a number: ");
            int input = scan.nextInt();
            if (input < min) {
                min = input;
            }
        }
        System.out.println("min num = " + min);

        System.out.println("===============================");

        //3. write a program that asks user to enter 5 numbers and returns the minimum
        int minimum = 2147483647;
        int maximum = -2147483648;

        for (int a = 1; a <= 5; a++) {
            System.out.println("Enter a num: ");
            int inp = scan.nextInt();
            if (inp < minimum) {
                minimum = inp;
            } else if (inp > maximum) {// or we can use separated if statement
                maximum = inp;
            }
        }
        System.out.println("min = " + minimum);
        System.out.println("max = " + maximum);
    }
}

