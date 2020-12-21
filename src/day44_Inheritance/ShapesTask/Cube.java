package day44_Inheritance.ShapesTask;

public class Cube extends Shape {
    public double side;

    public Cube(double side) {
        super("Cube");
        this.side = side;

    }

    public double calcArea() {
        //Square square = new Square(side);
        //double area = square.calcArea();
        return side * side * 6;
    }

    @Override
    public double calcPerimeter() {
        return side * 12;
    }


}
