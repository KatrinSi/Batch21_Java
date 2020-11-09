package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class Replit_106 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == vowels[0] || word.charAt(i) == vowels[1] || word.charAt(i) == vowels[2]
                    || word.charAt(i) == vowels[3] || word.charAt(i) == vowels[4]){
                result += word.charAt(i);
            }

        }
        System.out.println(result);

    }

}

