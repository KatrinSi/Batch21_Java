package day19_ForLoop;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first string:");
        String first = scan.next();

        System.out.println("Enter your second string:");
        String second = scan.next();

        if(first.length()>second.length() ){
            System.out.println(first);
        }else if(second.length()>first.length()){
            System.out.println(second);
        }else{
            System.out.println("Both are equal");
        }

    }
}

/*
write a program that can return the longest string frow two suer inputs
 */