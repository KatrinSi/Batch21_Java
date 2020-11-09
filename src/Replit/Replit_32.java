package Replit;

public class Replit_32 {
    public static void main(String[] args) {


        int hours = 3600;
        int minutes = 60;//=1hour
        int seconds = 1;//=1minute
        int inputSeconds = 20394;

                              //5
        hours = (inputSeconds / 3600);
        System.out.println(hours);
                              //2394/ 60
        minutes = (inputSeconds % 3600) / 60;
        System.out.println(minutes);

        seconds = (inputSeconds% 3600 % 60)/1;
        System.out.println(seconds);

    }
    // minutes = (inputSeconds%hours)/minutes;
    //seconds = (inputSeconds%hours%minutes)/seconds;

    //System.out.println (hours+" hours, "+minutes+" minutes, and "+seconds+" seconds.");


}


