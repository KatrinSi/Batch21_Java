package day14_Switch_Recap;

public class Ternary_Practice {
    public static void main(String[] args) {

        int num = 3;

        String result1 = (num%2 == 0)? "Odd": "Even";
        System.out.println(result1);

        System.out.println("===================================");

        String result2 = (num > 0)? "Positive" : (num < 0)? "Negative" : "Zero";
        System.out.println(result2);
        System.out.println("====================================");

        int Num = 4; //1~7
        if (Num >=1 && Num <= 7) {
            String day = (Num == 1) ? "Monday" : (Num == 2) ? "Tuesday" : (Num == 3) ? "Wednesday" : (Num == 4) ? "Thursday"
                    : (Num == 5) ? "Friday" : (Num == 6) ? "Saturday" : "Sunday";
            System.out.println(day);
        }else{
            System.out.println("Invalid number");
        }







    }
}
