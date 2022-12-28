package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage{

    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void accessApplication() {
        driver.get("https://www.qazando.com.br/curso.html");
        driver.manage().window().maximize();

        Assert.assertEquals("Não acessou a aplicação", true, driver.findElement(By.id("btn-ver-cursos"))
                .isDisplayed()); //verify if the element is displayed in the screen
    }

    public void scrollDown() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, 20000)");
        Thread.sleep(2000);
    }

    public void fillEmailField() {
        driver.findElement(By.id("email")).sendKeys("teste@teste.com");
    }

    public void clickReceiveDiscount() {
        driver.findElement(By.id("button")).click();
    }

    public void verifyDiscountCoupon() {
        String textCoupon = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
        Assert.assertEquals("O cupom está diferente", "QAZANDO15OFF", textCoupon);
    }
}
