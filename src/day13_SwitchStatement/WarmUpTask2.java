package day13_SwitchStatement;

public class WarmUpTask2 {
    public static void main(String[] args) {

        int year = 2020;
        int month = 19;
        String result = "";
        boolean has30Days = month == 4 || month == 6 || month == 9 || month == 11;
        boolean has28or29days = month == 2;
        //boolean has31days = !has28or29days || !has30Days;

        if (month >= 1 && month <= 12) { //1~12

            if (has28or29days) {
                if (year % 4 == 0) {
                    result = "29 days";
                } else {
                    result = "28 days";
                }
            } else if (has30Days) {
                result = "30 days";
            } else {
                result = "31 days";
            }

        } else {
            result = "Invalid input";
        }
    }
}

/*
/*
write a program that can find the number of days in a month


            Note: MUST USE NESTED IF
 */