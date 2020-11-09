package day15_Scanner;

import java.util.Scanner;

public class Scanner_Int {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number one: ");

        int num1 = scanner.nextInt();
        System.out.println("Enter number two: ");
        int num2 = scanner.nextInt();

        System.out.println("Number one is: "+num1);
        System.out.println("Number two is: "+num2);
        System.out.println("Sum is "+(num1+num2));

    }
}
