package Replit;

import java.util.Scanner;

public class Replit_86 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String newGuest = "";
        String guestList = "";
        String guest = "";

        do {
            System.out.println("Please enter guest name:");
            guest = input.nextLine(); //Kate;

            guestList += ", "+guest;
            System.out.println("Do you want to enter new guest name:");
            newGuest = input.nextLine();

            if (newGuest.equalsIgnoreCase("yes")) {
                continue;
            } else {

                //guestList.replace(guestList.substring(guestList.length() - 2), "")

                System.out.println("Guest's list:"+guestList.substring(1));

                System.exit(0);

            }
        } while (newGuest.equalsIgnoreCase("yes"));


    }
}
/*
1. Enter guest name
2. Do you want to enter new guest name?
if yes,
than guest name + guest name

if no,
then exit the loop

 */