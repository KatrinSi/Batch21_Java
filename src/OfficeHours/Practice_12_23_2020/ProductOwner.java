package OfficeHours.Practice_12_23_2020;

public class ProductOwner extends Employee{
    public ProductOwner(String name, String ID, char gender, double salary, boolean isFullTime) {
        super(name, "Product Owner", ID, gender, salary, isFullTime);
    }

    public void acceptProduct(){
        System.out.println(jobTitle+" "+name+" is accepting a product");
    }
    public void rejectProduct(){
        System.out.println(jobTitle+" "+name+" is rejecting a product");
    }
    public void writeUserStory(){
        System.out.println(jobTitle+" "+name+" is writing User Stories");
    }


}
