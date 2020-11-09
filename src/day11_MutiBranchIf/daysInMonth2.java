package day11_MutiBranchIf;

public class daysInMonth2 {
    public static void main(String[] args) {
        int month = 2;
        boolean days28 = month == 2;
        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;
        boolean days31 = !days28 && !days30;

        int days = 0;

        if (days28) {
            days = 28;
        } else if (days30) {
            days = 30;
        }else{
            days = 31;
        }
        System.out.println(days + " days");
        System.out.println("==========================");

        int days2 = (days28) ? 28 : (days30) ? 30 : 31;
        System.out.println(days2+ " days.");


    }
}
