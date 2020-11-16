package day30_ReturnMethods;

public class ReturnMethod2_ReverceString {
    public static void main(String[] args) {
        //void
        String name = "racecar";//racecar
        reverseStr1(name);

        //return
        String reversedName = reverseStr2(name);

        if (reversedName.equalsIgnoreCase(name)){
            System.out.println("The word is palindrome");
        }else{
            System.out.println("The word is not palindrome");
        }


    }

    //void
    public static void reverseStr1(String str){//"Cybertek
        String result = "";

        for (int i = str.length()-1; i >=0; i--){
            result +=str.charAt(i);
        }

        System.out.println(result);//has to be placed within the method when here is void
    }

    //return
    public static String reverseStr2(String str){

        String result = "";

        for (int i = str.length()-1; i >=0; i--){
            result +=str.charAt(i);
        }

        System.out.println(result);
        return result;
    }


}
