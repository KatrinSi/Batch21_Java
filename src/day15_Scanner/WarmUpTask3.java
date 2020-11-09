package day15_Scanner;

public class WarmUpTask3 {
    public static void main(String[] args) {

        int n1 = 1;
        int n2 = 2;
        int n3 = 3;

        int result1 = (n1%2 == 0)? n1*5 : n1*10;
        int result2 = (n3%5 == 0)? n3/5 : n3/2;
        //int result3 = ()



        System.out.println(result1);
        System.out.println(result2);
    }

    }



/*
Given 3 numbers (int) and a boolean calculate a number based on these conditions:

	- If the first number is even, multiple it by 5, but if it's odd, multiple it by 10.

	- If the last number is a multiply of 5 divide it by 5, but if the number is not divide it by 2

	- If the given boolean is true:
		- add all the numbers together
		- After adding the numbers if the total value is divisible by 10 evenly then print the number, otherwise print "invalid result"
	- If the given boolean is false:
		- multiple all the numbers together
		- After multiplying the numbers, if the number is odd, then print it, otherwise print "invalid result"
 */