package day31_MethodOverLoading;

import Library.StringUtility;

import java.util.Arrays;

public class MethodOverLoadingIntro {
    public static void main(String[] args) {
        method();
        method(2);
        method(3, 4);
        method(2, "str");
        method(0.5);
        System.out.println("===========================");
        int[] arr1 = {1, 2, 3};
        Arrays.sort(arr1);
        double[] arr2 = {1.0, 2.0, 3.0};
        Arrays.sort(arr2);
        char[] arr3 = {'a', 'b', 'c'};
        Arrays.sort(arr3);
        String[] arr4 = {"one", "two", "three"};
        Arrays.sort(arr4);

    }

    public static void method() {
        System.out.println("A");
    }

    public static void method(int a) {
        System.out.println("B");
    }

    public static void method(int b, int c) {
        System.out.println("C");
    }

    public static void method(int a, String b) {
        System.out.println("D");
    }

    public static void method(double e) {
        System.out.println("E");
    }
}
