package day30_ReturnMethods;

import java.util.Scanner;

public class WarmUpTask2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        gradeCalculator(scan.nextInt());

    }

    public static void gradeCalculator(int score) {
        if (score >= 0 && score <= 100) {
            System.out.println((score >= 90) ? 'A' : (score >= 80) ? 'B' :
                    (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F');
        } else {
            System.err.println("Invalid score");
        }


    }

}
// 2. create a function that can calculate the garde of the student