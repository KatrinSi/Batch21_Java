package OfficeHours.Practice_11_27_2020;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = {1,1,2,3,3,4};//[1,2,3,4]

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++){
            if (!arrayList.contains(arr[i])){
                arrayList.add(arr[i]);
            }
        }

        System.out.println(arrayList);

    }


}
