package day27_ForEachLoop;

public class UniqueIntegers3 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 4, 5, 4, 7, 7, 8};

        for (int j = 0; j < arr.length; j++) {

            int element = arr[j];//1
            int count = 0;//frequency of the element

            for (int i = 0; i < arr.length; i++) {

                if (arr[i] == element) {// arr[i] - each element in array
                    count++;

                }
            }//this loop is for finding of one element
            if (count == 1) {
                System.out.print(element+" ");
            }

        }


    }
}
