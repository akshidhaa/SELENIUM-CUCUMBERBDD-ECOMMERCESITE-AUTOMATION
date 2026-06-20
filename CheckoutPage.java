package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CheckoutPage
{
    WebDriver driver;
    public CheckoutPage(WebDriver driver)
    {
      this.driver=driver;
    }
    By checkoutBtn=By.id("checkout");
    By firstName=By.id("first-name");
    By lastName=By.id("last-name");
    By postalCode=By.id("postal-code");
    By continueBtn=By.id("continue");
    By finishBtn=By.id("finish");
    By successMsg=By.xpath("//h2[contains(text(),'Thank you')]");
    public void clickCheckout()
    {
      driver.findElement(checkoutBtn).click();
    }
    public void enterDetails(String fname,String lname,String zip)
    {
      try
        {
          Thread.sleep(3000);}
      catch(Exception e)
        {}
      driver.findElement(firstName).sendKeys(fname);
      driver.findElement(lastName).sendKeys(lname);
      driver.findElement(postalCode).sendKeys(zip);
      driver.findElement(continueBtn).click();
    }
    public void clickFinish()
    {
      try{
        Thread.sleep(1500);
      }
      catch(Exception e)
        {}
      driver.findElement(finishBtn).click();
    }
    public boolean isOrderPlaced()
    {
      return driver.findElement(successMsg).isDisplayed();
    }
}
  
