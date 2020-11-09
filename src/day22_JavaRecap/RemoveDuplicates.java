package day22_JavaRecap;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "AAABB";
//                  //01234
        String result = "";// AB

       for (int i = 0; i <= str.length()-1; i++) {
               String eachChar = ""+str.toLowerCase().charAt(i); //0 = A; 1 = A
              /* if (result.contains(eachChar)){
                   continue;
               }else{
                   result += eachChar;
               }
               */
           if (!result.contains(eachChar)){
               result += eachChar;
           }
       }

        System.out.println(result);

    }
}
