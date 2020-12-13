package day36_CustomClass;

public class Offer {
    String location, jobTitle, company;
    public double salary;
    public boolean hasBenefit,WFH,hasPTO,isFullTime;


    public void setInfo(String location, String jobTitle, String company, double salary, boolean hasBenefit, boolean WFH, boolean hasPTO, boolean isFullTime) {
        this.location = location;
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.WFH = WFH;
        this.hasPTO = hasPTO;
        this.isFullTime = isFullTime;
    }
    public void getInfo(){
        System.out.println("Company: " + company+ "\nLocation: " + location + "\nSalary: $" + salary +
                "\nJob Title: " + jobTitle + "\nHas Benefit: " + hasBenefit + "\nWork From Home: " + WFH +
                "\nHas PTO: " + hasPTO + "\nis Full time: " + isFullTime);
        System.out.println("====================");
    }

}
