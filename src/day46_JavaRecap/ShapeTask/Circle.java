package day46_JavaRecap.ShapeTask;

public final class Circle extends Shape {
    private final static double PI = 3.14;//for only internal use
    public double r, d;

    public Circle(double r) {
        super("Circle");
        if(r<=0){
            throw new RuntimeException("No Such a Circle with a radius of: "+r);
        }
        setR(r);
        setD(r * 2);
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getD() {
        return d;
    }

    @Override
    public double area() {
        return r * r * PI;
    }

    @Override
    public double perimeter() {
        return d * PI;
    }

    public void setD(double d) {
        this.d = d;
    }


}
