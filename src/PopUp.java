// Get alert message from pop-up window
// and display it in console

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopUp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String alertMessage = "";

        // launch browser with url
        driver.get("http://jsbin.com/usidix/1");

        // find element by cssSelector
        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();

        // get text from alert message at pop-up window
        alertMessage = driver.switchTo().alert().getText();

        // close pop-up window by click OK button
        driver.switchTo().alert().accept();

        System.out.println("Message text: " + alertMessage);

        // close browser
        driver.close();
    }
}
