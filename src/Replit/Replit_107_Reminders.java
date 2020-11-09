package Replit;

import java.util.Scanner;

public class Replit_107_Reminders {
    public static void main(String[] args) {

        int num, digit1, digit2, digit3, digit4, digit5;
        //WRITE YOUR CODE HERE

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your number:");
        num = scan.nextInt();// 12345
        digit1 = num / 10_000;//1.2345
        //12345 / 10 000 = 1 * 10 000 = 10 000; 12 345 - 10 000 = 2 345/ 1 000 = 2
        digit2 = num % 10_000 / 1_000;
        //12345 / 1 000 = 12 * 1000 = 12 345 - 12 000 = 345 / 100 = 3
        digit3 = num % 1_000 / 100;
        //12345 / 100 = 123 * 100 = 12 300; 12 345 - 12 300 = 45 /10 = 4
        digit4 = num % 100 / 10;
        //12345 / 10 = 1 234 * 10 = 12 340; 12 345 - 12 340 = 5 / 1 = 5
        digit5 = num % 10 / 1;
        //                       5   1234  12340
        System.out.println(12345 -(12345/10)*10);

        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(digit4);
        System.out.println(digit5);

    }
}
