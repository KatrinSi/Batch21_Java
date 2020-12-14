package Replit;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit_213 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,2,3));

        nums.removeIf(p->p==1);
        System.out.println(nums);

    }
}
