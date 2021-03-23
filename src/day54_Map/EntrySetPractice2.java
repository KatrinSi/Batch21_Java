package day54_Map;

import java.util.*;

public class EntrySetPractice2 {

    public static void main(String[] args) {
        LinkedHashMap<String , Integer> employeeInfo = new LinkedHashMap<>();
        employeeInfo.put("A",120000);
        employeeInfo.put("B",130000);
        employeeInfo.put("C",110000);
        employeeInfo.put("D",140000);
        employeeInfo.put("E",130000);
        employeeInfo.put("F",150000);
        for (Map.Entry<String, Integer> eachEntry : employeeInfo.entrySet()) {
            System.out.println(eachEntry);
        }

        LinkedHashMap<String , Integer> employeeInfo2 = new LinkedHashMap<>();
        employeeInfo2.put("A",120000);
        employeeInfo2.put("B",130000);
        employeeInfo2.put("C",110000);
        employeeInfo2.put("D",140000);
        employeeInfo2.put("E",130000);
        employeeInfo2.put("F",150000);
        List<Map<String ,Integer>> listOfMaps = new ArrayList<>(Arrays.asList(employeeInfo,employeeInfo2));
        for (Map<String, Integer> listOfMap : listOfMaps) {
            System.out.println(listOfMap.values());
        }

    }
}
