package day32_LocalDate_WrapperClass;

import java.time.LocalDate;

public class Date {

    public static void main(String[] args) {

        LocalDate yesterday = LocalDate.of(2020,11,22);
        System.out.println(yesterday);

        LocalDate date1 = LocalDate.of(2020,2,29);
        System.out.println(date1);

        System.out.println(yesterday.isLeapYear());

        LocalDate today = LocalDate.now();
        System.out.println(today);
//          or
        System.out.println(LocalDate.now());


        LocalDate dateOfBirth = LocalDate.of(1987,11,19);
        System.out.println(dateOfBirth.isLeapYear());

        String[] names = {"Muhtar", "Asya", "Saim"};

        LocalDate[] birthDay = {LocalDate.of(1977, 2,11),
                                LocalDate.of(1988, 6,23),
                                LocalDate.of(1983, 10, 3)};

        for (int i = 0; i < names.length; i++){
            System.out.println("The name: "+ names[i]+ "\nDate of Birth is: "+birthDay[i]+"\nWas it a Leap year? "+ birthDay[i].isLeapYear());
        }


    }
}
