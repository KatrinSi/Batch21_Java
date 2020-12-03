package Day35_CustomClass;

import java.time.LocalDate;

public class Dog {
    public String nickName;
    public String breed;
    public String size;
    public char gender;
    public String color;
    public LocalDate dOfB;

    public void setInfo(String dogNickName, String dogBreed, String dogSize, char dogGender, String dogColor, LocalDate dogDOfB) {

        nickName = dogNickName;
        breed = dogBreed;
        size = dogSize;
        gender = dogGender;
        color = dogColor;
        dOfB = dogDOfB;
    }

    public void getInfo() {

        System.out.println(nickName+" "+breed + " " + size+ " " +gender+" "+ color + " " + dOfB);
    }
    public void eat(String food){
        System.out.println(nickName+" is eating "+food);
    }
    public void drink(String drink){
        System.out.println(nickName+" is drinking "+drink);
    }

}
