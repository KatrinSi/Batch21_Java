package Library;

import day41_Encapsulation.Data;
import day43_Inheritance.AccessModifiers;

import static day41_Encapsulation.Data.*;

public class test extends AccessModifiers {

    public static void main(String[] args) {
        System.out.println(publicVariable);
        // System.out.println(privateVariable); Compile error
        //System.out.println(defaultVariable); Compile Error

        //Data obj1 = new Data(); Compile error Data() method is not reachable through another package

        publicMethod();

        test.PublicMethod();
        test.ProtectedMethod();

    }

}
