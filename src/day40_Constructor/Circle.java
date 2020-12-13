package day40_Constructor;

public class Circle {
    public double radius, diameter, area, perimeter;
    public static double PI;

    static {
        PI = 3.14; // static is executed first!
    }

    public Circle(double radius) {
        this.radius = radius;
        diameter = radius * 2;
        area = radius * radius * PI;
        perimeter = diameter * PI;
    }

}

class CircleObjects {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5); //int 5 to the double - implicit casting

        System.out.println(circle1.area);
        System.out.println(circle1.perimeter);

        Circle circle2 = new Circle(6.5);
        System.out.println(circle2.area);
        System.out.println(circle2.perimeter);

    }
}