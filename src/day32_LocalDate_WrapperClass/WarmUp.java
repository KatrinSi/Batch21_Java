package day32_LocalDate_WrapperClass;

import java.util.Arrays;

public class WarmUp {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        arr = addElement(arr, 6);
        System.out.println(Arrays.toString(arr));
        System.out.println("===============================");

        double[] arr1 = {1.2, 1.3, 1.4};
        arr1 = addElement(arr1,1.5);
        System.out.println(Arrays.toString(arr1));
    }
    //                         {1,2,3}         6
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






/*
    1. create a return method called addElements that can add an Inteeger  after the  last index of an integer array
    2. create a return method called addElements that can add a double after the last index of a double array
    3. create a return method called addElements that can add a String after the last index of a String array
    4. create a return method called addElements that can add a char after last index of a char array

 */