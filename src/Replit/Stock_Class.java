package Replit;

public class Stock_Class {
    public String tickerSymbol, companyName, pm;
    public int price, totalShares;
    public double percentChange;
    public long marketCap;


    public Stock_Class(String tickerSymbol, String companyName, int price, int totalShares){
        this.tickerSymbol = tickerSymbol.toUpperCase();
        this.companyName = companyName;
        this.price = price;
        this.totalShares = totalShares;
        marketCap = totalShares*price;
    }

    public void adjustPrice(int value){
        percentChange = (100*value)/price;
        if (value > 0){
            pm = "+";
            price +=value;
        }else{
            pm = "-";
            price -=value;
        }

    }
    public String toString(){
        return "Ticker Symbol: "+tickerSymbol+"\nCompany: "+companyName+"\nCurrent Price: $"+ price+"("+pm+percentChange+"%)\nMarket Cap: $"+marketCap;
    }
}
