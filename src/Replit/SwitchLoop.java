package Replit;

import java.util.Scanner;

public class SwitchLoop {
    public static void main(String[] args) {


        //Scanner scan = new Scanner(System.in);

        String start = "B";//scan.next();
        String end = "D";//scan.next();
        String output = "";

        if (!start.equals(end)) {
            for (int i = 1; i < 4; i++) {
                switch (start) {
                    case "A":
                        if (start.equals(end)) {
                            break;
                        }
                        output += "right";
                        break;
                    case "B":
                        if (start.equals(end)) {
                            break;
                        }
                        output += "down";
                        break;
                    case "C":
                        if (start.equals(end)) {
                            break;
                        }
                        output += "left";
                        break;
                    case "D":
                        if (start.equals(end)) {
                            break;
                        }
                        output += "up";
                        break;
                }
                System.out.println(output + ": " + end + " found");
            }
        } else {
            System.out.println(end + " found");


        }


    }
}


