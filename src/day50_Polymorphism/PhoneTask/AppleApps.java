package day50_Polymorphism.PhoneTask;

public interface AppleApps extends Downloadable {

    String AppStoreName = "Apple", OS = "IOS";// by default it's final and needs to be initialized. Also it's static.
    @Override
    void downloadApp();

}
/*
3. create an interface named AppleApp that can inherit from Downloadable
            variable: AppStoreName
 */