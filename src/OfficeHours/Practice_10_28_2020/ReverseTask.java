package OfficeHours.Practice_10_28_2020;

import java.util.Scanner;

public class ReverseTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        // 01234
        scan.close();
        String result = "";
/*
       result += name.charAt(name.length()-1);
       result += name.charAt(3);
       result += name.charAt(2);
       result += name.charAt(1);
       result += name.charAt(0);

        System.out.println(result);
       */
        for (int i = name.length() - 1; i >= 0; i--) {
           // result += name.charAt(i);
            result += name.substring(i, i+1);
        }
        System.out.println(result);

    }
}
