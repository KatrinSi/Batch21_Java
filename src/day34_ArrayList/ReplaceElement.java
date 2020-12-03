package day34_ArrayList;

import java.util.ArrayList;

public class ReplaceElement {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : arr) {
            list.add(each);
        }
        list.set(list.size()-1,0);
        System.out.println(list);



        for(int i = 0; i < list.size();i++){
            int each = list.get(i);
            if (each%2 != 0){
                list.set(i, each*2);
            }
        }
        System.out.println(list);

        System.out.println("=============================");

        int[] scores = {78, 99, 89, 79, 67, 69, 80, 87, 56};
        ArrayList<Integer> AList = new ArrayList<>();
        ArrayList<Integer> BList = new ArrayList<>();
        ArrayList<Integer> CList = new ArrayList<>();
        ArrayList<Integer> DList = new ArrayList<>();
        ArrayList<Integer> FList = new ArrayList<>();

        for (int each : scores){
            if (each >= 0 && each <= 100){
                if (each > 90){
                    AList.add(each);
                }else if(each > 80){
                    BList.add(each);
                }else if(each > 70){
                    CList.add(each);
                }else if(each > 60){
                    DList.add(each);
                }else{
                    FList.add(each);
                }
            }else{
                continue;
            }

        }
        System.out.println("Total number of A "+ AList.size());
        System.out.println("Total number of B "+ BList.size());
        System.out.println("Total number of C "+ CList.size());
        System.out.println("Total number of D "+ DList.size());
        System.out.println("Total number of F "+ FList.size());

    }

}

/*
write a program that can set the last element of the Integer arraylist to zero
            ex:
                list = [1,2,3,4,5];
                output: [1,2,3,4,0];

 */