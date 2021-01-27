package day49_Abstraction.ShapeTask;

public final class Cylinder extends Shape implements Volume {
    public double radius, diameter, high;
    public final static double PI = 3.14;


    public Cylinder(double radius, double high) {
        super("Cylinder");
        if (radius <= 0 || high <= 0) {
            throw new RuntimeException("No such a cylinder with radius and high " + radius + " " + high);

        }
        this.radius = radius;
        diameter = radius * 2;
        this.high = high;
    }

    @Override
    public double area() {
        return 2 * PI * radius * (radius + high);
    }

    @Override
    public double perimeter() {
        return new Circle(radius).perimeter() * high;
    }

    @Override
    public double volume() {
        return new Circle(radius).area() * high;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + getName() + '\'' +
                ", area='" + df.format(area()) + '\'' +
                ", perimeter='" + df.format(perimeter()) + '\'' +
                ", volume='" + df.format(volume()) + '\'' +
                '}';
    }
}
