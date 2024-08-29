package tek_final.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageSteps {

        WebDriver driver;

        @Given("the user is on the home page")
        public void the_user_is_on_the_home_page() {
            // Set up WebDriver
            System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
            driver = new ChromeDriver();
            driver.get("https://dev.insurance.tekschool-students.com/");  // Replace with the actual URL
        }

    @Then("the page title should be {string}")
    public void the_page_title_should_be(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Then("the {string} button should be present")
    public void the_button_should_be_present(String buttonText) {
        WebElement button = driver.findElement(By.xpath("//button[text()='" + buttonText + "']"));
        Assert.assertTrue(button.isDisplayed());
    }
    }
