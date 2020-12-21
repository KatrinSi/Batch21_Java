package day42_Inheritance.DeviceTask;

public class Device {
    public String deviceName, model, brand;
    public double price;
    public static String madeIn;
    public static boolean hasBattery, hasPowerButton;

    static {
        madeIn = "China";
        hasBattery = true;
        hasPowerButton = true;
    }

    public void setInfo(String deviceName, String model, String brand, double price) {
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.deviceName = deviceName;
    }

    public String toString() {
        return "Device{" +
                "deviceName='" + deviceName + '\'' +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", price=$" + price +
                '}';
    }

    public void turnOn() {
        System.out.println("Turning on is " + brand + " " + model);
    }

    public void turnOff() {
        System.out.println("Turning off is " + brand + " " + model);
    }


}
