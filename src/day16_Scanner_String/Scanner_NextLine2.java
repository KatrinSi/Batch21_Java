package day16_Scanner_String;

import java.util.Scanner;

public class Scanner_NextLine2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter your full name:");
        String name = input.nextLine();

        System.out.println("name: "+ name);
        System.out.println("age: "+ age);
    }
}
