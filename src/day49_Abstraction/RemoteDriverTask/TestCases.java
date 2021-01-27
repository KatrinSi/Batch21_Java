package day49_Abstraction.RemoteDriverTask;

public class TestCases {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.takeScreenShot("pic1");
        driver.get("google");
        driver.close();

        System.out.println("------------------------");

        FirefoxDriver driver1 = new FirefoxDriver();
        driver1.get("google");
        driver1.takeScreenShot("pic");
        driver1.close();

        WebDriver driver2 = new ChromeDriver();
    }
}
