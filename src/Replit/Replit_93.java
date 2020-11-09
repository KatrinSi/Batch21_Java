package Replit;

import java.util.Scanner;

public class Replit_93 {
    public static void main(String[] args) {

        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.indexOf("java") == 0 || word.indexOf("java") == 1){
            exists = true;
        }else{
            exists = false;
        }

        System.out.println(exists);
    }
}
