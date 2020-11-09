package day15_Scanner;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Scanner;

public class Substring2 {
    public static void main(String[] args) {
        String str = "Today is Monday";
        String word = str.substring(9);

        System.out.println(word);
        System.out.println("=============================");
        Scanner scan = new Scanner(System.in);

        String firstName = scan.next();
        System.out.println(firstName.substring(0, 1).toUpperCase()+firstName.substring(1).toLowerCase());


    }
}

