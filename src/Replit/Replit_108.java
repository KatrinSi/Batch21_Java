package Replit;

import java.util.Scanner;

public class Replit_108 {
    public static void main(String[] args) {

        for (int j = 1; j <= 5; j++) { //2. to down (prints the statement(10 digits) 5 times)
            for (int i = 1; i <= 10; i++) { // 1. to right (prints )
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("==========================================");


        for (int b = 1; b <= 10; b++) {
            for (int a = 1; a <= 10; a++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("==========================================");

        // ASTERISKS Triangle

        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int d = 1; d <= n; d++) {//to down
            for (int c = 1; c <= d; c++) { // to right: c1(*) = d1(1 time); c2(*) = d1(2 times)
                System.out.print("*");
            }
            System.out.println();
        }

    }
}


/*
Assume that the int variables i and j have been declared, and that n has been declared and initialized.
Using for loops (you may need more than one), write code that will cause a triangle of asterisks of size n to be output to the screen.

Example:
input: 5
output: *
output: **
output: ***
output: ****
output: *****
 */