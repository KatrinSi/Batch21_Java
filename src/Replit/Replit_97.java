package Replit;

import java.util.Scanner;

public class Replit_97 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        String word = scan.next();
        int result = 0;

        while (word.contains("java")){
            word = word.replaceFirst("java", "");
            result++;

        }
        System.out.println(result);
    }
}
