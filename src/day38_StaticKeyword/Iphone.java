package day38_StaticKeyword;

public class Iphone {

    public String model, color, storage;
    public double price;
    public static String brand = "Apple", OS = "iOS", madeIn = "China";


    public void call(long phoneNum){
        System.out.println(brand +" "+model +" is calling" + phoneNum);
    }

    public static void getInfo(){
        System.out.println("Brand is: "+brand);
        System.out.println("OS is: "+OS);
        System.out.println("Made in: "+madeIn);
    }


    public String toString() {
        return "Brand: "+brand+ "Model: " + model  + "Color: "+ color + "Storage: " + storage  + "Price: " + price + "Operating System: "+OS;
    }
}
