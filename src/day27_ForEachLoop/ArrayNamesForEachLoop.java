package day27_ForEachLoop;

public class ArrayNamesForEachLoop {
    public static void main(String[] args) {

        String[] names = { "Erjon", "Lola", "Aamir", "Oguzhan", "Aibek", "Elvin", "Ilgar", "Nadira", "Beraat", "Parizat"};

        for (String eachName : names) {
            System.out.print(eachName.substring(0, 3)+" ");

        }

    }
}
