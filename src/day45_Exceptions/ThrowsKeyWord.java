package day45_Exceptions;

import day15_Scanner.Scanner_Boolean;

import java.util.Scanner;

public class ThrowsKeyWord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scan.nextInt();
        if (age < 0 || age > 150) {
            throw new RuntimeException("Invalid age " + age);
        }

        if (age >= 21) {
            System.out.println("You're eligible to buy alco");
        } else {
            System.out.println("Not eligible");
        }
        scan.close();

    }
}
