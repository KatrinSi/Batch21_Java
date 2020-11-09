package day11_MutiBranchIf;

public class GradeReportTask {
    public static void main(String[] args) {

        int score = 79;

        String grade = "";

        if (score <= 59) {
            grade = "F";
        } else if (score >=60) {
            grade = "D";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 80) {
            grade = "B";
        }else{
            grade = "A";
        }
        System.out.println("Your grade is: "+ grade);
        System.out.println("=======================================");

        char grade2 = ' ';
        if (score >= 90) {
            grade2 = 'A';
        }else if (score >=80) {
            grade2 = 'B';
        }else if (score >=70) {
            grade2 = 'C';
        }else if (score >=60) {
            grade2 = 'D';
        }else{
            grade2 = 'F';
        }
        System.out.println("Your grade is: "+ grade);
    }
}
