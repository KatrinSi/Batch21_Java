package day15_Scanner;

public class WarmUpTask2 {
    public static void main(String[] args) {
        char letter = 'd';
        String lowercase = "\""+letter+"\"" + " is lowercase letter";
        String uppercase = "\""+letter+"\"" + " is uppercase letter";

        switch (letter) {
            case 'a':
                System.out.println(lowercase);
                break;
            case 'b':
                System.out.println(lowercase);
                break;
            case 'c':
                System.out.println(lowercase);
                break;
            case 'A':
                System.out.println(uppercase);
                break;
            case 'B':
                System.out.println(uppercase);
                break;
            case 'C':
                System.out.println(uppercase);

            default:
                System.err.println("Something went wrong");


        }

    }
}


/*
Given a letter (char) determine if the character is an uppercase letter or lowercase letter
	Ex: 'b'  --> lowercase
		'G'  --> uppercase
		'O'  --> uppercase

 */