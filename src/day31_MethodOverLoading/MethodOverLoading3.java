package day31_MethodOverLoading;

public class MethodOverLoading3 {
    public static void main(String[] args) {
        double[] arr = {1.1, 1.2, 1.3, 1.4};
        System.out.println(MaxNum(arr));
        System.out.println(MinNum(arr));


    }

    public static int MaxNum(int[] arr) {
        int max = arr[0];
        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    public static double MaxNum(double[] arr) {
        double max = arr[0];
        for (double each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    public static int MinNum(int[] arr) {

        int min = arr[0];
        for (int each : arr) {

            if (min > each) {
                min = each;
            }
        }
        return min;
    }

    public static double MinNum(double[] arr) {

        double min = arr[0];
        for (double each : arr) {

            if (min > each) {
                min = each;
            }
        }
        return min;
    }
}
