package day28_MultiDementionalArray;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        String[][] ScrumTeam = {{"Dorin", "Adil", "Fatih", "Subhi"},//0
                {"Katrin", "Mustafa", "Ruslan"},                  //1
                {"Ayse"},                                            //2
                {"Omid"},                                            //3
                {"Agalar"}};                                         //4

        System.out.println(Arrays.deepToString(ScrumTeam));

        for (int i = 0; i < ScrumTeam.length; i++) {
            System.out.println(Arrays.toString(ScrumTeam[i]));
            for(int j =0; j < ScrumTeam[i].length; j++){
                System.out.println(ScrumTeam[i][j]);
            }

        }

        System.out.println("==========================================");

        for ( String[] eachGroup: ScrumTeam){
            System.out.println(Arrays.toString(eachGroup));
            for (String eachName : eachGroup){
                System.out.println(eachName);
            }

        }

    }
}
