package OfficeHours.Practice_02_03_2021;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args) {

        //FIFO
        ArrayDeque<Integer> ad = new ArrayDeque<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));

        for (Integer each : ad) {
            System.out.println(each);
            ad.poll();
        }
        System.out.println(ad);
        System.out.println("----------------------------------");

        ArrayDeque<Integer> ad2 = new ArrayDeque<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));
        Iterator<Integer> it = ad2.iterator();
        while (it.hasNext()){
            if(it.next()<5){
                it.remove();
            }
        }

        System.out.println(ad2);




    }
}

/*
EmployeeName | Hired Date
      John           2017-5-1
      Erjon          2021-4-1
      Afrooz         2020-3-1
      Haroon         2019-2-1
      Aysel          2018-1-1
      .....
      displayed the Employee name and hire date of the employees who were hired before 2019 jan 1

 */