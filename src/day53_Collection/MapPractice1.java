package day53_Collection;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice1 {
    public static void main(String[] args) {

        Map<String, Double> employeeInfo = new LinkedHashMap<>();
        employeeInfo.put("Muhtar", 154000.0);
        employeeInfo.put("Inna", 153000.0);

        System.out.println(employeeInfo.size());
        System.out.println(employeeInfo.get("Muhtar"));
        employeeInfo.remove("Muhtar");
        System.out.println(employeeInfo);

        System.out.println("employeeInfo.containsKey(\"Inna\") = " + employeeInfo.containsKey("Inna"));
        System.out.println("employeeInfo.containsValue(155000.0) = " + employeeInfo.containsValue(155000.0));


        employeeInfo.put("Katrin", 151000.0);
        employeeInfo.put("Elvira", 152000.0);
        double max = Double.MIN_VALUE, min = Double.MAX_VALUE;
        String nameMax = "", nameMin = "";

        for (String eachName : employeeInfo.keySet()) {
            double eachSalary = employeeInfo.get(eachName);
            if(eachSalary > max){
                max = eachSalary;
                nameMax = eachName;
            }
            if(eachSalary < min){
                min = eachSalary;
                nameMin = eachName;
            }
        }
        System.out.println(nameMax);
        System.out.println(nameMin);

        employeeInfo.values().forEach(p->{
            System.out.println(p);
        });


    }
}
