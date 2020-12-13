package day38_StaticKeyword;

public class Pizza {
    public String size;
    public int cheeseTopping, pepperoniTopping;
    public double price, tips, totalPrice;


    public double calcCost() {
        double startingPrice = (size.equalsIgnoreCase("small") ? 10 : size.equalsIgnoreCase("medium") ? 12 : 14);
        double cheese = 1 * cheeseTopping;
        double pepperoni = 1.5 * pepperoniTopping;

        return startingPrice + cheese + pepperoni;

    }

    public void customizeOrder(String size, int cheeseTopping, int pepperoniTopping, double tips) {
        this.size = size;
        this.cheeseTopping = cheeseTopping;
        this.pepperoniTopping = pepperoniTopping;

        price = calcCost();
        this.tips = tips / 100 * price;
        totalPrice = price +  this.tips + (price * 0.08); // including tax

    }

    public String toString() {
        return "Pizza{" +
                ", size='" + size + '\'' +
                ", cheeseTopping=" + cheeseTopping +
                ", pepperoniTopping=" + pepperoniTopping +
                ", price=" + price +
                ", tips=" + tips +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
