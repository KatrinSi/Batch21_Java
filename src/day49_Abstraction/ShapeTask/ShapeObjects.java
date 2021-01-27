package day49_Abstraction.ShapeTask;

public class ShapeObjects {
    public static void main(String[] args) {
        Circle circle = new Circle(23);
        Rectangle rectangle = new Rectangle(10, 20);
        Cube cube = new Cube(15);
        Cylinder cylinder = new Cylinder(2, 5);
        Square square = new Square(50);

        System.out.println("circle = " + circle);
        System.out.println("rectangle = " + rectangle);
        System.out.println("cube = " + cube);
        System.out.println("cylinder = " + cylinder);
        System.out.println("square = " + square);

        System.out.println("cube.getSide() = " + cube.getSide());

    }

}
