package day19_ForLoop;

public class Task3 {
    public static void main(String[] args) {

        String str1 = " * * * * * *";

        System.out.println(str1);
        String str2 = " *         *";
        for(int i = 1; i <=8; i++){
            System.out.println(str2);
        }
        System.out.println(str1);
    }
}


/*

                    * * * * * *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    * * * * * *
    Hint: in the loop body , only place the statements that you need to repeat

 */