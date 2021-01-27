package day49_Abstraction.ShapeTask;

public final class Cube extends Shape implements Volume {

    private double side;

    public Cube(double side) {
        super("Cube");
        if (side <= 0) {
            throw new RuntimeException("No such a shape with side " + side);
        }
        this.side = side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }

    @Override
    public double area() {
        Square square = new Square(side);
        return square.area() * 6;
    }

    @Override
    public double perimeter() {
        return 6 * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
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
