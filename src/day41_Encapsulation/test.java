package day41_Encapsulation;

public class test {
    public static void main(String[] args) {
        System.out.println(Data.publicVariable);
        //System.out.println(Data.privateVariable); COMPILE error
        System.out.println(Data.defaultVariable);
        System.out.println(Data.protectedVariable);

        Data obj1 = new Data();//Data() method is reachable in another Class inside the same package

        Data d1 = new Data();

        Data.publicMethod();
        Data.defaultMethod();
        //Data.privateMethod(); Compile error


    }
}
