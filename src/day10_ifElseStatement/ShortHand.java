package day10_ifElseStatement;

public class ShortHand {
    public static void main(String[] args) {
        int a = 100;
        System.out.println(++a);
        System.out.println(a);
        a = 200;

        a +=100;
        a -=30;
        a *=2;
        System.out.println(a);


        String school = "Cybertek";
               school += " school";
        System.out.println(school);


        int savingAccaunt = 1000;
        System.out.println(savingAccaunt);
        // october savings
            savingAccaunt += 2000;
        System.out.println(savingAccaunt);
        // november savings
            savingAccaunt += 500;
        System.out.println(savingAccaunt);
        // spending
            savingAccaunt -= 1000;
        System.out.println(savingAccaunt);




    }
}
