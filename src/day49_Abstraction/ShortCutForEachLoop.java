package day49_Abstraction;

import SelfPractice.nums;

import java.util.ArrayList;
import java.util.Arrays;

public class ShortCutForEachLoop {
    public static void main(String[] args) {

        ArrayList<Integer> odds = new ArrayList<>();
        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> greaterThan5 = new ArrayList<>();

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        nums.forEach(p -> {if (p%2 == 0) evens.add(p); else odds.add(p);} );
        //or
        nums.forEach(p -> {
            if (p % 2 == 0) evens.add(p);
            else odds.add(p);
        });
        System.out.println("odds = " + odds);
        System.out.println("evens = " + evens);

        nums.forEach(p -> {if (p > 5) greaterThan5.add(p); });
        System.out.println("greaterThan5 = " + greaterThan5);

    }
}
