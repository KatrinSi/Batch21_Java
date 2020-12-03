package day33_ArrayList;

import java.util.ArrayList;

public class ListPractice1 {
    public static void main(String[] args) {
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for(int i = 0; i<= 100; i++){
            if (i%2 == 0) {
                odd.add(i);
            }else {
                even.add(i);
            }
        }
        System.out.println("odd: "+odd);
        System.out.println("even: "+even);

        System.out.println("Last odd num: "+odd.get(odd.size()-1));
        System.out.println("Last even num: "+even.get(even.size()-1));

        System.out.println("=============================================");

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

    }
}
