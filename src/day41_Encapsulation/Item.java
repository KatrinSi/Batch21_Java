package day41_Encapsulation;

public class Item {
    public String name;
    public double unitPrice;
    public int quantity;

    public Item(String name, double unitPrice, int quanity) { //Constructor
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quanity;
    }

    public double calcCost() {
        return unitPrice * quantity;
    }


    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=$" + unitPrice +
                ", quantity=" + quantity +
                ", totalCost=$"+calcCost()+
                '}';
    }
}
