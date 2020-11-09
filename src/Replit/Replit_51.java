package Replit;

import java.util.Scanner;

public class Replit_51 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Split:");
        String split = scan.next();

        System.out.println("Number of people:");
        int numOfPeople = scan.nextInt();
        String people = "&";
        String resultNumOfPeople = " ";

        for (int i = 1; i <= numOfPeople; i++) {
            resultNumOfPeople += people;
        }

        System.out.println("Check amount:");
        double check = scan.nextDouble();

        System.out.println("Service Quality:");
        double totalToPay = 0.0;
        String totalQuality = scan.next();
        if (totalQuality.equalsIgnoreCase("Excellent")) {
            totalToPay = check + (check * 0.25);
        } else if (totalQuality.equalsIgnoreCase("Great")) {
            totalToPay = check + (check * 0.2);
        } else if (totalQuality.equalsIgnoreCase("Good")) {
            totalToPay = check + (check * 0.15);
        } else if (totalQuality.equalsIgnoreCase("Fair")) {
            totalToPay = check + (check * 0.1);
        } else if (totalQuality.equalsIgnoreCase("Poor")) {
            check *= 0.05;
        }

        double totalPerPerson = 0.0;
        if (split.equalsIgnoreCase("Yes")) {
            totalPerPerson = totalToPay / numOfPeople;
        }

        double totalTip = totalToPay - check;
        double tipPerPerson = totalTip / numOfPeople;

        System.out.println("Number of people entered:" + resultNumOfPeople);
        System.out.println("Total to pay: " + totalToPay);
        System.out.println("Total tip: " + totalTip);
        System.out.println("Total per person: " + totalPerPerson);
        System.out.println("Tip per person: " + tipPerPerson);

    }
}
