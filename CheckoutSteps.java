package stepdefinitions;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.ProductPage;
import pages.CheckoutPage;

public class CheckoutSteps {

    ProductPage productPage;
    CheckoutPage checkoutPage;

    @When("user proceeds to checkout")
    public void proceedToCheckout() {

        productPage = new ProductPage(Hooks.driver);

        productPage.clickCart();

        checkoutPage = new CheckoutPage(Hooks.driver);

       
        checkoutPage.clickCheckout();

        System.out.println("moved to checkout page");
    }

    @When("user enters checkout details")
    public void enterDetails() {

        checkoutPage = new CheckoutPage(Hooks.driver);

        checkoutPage.enterDetails("Akshidhaa", "Test", "600001");

        System.out.println("entered details");
    }

    @When("user completes the order")
    public void finishOrder() {

        checkoutPage = new CheckoutPage(Hooks.driver);

        checkoutPage.clickFinish();

        System.out.println("order completed");
    }

    @Then("order should be placed successfully")
    public void verifyOrder() {

        checkoutPage = new CheckoutPage(Hooks.driver);

        Assert.assertTrue(checkoutPage.isOrderPlaced());

        System.out.println("order success");
    }
}
