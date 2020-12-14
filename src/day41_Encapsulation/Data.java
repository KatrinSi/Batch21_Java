package day41_Encapsulation;

public class Data {
    public static String publicVariable = "A";// STATIC called trough the class (Data.publicVariable)
    private static String privateVariable = "B";//not accessible outside of a Class
    static String defaultVariable = "C";// by default gives access to Package and Class within the same Package(Data.defaultVariable)
    protected static String protectedVariable = "D"; //class, package, subclass (Data.protectedVariable)

     //Data(){ //default access modifier
   // }

    public static void publicMethod(){
        System.out.println("Public method");

    }
    private static void privateMethod(){
        System.out.println("Private method");

    }
    static void defaultMethod(){
        System.out.println("Default method");

    }
}
