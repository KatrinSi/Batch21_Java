package day27_ForEachLoop;

public class ForEachLoopIntro {
    public static void main(String[] args) {

        String[] names = {"Kate", "Muhtar", "Dan", "Asyia"};//is it a data structure?
        for (int i = 0; i < names.length; i++) {// does the itteration need to be from 0 to the last index?
            System.out.println(names[i]);
        }
        System.out.println("======================================");

        for (String each : names){// represents each element of the array
            System.out.println(each);
        }
        System.out.println("======================================");

        int[] nums = {1,2,3,4,5,6,7,8,9,10};

        int countEven = 0;
        int countOdd = 0;

        for (int each : nums){ //each element of the array

            if (each%2 == 0){
                countEven++;
            }else{
                countOdd++;
            }

        }
        System.out.println(countEven);
        System.out.println(countOdd);


        System.out.println("======================================");

        int[] score = {10, 2, 3, 25, 5, 100 };
        int max = score[0];
        int min = score[0];

        for (int each : score ){
            if (each > max){
                max = each;
            }
            if (each < min){
                min = each;
            }
        }
        System.out.println(max);
        System.out.println(min);

        System.out.println("======================================");




    }
}
