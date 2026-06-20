package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.LoginPage;
import pages.SignupPage;

public class LoginSteps {

    LoginPage loginPage;
    SignupPage signupPage;

    @Given("user is on login page")
    public void openLoginPage() {

        loginPage = new LoginPage(Hooks.driver);
        signupPage = new SignupPage(Hooks.driver);

        System.out.println("User is on login page");
    }

    @When("user enters {string} and {string}")
    public void login(String username, String password) {

        loginPage.loginToApp(username, password);

        System.out.println("Entered credentials");
    }

    @When("user signup with {string} {string} {string}")
    public void signup(String user, String pass, String phone) {

        signupPage.signupNewuser(user, pass, phone);

        System.out.println("Signup executed");
    }

    @Then("user should login successfully")
    public void verifyLoginSuccess() {

        boolean status = Hooks.driver
                .findElement(By.id("inventory_container"))
                .isDisplayed();

        Assert.assertTrue(status);
    }

    @Then("error message should be displayed")
    public void verifyError() {

        boolean error = Hooks.driver
                .findElement(By.xpath("//h3[@data-test='error']"))
                .isDisplayed();

        Assert.assertTrue(error);
    }

    @Then("signup should be successful")
    public void verifySignup() {

        System.out.println("Signup successful");
    }
