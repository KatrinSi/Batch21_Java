package day25_ArrayIntro;

import javax.swing.text.html.parser.Entity;
import java.util.Scanner;

public class MyFriends {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How may friends do you have?");
        int friends = scan.nextInt();

        String[] firstName = new String[friends];
        String[] lastName = new String[friends];

        for (int i= 0; i < friends; i++){ // for storing names

            System.out.println("Enter first name: ");
            String firstN = scan.next();
            firstName[i] = firstN.substring(0,1).toUpperCase()+firstN.substring(1).toLowerCase();

            System.out.println("Enter last name: ");
            String lastN = scan.next();
            lastName[i] = lastN.substring(0,1).toUpperCase()+lastN.substring(1).toLowerCase();
        }

        for (int i = 0; i < friends; i++){ // for printing names
            System.out.println(firstName[i] +" "+ lastName[i]);
        }
    }
}
