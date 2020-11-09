package Replit;

import java.util.Scanner;

public class Replit_84 {
    public static void main(String[] args) {
        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you a premium customer?");
        boolean isPremiumCustomer = scan.nextBoolean();
        System.out.println("How many books do you purchase?");
        int booksPurchased = scan.nextInt();
        if (isPremiumCustomer == true) {
            if (booksPurchased >= 5 && booksPurchased <= 8) {
                freeBooks = 1;
            } else {
                freeBooks = 2;
            }
        } else {
                if (booksPurchased >= 7 && booksPurchased <= 12) {
                    freeBooks = 1;
                } else {
                    freeBooks = 2;

                }
            }
        System.out.println("You get "+freeBooks+" books for free");
        }
    }

/*
Online Book Merchants offers premium customers 1 free book with every purchase
of 5 or more books and offers 2 free books with every purchase of 8 or more books.
It offers regular customers 1 free book with every purchase of 7 or more books,
and offers 2 free books with every purchase of 12 or more books.
     Write a program that assigns freeBooks the appropriate value based on the
     values of the boolean variable isPremiumCustomer and the int variable nbooksPurchased.
     Print amount of freeBooks into the console.
 */