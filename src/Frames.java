import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // launch browser and open link
        driver.get("http://demo.guru99.com/selenium/deprecated.html");

        // switch to frame on page by name of it
        driver.switchTo().frame("classFrame");

        // find element on the page by linkText and click it
        driver.findElement(By.linkText("Index")).click();

        // close session
        driver.close();

        System.out.println("Test Passed!");
    }
}
