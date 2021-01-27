package day45_Exceptions;

public class LunchBreakException extends RuntimeException {
    public LunchBreakException() {
        super("Time for Lunch");
    }
    public LunchBreakException(String arg){
        super(arg);
    }
}

class Test {
    public static void main(String[] args) {
        throw new LunchBreakException("We need to take Lunch");
    }
}