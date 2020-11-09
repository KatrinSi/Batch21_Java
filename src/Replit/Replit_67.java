package Replit;

import java.util.Scanner;

public class Replit_67 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String word = scan.next();
            //WRITE YOUR CODE HERE
            String result = "";
            if (word.length() >5){
                System.out.println("Too long");
            }else if(word.length() <5){
                System.out.println("Too short");
            }else{
                for (int i = word.length()-1; i >= 0; i--){ //int
                    result += word.charAt(i);// have to convert int to string by charAt()

                }
                System.out.println(result); //string
            }


        }
    }

