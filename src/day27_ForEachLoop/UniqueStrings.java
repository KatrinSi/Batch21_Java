package day27_ForEachLoop;

public class UniqueStrings {
    public static void main(String[] args) {

        String[] str = {"c#", "c#", "java", "python", "python", "c++"};
        String result = " ";

       for (int j = 0; j < str.length; j++){
           String element = str[j]; //j!! don't forget to change from [0] to [j]
           int count = 0;

           for (int i = 0; i < str.length; i++){
               if (str[i].equals(element)){
                   count++;
               }
           }
           if (count == 1){
               result+= element+" ";
           }
       }
        System.out.println("Unique elements are: "+result);

    }
}
