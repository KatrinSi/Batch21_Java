package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class Replit_109 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            words[i] = input.nextLine();
        }
        //leave above alone! :)
        //assume you have String array of 5 items

        //write your code below:
        //[apple, banana, pineapple, kivi, strawberry]
        //  0       1       2           3       4

        /*System.out.println(arr[0].substring(0,3));
        System.out.println(arr[1].substring(0,3));
        System.out.println(arr[2].substring(0,3));
        System.out.println(arr[3].substring(0,3));
        System.out.println(arr[4].substring(0,3));

         */

        System.out.println(""+words[0].charAt(0)+words[0].charAt(words[0].length()-1));
        System.out.println(""+words[1].charAt(0)+words[1].charAt(words[1].length()-1));
        System.out.println(""+words[2].charAt(0)+words[2].charAt(words[2].length()-1));
        System.out.println(""+words[3].charAt(0)+words[3].charAt(words[3].length()-1));
        System.out.println(""+words[4].charAt(0)+words[4].charAt(words[4].length()-1));


    }
}
