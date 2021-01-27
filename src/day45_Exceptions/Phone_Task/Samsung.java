package day45_Exceptions.Phone_Task;

public final class Samsung extends Phone{

    public Samsung(String model, int price) {
        super("Samsung", model, "South Korea", price);
    }

    public void freeze(){
        System.out.println(brand+" "+model+" is freezing");
    }


}
