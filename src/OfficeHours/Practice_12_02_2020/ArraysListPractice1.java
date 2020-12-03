package OfficeHours.Practice_12_02_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysListPractice1 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5));
        list2.addAll(Arrays.asList(6,7,8,9,10));

        System.out.println(list1.isEmpty());

        int lastInd = list1.size()-1;
        int n1 = list1.get(lastInd);

        list1.set(list1.size()-1, 7);
        System.out.println(list1);

        int [] nums = {11,12,13,14};
        for (int each : nums) list1.add(each);
        System.out.println(list1.contains(14));

        System.out.println(list1.indexOf(13) >=0);





    }



}
