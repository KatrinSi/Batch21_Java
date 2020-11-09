package day19_ForLoop;

public class Task3Extra {
    public static void main(String[] args) {

        for (char c = 97; c <= 122; c++){//int
            System.out.print(c+" ");//((char)i)
        }

        System.out.println();

        for(char i = 'a'; i <='z'; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i = 97; i <= 122; i++){
            System.out.print((char)i+ " ");
        }
        System.out.println();

        for (char i = 'A'; i <= 'Z'; i++){
            System.out.print (i+" ");
        }
    }
}

/*
Write a program that will print out all letters in English alphabet in ascending order
 */