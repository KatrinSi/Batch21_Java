package OfficeHours.Practice_11_26_2020;

public class LoopPractice {
    public static void main(String[] args) {


        for (int i = 1; i <= 50; i++) {
            System.out.print(i + " ");

        }
        System.out.println();

        for (int i = 2; i <= 50; i += 2) {        //  i+=2!!
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i <= 49; i += 2) {      //  i+=2!!
            System.out.print(i + " ");
        }
        System.out.println();


        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) { //if even nums - skip
                continue;
            }
            System.out.print(i + " ");//prints only odd nums

            if (i == 29){
                break;                      //      break - exits loop; continue - skips condition in if statement; return - exits method
            }
        }
        System.out.println();
    }
}

