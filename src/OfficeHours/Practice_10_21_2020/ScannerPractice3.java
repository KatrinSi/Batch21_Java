package OfficeHours.Practice_10_21_2020;

import java.util.Scanner;

public class ScannerPractice3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your gender: ");
        String gender = scan.next();

        System.out.println("Enter your age: ");
        int age = scan.nextInt();
scan.nextLine();
        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Enter your zipcode: ");
        String zipcode = scan.next();

scan.nextLine();

        System.out.println("Enter your country name: ");
        String country = scan.nextLine();

        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble();

scan.nextLine();

        System.out.println("Enter your company name: ");
        String company = scan.nextLine();

        System.out.println("Enter your address: ");
        String address = scan.nextLine();
    }
}


/*
1. ask gender ( next() )
2. ask age ( nextInt() )
scan.nextLine()
3. ask full name ( nextLine() )
4. ask zipcode ( next() )
scan.nextLine()
5. ask country name ( nextLine() )
6. ask salary ( nextDouble() )
scan.nextLine()
7. ask companyName ( nextLine() )
8. ask address ( nextLine() )
 */