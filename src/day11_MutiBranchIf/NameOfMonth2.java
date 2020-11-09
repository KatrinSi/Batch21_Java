package day11_MutiBranchIf;

public class NameOfMonth2 {
    public static void main(String[] args) {
        int num = 11;

        String month = (num == 1)? "January" : (num == 2)? "February" : (num == 3)? "March" : (num == 4)? "April"
                     : (num == 5)? "May" : (num == 6)? "June" : (num == 7)? "July" : (num == 8)? "August"
                     : (num == 9)? "September" : (num == 10)? "October" : (num == 11)? "November" : "December";
        System.out.println(month);

    }
}
