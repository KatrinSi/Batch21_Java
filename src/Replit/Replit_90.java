package Replit;

import java.util.Scanner;

public class Replit_90 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Split:");
        String split = scan.nextLine();

        System.out.println("Number of people:");
        int numOfPeople = scan.nextInt();

        System.out.println("Check amount:");
        double checkAmount = scan.nextDouble();
        scan.nextLine();
        System.out.println("Service Quality:");
        String quality = scan.nextLine();
        double checkWithTips = 0;
        double checkTotalPerson = 0;

        String people = "";
        for (int i = 1; i <= numOfPeople; i++) {
            people += "&";
        }

        System.out.println("Number of people entered: " + people);
        if (quality.equalsIgnoreCase("Excellent")) {
            checkWithTips = (0.25*checkAmount)+checkAmount;
        }else if(quality.equalsIgnoreCase("Great")){
            checkWithTips = (0.20*checkAmount)+checkAmount;
        }else if(quality.equalsIgnoreCase("Good")){
            checkWithTips = (0.15*checkAmount)+checkAmount;
        }else if(quality.equalsIgnoreCase("Fair")){
            checkWithTips = (0.10*checkAmount)+checkAmount;
        }else if(quality.equalsIgnoreCase("Poor")){
            checkWithTips = (0.05*checkAmount)+checkAmount;

        }
        System.out.println(checkWithTips);

        if (split.equalsIgnoreCase("yes")){
            checkTotalPerson = (checkWithTips/numOfPeople);
        }

        System.out.println("Total to pay: "+checkAmount);
        System.out.println("Total tip: "+(checkWithTips-checkAmount));
        System.out.println("Total per person: "+(checkTotalPerson));
        System.out.println("Tip per person: "+(checkWithTips-checkAmount)/numOfPeople);



    }
}

/*
Write your code inside the method.
Use the values given as method parameters.
Assign final values.
Then user should select service quality that will correspond to tip percent.
Poor = 5%
Fair = 10%
Good = 15%
Great = 20%
Excellent = 25%
The program should display the following information based on the user input:
Split or No split
Number of people entered: &&&&
Service Quality:
Total to pay:
Total tip:
Total per person:
Tip per person:
 */