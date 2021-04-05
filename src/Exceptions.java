import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exceptions {
    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://account.habr.com/login";
        driver.get(url);

        WebElement email = driver.findElement(By.id("email_field"));

        // find element if it exists
        try {
            if (email.isEnabled()){
                email.sendKeys("sbukhovets@gmail.com");
            }
        }
        catch (NoSuchElementException notSee) {
            System.out.println(notSee.toString());
        }

        // close tab
        driver.close();
    }
}
