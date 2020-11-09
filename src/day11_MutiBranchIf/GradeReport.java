package day11_MutiBranchIf;

public class GradeReport {
    public static void main(String[] args) {
        int score = 70;
        String result = "";

        if (score < 60) {
            result = "Failed";
        }
        else if (score >= 60 && score < 90){
            result = "Passed";
        }else{
            result = "Passed with distinction";
        }
        System.out.println(result);
    }
}
