package OfficeHours.Practice_10_28_2020;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "abab";

        String nonDupl = "";

        for(int i = 0; i < str.length(); i++) {

       str.charAt(1);
       if ( nonDupl.contains(""+str.charAt(i))){

          continue;
       }else{
           nonDupl +=str.charAt(i);
       }
        }

        System.out.println(nonDupl);
    }
}
