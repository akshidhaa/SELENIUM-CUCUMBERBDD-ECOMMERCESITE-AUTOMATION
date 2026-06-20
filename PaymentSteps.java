package stepdefinitions;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.CheckoutPage;

public class PaymentSteps {

    CheckoutPage checkoutPage;

    @When("user selects card payment")
    public void selectCard() {

        checkoutPage = new CheckoutPage(Hooks.driver);

        checkoutPage.clickFinish();

        System.out.println("card payment done");
    }

    @When("user selects gpay payment")
    public void selectGpay() {

        checkoutPage = new CheckoutPage(Hooks.driver);

        checkoutPage.clickFinish();

        System.out.println("gpay payment done");
    }

    @Then("payment should be successful")
    public void verifyPayment() {

        checkoutPage = new CheckoutPage(Hooks.driver);

        Assert.assertTrue(checkoutPage.isOrderPlaced());

        System.out.println("payment success");
    }
}
