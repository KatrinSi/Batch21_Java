package day44_Inheritance.WebDriverTask;

public class Firefox extends RemoteWebDriverTask{

    public Firefox() {
        super("Firefox browser", "1.2.3.4");
    }

    @Override
    public void get(String URL) {
        System.out.println("Opening "+name+ " "+version+" driver");
    }

    @Override
    public void maximize() {
        System.out.println("Maximizing "+name+ " "+version+" driver");
    }

    @Override
    public void close() {
        System.out.println("Closing "+name+ " "+version+" driver");
    }
}
