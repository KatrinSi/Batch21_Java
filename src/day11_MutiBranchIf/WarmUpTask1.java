package day11_MutiBranchIf;

public class WarmUpTask1 {
    public static void main(String[] args) {
        int month = 6;
        boolean days28 = month == 2;
        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;
        boolean days31 = !days28 && !days30;

        int days = 0;

        if (days28) {
            days = 28;
        }
        if (days30) {
            days = 30;
        }
        if (days31) {
            days = 31;
        }
        System.out.println(days+" days");

    }
}
/*

	1. write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)
	 		Ex:
	 			month = 3

	 			output:
	 				31 days


 				month = 9

 				output:
 					30 days

		Hints: it cannot be done with if&else statement, you will need single if statements

 */