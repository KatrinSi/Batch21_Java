package Replit;

import java.util.Scanner;

public class Replit_ForLoopsVowel {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        char[] chars = {'a','e','i','o','u'};
        String result = "";
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == chars[0] || word.charAt(i) == chars[1]
                    || word.charAt(i) == chars[2] || word.charAt(i) == chars[3]
                    || word.charAt(i) == chars[4]) {
                result += word.charAt(i);
            }
        }
        System.out.println(result);

        for (int i = 100; i >= 1; i--){
            System.out.println(i);
        }

    }
}
