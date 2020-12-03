package day34_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Uniques {
    public static void main(String[] args) {

        String str = "bkjhbnjlknsvjnjlgvnjlabjbfhvaewgvf";

        ArrayList<Character> list = new ArrayList<>();

        //step 1
        for (char each : str.toCharArray()) list.add(each);//add to the list all chars
        // step 2
        for (char each : list) {
            if (Collections.frequency(list, each) == 1) {
                System.out.print(each + " ");
            }
        }


    }
}
