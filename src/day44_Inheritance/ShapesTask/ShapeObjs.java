package day44_Inheritance.ShapesTask;

public class ShapeObjs {
    public static void main(String[] args) {

        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(3,5);
        Square square = new Square(3);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);

    }
}
