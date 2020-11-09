package day19_ForLoop;

public class Task1Extra {
    public static void main(String[] args) {

        for(int i = 1; i <= 100; i++){
            if(i%2 != 0 && i%3 == 0 && i%5 == 0){
                System.out.print(i+" ");
            }
        }

    }
}

/*
write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5
 */