package day49_Abstraction.RemoteDriverTask;

public interface WebDriver { //behavior of subclasses

    void get(String URL);
    void close();
    void quit();

}
