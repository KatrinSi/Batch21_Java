package day54_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class EntrySetPractice {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> students = new LinkedHashMap<>();
        students.put("A",85);
        students.put("B",75);
        students.put("C",95);
        students.put("D",87);
        students.put("E",88);

        for (String eachKey : students.keySet()) {
            System.out.println(eachKey+" : "+students.get(eachKey));
        }
        for (Integer eachValue : students.values()) {
            System.out.print(eachValue+" ");
        }
        for (Map.Entry<String, Integer> eachEntry : students.entrySet()) {
            String eachKey = eachEntry.getKey();
            Integer eachValue = eachEntry.getValue();
            System.out.println(eachKey+": "+eachValue);
        }

    }
}
