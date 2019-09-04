package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BPPsteps {

    WebDriver driver;

    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "C://Users//caiof//Desktop//working//chromedriver.exe");
        driver = new ChromeDriver(); // Launch Chrome browser
    }

    @When("I open BPP homepage")
    public void i_open_BPP_homepage() {
        driver.get("https://bpp.com.br/");
    }

    @Then("I verify that the logo presente on page")
    public void i_verify_that_the_logo_presente_on_page() {
        boolean status = driver.findElement(By.xpath("//a[@class='navbar-brand']//img")).isDisplayed();
        Assert.assertEquals(true, status);
    }

    @Then("close browser")
    public void close_browser() {
        driver.quit();
    }

}
