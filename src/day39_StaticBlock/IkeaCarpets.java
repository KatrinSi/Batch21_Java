package day39_StaticBlock;

import java.util.ArrayList;
import java.util.Arrays;

public class IkeaCarpets {
    public static void main(String[] args) {

        Carpet carpet1 = new Carpet();
        carpet1.orderCarpet("SILKEBORG",5.7,7.10,12.34,true);

        Carpet carpet2 = new Carpet();
        carpet2.orderCarpet("VEDBAK", 6.7,9.10, 2.13, false);

        Carpet carpet3 = new Carpet();
        carpet3.orderCarpet("MEJRUP", 8.2, 9.1, 14.74,true);

        Carpet carpet4 = new Carpet();
        carpet4.orderCarpet("ROMDRUP", 6.7, 9.10,2.13,false);

        Carpet carpet5 = new Carpet();
        carpet5.orderCarpet("VEDTOFTE", 6.7, 9.10, 21.31, true);

        Carpet[] carpets = new Carpet[5];
        carpets[0] = carpet1;
        carpets[1] = carpet2;
        carpets[2] = carpet3;
        carpets[3] = carpet4;
        carpets[4] = carpet5;

        ArrayList<Carpet> regularCarp = new ArrayList<>();
        ArrayList<Carpet> persianCarp = new ArrayList<>();
        for(Carpet each:carpets){
            if (each.material().equals("Regular carpet")){
                regularCarp.addAll(Arrays.asList(each));
            }else{
                persianCarp.addAll(Arrays.asList(each));
            }
        }
        System.out.println("Total amount of regular carpets: "+ regularCarp.size());
        System.out.println("Total amount of persian carpets: "+persianCarp.size());
        System.out.println();

        for (Carpet each:carpets){
            System.out.println(each);
            System.out.println("==================================");
        }

    }
}
/*

    1. create a custom class for the Carpet class that should contain the following:

                instance variables:
                        width, length, unitPrice, isPersian (boolean)
                instance methods:
                        customOrder(): sets the carpet' width, length, unitprice, & isParsian
                        calcCost(): should be able to caculate the total cost of the carpet and return it as double
                        toSrring(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
            total price of carpet= (width*length)*unitprice
            if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice
            create a class called carpetObjects, and create an array of the carpet that contains 5 carpet objects ( make sure you set the instance variables of those objets)
            create two ArrayList of carpets:
                                        persianCarpets
                                        reugularCarpets
            write a program to store all the persian Carpets into the list of persianCarpets, and store all regular carpets into the list of reugularCarpets

                    use for each loop to print out all the persian carpets
 */