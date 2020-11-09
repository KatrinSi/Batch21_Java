package day18_String;

import java.util.Scanner;

public class String_Methods {
    public static void main(String[] args) {

        String str = "Cybertek";
        str = str.concat(" School");
        System.out.println(str);

        String str2 = "Cybertek";
        str2 = str2 + " School";
        System.out.println(str2);

        System.out.println("===========================");
        String name = "bank of america";

        name = name.toUpperCase();
        System.out.println(name);
        System.out.println(name.toLowerCase());
        System.out.println("=============================");

        String t1 = "                     Hello";// white space
        System.out.println(t1);
        t1 = t1.trim();
        System.out.println(t1);

        String t2 = "Hello Everyone";
        t2 = t2.trim();
        System.out.println(t2);

        System.out.println("========================");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = scan.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = scan.nextLine();

        System.out.println("First name is: "+firstName.trim());
        System.out.println("Last name is: "+ lastName.trim());
    }
}
