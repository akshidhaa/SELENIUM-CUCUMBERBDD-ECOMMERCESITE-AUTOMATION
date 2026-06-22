package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class ProductPage
{
  WebDriver driver;
  WebDriverWait wait;
  public ProductPage(WebDriver driver)
  {
    this.driver=driver;
    wait=new WebDriverWait(driver,Duration.ofSeconds(10));
  }

By addToCartBtn=By.xpath("//button[contains(@id,'add-to-cart')])[1]");
By removeBtn=By.xpath("//button[contains(@id,'remove')])[1]");
By cartIcon=By.className("shopping_cart_link");
By products=By.className("inventory_item");
public int getProductCount()
  {
     List<WebElement> list = driver.findElements(products);
     return list.size();
    }
public void addFirstProduct() {
  wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn)).click();
  wait.until(ExpectedConditions.visibilityOfElementLocated(removeBtn));
  System.out.println("☑️ Product added");
}
public void clickCart() {

        JavascriptExecutor js =(JavascriptExecutor) driver;

        int attempts = 0;

        while (!driver.getCurrentUrl().contains("cart")&& attempts < 4) {
          js.executeScript("arguments[0].click();",driver.findElement(cartIcon));
          try {
                Thread.sleep(1000);
            }
            catch (Exception e) {}

            attempts++;
        }

        wait.until(ExpectedConditions.urlContains("cart"));

        System.out.println("☑️ Cart opened: "+ driver.getCurrentUrl());
    }
}
