package day47_Abstraction.ShapeTask;

public class Circle extends Shape {//concrete object
    public final static double PI = 3.14;
    public double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * PI;
    }

    @Override
    public double perimeter() {
        return radius*2*PI;
    }

}
