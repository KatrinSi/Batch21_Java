package day04_Variables;

public class CalculateCircle {
    public static void main(String[] args) {
        double r = 7.5;
        double PI = 3.14;

        double area = r * r * PI;
        double perimeter = 2 * r * PI;

        System.out.println(area);
        System.out.println(perimeter);
    }
}



/*
write a program that can calulate the area and permeter of the circle based on the given radius

     	Hints: Area of circle = r * r * PI
     		  Perimeter of circle = 2 * r * PI
 */