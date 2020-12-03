package day32_LocalDate_WrapperClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimePractice2 {
    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/dd/yyyy EEEE");
        LocalDate bd = LocalDate.of(1987, 11, 19);

        int age = LocalDate.now().minusYears(10).getYear() - bd.getYear();
        //              2020-10 = 2010

        System.out.println("10 years ago you were " + age + " old");
        System.out.println("===========================================");

        LocalDate dateOfBirth = LocalDate.of(2005, 5, 19);
        int currentAge = LocalDate.now().getYear() - dateOfBirth.getYear();

        if (currentAge >= 21) {
            System.out.println("You are eligible to buy alcohol");
        } else {
            LocalDate eligible = LocalDate.of(LocalDate.now().plusYears(21 - currentAge).getYear(), dateOfBirth.getMonthValue(), dateOfBirth.getDayOfYear());
        //                                         2020        + 6
            System.err.println("You well be eligible to buy alcohol on "+ eligible.format(df));
    }

    }
}
