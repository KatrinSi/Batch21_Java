package day42_Inheritance.DeviceTask;

public class TV extends Device {

    public TV(String model, String brand, double price) {
        setInfo("TV", model, brand, price);
    }

    public static boolean hasChannel, hasCable;

    static {
        hasChannel = true;
        hasCable = true;
    }

    public void channelUp() {
        System.out.println(brand + " " + model + " channel up");
    }

    public void channelDown() {
        System.out.println(brand + " " + model + " channel down");
    }


}
