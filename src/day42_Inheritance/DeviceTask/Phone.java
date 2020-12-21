package day42_Inheritance.DeviceTask;

public class Phone extends Device {

    public static boolean canCall, canSendMessage, hasCamera;

    static {
        canCall = true;
        canSendMessage = true;
        hasCamera = true;
    }
    public Phone(String model, String brand, double price) {
        setInfo("Iphone", model, brand, price);
    }

    public void call(String phoneNum){
        System.out.println(brand+" "+model+" is calling "+phoneNum);
    }
    public void text(String phoneNum){
        System.out.println(brand+" "+model+" is texting "+phoneNum);
    }


}
