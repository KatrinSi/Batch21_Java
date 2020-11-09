package Replit;

import java.util.Scanner;

public class Replit_96 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        String result = "";

        for (int i = 1; i <= count; i++){
            if (i != count){
                result += word+separator;
            }else{
                result += word;
            }
        }
        System.out.println(result);

    }
}
