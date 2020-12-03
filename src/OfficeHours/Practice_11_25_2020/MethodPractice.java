package OfficeHours.Practice_11_25_2020;

import javax.sound.midi.Soundbank;

public class MethodPractice {

    public static void main(String[] args) {
        DivisibleBy3();
        System.out.println("Hello");
        DivisibleBy3();
        System.out.println("How are you?");
        System.out.println("==========================");
        DivisibleBy3Custom(10,5);

        gradeReport(90);

        eligibleToVote(17,true);

    }

    public static void DivisibleBy3() {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void DivisibleBy3Custom(int start, int end) {

        if (end <= start) {
            System.out.println("Invalid number");
            return;// exits the current method
        }

        for (int i = start; i <= end; i++) {
            if (i % 3 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void gradeReport(int score) {

        if (score > 100 || score < 0) {
            System.err.println("Invalid score");
            return;//exits the current method "gradeReport" ONLY!
        }
        char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Great");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            default:
                System.out.println("Failed");
                break;

        }

    }

    public static void eligibleToVote(int age, boolean isUSCitizen){
        if (age <18){
            System.out.println("You must be at least 18 years old");
            return;
        }
        if (isUSCitizen == false){
            System.out.println("You must be a US citizen");
            return;
        }
        System.out.println("You are eligible to vote!");

    }

}
