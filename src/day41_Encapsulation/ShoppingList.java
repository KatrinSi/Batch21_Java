package day41_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.addAll(Arrays.asList(
                new Item("Banana", 1.15, 3),
                new Item("Apple", 2.44, 4),
                new Item("Pomegranate", 5.5, 2),
                new Item("Orange", 2.30, 2),
                new Item("Blueberry", 5.00, 1)
        ));

        int total = 0;
        for (Item each : items) {
            total += each.calcCost();
        }
        System.out.println("Total price: "+total);

    }
}
