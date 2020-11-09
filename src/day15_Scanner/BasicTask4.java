package day15_Scanner;

import java.util.Scanner;

public class BasicTask4 {
    public static void main(String[] args) {

        Scanner data = new Scanner (System.in);

        System.out.println("Enter your zipcode: ");
        long zipcode = data.nextLong();
        System.out.println("Your zipcode is: "+zipcode);

        System.out.println("Enter the number of people you live with: ");
        byte numOfPeople = data.nextByte();
        System.out.println("The number of people you live with is: "+numOfPeople);

        System.out.println("Are you married? true/false");
        boolean married = data.nextBoolean();
        System.out.println("You are married: "+married);

        System.out.println("I see ");
    }
}
/*
Ask the user to enter their zipcode (long),
the number of people they live with (byte),
if they are married or not (boolean - true for married/false for not)
and print the values in the following format:
"I see you are $marriedOrNot! and live with $peopleNum people in your
house which is in the $zipcode area! "

	Ex: 31009, 4, false --> I see you are not married and live with
	4 people in your house which is in the 31009 area!
 */