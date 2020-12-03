package day33_ArrayList;

import java.util.ArrayList;

public class MinMaxElement {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int min = list.get(0);
        int max = list.get(0);


        for (int each : list) {
            max = Math.max(each, max);
            min = Math.min(each, min);
        }
            /*if (each > max) {
                max = each;
            }
            if (each < min) {
                min = each;
            }
        }
             */


            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
        }

    }
