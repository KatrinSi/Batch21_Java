package day50_Polymorphism.PhoneTask;

public interface AndroidApps extends Downloadable{

    String AppStoreName = "Play Market", OS = "Android";// by default it's final and needs to be initialized. Also it's static

    @Override
    void downloadApp();
}
