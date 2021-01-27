package day49_Abstraction.ShapeTask;

public final class Rectangle extends Shape {
    public double width, length;

    public Rectangle(double width, double length) {
        super("Rectangle");
        if (width <= 0 || length <= 0) {
            throw new RuntimeException("No such a rectangle with width " + width + " and length" + length);
        }
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width*length;
    }

    @Override
    public double perimeter() {
        return 2*(width+length);
    }
}
