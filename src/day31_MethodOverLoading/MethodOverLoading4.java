package day31_MethodOverLoading;

import Library.ArraysUtility;

import java.util.Arrays;

public class MethodOverLoading4 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        double[] arr2 = {1.1, 1.2, 1.3};

        arr = sort(arr);
        System.out.println(Arrays.toString(arr));
        ArraysUtility.printArray(arr);
        arr2 = sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] sort(int[] arr) {//{2,1,3}

        Arrays.sort(arr);//{1,2,3}

        int[] reversedArr = new int[arr.length];//{3,2,1}

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArr[j] = arr[i];

        }

        return reversedArr;
    }
    public static double[] sort(double[] arr) {//{2,1,3}

        Arrays.sort(arr);//{1,2,3}

        double[] reversedArr = new double[arr.length];//{3,2,1}

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArr[j] = arr[i];

        }

        return reversedArr;
    }
    public static char[] sort(char[] arr) {//{2,1,3}

        Arrays.sort(arr);//{1,2,3}

        char[] reversedArr = new char[arr.length];//{3,2,1}

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArr[j] = arr[i];

        }

        return reversedArr;
    }
    public static String[] sort(String[] arr) {//{2,1,3}

        Arrays.sort(arr);//{1,2,3}

        String[] reversedArr = new String[arr.length];//{3,2,1}

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArr[j] = arr[i];

        }

        return reversedArr;
    }
}
/*
int[]

 */