package day35_CustomClass;

public class Car {

    public String brand;//instance variable
    public String model;
    public int year;
    public String color;
    public double price;


    public void setInfo(String carBrand, String carModel, String carColor, int carYear, double carPrice) {
        brand = carBrand;
        model = carModel;
        color = carColor;
        year = carYear;
        price = carPrice;

    }

    public void getInfo(){
        System.out.println(brand+" "+model+" "+color+" "+year+" "+ price);
    }
}
