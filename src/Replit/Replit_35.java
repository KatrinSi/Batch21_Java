package Replit;

import java.util.Scanner;

public class Replit_35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        if (word.length() >5){
            System.out.println("Too long");
        }else if(word.length() <5){
            System.out.println("Too short");
        }else{
            System.out.println(""+word.length());
            //for (word.length()-1, word.length(),  )
        }


    }
}
