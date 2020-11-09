package Replit;

import java.util.Scanner;

public class Replit_73 {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String word = scan.next();
            //YOUR CODE HERE

            if (word.length()%2 != 0 && word.length() >= 5){
                int middle = word.length()/2; //int
                System.out.println(word.charAt(middle -1)+""+ word.charAt(middle)+"" + word.charAt(middle+1));
            }

        }
    }


