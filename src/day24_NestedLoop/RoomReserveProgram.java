package day24_NestedLoop;

import java.util.Scanner;

public class RoomReserveProgram {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double totalPrice = 0;
        System.out.println("Do you want to reserve a room?");
        String answer = scan.next();
        String bed ="";

        while (answer.equalsIgnoreCase("yes")){
            System.out.println("Which bedroom do you want to reserve?");
            bed = scan.next();

            switch (bed){
                case "King":
                    totalPrice += 120;
                    break;
                case "Queen":
                    totalPrice += 100;
                    break;
                case "Single":
                    totalPrice += 80;
                    break;
                default:
                    System.out.println("Invalid room type.");
                    break;
            }
            System.out.println("Do you want to reserve another room?");
            answer = scan.next();
            if (answer.equalsIgnoreCase("yes")){
                continue;
            }else{
                break;
            }

        }
        System.out.println("Your room type: "+bed);
        System.out.println("The price: $"+totalPrice);
    }
}

/*
write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
            the program asks the user which bedroom does he/she wants to reserve and calculats the total price, and then the program will ask:
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            while answer is neither yes or no ==> please re-enter
            HINT: nested loop task, outter loop need to be an infinite loop
 */