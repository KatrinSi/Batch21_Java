package day44_Inheritance.WebDriverTask;

public class CybertekDriver extends RemoteWebDriverTask {

    public CybertekDriver() {
        super("Cybertek browser", "1.2");
    }

    @Override
    public void get(String URL) {
        System.out.println("Opening "+name+" is opening");
    }

    @Override
    public void maximize() {
        System.out.println("Maximizing "+name+" is opening");
    }

    @Override
    public void close() {
        System.out.println("Closing "+name+" is opening");
    }
}
