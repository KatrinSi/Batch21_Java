package day50_Polymorphism.PhoneTask;

public class Samsung extends Phone implements AndroidApps{


    public Samsung(String model, String size, String color, double price) {
        super("Samsung", model, size, color, price);
        if(price > 1200){
            throw new RuntimeException("Invalid Price, Samsung' price cannot more than 1200");
        }
    }

    @Override
    public void downloadApp() {
        System.out.println("Downloading apps from: "+AppStoreName);
    }

    @Override
    public void text() {
        System.out.println("Samsung is texting");
    }

    @Override
    public void call() {
        System.out.println("Samsung is calling");
    }

    public void freezing(){
        System.out.println("Samsung is freezing");
    }
    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", OS='" + OS + '\'' +
                ", price=" + price +
                '}';
    }
}
