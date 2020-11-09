package day27_ForEachLoop;

import java.util.Arrays;

public class CombiningGroupsForEachLoop {
    public static void main(String[] args) {

        String[] group1 = {"Erjon", "Lola", "Aamir"};
        String[] group2 = {"Oguzhan", "Aibek", "Elvin"};
        String[] group3 = {"Ilgar", "Nadira" };
        String[] group4 = {"Beraat", "Parizat"};

        String[] groups = new String[group1.length + group2.length + group3.length + group4.length];
        int i = 0;

        for (String eachName1 : group1){
            groups[i++] = eachName1;
        }
        for(String eachName2 : group2){
            groups[i++] = eachName2;
        }
        for(String eachName3 : group3){
            groups[i++] = eachName3;
        }
        for (String eachName4 : group4){
            groups[i++] = eachName4;
        }

        System.out.println(Arrays.toString(groups));
    }


}


