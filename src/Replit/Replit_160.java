package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class Replit_160 {
    public static void main(String[] args) {

        //first way to assign variables to the array words
            Scanner scan = new Scanner(System.in);
            int size = scan.nextInt();//7
            String[] words = new String[size];
            for(int i=0; i < size; i++){
                words[i] = scan.next();//[java, code, python, code, rust, code, rust]
            }
            printUniqueWords(words);


        // second way to assign variables to the array words
        /*String[] words = {"java", "code", "python", "code", "rust", "code", "rust"};
        printUniqueWords(words);

         */

    }

    public static void printUniqueWords(String[] words) {
        //WRITE YOUR CODE HERE

        for (String each : words) {
            String unique = each;
            int count = 0;

            for (String eachWord : words) {
                if (unique.equals(eachWord)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(unique);
            }

        }


//temporary:
        /*String unique = words[1];
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (unique == words[i]) {
                count++;
            }
        }
        if (count == 1) {
            System.out.println(unique);
        }

         */

    }
}


/*
Complete a void method printUniqueWords() that will print only unique words from an array of strings.
Every single unique word should be printed from the new line.

Example:

java
code
python
code
rust
code
rust

input:[java, code, python, code, rust, code, rust]
output:
java
python
 */