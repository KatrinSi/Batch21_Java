package Replit;

import java.util.Scanner;

public class Replit_101 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        String word1 = "java";
        String word2 = "python";
        int word1Result = 0;
        int word2Result = 0;

        while (sentence.contains(word1)) {
            sentence = sentence.replaceFirst(word1, "");
            word1Result++;
        }
        while (sentence.contains(word2)) {
            sentence = sentence.replaceFirst(word2, "");
            word2Result++;

        }
        System.out.println(word1Result == word2Result);

    }

}

