package day49_Abstraction.RemoteDriverTask;

public class FirefoxDriver extends RemoteDriver{
    @Override
    public void executeScript(String script) {
        System.out.println("Script "+script+" is executed on FireFox browser");
    }

    @Override
    public void takeScreenShot(String name) {
        System.out.println("Taking screenshot on FireFox browser");
    }

    @Override
    public void get(String URL) {
        System.out.println("Navigating to "+URL+ " on FireFox");
    }

    @Override
    public void close() {
        System.out.println("Firefox is closing");
    }

    @Override
    public void quit() {
        System.out.println("Firefox is quitting");
    }
}
