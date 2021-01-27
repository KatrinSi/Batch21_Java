package day45_Exceptions;

import java.time.LocalTime;

public class EveryDaysLunchBreak {
    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();
        LocalTime lunchTime = LocalTime.of(1,00);
        if(currentTime.equals(lunchTime)){
            throw new LunchBreakException("We need to go on Lunch break!");
        }else {
            System.out.println("Continue");
        }
    }
}
