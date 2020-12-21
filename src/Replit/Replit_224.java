package Replit;

public class Replit_224 {

    private String firstName, lastName;
    private int age;

    public Replit_224(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;

    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String toString(){
        return firstName+"|"+lastName+"|"+age;
    }

    public Replit_224(){
        firstName = "undefined";
        lastName = "undefined";
        age = -1;

    }

    public static void main(String[] args) {
        Replit_224 person = new Replit_224();
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());

        System.out.println(person.toString());
    }
}
