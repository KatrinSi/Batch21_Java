package day45_Exceptions.Phone_Task;

public final class IPhone extends Phone {
    public IPhone(String model, int price) {
        super("IPhone", model, "USA", price);
    }

    public void FaceTime(long phoneNumber) {
        System.out.println(brand+" "+model+" is FaceTiming with "+phoneNumber);
    }
    public void FaceTime(String email){
        System.out.println(brand+" "+model+" is FaceTiming with "+email);
    }
    public void FaceTime(long phoneNumber1, long phoneNumber2){
        //System.out.println(brand+" "+model+" is FaceTiming with "+phoneNumber1+" and "+ phoneNumber2);
        FaceTime(phoneNumber1);
        FaceTime(phoneNumber2);
    }
    public void FaceTime(long phoneNumber1, long phoneNumber2, long phoneNumber3){
        FaceTime(phoneNumber1,phoneNumber2);
        FaceTime(phoneNumber3);
    }
    public void FaceTime(String email1, String email2){
        FaceTime(email1);
        FaceTime(email2);
    }
    public void FaceTime(String email1, String email2, String email3){
        FaceTime(email1,email2);
        FaceTime(email3);
    }

}
