package day13_SwitchStatement;

public class NameOfMonthTask {
    public static void main(String[] args) {

        int num = 2;
        String month = "";

        switch (num){
            case 1: month = "Jan";
                break;
            case 2: month = "Feb";
                break;
            case 3: month = "March";
                break;
            case 4: month = "Apr";
                break;
            case 5: month = "May";
                break;
            case 6: month = "June";
                break;
            case 7: month = "July";
                break;
            case 8: month = "Aug";
                break;
            case 9: month = "Sep";
                break;
            case 10: month = "Oct";
                break;
            case 11: month = "Nov";
                break;
            case 12: month = "Dec";
                break;
            default:
                month = "Invalid Number";
        }

        System.out.println(month);

    }


}
