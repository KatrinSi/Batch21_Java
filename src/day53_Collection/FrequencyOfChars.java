package day53_Collection;

import java.util.*;

public class FrequencyOfChars {
    public static void main(String[] args) {

        String str = "aaabbc";
        String result = "";//a3b2c1

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        for (String each : new LinkedHashSet<>(list)) {
            int frequency = Collections.frequency(list, each);
            result += each + frequency;
        }

        System.out.println(result);

        System.out.println("---------------------------------------------");

        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7,8);


    }
}
