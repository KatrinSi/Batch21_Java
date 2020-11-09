package day25_ArrayIntro;

import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {

       String[] month = {"Jan", "Feb", "Mar", "Apr","May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt(); //1 = index 0, 2 = index 1.....
        System.out.println(month[number-1]);


        String[] day = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        System.out.println("Enter a num");
        int num = scan.nextInt();

        System.out.println(day[num-1]);//index-1


    }
}
