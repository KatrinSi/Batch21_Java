package day50_Polymorphism;

import day49_Abstraction.RemoteDriverTask.ChromeDriver;
import day49_Abstraction.RemoteDriverTask.FirefoxDriver;
import day49_Abstraction.RemoteDriverTask.RemoteDriver;
import day49_Abstraction.ShapeTask.Circle;
import day49_Abstraction.ShapeTask.Cube;
import day49_Abstraction.ShapeTask.Rectangle;
import day49_Abstraction.ShapeTask.Shape;
import day50_Polymorphism.PhoneTask.IPhone;
import day50_Polymorphism.PhoneTask.Phone;
import day50_Polymorphism.PhoneTask.Samsung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class PolymorphismIntro {

    public static void main(String[] args) {

        Phone iPhone= new IPhone("12 XPro", "small", "black", 1200);
        Phone samsung = new Samsung("S20", "big", "red", 1100);

        ArrayList<Phone> list = new ArrayList<>(Arrays.asList(iPhone,samsung));


        Shape shape;
        //shape = new Circle(3);
        //shape = new Rectangle(4,3);
        shape = new Cube(5);

        System.out.println(shape.area());


        RemoteDriver driver;
        String browserName = "";
        driver = new ChromeDriver();

        switch (browserName.toLowerCase()){
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "chrome":
                driver = new ChromeDriver();
                break;
            default:throw new RuntimeException("No such a browser");
        }

    }
}
