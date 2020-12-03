package Library;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysUtility {

    public static int MinNum(int[] arr) {

        int min = arr[0];
        for (int each : arr) {

            if (min > each) {
                min = each;
            }
        }
        return min;
    }
    //returns the min num from the array of integers

    public static int MaxNum(int[] arr) {
        int max = arr[0];
        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }
    //returns the max num from the array of integers

    public static int[] CombinationOfArr(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0; // represents the index nums of arr3
        for (int each : arr1) {
            arr3[i++] = each;//each element of arr1 is being assigned to the index of arr3
        }
        //i = 2
        for (int each : arr2) {
            arr3[i++] = each;//each element of arr2 is being assigned to the index of arr3
        }
        //Arrays.sort(arr3);
        //System.out.println(Arrays.toString(arr3));
        return arr3;

    }
    //combines two arrays of integers and returns the new array

    public static double[] CombinationOfArr(double[] arr1, double[] arr2) {
        double[] arr3 = new double[arr1.length + arr2.length];
        int i = 0; // represents the index nums of arr3
        for (double each : arr1) {
            arr3[i++] = each;//each element of arr1 is being assigned to the index of arr3
        }
        //i = 2
        for (double each : arr2) {
            arr3[i++] = each;//each element of arr2 is being assigned to the index of arr3
        }
        //Arrays.sort(arr3);
        //System.out.println(Arrays.toString(arr3));
        return arr3;

    }
    //combines two arrays of double and returns the new array

    public static char[] CombinationOfArr(char[] arr1, char[] arr2) {
        char[] arr3 = new char[arr1.length + arr2.length];
        int i = 0; // represents the index nums of arr3
        for (char each : arr1) {
            arr3[i++] = each;//each element of arr1 is being assigned to the index of arr3
        }
        //i = 2
        for (char each : arr2) {
            arr3[i++] = each;//each element of arr2 is being assigned to the index of arr3
        }
        //Arrays.sort(arr3);
        //System.out.println(Arrays.toString(arr3));
        return arr3;

    }
    //combines two arrays of char and returns the new array

    public static String[] CombinationOfArr(String[] arr1, String[] arr2) {
        String[] arr3 = new String[arr1.length + arr2.length];
        int i = 0; // represents the index nums of arr3
        for (String each : arr1) {
            arr3[i++] = each;//each element of arr1 is being assigned to the index of arr3
        }
        //i = 2
        for (String each : arr2) {
            arr3[i++] = each;//each element of arr2 is being assigned to the index of arr3
        }
        //Arrays.sort(arr3);
        //System.out.println(Arrays.toString(arr3));
        return arr3;

    }
    //combines two arrays of String and returns the new array

    public static int[] sort(int[] arr) {//{2,1,3}

        Arrays.sort(arr);//{1,2,3}

        int[] reversedArr = new int[arr.length];//{3,2,1}

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArr[j] = arr[i];

        }

        return reversedArr;
    }
    //sorts the array of integers in descending order and returns it as an array

    public static String printArray (int[] arr ){
        String str = Arrays.toString(arr);

        str = str.replace("[", "{").replace("]", "}");

       return str;
    }
    //replaces [] with {}  while printing the array

    public static double MaxNum(double[] arr) {
        double max = arr[0];
        for (double each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }
    //returns max num from double array

    public static double MinNum(double[] arr) {

        double min = arr[0];
        for (double each : arr) {

            if (min > each) {
                min = each;
            }
        }
        return min;
    }
    //returns min num from double array

    public static double[] sort(double[] arr) {//{2,1,3}

        Arrays.sort(arr);//{1,2,3}

        double[] reversedArr = new double[arr.length];//{3,2,1}

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArr[j] = arr[i];

        }

        return reversedArr;
    }
    //sorts the array of double in descending order and returns it as an array

    public static char[] sort(char[] arr) {//{2,1,3}

        Arrays.sort(arr);//{1,2,3}

        char[] reversedArr = new char[arr.length];//{3,2,1}

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArr[j] = arr[i];

        }

        return reversedArr;
    }
    //sorts the array of chars in descending order and returns it as an array

    public static String[] sort(String[] arr) {//{2,1,3}

        Arrays.sort(arr);//{1,2,3}

        String[] reversedArr = new String[arr.length];//{3,2,1}

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArr[j] = arr[i];

        }

        return reversedArr;
    }
    //sorts the array of strings in descending order and returns it as an array

    public static int[] addElement(int[] arr, int element) {

        int[] result = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        result[result.length - 1] = element;
        return result;
    }
    //adds element to int array

    public static double[] addElement(double[] arr, double element) {

        double[] result = new double[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        result[result.length - 1] = element;
        return result;
    }
    //adds element to double array

    public static char[] addElement(char[] arr, char element) {

        char[] result = new char[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        result[result.length - 1] = element;
        return result;
    }
    //adds element to char array

    public static String[] addElement(String[] arr, String element) {

        String[] result = new String[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        result[result.length - 1] = element;
        return result;
    }
    //adds element to String array

    public static int[] ReversedArr(int[] arr) {

        int[] reversed = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = arr[i];
        }
        System.out.println(Arrays.toString(reversed));
        return reversed;

    }
    public static double[] ReversedArr(double[] arr) {

        double[] reversed = new double[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = arr[i];
        }
        System.out.println(Arrays.toString(reversed));
        return reversed;

    }
    public static char[] ReversedArr(char[] arr) {

        char[] reversed = new char[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = arr[i];
        }
        System.out.println(Arrays.toString(reversed));
        return reversed;

    }
    public static String[] ReversedArr(String[] arr) {

        String[] reversed = new String[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = arr[i];
        }
        System.out.println(Arrays.toString(reversed));
        return reversed;

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
    //finds unique elements in the String arr
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
    //finds unique elements in the double arr
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
    //finds unique elements in the int arr
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
    //finds unique elements in the char arr


}
