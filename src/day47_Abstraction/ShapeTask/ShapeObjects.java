package day47_Abstraction.ShapeTask;

public class ShapeObjects { //has a relation with Shape since they don't inherit each other
    public static void main(String[] args) {
        Circle circle = new Circle(3.5);
        Rectangle rectangle = new Rectangle(3,5);
        Square square = new Square(4);


        System.out.println("circle.area() = " + circle.area());
        System.out.println("rectangle.perimeter() = " + rectangle.perimeter());
    }
}
