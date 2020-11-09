package day22_JavaRecap;

import java.util.Scanner;

public class StringPractice2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine();
        String lastName = scan.nextLine();
        scan.close();


        String initials = firstName.substring(0, 1).toUpperCase()+"." + lastName.substring(0, 1).toUpperCase()+".";
        System.out.println(initials);


    }
}
