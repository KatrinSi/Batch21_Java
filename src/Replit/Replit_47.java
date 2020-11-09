package Replit;

import java.util.Scanner;

public class Replit_47 {

    public static void main(String[] args) {
        //DO NOT CHANGE
        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        //WRITE YOUR CODE HERE

        System.out.println("Enter your property type:");
        String propertyType = scan.nextLine(); //Condo, Townhouse, Single Family Home


        switch (propertyType) {

            case "Condo":
                propertyPrice = 50_000;
                break;
            case "Townhouse":
                propertyPrice = 75_000;
                break;
            case "Single Family Home":
                propertyPrice = 95_000;
                break;
        }

        System.out.println("How many bedrooms do you have?");
        numberOfBedrooms = scan.nextInt();
        int priceForEachBedroom = 30_000;
        int totalPriceBedrooms = 0;
        for (int i = 1; i <= numberOfBedrooms; i++) { // for bedrooms
            totalPriceBedrooms += priceForEachBedroom;
        }
        propertyPrice += totalPriceBedrooms;


        System.out.println("Do you have a backyard?");
        backyard = scan.nextBoolean();

        if (backyard && propertyType.equalsIgnoreCase("Condo")) {
            System.out.println("Backyard is not available for condo!");

        } else {
            propertyPrice += 5_000;
        }

        System.out.println("Do you have garage?");
        garage = scan.nextBoolean();
        if (garage) {
            System.out.println("How many spots?");
            garageSpots = scan.nextInt();
            int priceForSpot = 20_000;
            int totalPriceSpots = 0;
            if (garageSpots <= 10) {
                //
                for (int j = 1; j <= garageSpots; j++) {
                    totalPriceSpots += priceForSpot;
                }
            } else {
                System.out.println("Pardon, it's not a public parking!");
            }
            propertyPrice +=totalPriceSpots;

        }


            System.out.println("How close is metro station?");
            metroAccessibility = scan.nextFloat();
            if (metroAccessibility <= 1) {
                propertyPrice += 10_000;
            } else if (metroAccessibility <= 3) {
                propertyPrice += 5_000;
            }

            System.out.println("How close is highway?");
            highwayAccessibility = scan.nextFloat();
            if (highwayAccessibility <= 1) {
                propertyPrice += 15_000;
            } else if (highwayAccessibility <= 5) {
                propertyPrice += 8_000;
            } else if (highwayAccessibility <= 20) {
                propertyPrice += 4_000;
            }


            System.out.println("What's the rating of nearest school?");
            schoolScore = scan.nextFloat();
            if (schoolScore <= 10 && schoolScore >=8) {
                propertyPrice += 45_000;
            } else if (schoolScore < 8 && schoolScore >=4) {
                propertyPrice += 20_000;
            } else if (schoolScore < 4) {
                propertyPrice += 5_000;
            }
/*
            System.out.println("Does any of yours family members smoking?");
            smoking = scan.nextBoolean();
            if (smoking == true) {
                propertyPrice -= 5_000;
            }

   */

            System.out.println("Market report has been generated. \n Your estimate market price is: " + propertyPrice);

        }
    }








