package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {
    public static WebDriver driver;
    WebElement Search;
    @Given("browser is open")
    public void browserIsOpen() throws Exception{
        System.out.println("Inside step - browser is open");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @And("user is on google search page")
    public void userIsOnGoogleSearchPage() throws Exception {
        System.out.println("Inside step - user is on the google search page");
        //driver.get("https://www.google.com/");
        driver.get("https://www.amazon.in/");
        Thread.sleep(3000);
    }

    @When("user enters a text in search box")
    public void userEntersATextInSearchBox() throws Exception{
        System.out.println("Inside step - user enters a text in search box");
        Search = driver.findElement(By.id("twotabsearchtextbox"));
        Search.sendKeys("car");
        Thread.sleep(3000);
    }

    @And("hits enter")
    public void hitsEnter() throws Exception{
        System.out.println("Inside step - user hits enter");
        Search.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }

    @Then("user is navigated to search results")
    public void userIsNavigatedToSearchResults() {
        System.out.println("Inside step - user is navigated to search results");
        Assert.assertEquals(driver.getTitle(), "Amazon.in : car");
        System.out.println("User searched car");
        driver.quit();
    }
}
