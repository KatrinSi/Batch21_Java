package day41_Encapsulation;

public class Instance_and_Statics_Short_Quiz {
    static int Inum = 10;


    public static void main(String[] args) {
        Instance_and_Statics_Short_Quiz obj1 = new Instance_and_Statics_Short_Quiz();
        obj1.Inum = 20;
        Instance_and_Statics_Short_Quiz obj2 = new Instance_and_Statics_Short_Quiz();
        System.out.println(obj2.Inum);


    }
}
