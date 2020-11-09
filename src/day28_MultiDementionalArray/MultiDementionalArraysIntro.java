package day28_MultiDementionalArray;

import java.util.Arrays;

public class MultiDementionalArraysIntro {
    public static void main(String[] args) {

        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4, 5, 6, 7};
        int[] arr3 = {8, 9, 10, 11, 12, 13};
        //            0 1  2  3  4  5

        int[][] arrays = {arr1, arr2, arr3};

        System.out.println(Arrays.deepToString(arrays));
        System.out.println("===============================");

        String[][] batch21 = {{"Mustafa", "Kemal", "Ataturk"},
                {"Justyna", "Adil", "Ercan", "Irina", "Med", "Olesea", "Vlad", "Asuman", "Guvanch"},
                {"Polina", "Serhii", "Abdujilil", "Aziz", "Halzat"}};

        for (int i = 0; i < batch21.length; i++) {
            String[] eachGroup = batch21[i];
            System.out.println(Arrays.toString(eachGroup));
            for (int j = 0; j < eachGroup.length; j++) {
                System.out.println(eachGroup[j]);
        }

            System.out.println("===========================");


            for (int a = batch21.length-1; a >= 0; a--){ //2 1 0
                for (int b = batch21[a].length-1; b >= 0; b--){
                    System.out.print(batch21[a][b]+ " ");
                }
            }


        }

    }

}
