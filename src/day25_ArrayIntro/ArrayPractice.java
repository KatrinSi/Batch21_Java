package day25_ArrayIntro;

import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {

        String[] students = new String[5];

        System.out.println(students[0]);//null


        System.out.println("=========================================");
        students[0] = "Agalar";
        students[1] = "Mohammad";
        students[2] = "Afrooz";
        students[3] = "Dargiza";
        students[4] = "Elvira";

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("How may friends do you have?");


    }
}
