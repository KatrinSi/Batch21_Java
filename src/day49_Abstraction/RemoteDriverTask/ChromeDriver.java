package day49_Abstraction.RemoteDriverTask;

public class ChromeDriver extends RemoteDriver {

    @Override
    public void executeScript(String script) {
        System.out.println("Script "+script+" is executed on Chrome browser");
    }

    @Override
    public void takeScreenShot(String name) {
        System.out.println("Taking screenshot on Chrome browser");
    }

    @Override
    public void get(String URL) {
        System.out.println("Navigating to "+URL+ " on Chrome");
    }

    @Override
    public void close() {
        System.out.println("Chrome is closing");
    }

    @Override
    public void quit() {
        System.out.println("Chrome is quitting");
    }
}
