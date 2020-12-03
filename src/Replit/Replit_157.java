package Replit;

import java.util.Scanner;

public class Replit_157 {

    public static void main(String[] args) {
        String time = "07:05:45PM";
        timeConversion(time);
    }

    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */

        String[] separate = s.split(":");
        if (separate[2].contains("PM")) {
            int hour = Integer.parseInt(separate[0]);
            hour += 12;
            separate[0] = hour + "";
        }
        String time2 = "";
        for (int i = 0; i < separate.length; i++) {
            time2 += separate[i];
            if (i == 0 || i == 1) {
                time2 += ":";
            }
        }
        time2 = time2.replace("PM", "").replace("AM","");

        System.out.print(time2);

    }
}
/*
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
Function Description
It should print a new string representing the input time in 24 hour format.
timeConversion has the following parameter(s):
s: a string representing time in  12 hour format

Input: 07:05:45PM
Output: 19:05:45
 */