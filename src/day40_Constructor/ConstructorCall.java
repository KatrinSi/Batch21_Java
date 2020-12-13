package day40_Constructor;

public class ConstructorCall {
    public ConstructorCall(){
        System.out.println("Default constructor");
    }
    public ConstructorCall(int a){
        this();
        System.out.println("Constructor with int arg");
    }
    public ConstructorCall(String str){
        this(10);
        System.out.println("Constructor with String arg");
    }

    public static void main(String[] args) {
        ConstructorCall obj1 = new ConstructorCall("A");
    }



}


