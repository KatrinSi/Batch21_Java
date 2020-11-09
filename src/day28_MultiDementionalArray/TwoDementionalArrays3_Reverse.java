package day28_MultiDementionalArray;

public class TwoDementionalArrays3_Reverse {
    public static void main(String[] args) {

        int[][] arrays = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13}};

        for (int i = arrays.length - 1; i >= 0; i--) {

            for (int each : arrays[i]) {
                System.out.print(each + " ");
            }
            System.out.println();
        }
        System.out.println("========================");

        for (int[] eachArray : arrays) {

            for (int i = eachArray.length-1; i >= 0; i--){
                System.out.print(eachArray[i]+" ");
            }
            System.out.println();

        }


    }
}
