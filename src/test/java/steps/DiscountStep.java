package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DiscountStep {

    WebDriver driver = new ChromeDriver();

    @Given("^that Im on qazando website$")
    public void that_Im_on_qazando_website() throws Throwable {
        driver.get("https://www.qazando.com.br/curso.html");
        driver.manage().window().maximize();

        Assert.assertEquals("Não acessou a aplicação", true, driver.findElement(By.id("btn-ver-cursos"))
                .isDisplayed()); //verify if the element is displayed in the screen
    }

    @When("^I fill email field$")
    public void i_fill_email_field() throws Throwable {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, 20000)");
        Thread.sleep(2000);

        driver.findElement(By.id("email")).sendKeys("teste@teste.com");
    }

    @When("^click on ganhar cupom button$")
    public void click_on_ganhar_cupom_button() throws Throwable {
        driver.findElement(By.id("button")).click();
    }

    @Then("^I see the discount code$")
    public void i_see_the_discount_code() throws Throwable {
        String textCoupon = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();

        Assert.assertEquals("O cupom está diferente", "QAZANDO15OFF", textCoupon);

        driver.quit();
    }
}
