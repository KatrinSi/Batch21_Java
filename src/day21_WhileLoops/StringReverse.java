package day21_WhileLoops;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        int lastInd = word.length()-1;
        String reverseWord = "";

        for (int i = lastInd; i >= 0; i--){
            //System.out.println(word.charAt(i));
            reverseWord += word.charAt(i);

        }
        System.out.println(reverseWord);

        boolean isPalindrome = word.equalsIgnoreCase(reverseWord);
        System.out.println(isPalindrome);
        }

    }

