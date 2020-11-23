package Library;

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

    public static double[] addElement(double[] arr, double element) {

        double[] result = new double[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        result[result.length - 1] = element;
        return result;
    }
}
