package day45_Exceptions.Phone_Task;

public final class HuaWei extends Phone{
    public HuaWei(String model, int price) {
        super("Huawei", model, "China", price);
    }

    public void spy(){
        System.out.println(brand+" "+model+" is spying");
    }
}
