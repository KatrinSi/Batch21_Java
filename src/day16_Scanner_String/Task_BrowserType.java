package day16_Scanner_String;

import java.util.Scanner;

public class Task_BrowserType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of a browser:");
        String browser = input.nextLine();
        input.close();
        String output = browser+ " is opening";

        switch (browser){
            case "Chrome":
            case "CHROME":
                System.out.println(output);
                break;
            case "Safari":
                System.out.println(output);
                break;
            case "Firefox":
                System.out.println(output);
                break;
            case "Internet Explorer":
                System.out.println(output);
                break;
            default:
                System.out.println("Invalid input");

        }
    }
}
