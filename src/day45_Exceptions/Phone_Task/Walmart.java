package day45_Exceptions.Phone_Task;

public class Walmart {
    public static void main(String[] args) {
        String number = "911";

        IPhone iPhone = new IPhone("12 Max Pro", 1300);
        Samsung samsung = new Samsung("s20", 1200);
        Nokia nokia = new Nokia("Brick", 70);
        HuaWei huaWei = new HuaWei("iSpy", 300);

        iPhone.call(number);
        samsung.text(number);
        nokia.call(number);
        huaWei.call(number);

        System.out.println(iPhone);
        System.out.println(nokia);
        System.out.println(samsung);
        System.out.println(huaWei);

        iPhone.FaceTime(number);
        iPhone.FaceTime("katrinsi@me.com");
        samsung.freeze();
        nokia.breaksTheFloor();
        huaWei.spy();

    }
}
