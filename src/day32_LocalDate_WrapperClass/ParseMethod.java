package day32_LocalDate_WrapperClass;

public class ParseMethod {
    public static void main(String[] args) {

        String str = "123";

        int num1 = Integer.parseInt(str); //none of outboxing or autoboxing
        System.out.println(num1);

        Integer num2 = Integer.parseInt(str);//autoboxing

        String str1 = "2.5";
        double num = Double.parseDouble(str1);//none of outboxing or autoboxing
        System.out.println(num);
        Double numClass = Double.parseDouble(str1);//autoboxing
        System.out.println(numClass+2);


        String str2 = "true false";
        boolean result = Boolean.parseBoolean(str2);

        Boolean result1 = Boolean.parseBoolean(str2);

        System.out.println(result +" "+ result1);




    }
}
