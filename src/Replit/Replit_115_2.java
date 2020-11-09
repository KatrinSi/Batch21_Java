package Replit;

import java.util.Scanner;

public class Replit_115_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }

        //write your code below
        String largestWord = words[0];

        for (int i = 1; i < words.length; i++){
            if (words[i].length() > largestWord.length()){
                largestWord = words[i];
            }
        }
        System.out.println(largestWord);
    }
}
