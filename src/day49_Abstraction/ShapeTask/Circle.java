package day49_Abstraction.ShapeTask;

public class Circle extends Shape {
    public final static double PI = 3.14;
    public double radius, diameter;

    public Circle(double radius) {
        super("Circle");
        if (radius <= 0) {
            throw new RuntimeException("No such a circle with radius " + radius);
        }
        this.radius = radius;
        diameter = radius * 2;
    }

    @Override
    public double area() {
        return radius * radius * PI;
    }

    @Override
    public double perimeter() {
        return diameter * PI;
    }
}
