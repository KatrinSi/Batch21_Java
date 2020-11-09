package Replit;

import java.util.Scanner;

public class Replit_79 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.next();

        if (word.contains("x")||word.contains("X")) {

            System.out.println(word.replace("x", "").replace("X", ""));
        }else{
            System.out.println(word);
        }
    }
}
