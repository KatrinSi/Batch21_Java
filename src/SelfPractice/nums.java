package SelfPractice;

import java.text.DecimalFormat;

public class nums {
    public static void main(String[] args) {

        double num = 3.45567877874;
        DecimalFormat decimal = new DecimalFormat("0.00");

        System.out.println(decimal.format(num));

    }
}
