package day50_Polymorphism;


import day47_Abstraction.EmployeeTask.Developer;
import day47_Abstraction.EmployeeTask.Employee;
import day47_Abstraction.EmployeeTask.Tester;
import day47_Abstraction.EmployeeTask.UberDriver;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleInc {
    public static void main(String[] args) {
        Employee[] employees = {
                new Tester("Mini", 23, 'F', "SDET", "S123", 95_000),
                new Developer("Emre", 30, 'M', "Java Developer", "784512", 110000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
                new Developer("Emre", 30, 'M', "Java Developer", "784512", 110000),
                new Developer("Emre", 30, 'M', "Java Developer", "784512", 110000),
                new Developer("Emre", 30, 'M', "Java Developer", "784512", 110000),
                new Developer("Emre", 30, 'M', "Java Developer", "784512", 110000),
                new Developer("Emre", 30, 'M', "Java Developer", "784512", 110000),
                new Developer("Emre", 30, 'M', "Java Developer", "784512", 110000),
                new Tester("Mini", 23, 'F', "SDET", "S123", 95_000),
                new Tester("Mini", 23, 'F', "SDET", "S123", 95_000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000)
        };

        int countTesters = 0;
        int countDev = 0;
        int countUberDriv = 0;
        for (Employee each : employees){
            if(each instanceof Tester){
                countTesters++;
            }
            if (each instanceof Developer){
                countDev++;
            }
            if (each instanceof UberDriver){
                countUberDriv++;
            }
        }

        System.out.println(countTesters);
        System.out.println(countDev);
        System.out.println(countUberDriv);

        System.out.println("-------------------------------------");

        ArrayList<Employee> scrumMembers = new ArrayList<>();
        scrumMembers.addAll(Arrays.asList(employees));

       scrumMembers.removeIf(p->p instanceof UberDriver);
        System.out.println(scrumMembers.size());

        System.out.println("-------------------------------------");

        ArrayList<Employee> testers = new ArrayList<>();
        ArrayList<Employee> developers = new ArrayList<>();

        scrumMembers.forEach(each -> {if (each instanceof Tester) testers.add(each); else developers.add(each);});

        /*for (Employee each:scrumMembers){
            if(each instanceof Tester){
                testers.add(each);
            }else {
                developers.add(each);
            }
        }
         */



    }
}
