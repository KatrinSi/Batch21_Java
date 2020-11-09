package day18_String;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine();
        String lastName = scan.nextLine();

        String output1 = firstName.substring(0,1).toUpperCase();
        String output2 = lastName.substring(0,1).toUpperCase();
        System.out.println(output1+ "."+ output2);
    }
}
/*
write a program that can return the initials of the user
			ex:
				cybertek
				school

			output:
				C.S
 */