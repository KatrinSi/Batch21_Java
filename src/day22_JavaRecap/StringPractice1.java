package day22_JavaRecap;

import sun.nio.ch.sctp.SctpChannelImpl;

import java.util.Scanner;

public class StringPractice1 {
    public static void main(String[] args) {

        String sentence = "My name is Muhtar";
        String name1 = sentence.substring(11, sentence.length());
        System.out.println(name1);


        String name2 = sentence.substring(11);
        System.out.println(name2);

        String web = "https://www.amazon.com";
        String domain = web.substring(web.lastIndexOf(".") + 1);
        System.out.println(domain);

        String name = web.substring(web.indexOf(".") + 1, web.lastIndexOf("."));
        String firstLetter = name.substring(0, 1).toUpperCase() + name.substring(1);
        System.out.println(firstLetter);

        System.out.println("=====================================================");


        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine().toLowerCase().replace(" ", "");
        String lastName = scan.nextLine().toLowerCase();
        scan.close();
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);


    }

}
