package day33_ArrayList;

import java.util.ArrayList;

public class List_Intro {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();

        scores.add(1);
        scores.add(2);
        scores.add(3);

        scores.add(1, 3);//[1, 3, 2, 3]


        System.out.println(scores);

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("Eggs");
        groceryList.add("Water");
        groceryList.add("Milk");
        groceryList.add("Bread");
        groceryList.add(0,"Toilet Paper");
        groceryList.add(1, "Hand Sanitizer");
        groceryList.add(1, "Masks");

        System.out.println(groceryList.get(2));

        System.out.println(groceryList.size());

        System.out.println(groceryList);

        System.out.println(groceryList.get(groceryList.size()-1));


    }
}
