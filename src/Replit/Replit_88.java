package Replit;

import java.util.Scanner;

public class Replit_88 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();


        while (word.contains("cat")) {
            word = word.replaceFirst("cat", "");
            countOfCats++;
        }
        System.out.println(word);
        System.out.println(countOfCats);
        while (word.contains("dog")) {
            word = word.replaceFirst("dog", "");
            countOfDogs++;
        }
        System.out.println(word);
        System.out.println(countOfDogs);

       System.out.println(countOfCats == countOfDogs);
    }
}
