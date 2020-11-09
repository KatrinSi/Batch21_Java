package day25_ArrayIntro;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int total = 0;
        while (true) {
            System.out.println("Which bedroom do you want to reserve?");

            System.out.println("\t\tKing Bed ==> 120$");
            System.out.println("\t\tQueen Bed ==> 100$");
            System.out.println("\t\tSingle Bed ==> 80$");

            String room = scan.nextLine().toLowerCase();
            while (room.equalsIgnoreCase("King Bed") ||
                    room.equalsIgnoreCase("Queen Bed") || room.equalsIgnoreCase("Single Bed")) {
                System.out.println("Envalid Entry. Please Re-Enter");
                room = scan.nextLine().toLowerCase();

            }
            total += (room.equals("king bed")) ? 120 : (room.equals("queen bed")) ? 100 : 80;
            System.out.println("Would like to select another room?");
            String answer = scan.next().toLowerCase();

            while (answer.equalsIgnoreCase("yes")){
                continue;
        }
    }

}
}

/*
write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
            the program asks the user which bedroom does he/she wants to reserve and calculate the total price, and then the program will ask:
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            while answer is neither yes or no ==> please re-enter
 */
