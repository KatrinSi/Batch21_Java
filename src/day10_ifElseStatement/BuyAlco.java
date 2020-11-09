package day10_ifElseStatement;

public class BuyAlco {
    public static void main(String[] args) {
        int age = 20;

        if (age >= 21) {
            System.out.println("You are eligible to by alco.");
        } else {
            System.out.println("You are not eligible to by it.");
        }

        int year = 2020;

        if (year % 4 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is a not leap year.");
        }


    }

    }
