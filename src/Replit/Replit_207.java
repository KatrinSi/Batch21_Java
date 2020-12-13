package Replit;

import java.util.Arrays;

public class Replit_207 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int[] newArr = do_switch(nums);

        System.out.println(Arrays.toString(newArr));

    }
    public static int[] do_switch(int[] i)
    {
        int[] newArr = new int[i.length];
        int temp = 0;
        temp = i[0];
        i[0]=i[i.length-1];
        i[i.length-1] = temp;

        /*for (int each:i){
            newArr[each]=i[each];
        }
         */
        for(int j = 0; j < i.length; j++){
            newArr[j] = i[j];
        }

        return newArr;
    }
}
