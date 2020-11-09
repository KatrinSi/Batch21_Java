package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class Replit_119 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //Write your code below
        int count = 0;
            char ch = '@';

            for (int i = 0; i < email.length(); i++) {
                if (ch == email.charAt(i)) {
                    count++;
                }
            }
       String[] indexes = email.split("@");
        if (email.contains("@") && count ==1 ) {
            System.out.println("Email id: " + indexes[0]);
            System.out.println("Email domain: " + indexes[1]);
        } else{
            System.out.println("invalid email");
        }


    }
}
