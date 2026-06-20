package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void setUp() {

        driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        System.out.println("Browser launched");
    }

    @After
    public void tearDown() {

        try {
            Thread.sleep(2000);
        }
        catch (Exception e) {}

        driver.quit();

        System.out.println("Browser closed");
    }
}
