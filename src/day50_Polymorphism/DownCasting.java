package day50_Polymorphism;

import day49_Abstraction.ShapeTask.Cylinder;
import day49_Abstraction.ShapeTask.Shape;

public class DownCasting {
    public static void main(String[] args) {

        Shape shape = new Cylinder(3, 5);
        System.out.println("((Cylinder) shape).volume() = " + ((Cylinder) shape).volume());




    }
}
