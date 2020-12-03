package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class SimpleLambdaExpressions {
    public static void main(String[] args) {
        //predicate

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

       /* for (int i = 0; i < nums.size();i++){
            if (nums.get(i) < 5){
                nums.remove(i);
            }
        }
        */
        //removeIf(Predicate) - for collection types

        Predicate<Integer> lessThanFive = each -> each < 5;
        nums.removeIf(lessThanFive);

        System.out.println(nums);
        System.out.println("==============================");

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        nums2.removeIf(element -> element < 7);//remove all before 7
        System.out.println(nums2);

        System.out.println("================================");

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(97, 99, 67, 85, 54, 65, 88));

        scores.removeIf(p -> p % 3 == 0 || p % 5 == 0);//remove elements divisible by 3
        System.out.println(scores);
       /* scores.removeIf(p -> p%5 == 0);
        System.out.println(scores);
        */
        System.out.println("==================================");

        String[] names = {"Ramiz", "Olesea", "Irina", "Inna", "Muhtar"};
        ArrayList<String> students = new ArrayList<>(Arrays.asList(names));

        students.removeIf(p -> p.startsWith("I") && !p.equals("Irina"));
        System.out.println(students);
        System.out.println("====================================");

        ArrayList<String> employee = new ArrayList<>(Arrays.asList("Ramiz", "Olesea", "Irina", "Inna", "Muhtar"));

        employee.removeIf(p -> p.toLowerCase().contains("a") || p.toLowerCase().contains("r"));

        System.out.println(employee);

        /*
        1. write a program that find the unique names from an arraylist of string
                        DO NOT USE:
                                for loop, for each loop, while loop, do while loop
         */

        ArrayList<String> names2 = new ArrayList<>(Arrays.asList("Ramiz", "Olesea", "Irina", "Inna", "Muhtar", "Irina", "Inna", "Muhtar"));
        System.out.println(Collections.frequency(names2, "Inna"));


        /*2. write a program that can remove the digits and letters from an array list of characters
        DO NOT USE:
        for loop, for each loop, while loop, do while loop
         */

        ArrayList<Character> chars = new ArrayList<>(Arrays.asList('d', '@', 'g', 't', 'w', '&', '$', '3', 't', '7', '4', '1', '9', 'r'));



    }

}
