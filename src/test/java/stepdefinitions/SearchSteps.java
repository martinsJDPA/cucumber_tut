package stepdefinitions;

import AmazonImplementation.Product;
import AmazonImplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class SearchSteps {

    Product product;        //called in from the Product class
    Search search;          //called in from the Search class

    @Given("I have a search field on Amazon page")
    public void i_have_a_search_field_on_amazon_page() {
        System.out.println("Step 1: I am on Amazon search page");
    }

    @When("I search for a product with name {string} and price {int}")
    public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {
        System.out.println("Step 2: Searching for a product with name:" +
                productName + " and price: " + price);

        product = new Product(productName, price);
    }

    @Then("Product with name {string} should be displayed")
    public void product_with_name_should_be_displayed(String productName) {
        System.out.println("Step 3: Product " + productName + " is now displayed");

        search = new Search();
        String DeviceName = search.displayProduct(product);
        System.out.println("Result: Product displayed is: " + DeviceName);

        //Verify product name
        Assertions.assertEquals(product.getProductName(), DeviceName);
    }


    @Then("Order_id is {int} and username is {string}")
    public void order_id_is_and_username_is(Integer price, String productName) {

    }

}
