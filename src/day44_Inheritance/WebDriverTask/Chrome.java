package day44_Inheritance.WebDriverTask;

public class Chrome extends RemoteWebDriverTask {

    public Chrome() {
        super("Chrome Browser", "1.2.3");
    }

    @Override
    public void get(String URL) {
        System.out.println("Opening "+name+ " "+version+" driver");
    }

    @Override
    public void maximize() {
        System.out.println("Maximizing "+name+ " driver");
    }

    @Override
    public void close() {
        System.out.println("Opening "+name+ " driver");
    }
}
/*
create a sub class called ChromeDriver
            name = "Chrome Browser"
            version
            get(): Opening URL with Chrome driver
            close(): closing chrome driver
 */