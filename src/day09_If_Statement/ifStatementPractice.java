package day09_If_Statement;

public class ifStatementPractice {
    public static void main(String[] args) {
        int year = 2021;
        boolean isPandemic  = year == 2020;

        if (isPandemic){
            System.out.println("Wear a mask.");
            System.out.println("Buy some toilet paper.");
            System.out.println("Wash your hands.");
        }
        if (!isPandemic){
            System.out.println("Just be free!");
        }

        System.out.println("=========================================");

        String name = "David";
        int age = 21;
        boolean isUSAcitizen = false;
        boolean eligible = isUSAcitizen && age >= 18;

        if (eligible) {
            System.out.println(name+" is eligible to voit.");
        }
        if (!eligible) {
            System.out.println(name+ " is not eligible to voit.");
        }
    }
}
