package Replit;

import java.util.Scanner;

public class Replit_99 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        int result = 0;
        String prefix = str.substring(0,n); //a
        while(str.contains(prefix)){
            str = str.replaceFirst(prefix, "");
           result++;
        }
        boolean output = result == 2;
        System.out.println(output);

        if (output){
            System.out.println(prefix+" appears twice");
        }else{
            System.out.println(prefix+" appears once only");
        }
    }
}
/*
Given a string, consider the prefix string made of the first n chars of the string. Does that prefix string appear somewhere else in the string?
Assume that the string is not empty and that n is in the range from 1 till str.length().
Example:
input: abXYabc
input: 1
output: true
a appears twice

Example:
input: abXYabc
input: 2
output: true
ab appears twice

Example:
input: abXYabc
input: 3
output: false
abX appears once only
 */