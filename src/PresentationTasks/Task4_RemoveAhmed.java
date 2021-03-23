package PresentationTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task4_RemoveAhmed {
    public static void main(String[] args) {
        //1. Given a list of people' names: "Ahmed", "John", "Eric", "Ahmed", "Edison".
        // Write a java operation to remove all the names named Ahmed

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Edison"));

        //1st way:
        names.removeAll(Arrays.asList("Ahmed"));
        //2nd way:
        //names.removeIf(p->p.equals("Ahmed"));
        System.out.println(names);

        //just to print:
        /*for (String each:names){
            if(!each.equals("Ahmed")){
                System.out.println(each);
            }
        }
         */

    }
}
