package OfficeHours.Practice_12_02_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperationsPractice {
    public static void main(String[] args) {

        ArrayList<Character> chars = new ArrayList<>(Arrays.asList('A', 'A', 'B', 'C', 'D', 'C', 'A'));

        chars.removeAll(Arrays.asList('A'));
        System.out.println(chars);

        //keep 'C', 'B'

        chars.retainAll(Arrays.asList('C','B'));
        System.out.println(chars);



    }
}
