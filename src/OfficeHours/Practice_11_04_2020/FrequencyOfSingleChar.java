package OfficeHours.Practice_11_04_2020;

import java.util.Scanner;

public class FrequencyOfSingleChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//*    if we don't want to remove any chars from the string, than this way is better, otherwise we could use removeFirst method:
        System.out.println("Enter a string");
        String str = scan.next();

        System.out.println("Enter a character");
        char ch = scan.next().charAt(0);// the character from user
        scan.close();

        int frequency = 0;
        for(int i = 0; i < str.length(); i++){
            if(ch == str.charAt(i)){
                frequency++;
            }
        }
        System.out.println("Frequency of the character "+ ch + " is: "+frequency);

    }
}
