package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import runner.RunCucumberTest;

public class DiscountStep extends RunCucumberTest {

    HomePage homePage = new HomePage(driver);

    @Given("^that Im on qazando website$")
    public void thatImOnQazandoWebsite() throws Throwable {
        homePage.accessApplication();
    }

    @When("^I fill email field$")
    public void iFillEmailField() throws Throwable {
        homePage.scrollDown();
        homePage.fillEmailField();
    }

    @When("^click on ganhar cupom button$")
    public void clickOnGanharCupomButton() throws Throwable {
        homePage.clickReceiveDiscount();
    }

    @Then("^I see the discount code$")
    public void iSeeTheDiscountCode() throws Throwable {
        homePage.verifyDiscountCoupon();
    }

}
