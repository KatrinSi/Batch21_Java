package day42_Inheritance.DeviceTask;

public class DeviceObj {
    public static void main(String[] args) {

        TV tv = new TV("LG", "LG123", 499.99);
        System.out.println(tv);

        Phone phone = new Phone("Iphone 12 Pro Max", "Apple", 1299);
        phone.call("122345");

        System.out.println(Device.hasBattery);
    }
}
