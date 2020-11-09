package day23_NestedLoop;

public class DoWhilePractice {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            if (i%2 != 0){
                System.out.println(i);
            }
        }

        int i = 1;
        do{
            if (i%2 != 0) {
                System.out.println(i);
            }
            i++;
        }while (i<=10);

    }
}
