package OfficeHours.Practice_11_26_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysPractice1 {
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 30;
        arr[3] = 25;
        arr[4] = 15;
        arr[1] = 50;


        int[] arr1 = new int[100];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i+1;
        }
        System.out.println(Arrays.toString(arr1));

        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for (int each:arr1){
            if (each%2 == 0){
                even.add(each);
            }else{
                odd.add(each);
            }
        }

        System.out.println(odd);
        System.out.println(even);
    }
}
