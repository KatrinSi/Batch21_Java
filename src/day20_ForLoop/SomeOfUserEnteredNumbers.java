package day20_ForLoop;

import java.util.Scanner;

public class SomeOfUserEnteredNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        System.out.println("Enter a number");

        int num1 = scan.nextInt();

        System.out.println("Enter a number");
        int num2 = scan.nextInt();

        System.out.println("Enter a number");
        int num3 = scan.nextInt();
        */
        int times = scan.nextInt();
        int result = 0;
        for (int i = 1; i <= times; i++) {// +1 = 1 + 2 = 3 + 3  = 6+4 =10+5 =15
            System.out.println("Enter a number: " + i);
            result += scan.nextInt(); //result = result + scan.nextInt();
        }
        scan.close();
        System.out.println("result: "+result);
    }
}
