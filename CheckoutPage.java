package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage {

    WebDriver driver;
    WebDriverWait wait;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // LOCATORS

    By checkoutBtn = By.id("checkout");

    By firstName = By.id("first-name");

    By lastName = By.id("last-name");

    By postalCode = By.id("postal-code");

    By continueBtn = By.id("continue");

    By finishBtn = By.id("finish");

    By successMsg =
            By.xpath("//h2[contains(text(),'Thank you')]");


   
    public void clickCheckout() {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        int attempts = 0;

        while (!driver.getCurrentUrl().contains("checkout-step-one") && attempts < 3) {

            js.executeScript("arguments[0].click();",driver.findElement(checkoutBtn)
            );

            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {}

            attempts++;
        }

        wait.until(ExpectedConditions.urlContains("checkout-step-one"));

        wait.until(ExpectedConditions.visibilityOfElementLocated(firstName));

        System.out.println("☑ Checkout step one opened");
    }
      public void enterDetails(String fname, String lname, String zip) {

        driver.findElement(firstName).sendKeys(fname);

        driver.findElement(lastName).sendKeys(lname);

        driver.findElement(postalCode).sendKeys(zip);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        int attempts = 0;

        while (!driver.getCurrentUrl()
                .contains("checkout-step-two")
                && attempts < 3) {

            js.executeScript(
                    "arguments[0].click();",
                    driver.findElement(continueBtn));

            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {}

            attempts++;
        }

        wait.until(
                ExpectedConditions.urlContains(
                        "checkout-step-two"));

        wait.until(
                ExpectedConditions
                .visibilityOfElementLocated(finishBtn));

        System.out.println(
                "☑️ Checkout step two opened");
    }
    public void clickFinish() {

        wait.until(ExpectedConditions.elementToBeClickable(finishBtn)).click();
    }
    public boolean isOrderPlaced() {

        return wait.until(ExpectedConditions.visibilityOfElementLocated(successMsg)).isDisplayed();
    }
}
