package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class CartPage
{
  WebDriver driver;
  public CartPage(WebDriver driver)
  {
    thos.driver=driver;
  }
  By cartItems=By.className("cart_item");
  By removeBtn=By.xpath("//button[contains(text(),'Remove')])[1]");
  public int getCartItemCount()
  {
    try{
      Thread.sleep(1000);
    }
    catch(Exception e)
      {}
    List<WebElement> items=driver.findElements(cartItems);
    System.out.println("cart item count:"+items.size());
    return items.size();
  }
  public void removeItem()
  {
    driver.findElement(removeBtn).click();
  }
}
      
