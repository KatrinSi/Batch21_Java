package Replit;

import java.util.Scanner;

public class Replit_125 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(), scan.next(), scan.next(), scan.next()};
//                          java         cable       red         vivid        remedy         grace
        String word = str[0];//java

            for (int j = 0; j < str.length; j++) {//index in each word
                if (str[j].length() < word.length()) {//str[0] str[1] str[2] str[3] str[4] str[5]
                    word = str[j];
                }
            }
        System.out.println(word);
        }

    }

/*
java
cable
red
vivid
remedy
grace
 */