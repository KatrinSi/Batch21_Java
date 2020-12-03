package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniques2 {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,1,2,3,3,4,4,5,6,7,7,8,9,9,9));
        nums.removeIf(p -> Collections.frequency(nums, p) == 1);
        System.out.println(nums);
        System.out.println("=================================");

        String str = "aabcccddttteed";
        ArrayList<String> chars = new ArrayList<>(Arrays.asList(str.split("")));
        //chars.removeIf(p -> Collections.frequency(chars, p));

    }
}
