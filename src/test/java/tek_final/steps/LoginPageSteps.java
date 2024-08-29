package tek_final.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek_final.pages.LoginPage;
import tek_final.utilities.SeleniumUtility;

public class LoginPageSteps extends SeleniumUtility{

    @When("click on login button")
    public void clickOnLoginButton() {
        clickOnElement(LoginPage.LOGIN_BUTTON);
    }

    @Then("validate Sign in to your Account text is exist")
    public void validateSignInToYourAccountTextIsExist() {
        String loginPageText = getElementText(LoginPage.SIGN_IN_TO_YOUR_ACCOUNT_TEXT);
        Assert.assertEquals("Sign in to your Account", loginPageText);

    }

    @Then("enter username {string} and password {string}")
    public void enterUsernameAndPassword(String username, String password) {
        sendText(LoginPage.USERNAME_INPUT, username);
        sendText(LoginPage.PASSWORD_INPUT, password);

    }

    @Then("click on sign in button")
    public void clickOnSignIButton() throws InterruptedException {
        clickOnElement(LoginPage.SIGN_IN_BUTTON);
        Thread.sleep(5000);

    }

    @Then("validate user navigate to Customer Service Portal")
    public void validateUserNavigateToCustomerServicePortal() {
        String actualCustomerServicesPortal = getElementText(LoginPage.VALIDATE_CUSTOMER_SERVICES_PORTAL);
        Assert.assertEquals("Customer Service Portal", actualCustomerServicesPortal);

    }

    @Then("validate error message {string}")
    public void validateErrorMessage(String expectedErrorMessage) {
        String actualErrorMessage = getElementText(LoginPage.ERROR_MESSAGE);
        Assert.assertEquals("ERROR", actualErrorMessage, expectedErrorMessage);
    }

    @Then("close browser")
    public void closeBrowser() {
        quitBrowser();
    }
}
