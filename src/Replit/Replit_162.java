package Replit;

import java.util.Scanner;

public class Replit_162 {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            fib(num);

    }

    public static void fib(int num) {

       int num1 = 0;
       int num2 = 1;
       int fibNum = 0;

        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144

        for (int i =1; i < num; i++){
            fibNum = num1+num2;//1
            num1 = num2;
            num2 = fibNum;
        }
        System.out.println(fibNum);
    }
}


/*
Complete a method fib() that will compute Fibonacci numbers
In Fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144,……...
The first two numbers of the Fibonacci series are 0 and 1.
You are given a number num, print n-th Fibonacci Number.
Input  : 2
Output : 1
(Explanation : because number 2 in the sequence of 0, 1 --> 1)

Input  : 8
Output : 21
(Explanation : because number 8 in the sequence of
  0, 1, 1, 2, 3, 5, 8, 13, 21 --> 21)


 */