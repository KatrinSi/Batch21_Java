package day35_CustomClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraysListPractice1 {
    public static void main(String[] args) {

        ArrayList<String> countryNames = new ArrayList<>(Arrays.asList("Andorra","United Arab Emirates","Afghanistan",
                                                            "Turkey","United States"," Antigua and Barbuda","Albania"));

        //Predicate<String> length10 = p -> p.length() >= 10;
        countryNames.removeIf(p -> p.length() >= 10);
        System.out.println(countryNames);

        System.out.println("===============================");

        LocalDate[]arr1 = {
                LocalDate.of(2010,11,19),
                LocalDate.of(2011, 12,01),
                LocalDate.of(2012, 12,01),
                LocalDate.of(2013, 12,01),
                LocalDate.of(2014, 12,01),
                LocalDate.of(2015, 12,01)
        };

        ArrayList<LocalDate> dates = new ArrayList<>(Arrays.asList(arr1));
        LocalDate d1 = LocalDate.of(2016,8,15);
        //dates.removeIf(p -> p.isBefore(d1));
        System.out.println(dates);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM-dd-yyyy, EEEE");

        for (LocalDate each:dates){
            System.out.println(each.format(df));
        }


    }
}
/*
task01:
            1. create an Array of string called country names
            2. write a program that can remove all the country names that have length of 10 or greater
    task02:
            1. create an Array of LocalDate
            2. write a program that can remove all the dates before August-15-2016
    task03:
            1. create an Array of String called jobTitles
            2. write a program that only keeps the jobTitles that are: SDET and QA
    task04:
        Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
                solution 1: use lambda
                solution 2: do not use lambda

 */