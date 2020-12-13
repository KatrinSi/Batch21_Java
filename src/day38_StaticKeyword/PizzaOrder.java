package day38_StaticKeyword;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrder {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza();
        pizza1.customizeOrder("small", 2, 2, 20);

        System.out.println(pizza1);

        Pizza[] cybertekPizza = new Pizza[178];
        for (int i =0; i < cybertekPizza.length; i++){
            Pizza pizza = new Pizza();
            pizza.customizeOrder("Medium", 2,3,18);
            cybertekPizza[i] = pizza;

        }

        double total = 0;
       for(Pizza each:cybertekPizza){
          total += each.totalPrice;
       }
        System.out.println("Total price of 175 pizzas: "+total);

        ArrayList<Pizza> pizzas = new ArrayList<>();


        for(int i = 1; i <= 60; i++){
            Pizza medium = new Pizza();
            medium.customizeOrder("Medium", 2,3,18 );

            Pizza large = new Pizza();
            large.customizeOrder("Large", 3,4,18);

            Pizza small = new Pizza();
            small.customizeOrder("Small", 1,2,18);

            pizzas.addAll(Arrays.asList(small, medium,large));
        }

        System.out.println("Number of pizza: "+pizzas.size());
        double sum = 0;

        for (Pizza each:pizzas){
            sum+=each.totalPrice;
        }
        System.out.println(sum);

    }
}
