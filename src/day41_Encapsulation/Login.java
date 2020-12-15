package day41_Encapsulation;

public class Login {
    public static void main(String[] args) {

        Credentials object = new Credentials();
        System.out.println(object.getUserName());
        System.out.println(object.getPassword());
        object.setUserName("123");
        object.setPassword(1234);

        System.out.println(object.getUserName());
        System.out.println(object.getPassword());



    }
}
