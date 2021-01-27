package day45_Exceptions;

import java.time.LocalTime;

public class BreakTimeException extends RuntimeException{
    public BreakTimeException(){
        super("Time for having Break");
    }

    public BreakTimeException(String msg){
        super(msg);
    }


}
class Test1{
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        if(currentTime.equals(LocalTime.of(10,45))){
            throw new BreakTimeException();
        }else if(currentTime.equals(LocalTime.of(11,45))) {
            throw new BreakTimeException();
        }else if(currentTime.equals(LocalTime.of(12,45))) {
            throw new BreakTimeException();
        }
    }
}