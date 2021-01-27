package day47_Abstraction.ShapeTask;

public abstract class Shape { //ABSTRACT, cannot have any objects

    public Shape(String name) { // not concrete, not physically exists
        this.name = name;
    }
    public String name;

    public abstract double area();//ABSTRACT, doesn't require any implementation
    public abstract double perimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
