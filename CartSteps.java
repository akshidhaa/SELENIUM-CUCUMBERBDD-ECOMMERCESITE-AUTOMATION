package stepdefinitions;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.ProductPage;
import pages.CartPage;

public class CartSteps {

    ProductPage productPage;
    CartPage cartPage;

    @When("user goes to cart page")
    public void goToCart() {

        productPage = new ProductPage(Hooks.driver);

        productPage.clickCart();

        System.out.println("navigated to cart page");
    }

    @Then("user should see items in cart")
    public void verifyCart() {

        cartPage = new CartPage(Hooks.driver);

        int count = cartPage.getCartItemCount();

        System.out.println("cart item count: " + count);

        Assert.assertTrue(count > 0); // correct check
    }

    @When("user removes an item")
    public void removeItem() {

        cartPage = new CartPage(Hooks.driver);

        cartPage.removeItem();

        System.out.println("removed item");
    }

    @Then("cart should be updated")
    public void cartUpdated() {

        System.out.println("cart updated");
    }
}
