package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        //contains()
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(4);
        list.add(2);
        list.add(7);
        list.add(6);
        list.add(7);

        boolean r1 = list.contains(10);

        //containsAll()
        //(if all are contained)
        boolean r2 = list.containsAll(Arrays.asList(10, 4, 2, 7, 6, 7));
        System.out.println(r2);

        ArrayList<String> group1 = new ArrayList<>();
        group1.add("Mohammad");
        group1.add("Nuhtar");
        group1.add("Gurhan");
        group1.add("Saim");

        System.out.println(group1.containsAll(Arrays.asList("Saim")));
        System.out.println("=======================================");

        //addAll()
        ArrayList<Character> chars = new ArrayList<>();//A,Z,D,H,R,E,U,O

        chars.addAll(Arrays.asList('A', 'Z', 'D', 'H', 'R', 'E', 'U', 'O'));

        System.out.println(chars);

        System.out.println("==========================================");

        String[] names = {"Ramiz", "Olesea", "Irina", "Inna", "Muhtar"};
        ArrayList<String> students = new ArrayList<>(Arrays.asList(names));//or:
        //or: students.addAll(Arrays.asList(names));
        System.out.println(students);

        System.out.println("============================================");

        int[] arr = {1, 2, 3, 4, 5};//!!!!
        //for assigning this elements from arr to ArraysList we have to use for loop


        ArrayList<Character> arr1 = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D'));
        arr1.addAll(Arrays.asList('E', 'F', 'G'));

        System.out.println(arr1);

        System.out.println("======================");
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.addAll(Arrays.asList(names));

        System.out.println(arr2);

        System.out.println("========================");

        //removeAll()
        arr2.remove("Inna");
        arr2.remove("Muhtar");
        System.out.println(arr2);
        arr2.removeAll(Arrays.asList("Olesea", "Ramiz"));
        System.out.println(arr2);

        System.out.println("=========================");

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ramiz", "Olesea", "Irina", "Ramiz", "Inna", "Muhtar", "Ramiz"));

        /*for (int i = 0; i < employees.size(); i++){
            if (employees.get(i).equals("Ramiz")){
                employees.remove(i);
            }
        }
         */

        employees.removeAll(Arrays.asList("Ramiz"));
        System.out.println(employees);

        System.out.println("===============================");

        //retainAll() - removes not matching elements

        ArrayList<String> employees2 = new ArrayList<>();
        employees2.addAll(Arrays.asList("Ramiz", "Olesea", "Irina", "Olesea", "Olesea", "Ramiz", "Inna", "Muhtar", "Ramiz"));

        employees2.retainAll(Arrays.asList("Olesea"));

        System.out.println(employees2);
        System.out.println("=================================");



    }
}
