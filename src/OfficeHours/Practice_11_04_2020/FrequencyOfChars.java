package OfficeHours.Practice_11_04_2020;

public class FrequencyOfChars {
    public static void main(String[] args) {

        String str = "abbacaa";// a4b2c1
        String result = "";//a4

       for (int j = 0; j < str.length(); j++){
           char ch = str.charAt(j);//      a b c
           int count = 0; //the frequency: 4 2 1

           for (int i = 0; i < str.length(); i++){// to find the frequency the first char by comparing with each char of the str
               if (ch == str.charAt(i)){
                   count++;
               }
           }
           if(result.contains(""+ch)){
               continue;
           }
           result += ""+ch+count;
       }

        System.out.println(result);

    }
}
