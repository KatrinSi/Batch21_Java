package day32_LocalDate_WrapperClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormat {
    public static void main(String[] args) {
        DateTimeFormatter date = DateTimeFormatter.ofPattern("MMMM/dd/yyyy EEEE");
        LocalDate today = LocalDate.now();

        System.out.println(today.format(date));

        DateTimeFormatter time = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime now = LocalTime.now();
        System.out.println(now.format(time));

        LocalTime t1 = LocalTime.of(23, 35, 55);
        System.out.println(t1);
        System.out.println(t1.format(time));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE, hh:mm a, MMMM/dd/yyyy ");
        LocalDateTime dt1 = LocalDateTime.now();


        LocalDate tomorrow = LocalDate.of(2020, 11, 24);
       // System.out.println(tomorrow.format(df));
        boolean r1 = today.isBefore(tomorrow);
        boolean r2 = today.isAfter(tomorrow);


        int currentYear = LocalDate.now().getYear();
        LocalDate dateOfBirth = LocalDate.of(2000, 5, 23);
        int age = currentYear - dateOfBirth.getYear();
        System.out.println(age);

        LocalTime classStarts = LocalTime.of(10,00,00);
        LocalTime firstBreak = classStarts.plusMinutes(45);
        System.out.println(firstBreak);

        LocalTime secondBreak = firstBreak.plusHours(1);
        System.out.println(secondBreak);

        LocalTime thirdBreak = secondBreak.plusHours(1).plusMinutes(15);
        System.out.println(thirdBreak);

        LocalTime afternoonClass = thirdBreak.plusHours(1);
        System.out.println(afternoonClass);


    }

    /*
    Local date:
    year:yyyy
    month:MM, MMM(first three letters,MMMM(full name)
    day:dd
    name of day: EEE(three lett); EEEE(full name)
    =============================
    hour: hh
    minutes: mm
    seconds: ss
    am or pm: a


     */


}
