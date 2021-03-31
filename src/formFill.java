// Autofill form for login to Habr.com

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class formFill {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);

        // base url
        String url = "https://account.habr.com/login";

        // get base url and open in browser
        driver.get(url);

        // find email and password elements by id on the page
        WebElement email = driver.findElement(By.id("email_field"));
        WebElement password = driver.findElement(By.id("password_field"));
        WebElement captcha = driver.findElement(By.className("captcha"));

        // WebDriverWait webWait = new WebDriverWait(driver, 10);

        // send values to email and password fields

        /*webWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email_field")));
        driver.findElement(By.id("email_field")).sendKeys("*****@gmail.com");*/
        email.sendKeys("sbukhovets@gmail.com");
        password.sendKeys("proSerique5");

        System.out.println("TextFields are filled!");

        captcha.click();

        // find button element and click it
        WebElement login = driver.findElement(By.name("go"));
        login.click();

        System.out.println("Login done!");

        // close tab or browser
        //driver.close();
    }
}
