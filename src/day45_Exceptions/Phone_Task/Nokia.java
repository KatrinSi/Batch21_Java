package day45_Exceptions.Phone_Task;

public final class Nokia extends Phone{

    public Nokia(String model, int price) {
        super("Nokia", model, "Finland", price);
    }
    public void selfDefence(){
        System.out.println(brand+" "+model+" is for self defence");
    }

    public void breaksTheFloor(){
        System.out.println(brand+" "+model+" can break the floor");
    }
}
