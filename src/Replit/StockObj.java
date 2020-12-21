package Replit;

public class StockObj {
    public static void main(String[] args) {

        Stock_Class stock1 = new Stock_Class("goog", "Google, Inc.", 802,670822942 );

        stock1.adjustPrice(0);
        System.out.println(stock1.price);

        long sum = stock1.price* stock1.totalShares;
        System.out.println(sum);

        System.out.println(stock1);

    }
}
