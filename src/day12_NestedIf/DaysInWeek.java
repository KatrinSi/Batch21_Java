package day12_NestedIf;

public class DaysInWeek {
    public static void main(String[] args) {

        int day = 8;
        String name = " ";

        if (day >= 1 && day <= 7) {

            if (day == 1) {
                name = "Monday";

            } else if (day == 2) {
                name = "Tuesday";

            } else if (day == 3) {
                name = "Wednesday";

            } else if (day == 4) {
                name = "Thursday";

            } else if (day == 5) {
                name = "Friday";

            } else if (day == 6) {
                name = "Saturday";

            }else{
                name = "Sunday";
            }
        }else{
            name = "Invalid number";
        }
        System.out.println(name);

    }
}
