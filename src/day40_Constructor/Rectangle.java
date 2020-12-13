package day40_Constructor;

public class Rectangle {

    public double width, length, area, perimeter;

    public static int numOfSides;//belongs to the class Rectangle

    static {
        numOfSides = 4;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        area = width*length;
        perimeter = (width+length)*2;
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", number of sides="+numOfSides+
                '}';
    }
}
class RectangleObjects{
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(3,5);
        System.out.println(rectangle1);
        Rectangle rectangle2 = new Rectangle(10,20);
        System.out.println(rectangle2);
        System.out.println(Rectangle.numOfSides);

    }
}