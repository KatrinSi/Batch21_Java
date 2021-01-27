package day47_Abstraction.ShapeTask;

public class Rectangle extends Shape{//we cannot have any object of Shape class since it abstract!!
    public double width, length;

    public Rectangle(double width, double length) {
        super("Rectangle");
        this.width = width;
        this.length = length;
    }

    @Override
    public double area(){
        return width*length;
    }

    @Override
    public double perimeter(){
        return width*2+length*2;
    }



}
