package day26_Arrays;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sentence = scan.nextLine();

        String[] words = sentence.split(" ");
        //System.out.println(Arrays.toString(words));
        String reversedSent = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSent += words[i] + " ";

        }
        reversedSent = reversedSent.trim();
        System.out.println(reversedSent);

    }
}
