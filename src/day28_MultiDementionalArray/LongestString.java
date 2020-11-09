package day28_MultiDementionalArray;

public class LongestString {
    public static void main(String[] args) {

        String[] names = {"Erjon", "Lola", "Aamir", "Oguzhan", "Aibek"};

        String longest = names[0];
        String shortest = names[0];

        for (int i = 0; i < names.length; i++) {
            if (names[i].length() > longest.length()) {
                longest = names[i];

            }
            if (names[i].length() < shortest.length()){
                shortest = names[i];
            }
        }
        System.out.println(longest);
        System.out.println(shortest);
    }
}
