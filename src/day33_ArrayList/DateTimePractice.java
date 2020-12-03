package day33_ArrayList;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class DateTimePractice {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E, hh:mm a, MMMM/dd/yyyy");

        LocalDateTime d1 = LocalDateTime.of(2020, 11, 24, 13, 0);

        System.out.println(d1.format(dtf));
        System.out.println("===============================================");
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM-dd, E");

        LocalDate[] days = new LocalDate[5];

        for (int i = 0; i < days.length; i++) {
            days[i] = LocalDate.now().plusDays(i + 1);
        }
        System.out.println(Arrays.toString(days));

        for (LocalDate each : days) {
            System.out.println(each.format(df));
        }
        System.out.println("================================================");


        String[] names = {"Muhtar", "Saim", "Akbar", "Gurhan", "Asya"};
        LocalDate[] birthDays = {
                LocalDate.of(1977, 03, 25),
                LocalDate.of(1983, 12, 11),
                LocalDate.of(1987, 04, 02),
                LocalDate.of(1984, 07, 13),
                LocalDate.of(1985, 11, 05)};

        String nameOfOlder = names[0];
        LocalDate older = birthDays[0];

String nameOfYanger = names[0];
LocalDate younger = birthDays[0];


        for (int i = 0; i < birthDays.length; i++){
            if(birthDays[i].isBefore(older)){
                older = birthDays[i];
                nameOfOlder = names[i];

            }
            if (birthDays[i].isAfter(younger)){
                younger = birthDays[i];
                nameOfYanger = names[i];
            }
        }

        System.out.println("older is: "+nameOfOlder+ " "+older);
        System.out.println("younger is: "+nameOfYanger+" "+younger);

    }
}


/*
LocalDate:
            year: yyyy
            month: MM (number), MMM(three letters of month), MMMM(full name)
            days: dd
            name of day: E(three letters) , EEEE (full name)

        LocalTime:
            hours: hh
            minutes: mm
            seconds: ss
            am/pm: a

methods:
* of
* now
* format
* isBefore
* isAfter
* plusday,month,year,hour, minutes





1. use the LocalDate & Time get the date and time in the following format:
            Tuesday, 1:00 pm, Nov/24/2020
    2. create an array of LocalDate and store the next 10 day's dates, use for each loop to print each Date in the following formar:
                MonthName/Day, Name
                ex:
                    November/25, Wednesday

 */