package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class Replit_132 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        //WRITE YOUR CODE HERE
        int judge = 1;
        for (int i = 0; i < score.length; i++) {
            System.out.println("Enter score for judge " + judge++);
            score[i] = input.nextFloat();// score
        }
        Arrays.sort(score);//[1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0]
        System.out.println(Arrays.toString(score));

        float remainingScore = 0;
        for (int i = 1; i < score.length - 1; i++) {
            remainingScore += score[i];
        }
        System.out.println(remainingScore);//5.0+ 5.0+ 5.0+ 5.0+ 8.0 = 28.0
        float total = 0;
        System.out.println("Enter difficulty:");
        float difficulty = input.nextFloat();//2.1
        if (difficulty >= 1.2 && difficulty <= 3.8) {
            total = remainingScore * difficulty;//28.0*2.1=58.799995
        }
        System.out.println(total);//58.799995
        float driversScore = (float) (total * 0.6);//35.279997

        total = driversScore;


        // FINAL OUTPUT
        System.out.printf("Total: %.2f", total);


    }
}

/*
In the sport of diving, seven judges award a score between 0 and 10, where each score may be a floating-point value.
The highest and lowest scores are thrown out, and the remaining scores are added together.
The sum is then multiplied by the degree of difficulty for that dive.
The degree of difficulty ranges from 1.2 to 3.8 points. The total is then multiplied by 0.6 to determine the divers score.
Use System.out.printf("Total: %.2f",total); in order to get rid of extra floating points.
output: Enter score for judge 1:
input: 1
output: Enter score for judge 2:
input: 5
output: Enter score for judge 3:
input: 5
output: Enter score for judge 4:
input: 5
output: Enter score for judge 5:
input: 5
output: Enter score for judge 6:
input: 8
output: Enter score for judge 7:
input: 9
output: Enter difficulty:
input: 2.1
output: Total: 35.28
 */