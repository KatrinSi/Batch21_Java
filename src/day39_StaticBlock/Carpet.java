package day39_StaticBlock;

import java.text.DecimalFormat;

public class Carpet {

    public double width, length, unitPrice;
    public boolean isPersian;
    public String name;

    public void orderCarpet(String name, double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
        this.name = name;
    }

    public int calcCost() {
        int totalCost = (int) ((width * length) * unitPrice);
        if (isPersian) {
            totalCost += 200;
        }
        return totalCost;
    }

    public String material() {
        String material = "";
        if (isPersian) {
            material = "Persian carpet";
        } else {
            material = "Regular carpet";
        }
        return material;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "You have selected: " + material() + " " + name + ".\n" + width + " x " + length + "\nUnit price: $" + unitPrice +
                "\nYour total is: $" + df.format(calcCost());

    }


}


/*

    1. create a custom class for the Carpet class that should contain the following:

                instance variables:
                        width, length, unitPrice, isPersian (boolean)
                instance methods:
                        customOrder(): sets the carpet' width, length, unitprice, & isParsian
                        calcCost(): should be able to caculate the total cost of the carpet and return it as double
                        toSrring(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
            total price of carpet= (width*length)*unitprice
            if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice
            create a class called carpetObjects, and create an array of the carpet that contains 5 carpet objects ( make sure you set the instance variables of those objets)
            create two ArrayList of carpets:
                                        persianCarpets
                                        reugularCarpets
            write a program to store all the persian Carpets into the list of persianCarpets, and store all regular carpets into the list of reugularCarpets

                    use for each loop to print out all the persian carpets
 */