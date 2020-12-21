package day44_Inheritance.WebDriverTask;

public class Test {
    public static void main(String[] args) {
        Chrome chrome = new Chrome();
        chrome.get("apple.com");
        chrome.close();

        Firefox firefox = new Firefox();
        firefox.get("cybertek.com");
        firefox.maximize();
        firefox.close();
    }
}
