package day43_Inheritance.restaurantTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public static boolean hasKitchen, hasCashier;
    public String owner;
    public ArrayList<Server> servers;
    public ArrayList<Chef> chefs;

    static {
        hasKitchen = true;
        hasCashier = true;
    }

    public Restaurant(String owner) {
        this.owner = owner;
        servers = new ArrayList<>();
        chefs = new ArrayList<>();
    }

    public void hireServer(Server server) {
        servers.add(server);
    }
    public void hireServer(Server[] servers){
        this.servers.addAll(Arrays.asList(servers));
    }
    public void hireChef(Chef chef){
        chefs.add(chef);
    }
    public void hireChef(Chef[] chefs){
        this.chefs.addAll(Arrays.asList(chefs));
    }
    public void terminateEmployee(String ID){
        servers.removeIf(p->p.ID.equals("ID"));
        chefs.removeIf(p->p.ID.equals("ID"));
    }

    public String toString() {
        return "Owner: "+owner+ ",\nTotal number of employee: "+(servers.size()+chefs.size())+
                "\nServers: "+ servers.size()+"\nChefs: "+chefs.size();
    }
}
