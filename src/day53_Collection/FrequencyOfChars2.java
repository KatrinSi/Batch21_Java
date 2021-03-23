package day53_Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfChars2 {
    public static void main(String[] args) {

        String str = "aaabbc";
        Map<String, Integer> result = new LinkedHashMap<>();

        for (String s : str.split("")) {
            int f = Collections.frequency(Arrays.asList(str.split("")),s);
            result.put(s,f);
        }
        System.out.println(result);
    }
}
