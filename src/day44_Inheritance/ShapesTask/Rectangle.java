package day44_Inheritance.ShapesTask;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Rectangle extends Shape {
    public double width, length;//+ name

    public Rectangle(double width, double length){
        super("Rectangle");
        this.width = width;
        this.length = length;
    }

    @Override
    public double calcArea() {
        return width*length;
    }

    @Override
    public double calcPerimeter() {
        return (width+length)*2;
    }
}
/*
 3. override super class' calculateArea(), calculatePerimeter() methods to the sub classes:
                Area of the circle:    3.14 * radius * radius
                Area of the rectangle:  width * length
                Area of the square:    side * side
                Perimeter of circle:   3.14 * 2 * radius
                Perimeter of rectangle: (width + length) * 2
                Perimeter of Square: 4 * side
        4. create constructor in shape class that can initialize the instances

 */