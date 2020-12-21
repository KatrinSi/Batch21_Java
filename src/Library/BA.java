package Library;

import day43_Inheritance.PersonTask.Employee;

public class BA extends Employee {

    public static void main(String[] args) {
        System.out.println(BA.publicVar);
        System.out.println(BA.protectedVar);

    }
}

    class A extends Employee{
        public static void main(String[] args) {
            System.out.println(Employee.publicVar);
            //System.out.println(Employee.protectedVar);
        }
    }

