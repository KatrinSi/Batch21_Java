package day29_Methods;

import java.util.Scanner;

public class VoidMethodsPractice2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        sumOf3Nums(10, 3, 20);
        sumOf3Nums(1,2,3);
        //sumOf3Nums(scan.nextInt(),scan.nextInt(),scan.nextInt());

        greaterNum(5,5);

    }

    public static void sumOf3Nums(int num1, int num2, int num3){
        System.out.println("Sum is: "+(num1+num2+num3));



    }

    public static void greaterNum(int num1, int num2){
        if (num1>num2){
            System.out.println(num1);
        }else if (num1 < num2){
            System.out.println(num2);
        }else{
            System.out.println("Equal");
        }
    }




}
