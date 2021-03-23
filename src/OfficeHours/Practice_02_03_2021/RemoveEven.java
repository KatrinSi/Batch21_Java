package OfficeHours.Practice_02_03_2021;

import java.util.*;

public class RemoveEven {
    public static void main(String[] args) {

        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(nums));

        //set.removeIf(p->p%2==0);

       /* for (Iterator<Integer> i = set.iterator(); i.hasNext(); ){
            Integer p = i.next();
            if(p%2==0){
                i.remove();
            }
        }
        */
        Iterator<Integer> i = set.iterator();
        while (i.hasNext()) {
            if (i.next() % 2 == 0) {
                i.remove();
            }
        }
        System.out.println(set);
        System.out.println("------------------------------------------");

        Integer[] nums2 = {10, 10, 11, 11, 9, 9, 9, 9, 5, 5, 5, 6, 7, 4, 3, 2, 1};
        nums2 = new TreeSet<>(Arrays.asList(nums2)).toArray(new Integer[0]);//converting the collection to the array

        String[] names = {"j", "j", "m", "l", "k"};
        names = new TreeSet<>(Arrays.asList(names)).toArray(new String[0]);

        System.out.println(Arrays.toString(names));

    }

}
