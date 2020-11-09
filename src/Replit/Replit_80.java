package Replit;

import java.util.Scanner;

public class Replit_80 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String start = scan.next();
        String end = scan.next();
        String output = "";

        char first = start.charAt(0);
        char last = end.charAt(0);

        if (first != last) {

            for (char ch = first; ch <= last; ch++) {
                    switch (ch) {
                        case 'A':
                            if (ch == last) {
                                break;
                            }
                            output += "right";
                            break;
                        case 'B':
                            if (ch == last) {
                                break;
                            }
                            output += "down";
                            break;
                        case 'C':
                            if (ch == last) {
                                break;
                            }
                            output += "left";
                            break;
                        case 'D':
                            if (ch == last) {
                                break;
                            }
                            output += "up";
                            break;
                    }
                }
                System.out.println(output + ": " + end + " found");
            } else{
                System.out.println(end + " found");
            }


        }

    }

/*
Write a program that will print out route instructions. Your program should take 2 parameters: start point and endpoint. Use left, right, up and down for navigation. Insert ">" between commands. If start point equals to endpoint - display: "start/end(start or end variable!) found".
Note: you may move only clockwise.

Example:
Input: A
Input: D
Output: right > down > left: D found

Input: C
Input: C
Output: C found

 */