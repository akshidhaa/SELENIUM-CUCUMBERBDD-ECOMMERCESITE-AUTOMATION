package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class PaymentPage
{
    WebDriver driver;
    WebDriverWait wait;

public PaymentPage(WebDriver driver)
{
  this.driver=driver;
  wait=new WebDriverWait(driver,Duration.ofSeconds(10));
}
By finishBtn=By.id("finish");
By successMsg=By.xpath("//h2[contains(text(),'Thank you')]");
public void completeCardPayment()
{
  wait.until(ExpectedConditions.elementToBeClickable(finishBtn)).click();
}
public void completeGpayPayment()
{
    wait.until(ExpectedConditions.elementToBeClickable(finishBtn).click();
}
public boolean isPaymentsuccess()
{
  return wait.until(ExpectedConditions.visibilityOfElementLocated(successMsg)).isDisplayed();
}
}
    
    
      
