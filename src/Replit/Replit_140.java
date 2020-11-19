package Replit;

import java.util.Arrays;

public class Replit_140 {
    public static void main(String[] args) {

        String[] words = {"hello", "why", "by", "apple", "note"};
        String result = "";

        for (String each : words) {
            result += each.substring(0, 1) + each.substring(each.length() - 1) + " ";
        }
        String[] print = result.split(" ");
        System.out.println(Arrays.toString(print));

    }
}

/*
Given a String array words, iterate through each word and print first and last letter of each element in the format below.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print → [ho, wy, by, ae, ne]

 */