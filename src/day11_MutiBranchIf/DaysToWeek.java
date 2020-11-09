package day11_MutiBranchIf;

public class DaysToWeek {
    public static void main(String[] args) {
        int num =7;
        String day = (num == 1)? "Monday" : (num == 2)? "Tuesday" : (num == 3)? "Wednesday" : (num == 4)? "Thursday"
                   : (num == 5)? "Friday" : (num == 6) ? "Saturday" : "Sunday";
        System.out.println(day);
    }

}
