package Replit;

import java.util.Scanner;

public class Replit_128 {
    public static void main(String[] args) {

        double[] temps = {80, 88, 88, 84, 82, 78, 60, 68};
        double avgTemp = 0;
        int k = 0;
        double total = 0;

        for (double each : temps) {
            total += each;
            k++;
        }
        avgTemp = total/k;

        System.out.println(avgTemp);

    }
}

/*
Given an array temps of doubles, containing temperature data, compute the average temperature.
Store the average in a variable called avgTemp.
Besides temps and avgTemp, you may use only two other variables -- an int variable k and a double variable named total, which have been declared.
Example:
input: 80 88 88 84 82 78 60 68
output: 78.5
 */