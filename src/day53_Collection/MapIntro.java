package day53_Collection;

import java.util.*;

public class MapIntro {
    public static void main(String[] args) {

        Map<String , String> credentials1 = new HashMap<>();// can be the random order, faster than Hashtable, accepts null
        Map<String , String> credentials2 = new LinkedHashMap<>();//keeps the insertion order, accepts null
        Map<String , String> credentials3 = new TreeMap<>();//sorted order, doesn't accept null key
        Map<String , String> credentials4 = new Hashtable<>();//synchronized version of the map(thread safe)

    }
}
