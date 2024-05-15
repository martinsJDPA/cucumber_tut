package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class billingsteps {
    double billing_amount;
    double tax_amount;
    double final_amount;


    @Given("user is on billing page")
    public void user_is_on_billing_page() {
    }

    @When("user enters billing amount {string}")
    public void user_enters_billing_amount(String billing_amount) {
        this.billing_amount = Double.parseDouble(billing_amount);
    }

    @When("user enters tax amount {string}")
    public void user_enters_tax_amount(String tax_amount) {
        this.tax_amount = Double.parseDouble(tax_amount); //convert str to double
    }

    @When("user clicks on calculate button")
    public void user_clicks_on_calculate_button() {

    }

    @Then("it gives the final amount {string}")
    public void it_gives_the_final_amount(String expected_final_amount) {
        this.final_amount = this.billing_amount + this.tax_amount;
        System.out.println("Expected final amount = " + Double.parseDouble(expected_final_amount));
        System.out.println("Actual final amount = " + this.final_amount + "\n");
        //Verify the calculation logic
        Assertions.assertTrue(this.final_amount == Double.parseDouble(expected_final_amount));
        System.out.println("Calculations completed");
    }


}
