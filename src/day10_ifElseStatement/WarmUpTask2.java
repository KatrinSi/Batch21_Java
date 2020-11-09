package day10_ifElseStatement;

public class WarmUpTask2 {
    public static void main(String[] args) {
        double angle1 = 60;
        double angle2 = 60;
        double angle3 = 60;
        double sum = angle1+angle2+angle3;

        if (sum == 180) {
            System.out.println("The triangle is valid");
        }
        if (sum != 180) {
            System.out.println("The triangle is not valid");
        }
    }
}
/*
ValidTriangle
         A triangle is valid if the sum of all the three angles is equal to 180 degrees.
         Write a program that declares three integers as angles and check whether a triangle is valid or not.

 */