package Replit;

import java.util.Scanner;

public class Replit_77 {
    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                String email = scan.next();

                String firstName = email.substring(1, email.indexOf("_"));
                String firstLaterOfFirstName = (""+email.charAt(0)).toUpperCase();
                System.out.println("First name: "+firstLaterOfFirstName+firstName);

                String lastName = email.substring(email.indexOf("_")+2,email.indexOf("@"));
                String firstLaterOfLastName = (""+email.charAt(email.indexOf("_")+1)).toUpperCase();

                System.out.println("Last name: "+firstLaterOfLastName+lastName);


                String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));

                System.out.println(domain);
                String topLevelDom = email.substring(email.indexOf(".")+1);
                System.out.println(topLevelDom);


    }
        }

