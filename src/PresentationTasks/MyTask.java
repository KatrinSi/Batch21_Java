package PresentationTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.SimpleTimeZone;

public class MyTask {
    //1. Given a list of people' names: "Ahmed", "John", "Eric", "Ahmed", "Edison".
    // Write a java operation to remove all the names named Ahmed
    //2. Write a return method that returns the Fibonacci of any given number
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233 ...
    //3. Write a method which prints out the numbers from 1 to 30
    // but for numbers which are a multiple of 3 print "FIN" instead of the number
    // and for numbers which are a multiple of 5, print "RA" instead of the number.
    // For numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
    //1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN 19 RA FIN 22 23 FIN RA 26 FIN 28 29 FINRA
    public static void main(String[] args) {
        finra();
    }

    public static void finra() {
        String result = "";

        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result += "FINRA ";
            } else if (i % 3 == 0) {
                result += "FIN ";
            } else if (i % 5 == 0) {
                result += "RA ";
            }else{
                result+= i+" ";
            }
        }

        System.out.println(result);
    }


}
