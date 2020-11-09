package day14_Switch_Recap;

public class DaysInMonth2 {
    public static void main(String[] args) {

        int year = 2020;
        String month = "Jan";

        String result = "";

        switch (month){
            case "Fab":
                result = (year%4 == 0)? "29 days" : "28 days";
            break;
            case "Apr":
            case "June":
            case "Sep":
            case "Nov":
                result = "30 days";
            break;
            case "Jan":
            case "Mar":
            case "May":
            case "July":
            case "Aug":
            case "Oct":
            case "Dec":
                result = "31 days";
                break;
            default:
                result = "Invalid input";
        }
        System.out.println(result);



    }
}
