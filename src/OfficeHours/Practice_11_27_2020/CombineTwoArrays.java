package OfficeHours.Practice_11_27_2020;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class CombineTwoArrays {
    public static void main(String[] args) {

        char[] arr1 = {'A', 'B', 'C', 'D', 'E'};
        char[] arr2 = {'F', 'G', 'H', 'I'};

        ArrayList<Character> combinedArrays = new ArrayList<>();

        for (char each : arr1) combinedArrays.add(each);
        for (char each : arr2) combinedArrays.add(each);

        System.out.println(combinedArrays);
        DateTimeFormatter tf = DateTimeFormatter.ofPattern("h:mm a");

        LocalTime breakTime = LocalTime.now().plusMinutes(10);
        System.out.println(breakTime.format((tf)));

    }
}
