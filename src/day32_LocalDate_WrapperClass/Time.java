package day32_LocalDate_WrapperClass;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time {
    public static void main(String[] args) {

        LocalTime time1 = LocalTime.of(11,45);
        System.out.println(time1);

        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println("============================");


        LocalDateTime time2 = LocalDateTime.of(2020, 9, 14,10,00);
        System.out.println(time2+ " Cybertek Batch 21 started");

    }
}
