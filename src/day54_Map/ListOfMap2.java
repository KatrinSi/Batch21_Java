package day54_Map;

import java.util.*;

public class ListOfMap2 {
    public static void main(String[] args) {

        String[] modelOfToyota = {"Camry", "Rav4", "Corolla", "Land Cruiser"};
        Integer[] yearOfToyota = {1961, 2011, 1970, 2021};
        String[] modelOfBMW = {"M1", "M3", "M5", "X5"};
        Integer[] yearOfBMW = {1995, 2005, 2015, 2020};
        String[] modelOfMercedes = {"C-Class", "A-Class", "SLS", "GLC"};
        Integer[] yearOfMercedes = {1990, 1995, 2015, 2021};

        List<Map<String, Integer>> CarCollection = new ArrayList<>(Arrays.asList(new TreeMap<>(), new TreeMap<>(), new TreeMap<>()));

        for (int i = 0; i < modelOfToyota.length; i++) {
            CarCollection.get(0).put(modelOfToyota[i], yearOfToyota[i]);
        }
        for (int i = 0; i < modelOfBMW.length; i++) {
            CarCollection.get(1).put(modelOfBMW[i], yearOfBMW[i]);
        }
        for (int i = 0; i < modelOfMercedes.length; i++) {
            CarCollection.get(2).put(modelOfMercedes[i], yearOfMercedes[i]);
        }

        Map<String, Integer> BMWEligibleToRecall = new TreeMap<>();
        Map<String, Integer> ToyotaEligibleToRecall = new TreeMap<>();
        Map<String, Integer> MercedesEligibleToRecall = new TreeMap<>();

        for (Map.Entry<String, Integer> eachCar : CarCollection.get(0).entrySet()) {//Toyota
            String eachBrandName = eachCar.getKey();
            Integer eachCarYear = eachCar.getValue();
            if (eachCarYear >= 1960 && eachCarYear <= 1970) {
                ToyotaEligibleToRecall.put(eachBrandName, eachCarYear);
            }
        }

        for (Map.Entry<String, Integer> eachCar : CarCollection.get(1).entrySet()) { //BMW
            String eachBrandName = eachCar.getKey();
            Integer eachCarYear = eachCar.getValue();
            if (eachCarYear >= 2011 && eachCarYear <= 2015) {
                BMWEligibleToRecall.put(eachBrandName, eachCarYear);
            }
        }

        for (Map.Entry<String, Integer> eachCar : CarCollection.get(2).entrySet()) {
            String eachBrandName = eachCar.getKey();
            Integer eachCarYear = eachCar.getValue();
            if (eachCarYear >= 1990 && eachCarYear <= 1998) {
                MercedesEligibleToRecall.put(eachBrandName, eachCarYear);
            }
        }
        System.out.println("Eligible to recall: \nMercedes " + MercedesEligibleToRecall.entrySet() + "\nBMW " + BMWEligibleToRecall.entrySet() + "\nToyota " + ToyotaEligibleToRecall.entrySet());

    }
}
