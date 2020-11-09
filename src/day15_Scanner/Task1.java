package day15_Scanner;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer number: ");

        int num = scanner.nextInt();

        String result =  (num%2==0)? num+ " is even number" : num+ " is odd number";

        System.out.println(result);

    }
}
