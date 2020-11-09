package day13_SwitchStatement;

public class WarmUpTask4 {
    public static void main(String[] args) {

        String browserName = " ";
        String message = " Browser Is Selected";

        if (browserName == "Chrome") {
            System.out.println(browserName+message);
        }else if (browserName == "Firefix") {
            System.out.println(browserName+message);
        }else if (browserName == "Opera") {
            System.out.println(browserName+message);
        }else if (browserName == "Safari") {
            System.out.println(browserName + message);
        }else{
            System.out.println("Invalid Browser Name");
        }




    }
}


/*
write a program that can display the selected browser
                1. declare a String variable called browserName
                2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name
                  Ex:
             	browserName = "chrome";

             	output:
             		Chrome Browser is Selected



             	browserName =	"cybertek";

             	output:
             		Invalid Browser Name

 */