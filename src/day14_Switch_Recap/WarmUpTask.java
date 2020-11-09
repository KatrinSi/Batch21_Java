package day14_Switch_Recap;

public class WarmUpTask {
    public static void main(String[] args) {

        int year = 2019;
        String month = "Feb";
        int days = 31; // this number is for instance

        switch (month) {
            case "Jan": days = 31;
                break;
            case "Feb": days = (year%4 == 0)? 29 : 28; //!!!!
                break;
            case "Mar": days = 31;
                break;
            case "Apr": days = 30;
                break;
            case "May": days = 31;
                break;
            case "June": days = 30;
                break;
            case "July": days = 31;
                break;
            case "Aug": days = 31;
                break;
            case "Sep": days = 30;
                break;
            case "Oct": days = 31;
                break;
            case "Nov": days = 30;
                break;
            case "Dec": days = 31;
                break;
            default:
                month = "Invalid input";
        }

        System.out.println(days + " days");

    }
}

/*
use swithc statement to write a program that can return the number of days based on the name of the month
    Ex:
        year = 2020;
        month = Mar;
        output:
            30 days
        year = 2020;
        month = Feb;
        output:
            29  days

 */