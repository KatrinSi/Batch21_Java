package day43_Inheritance.restaurantTask;

public class LocalRestaurants {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Jamie Oliver");
        System.out.println(restaurant);
        Server[] servers = {
                new Server("Yasin", 'M', 29, 35, "Captain Server", "S001"),
                new Server("Sabryne", 'F', 28, 30, "Server Assistant", "S002"),
                new Server("Karim", 'M', 27, 25, "Server1", "S003"),
                new Server("Aysel", 'F', 26, 20, "Server2", "S004"),
                new Server("Kamal", 'M', 25, 15, "Server3", "S005")};


        restaurant.hireServer(new Server("Sabryne", 'F', 28, 30, "Server Assistant", "S002"));


    }
}
