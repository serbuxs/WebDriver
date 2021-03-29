import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {
    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://habr.com";
        String expectedTitleEN = "All posts in a row / Habr";
        String expectedTitleRU = "Все публикации подряд / Хабр";
        String actualTitle = "";

        // launch browser and direct it to url
        driver.get(url);

        // get the actual title of the web page
        actualTitle = driver.getTitle();

        // compare actual title with expected
        if (actualTitle.contentEquals(expectedTitleEN) ||
                actualTitle.contentEquals(expectedTitleRU)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed :(");
        }

        // close tab
        driver.close();
    }
}
