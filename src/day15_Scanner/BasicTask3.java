package day15_Scanner;
import java.util.Scanner;
public class BasicTask3 {
    public static void main(String[] args) {

        Scanner dateOfBirth = new Scanner(System.in);

        System.out.println("Enter the year of your birth: ");
        int year = dateOfBirth.nextInt();

        System.out.println("Enter the month of your birth: ");
        int month = dateOfBirth.nextInt();

        System.out.println("Enter the day of your birth: ");
        int day = dateOfBirth.nextInt();

        System.out.println(month+ "/"+day+"/"+year+" is your birthday.");
    }
}

/*
Ask the user to enter the year, month number, and day (pick any datatype for the values) they were born and print in the following format:
	" $month / $day / $year is your birthday "
 */