package Day35_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        String[] jobTitles = {"SDET", "Scrum Master", "QA", "Product Owner", "Developer", "BA", "QA", "SDET"};
        ArrayList<String> jobs = new ArrayList<>(Arrays.asList(jobTitles));

        jobs.retainAll(Arrays.asList("SDET", "QA"));

        //jobs.removeIf(p -> !p.equals("SDET") && !p.equals("QA"));
        System.out.println(jobs);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,5,4,7,9,7,-3,-5,-6,5));
        //nums.retainAll(Arrays.asList(5,7));
        System.out.println(nums);

        nums.removeIf(p -> !(p == 7 || p ==5) );
        System.out.println(nums);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.addAll(Arrays.asList(1,2,5,4,7,9,7,-3,-5,-6,5));

        nums2.removeIf(p -> p < 7);
        System.out.println(nums2);
        System.out.println("================================");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,5,4,6,10,14,5,46,59));

        //Solution 1:
        list.removeIf(p-> p >10);
        System.out.println(list);
        //Solution 2:
        ArrayList<Integer> temp = new ArrayList<>();

        for (int each:list){
            if(each <= 10){
                temp.add(each);
            }
        }
        list = temp;
        System.out.println(list);




    }
}
/*
 task03:
            1. create an Array of String called jobTitles
            2. write a program that only keeps the jobTitles that are: SDET and QA
    task04:
        Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
                solution 1: use lambda
                solution 2: do not use lambda
 */