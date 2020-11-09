package Replit;

import java.util.Scanner;

public class Replit_85 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;
        int numItem = 1;

        do {
            System.out.println("Enter Item" + numItem + " and its price:");
            item = scan.nextLine();
            price = scan.nextDouble();
            scan.nextLine();

            shoppingListReport += ", Item" + count + ":" + item + " Price:" + price;
            totalPrice += price;

            System.out.println("Add one more item?");
            countinue = scan.nextLine();
            if (countinue.equalsIgnoreCase("yes")) {
                numItem++;
                count++;
                continue;

            } else {
                System.out.println(shoppingListReport.replaceFirst(", ", ""));
                System.out.println("Total price: " + totalPrice);
                System.exit(0);
            }

        } while (countinue.equalsIgnoreCase("yes"));


    }
}
