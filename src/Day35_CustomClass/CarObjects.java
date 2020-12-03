package Day35_CustomClass;

public class CarObjects {
    public static void main(String[] args) {
        Car car1 = new Car();//has own brand
        Car car2 = new Car();//has own brand
        Car car3 = new Car();//has own brand
        car1.brand = "Toyota";
        car2.brand = "BMW";
        car3.brand = "Mercedes";

        car1.model = "Corolla";
        car2.model = "X5";
        car3.model = "GLA";

        car1.year = 2020;
        car2.year = 2018;
        car3.year = 2019;

        Car car4 = new Car();
        car1.color = "red";
        car2.color = "black";
        car3.color = "pink";
        car4.color = "orange";


        car4.setInfo("Lada", "Sedan","Baklajan",2011, 2000 );

        System.out.println(car1.brand+" "+car1.model+","+car1.year+" year, "+ car1.color+" color");
        System.out.println(car2.brand+" "+car2.model+","+car2.year+" year, "+ car2.color+" color");
        System.out.println(car3.brand+" "+car3.model+","+car3.year+" year, "+ car3.color+" color");



        System.out.println(car4.brand+" "+ car4.model);


    }
}
