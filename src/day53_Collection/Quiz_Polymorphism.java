package day53_Collection;


abstract class Car{

}

class BMW extends Car{

}

class Toy extends Car{

}

class carDeal{
    public static void main(String[] args) {
        BMW bmw = new BMW();
        Car car1 = (Car)bmw;

    }
}