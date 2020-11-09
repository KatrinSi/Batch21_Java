package Replit;

import java.util.Scanner;

public class Replit_87 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inhabitants = scan.nextInt();
        int day = 0;


        do {
            if (inhabitants == 0) {
                System.out.println("---- EXTINCT ----");
                break;
            }

            System.out.println("Day " + day + "[" + inhabitants + "]");
            inhabitants = inhabitants / 2;
            day++;
        } while (inhabitants >= 0);

    }


}


