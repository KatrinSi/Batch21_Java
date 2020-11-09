package day21_WhileLoops;

import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int result = 0;//0+5=5+10=15+...

        for (int i = 0; i < 1; ) {

            System.out.println("Enter numbers");
            int num = scan.nextInt();

            if(num < 0){ //negative num will not be added to the result
                break;
            }
            result += num; //5, 10
        }

        System.out.println("result = "+result);
    }


    }


/*
Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
            hint: you need an infinite
 */