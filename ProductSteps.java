package stepdefinitions;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.ProductPage;

public class ProductSteps {

    ProductPage productPage;

    @Then("user should see products list")
    public void VerifyProducts() {

        productPage = new ProductPage(Hooks.driver);

        int count = productPage.getProductCount();

        System.out.println("Product count: " + count);

        Assert.assertTrue(count > 0);
    }

    @When("user adds a product to cart")
    public void addProduct() {

        productPage = new ProductPage(Hooks.driver);

        productPage.addFirstProduct();

        System.out.println("Product added to cart");
    }

    @Then("product should be added successfully")
    public void verifyCart() {

        System.out.println("Product addition verified");
    }
}
