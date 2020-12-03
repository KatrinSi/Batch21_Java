package OfficeHours.Practice_11_27_2020;

import java.util.ArrayList;

public class findDuplicates {
    public static void main(String[] args) {

        char[] arr = {'A','A','B','C','C','A'};//A A C C A

        ArrayList<Character> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            int count = 0;

            for (char each:arr){
                if(arr[i] == each){
                    count++;
                }
            }
            if (count>1&&!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        System.out.println(list);




    }
}
