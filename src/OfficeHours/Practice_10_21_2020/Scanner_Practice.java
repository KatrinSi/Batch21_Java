package OfficeHours.Practice_10_21_2020;

import java.util.Scanner;
//the class

public class Scanner_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //the object of the Scanner
        //we are able to call methods now
        System.out.println("Enter your score: ");
        int score = scan.nextInt();
        scan.close();

        String grade = " ";

        if (score >= 0 && score <= 100) { //pre condition. We define frames
 /*           if (score >= 90) {//becomes false when score is < 90
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else { // otherwise
                grade = "F";
            }
*/
            grade = (score >=90)? "Excellent" : (score >=80)? "Great"
                    : (score >=70)? "Good" : (score >=60)? "Passed"
                    : "Failed";
        } else {
            System.out.println("Invalid");//otherwise
        }
        System.out.println(grade);
    }
}
/*

we know Score ,but want to know Grade
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59

pre condition: grade > 0&& grade <=100
 */