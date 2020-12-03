package SelfPractice;

public class UniqueNums2 {

    public static void main(String[] args) {

        int[] arr = {3, 4, 4, 1, 6, 6, 7};//7
        //   index   0  1  2  3  4  5  6


        for (int j = 0; j < arr.length; j++){
            int element = arr[j];//3
            int count = 0;

            for (int i = 0; i < arr.length; i++){
                if(element == arr[i]){
                    count++;
                }
            }
            if(count == 1){
                System.out.print(element + " ");
            }
        }

    }

}
