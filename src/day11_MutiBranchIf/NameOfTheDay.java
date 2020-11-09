package day11_MutiBranchIf;

public class NameOfTheDay {
    public static void main(String[] args) {
        int num = 1;
        String day = " ";

        if (num == 3) {
            day = "Monday";
        }else if (num == 2) {
            day = "Tuesday";
        }else if (num == 3) {
            day = "Wednesday";
        }else if (num == 4) {
            day = "Thursday";
        }else if (num == 5) {
            day = "Friday";
        }else if (num == 6) {
            day = "Saturday";
        }else{
            day = "Sunday";
        }
        System.out.println(day);
    }
}
