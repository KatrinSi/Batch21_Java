package Day35_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeesData {
    public static void main(String[] args) {
        Employees employee1 = new Employees();
        Employees employee2 = new Employees();
        Employees employee3 = new Employees();
        Employees employee4 = new Employees();
        Employees employee5 = new Employees();

        employee1.setInfo("Angelina Jolie", 'F', "123 456", "0001", "Developer", "Apple", 400000);
        employee2.setInfo("Mr. Bean", 'M', "123 457","0002", "Joker", "Joker&Co", 99000);
        employee3.setInfo("Brad Pitt", 'M',"123 458", "0003", "Scrum Master", "Amazon", 140000);
        employee4.setInfo("Kevin Spacey", 'M', "123 459", "0004", "Manual tester", "Government", 64000);
        employee5.setInfo("Scarlett Johansson", 'F', "123 460", "0005", "Product Owner", "Google", 450000);

        ArrayList<Employees> list = new ArrayList<>(Arrays.asList(employee1, employee2, employee3, employee4, employee5));
        employee1.getInfo();



    }

}
