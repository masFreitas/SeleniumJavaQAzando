package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DiscountStep {

    @Given("^that Im on qazando website$")
    public void that_Im_on_qazando_website() throws Throwable {
        System.out.println("chegou");
    }

    @When("^I fill email field$")
    public void i_fill_email_field() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^click on ganhar cupom button$")
    public void click_on_ganhar_cupom_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I see the discount code$")
    public void i_see_the_discount_code() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
