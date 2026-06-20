package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage
  {
    WebDriver driver;
    public SignupPage(WebDriver driver)
    {
      this.driver=driver;
    }
    By signupLink = By.id("signup-link");
    By username = By.id("signup-username");
    By password = By.id("signup-password");
    By phone = By.id("signup-phone");
    By signupBtn = By.id("signup-Button");

    public void openSignupPage() {
        driver.findElement(signupLink).click();
    }

    public void enterusername(String user) {
        driver.findElement(username).sendKeys(user);
    }

    public void enterpassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void enterPhone(String ph) {
        driver.findElement(phone).sendKeys(ph);
    }

    public void clickSignUp() {
        driver.findElement(signupBtn).click();
    }

    public void signupNewuser(String user, String pass, String ph) {
        openSignupPage();
        enterusername(user);
        enterpassword(pass);
        enterPhone(ph);
        clickSignUp();
    }
}
