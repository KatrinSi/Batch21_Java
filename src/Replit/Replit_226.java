package Replit;

public class Replit_226 {
    public double width, length, unitPrice, totalPrice;
    public boolean isPersian;

    public Replit_226() {
        width = 300;
        length = 300;
        totalPrice = 200;
        isPersian = false;
        unitPrice = 0;
    }

    public Replit_226(double width, double length, double unitPrice, boolean isPersian) {

        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
        totalPrice = (width + length) * unitPrice;
        if (isPersian) {
            totalPrice += 200;
        }
    }


}
