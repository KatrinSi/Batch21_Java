package OfficeHours.Practice_11_27_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class findUniques {
    public static void main(String[] args) {

        String[] arr = {"A", "B", "A", "C", "D", "D"};
//                       0   1   2   3   4   5

        String[] names = {"Muhtar", "Asiya", "Saim", "Muhtar", "Asiya"};
        String[] result1 = uniques(names);

    }
    public static String[] uniques (String[] arr){
        ArrayList<String> uniqueElements = new ArrayList<>();

        for (String element : arr) {
            int count = 0;
            for (String each : arr) {
                if (each.equals(element)) {
                    count++;
                }
            }

            if (count == 1) {
                uniqueElements.add(element);
            }
        }

        String[] uniques = new String[uniqueElements.size()];
        for (int i = 0; i < uniques.length; i++) {
            uniques[i] = uniqueElements.get(i);
        }
        System.out.println(Arrays.toString(uniques));
        return uniques;
    }
    public static double[] uniques (double[] arr){
        ArrayList<Double> uniqueElements = new ArrayList<>();

        for (double element : arr) {
            int count = 0;
            for (double each : arr) {
                if (each==element) {
                    count++;
                }
            }

            if (count == 1) {
                uniqueElements.add(element);
            }
        }
        double[] uniques = new double[uniqueElements.size()];
        for (int i = 0; i < uniques.length; i++) {
            uniques[i] = uniqueElements.get(i);
        }
        System.out.println(Arrays.toString(uniques));
        return uniques;
    }
    public static int[] uniques (int[] arr){
        ArrayList<Integer> uniqueElements = new ArrayList<>();

        for (int element : arr) {
            int count = 0;
            for (int each : arr) {
                if (each==element) {
                    count++;
                }
            }

            if (count == 1) {
                uniqueElements.add(element);
            }
        }
        int[] uniques = new int[uniqueElements.size()];
        for (int i = 0; i < uniques.length; i++) {
            uniques[i] = uniqueElements.get(i);
        }
        System.out.println(Arrays.toString(uniques));
        return uniques;
    }
    public static char[] uniques (char[] arr){
        ArrayList<Character> uniqueElements = new ArrayList<>();

        for (char element : arr) {
            int count = 0;
            for (char each : arr) {
                if (each==element) {
                    count++;
                }
            }

            if (count == 1) {
                uniqueElements.add(element);
            }
        }
        char[] uniques = new char[uniqueElements.size()];
        for (int i = 0; i < uniques.length; i++) {
            uniques[i] = uniqueElements.get(i);
        }
        System.out.println(Arrays.toString(uniques));
        return uniques;
    }
}
