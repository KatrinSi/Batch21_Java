package day54_Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;

public class UniquesAndDuplicates {
    public static void main(String[] args) {
        String str = "aabcccdee";
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
        for (String each : str.split("")) {
            int f = Collections.frequency(Arrays.asList(str.split("")), each);

            if (f > 1){
                map.put(each,f);
            }
            if(f == 1){
                map2.put(each, 1);
            }
        }
        System.out.println(map);
        System.out.println(map2);

    }
}
/*
1. write a program that stores the duplicated characters from a string into a map

            Ex:
                str = "aabcccdee";
                output:
                    {a=2, c=3, e=2}

 */