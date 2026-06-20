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
    return driver.findElements(products).size(0;
}
public void addFirstProduct()
{
    wait.until(ExpectedConditions.elementToBeClickable(adToCartBtn)).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(removeBtn));
    System.out.println("Product CONFIRMED added");
}
public void clickCart()
  {
    wait.until(ExpectedConditions.elementToBeClickable(cartIcon)).click();
    try
      {
        Thread.sleep(5000);
      }
    catch(Exception e)
      {}
    System.out.println("Navigated to cart");
  }
}
