package day39_StaticBlock;

//import Library.Data;//imports everything static and non static

import static Library.Data.method1; //!!
import static Library.Data.data1;
//import static Library.Data.*;

public class test {
    public static void main(String[] args) {

        System.out.println(StaticBlocks.company);
        System.out.println(StaticBlocks.employee1);

        System.out.println("==============================");

        System.out.println(data1);
        method1();



    }
}
