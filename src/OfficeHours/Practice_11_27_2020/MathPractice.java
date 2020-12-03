package OfficeHours.Practice_11_27_2020;

import java.text.DecimalFormat;
import java.util.Random;

public class MathPractice {
    public static void main(String[] args) {

        double n1 = Math.pow(2,3);
        System.out.println(n1);

        double n2 = Math.pow(10,2);
        System.out.println(n2);

        int max = Math.max(6,9);
        System.out.println(max);

        int min = Math.min(7,3);
        System.out.println(min);

        int[] nums = {1,8,3,2,4,65,3,4,2,6,7};
        int maxEl = nums[0];
        int minEl = nums[0];

        for (int each:nums){
            max = Math.max(each, max);
            min = Math.min(each,min);

        }

        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.sqrt(100));
        DecimalFormat df = new DecimalFormat("0.00");

        double r1 =  CalculateAreaOfCircle(3);
        System.out.println(df.format(r1));

        System.out.println(df.format(2.98777777));

    }

    public static double CalculateAreaOfCircle(double r){


        return Math.PI*Math.pow(r,2);
    }
}
