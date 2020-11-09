package day09_If_Statement;

public class MaximumMinimum {
    public static void main(String[] args) {
        int n1 = 100;
        int n2 = 100;

        boolean n1IsMax = n1 > n2;
        boolean n2IsMax = n2 > n1;
        boolean areEqual = !n1IsMax && !n2IsMax;

        if (n1IsMax){
            System.out.println(n1+ " is maximum.");
        }

        if (n2IsMax) {
            System.out.println(n2+ " is maximum.");
        }
        if(areEqual){
            System.out.println("Both are equal.");
        }


    }
}
