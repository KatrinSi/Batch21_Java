package day32_LocalDate_WrapperClass;

public class OverLoading {
    public static void main(String[] args) {
        System.out.println("String");

        int[] arr1 = {1,2,3};
        main(arr1);//call method to be able to run other methods
    }

    public static void main(int[] args){
        System.out.println("int");
    }

    public static void main(double[] args){
        System.out.println("double");
    }

    public static void main(char[] args){
        System.out.println("char");
    }
}
//prints only first method!!
//output :   String