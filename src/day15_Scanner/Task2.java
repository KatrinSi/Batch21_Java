package day15_Scanner;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner ask = new Scanner(System.in);

        System.out.println("Enter your age: ");
        byte age = ask.nextByte();

        System.out.println("Enter your favorite number: ");
        long favNum = ask.nextLong();

        System.out.println("Are you a student? Enter true or false");
        boolean student = ask.nextBoolean();

        System.out.println("My age is: "+age+"\nMy favorite number is: "+favNum);

        String message =  (student)? "Great, you are a student!" : "Oh okay, you are not a student";
        System.out.println(message);
    }
}
