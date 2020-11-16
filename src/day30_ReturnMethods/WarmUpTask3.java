package day30_ReturnMethods;

public class WarmUpTask3 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6, 7};
        CombinationOfArr(arr1,arr2);

    }

    public static void CombinationOfArr(int[] arr1, int[] arr2) {
       int[] twoArr = new int[arr1.length+ arr2.length];
        System.out.println(twoArr.length);
      /* for (int i = 0; i < twoArr.length;i++){
           twoArr[i] = arr1[i]+arr2[i];

       }

        System.out.println(twoArr);

       */
    }
}


//3. create a function that can print out the combination of two integer arrays