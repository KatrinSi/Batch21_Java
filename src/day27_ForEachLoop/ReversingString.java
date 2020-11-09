package day27_ForEachLoop;

public class ReversingString {
    public static void main(String[] args) {

        String[] names = {"Kate", "Muhtar", "Dan", "Asyia"};


        for (String eachName: names) {

           String reversedName = "";

           for (int i = eachName.length()-1; i >= 0; i--){
               reversedName += eachName.charAt(i);
           }

            System.out.println(reversedName+ " ");
        }



    }
}
