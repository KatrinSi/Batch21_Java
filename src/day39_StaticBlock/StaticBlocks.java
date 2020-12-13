package day39_StaticBlock;

import day37_CustomClass.Employee;

public class StaticBlocks {
    public static String company;
    public static Employee employee1;


    static {//static block (accepts only static!!), runs first and only one time
        company = "BOfA";
        employee1 = new Employee();
        employee1.setInfo("Muhtar", "Cybertek", "Teacher", "1234", "M", 40, 55);
    }

}
