package SelfPractice;

public class Unique {
    public static void main(String[] args) {

        int[] arr = {2, 2, 3, 1, 4, 4, 5};// length = 7
        //index:     0 1 2 3 4 5 6
        /*

        //step 2
        for(int j = 0; j < arr.length; j++){
            //step 1
            int element = arr[j];//2
            int count = 0;

            for (int i = 0; i < 7; i++){
                if (element == arr[i]){
                    count++;
                }
            }
            if(count == 1){
                System.out.print(element+" ");
            }
        }

        */

        //step 2
        for(int eachEl : arr){
            int element = eachEl;//2
            int count = 0;

            //step 1
            for (int each: arr){
                if (element==each){
                    count++;
                }
            }
            if(count == 1){
                System.out.print(element+" ");
            }

        }



    }
}
