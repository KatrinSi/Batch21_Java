package day03_Variables;

public class CalculateCircle {
    public static void main(String[] args) {
        double radius = 4.5;
        double PI = 3.14;
        double area = radius * radius * PI;
        double perimeter = radius * 2 * PI;


        System.out.print("Area is: ");
        System.out.println(area);
        System.out.print("Perimeter is: ");
        System.out.println(perimeter);


    }
}
