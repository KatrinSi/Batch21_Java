package day12_NestedIf;

public class Loan {
    public static void main(String[] args) {
        double minimumSalary = 50000;
        int jobYear = 3;
        int creditScore = 550;

        if (minimumSalary >= 30000)
            if (jobYear >= 2)
                if (creditScore >= 680) {
                    System.out.println("You are qualified for a loan.");
                } else {
                    System.out.println("You're eligible for a loan.");
                }else{
                    System.out.println("You must be on the job at least for 2 years.");
                } else {
                System.out.println("You must have minimum of 30k salary first.");
            }
        }
    }

