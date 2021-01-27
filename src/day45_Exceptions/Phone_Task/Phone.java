package day45_Exceptions.Phone_Task;

public class Phone extends Device {

    public Phone(String brand, String model, String country, int price) {
        super(brand, model, country, price);
    }

    @Override
    public String toString() {
        return "Phone" + super.toString();
    }

    public void call(String phoneNumber) {
        System.out.println(brand + " " + model + " is calling " + phoneNumber);
    }

    public void text(String phoneNumber) {
        System.out.println(brand + " " + model + " is texting " + phoneNumber);
    }
}
/*
 create a class called phone:
                attributes: brand, model, price, country
                methods: call, text,  toString
 */