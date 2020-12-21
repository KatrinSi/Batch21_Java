package day44_Inheritance.WebDriverTask;

public class RemoteWebDriverTask {
    public String name, version;

    public RemoteWebDriverTask(String name, String version){
        this.name = name;
        this.version = version;
    }
    public void get(String URL){
        System.out.println("Opening the default driver");
    }

    public void maximize(){
        System.out.println("Maximizing the Remote driver");
    }
    public void close(){
        System.out.println("Closing the Remote driver");
    }

    @Override
    public String toString() {
        return "RemoteWebDriverTask{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
/*
Task: RemoteWebDriverTask

    1. create a class called RemoveWebDriver
            name, version
            add a constructor to set the instances
            get(URL), maximize(),close()
    2. create a sub class called ChromeDriver
            name = "Chrome Browser"
            version
            get(): Opening URL with Chrome driver
            close(): closing chrome driver
    3. FireFoxDriver
    4. SalariDriver
    5. OperaDriver
    6. EdgeDriver
 */