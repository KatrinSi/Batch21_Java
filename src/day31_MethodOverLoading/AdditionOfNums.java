package day31_MethodOverLoading;

public class AdditionOfNums {
    public static void main(String[] args) {

        System.out.println(AdditionOf2Nums(2,3));

    }
    public static int AdditionOf2Nums(int num1, int num2){

        return num1+num2;
    }
    public static int AdditionOf3Nums(int num1, int num2, int num3){

        return AdditionOf2Nums(num1,num2)+num3;
    }
    public static int AdditionOf4Nums(int num1, int num2, int num3, int num4){
        return AdditionOf2Nums(num1,num2)+AdditionOf2Nums(num3,num4);
    }
}

/*
1. create a method that can find the addition of two numbers
                    method name: additionOf2Numbers
        2. create a method that can find the addition of three numbers
                    method name: additionOf3Numbers
        3. create a method that can find the addition of four numbers
                    method name: additionOf4Numbers

 */