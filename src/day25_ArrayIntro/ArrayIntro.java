package day25_ArrayIntro;

public class ArrayIntro {
    public static void main(String[] args) {

        String[] names = {"Mike", "Muhtar", "SwitchLoop", "Erjon", "Azad" };
        //index numbers:    0          1        2       3       4

        System.out.println(names[1]);

        String str1 = names[1];
        System.out.println(str1);

        int[] score = {80, 85, 90, 75, 70};
        //              0   1   2   3   4
        /*
        System.out.println(names[0]+": "+score[0]);
        System.out.println(names[1]+": "+score[1]);
        System.out.println(names[2]+": "+score[2]);
        System.out.println(names[3]+": "+score[3]);

         */

        for (int i = 0; i < names.length;i++){//i: 0, 1, 2, 3, 4
            System.out.println(names[i]+": "+score[i]);
        }

//          initializing the size only:
        String [] students = new String[10];

    }
}
