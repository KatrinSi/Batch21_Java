package day41_Encapsulation;

public class CircleObjects {
    public static void main(String[] args) {
        Circle circle1 = new Circle(4);

        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        circle1.setRadius(5);
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.getArea());
    }

}
