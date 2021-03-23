package day53_Collection;

import java.time.LocalDate;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        TreeMap<String, Integer> students = new TreeMap<>();
        students.put("Daniel", 63);
        students.put("Kate", 93);
        students.put("Inna", 94);
        students.put("Erjon", 76);
        students.put("Lenny", 96);

        List<String> earlyBirds = new ArrayList<>();//=>80
        List<String> angryBirds = new ArrayList<>();//<=80

       students.keySet().forEach(p -> {
            if (students.get(p) >= 80) earlyBirds.add(p);
            else angryBirds.add(p);
        });
        LinkedHashMap<String, LocalDate> DOfB = new LinkedHashMap<>();
        DOfB.put("Jimmy", LocalDate.now());
        DOfB.put("Farzam", LocalDate.of(2021,01,2));
        DOfB.put("Muhtar", LocalDate.of(1976, 5, 19));
        DOfB.put("Kate", LocalDate.of(1987,11,19));
        for (String name : DOfB.keySet()) {
            LocalDate DOB = DOfB.get(name);
            if(DOB.isBefore(LocalDate.of(1980,1,1))){
                System.out.println(name+" "+DOB);
            }
        }
        System.out.println("=================================");
        TreeMap<String,String > countrues = new TreeMap<>();
        countrues.put("USA", "Washington, DC");
        countrues.put("Russia", "Moscow");
        countrues.put("The Czech Republic", "Prague");
        countrues.put("España", "Madrid");
        countrues.put("Germany", "Berlin");

        countrues.values().forEach(p-> {
            System.out.println(p.toUpperCase());
        });

        System.out.println("---------------------------------");
        //verify :
        boolean r1 = countrues.get("Russia").equals("Moscow");
        boolean r2 = countrues.containsValue("Moscow");

        for (String country : countrues.keySet()) {
            String capital = countrues.get(country);
            if(capital.equals("Berlin")){
                System.out.println(country);
            }
        }

        countrues.keySet().forEach(p->{if (countrues.get(p).equals("Washington DC")) System.out.println(p);});



    }
}

/*
1. create a map that can contain student name and student' score
            put 5 of your friends names and thier scores
            print out the names of the students who made less than 80

 2. create a map that can contains name and Date Of Birth.
            put 5 of your classmates' names and thier date of birth
            print out the names of the students who were born before 1980 January 1st
 3. create a map that can contain names of counties and thier capitals
                use for each loop to print out all the capitals

 */