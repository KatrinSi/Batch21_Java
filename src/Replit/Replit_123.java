package Replit;

public class Replit_123 {
    public static void main(String[] args) {

        int year = 0;
        int growth =0;
        int size = 0;
        for (int i = 1; i <= 10; i++){
            year = i;
            if (year>0 && year <= 3){
                growth=1;
                size+=growth;
            }
            if(year>3 && year <=10 ){
                growth=2;
                size+=growth;
            }
            System.out.println("year "+year+" - growth "+ growth+ " cm");
            System.out.println("tree size: "+size);
        }

    }
}
