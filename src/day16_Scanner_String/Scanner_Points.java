package day16_Scanner_String;

import java.util.Scanner;

public class Scanner_Points {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of people you live with");
        int people = input.nextInt();
        //int points = 0;
        String points = (people <= 2)? "1 point": (people <= 6)? "2 points" : "3 points";

        System.out.println("What city do you live in?");
        String city = input.next();

        System.out.println("Do you live in downtown?");

        System.out.println(points);


    }
}
/*
Count up some points based on the users input:
    Ask the user how many people they live with?
        if user lives with Less than 2 people: add one point
        if the user lives with 3 - 6 people: add two points
        if the user lives with more than 6 people: add three points
    Ask the user what city they live in?
    Ask the user if the live in downtown ("yes or no")
        if you live downtown, ask them have you thought about moving to the suburbs? ("yes or no")
            if they have thought about it, add one point
            if no, minus one point
    Ask the user their favorite animal?
    Ask the user how many pets they want?
    Print everything
 */