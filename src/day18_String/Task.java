package day18_String;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first word: ");
        String firstWord = scan.nextLine();
        System.out.println("Enter the second word: ");
        String secondWord = scan.nextLine();

        System.out.println(firstWord.substring(1, firstWord.length()) + secondWord.substring(1, secondWord.length()));

        String s1 = "I like movie and books";
        String word1 = s1.substring(7, 12);
        System.out.println(word1);
        System.out.println("===========================");

        String firstName = "cYBERtek";//Marwan
        String firstChar = firstName.substring(0,1).toUpperCase();
        System.out.println(firstChar);
        String name = firstChar + firstName.substring(1,firstName.length()).toLowerCase();
        System.out.println(name);

        System.out.println("=========================");

        System.out.println("Enter your first name: ");
        String f = scan.nextLine();
        System.out.println("Enter your last name: ");
        String l = scan.nextLine();
        f = f.substring(0,1).toUpperCase() + f.substring(1, f.length()).toLowerCase();
        l = l.substring(0,1).toUpperCase() + l.substring(1, l.length()).toLowerCase();
        System.out.println(f + " " +l);

    }
}
