package day32_LocalDate_WrapperClass;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTimePractice1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first person's birth year, month, day");//jhon
        LocalDate birth1 = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());

        System.out.println("Enter second person's birth year, month, day");//aaron
        LocalDate birth2 = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());
//          earlier
        if (birth1.isBefore(birth2)){
            System.out.println("First person is older");
        }else if(birth2.isBefore(birth1)){
            System.out.println("Second person is older");
        }else{
            System.out.println("Same age");
        }


        int age1 = LocalDate.now().getYear() - birth1.getYear();
        int age2 = LocalDate.now().getYear() - birth2.getYear();

        int after1 = age1+30;
        int after2 = age2+30;

        System.out.println("After 30 years the age of the first person will be "+after1);
        System.out.println("After 30 years the age of the second person will be "+after2);

        LocalDate bd3 = LocalDate.of(1980, 12,5);
        System.out.println(CalculateAge(bd3, 20));

    }

    public static int CalculateAge(LocalDate birth, int year ){

        return  LocalDate.now().plusYears(year).getYear()-birth.getYear();



    }
}
