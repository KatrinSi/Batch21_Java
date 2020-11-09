package day28_MultiDementionalArray;

public class LongestString2 {
    public static void main(String[] args) {

        String[] names = {"Erjon", "Lola", "Aamir", "Oguzhan", "Aibek", "Elvin", "Ilgar", "Nadira", "Beraat", "Parizat"};

        int max = names[0].length();
        int min = names[0].length();


        for (String each : names){
            if (each.length() > max ){
                max = each.length();
            }
            if (each.length() < min){
                min = each.length();
            }
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);

        String longest = "";
        String shortest = "";
        for (String each : names){
            if (each.length() == max){
                longest += each +" ";
            }
            if (each.length() == min){
                shortest += each+ " ";
            }
        }

        System.out.println("Longest name is : "+ longest);
        System.out.println("Shortest name is : "+ shortest);

    }
}
