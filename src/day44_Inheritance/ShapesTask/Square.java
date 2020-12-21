package day44_Inheritance.ShapesTask;

public class Square extends Shape{
    public double side;// + name

    public Square(double side){
        super("Square");
        this.side = side;

    }

    @Override
    public double calcArea() {
        return side*side;
    }

    @Override
    public double calcPerimeter() {
        return 4*side;
    }
}
/*
Area of the square:    side * side
                Perimeter of circle:   3.14 * 2 * radius
                Perimeter of rectangle: (width + length) * 2
                Perimeter of Square: 4 * side
 */