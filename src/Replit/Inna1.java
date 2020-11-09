package Replit;

import java.util.Scanner;

public class Inna1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();  //craig_federighi@apple.gov

        String firstName = email.substring(0,1).toUpperCase() + email.substring(1,email.indexOf("_")).toLowerCase();
        String lastName = email.substring(email.indexOf("_")+1, email.indexOf("_")+2).toUpperCase()+
                email.substring(email.indexOf("_")+2,email.lastIndexOf("@")).toLowerCase();
        String domain = email.substring (email.indexOf("@")+1, email.indexOf("."));
        String topLevelDomain = email.substring (email.indexOf(".")+1);
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);
        System.out.println("Top-Level Domain: " + topLevelDomain);
    }
}

