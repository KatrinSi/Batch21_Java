package day44_Inheritance.ShapesTask;

import day38_StaticKeyword.Pizza;

public class Circle extends Shape {

    public double radius, diameter;//+ name
    public final double PI = 3.14;//Math.PI

    public Circle(double radius) { //CONSTRUCTOR
        super("Circle");
        this.radius = radius;
        diameter = this.radius * 2;
    }

    @Override
    public double calcArea() {//should be the same with the original method to override!!
        return radius*radius*PI;
    }

    @Override
    public double calcPerimeter() {
        return PI*2*radius;
    }
}
/*
create sub classes of Shape:
                        Circle
                        Rectangle
                        Square
             give the instance variables that are needed to calculate the Area, perimeter, of those shapes
    AFTER TODAY'S TOPIC: Overriding
    3. override super class' calculateArea(), calculatePerimeter() methods to the sub classes:
                Area of the circle:    3.14 * radius * radius
                Area of the rectangle:  width * length
                Area of the square:    side * side
                Perimeter of circle:   3.14 * 2 * radius
                Perimeter of rectangle: (width + length) * 2
                Perimeter of Square: 4 * side
        4. create constructor in shape class that can initialize the instances

 */