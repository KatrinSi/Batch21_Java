package day17_String;

import java.util.Scanner;

public class Scanner_Review2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the product name:");
        String product = input.nextLine();

        System.out.println("Enter the price:");
        double price = input.nextDouble();

        System.out.println("Enter the quantity:");
        int quantity = input.nextInt();
        input.nextLine();//enter from the above method is absorbed

        System.out.println("Enter their full name:");
        String fullName = input.nextLine();
        System.out.println(product);
        System.out.println(price);
        System.out.println(quantity);
        System.out.println(fullName);


    }
}
