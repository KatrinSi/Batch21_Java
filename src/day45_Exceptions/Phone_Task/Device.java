package day45_Exceptions.Phone_Task;

public class Device {
    public String brand, model;
    public String country;
    public int price;

    public Device(String brand, String model, String country, int price) {
        this.country = country;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nBrand: " + brand + "\nModel: " + model + "\nCountry: " + country + "\nPrice: $" + price;
    }

}
/*
Phone Task:
            create a class called device:
                attributes: brand, model, price, country
                methods: toString
    create a class called phone:
                attributes: brand, model, price, country
                methods: call, text,  toString
    create the following subclasses of phone:
                        1. iPhone
                        2. Samsung
                        3. Nokia
    create constructors in each sub class that can initialize the instance variables

 */