package OfficeHours.Practice_01_27_2021;

import day50_Polymorphism.PhoneTask.IPhone;
import day50_Polymorphism.PhoneTask.Phone;
import day50_Polymorphism.PhoneTask.Samsung;

public class PolymorphismPractice {
    public static void main(String[] args) {
        Phone iphone = new IPhone("12","small", "black", 1000);
        Phone phone2 = new Samsung("S20", "small", "red", 800);

        boolean isSamsung = phone2 instanceof Samsung;


    }
}
