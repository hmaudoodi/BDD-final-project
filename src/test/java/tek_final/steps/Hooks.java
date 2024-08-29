package tek_final.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import tek_final.pages.HomePage;
import tek_final.utilities.SeleniumUtility;

public class Hooks extends SeleniumUtility {

    @Given("open browser and navigate to retail app")
    public void openBrowserAndNavigateToRetail_app() {
        openBrowser();

    }

    @Then("validate TEK Insurance UI is exist")
    public void validateTekInsuranceUiIsExist() {
        String tekInsuranceText = getElementText(HomePage.TEK_INSURANCE_UI_TEXT);
        Assert.assertEquals("TEK Insurance App", tekInsuranceText);
        System.out.println(tekInsuranceText);

    }

    @Then("validate Create Primary Account is exist")
    public void validateCreatePrimaryAccountIsExist() {
        String createPrimaryAccountText = getElementText(HomePage.CREATE_PRIMARY_ACCOUNT_BUTTON);
        Assert.assertEquals("Create Primary Account", createPrimaryAccountText);
        System.out.println(createPrimaryAccountText);

    }

    @Then("validate Login button is enabled")
    public void validateLoginButtonIsEnabled() {
        boolean loginBtnText = isElementIsEnabled(HomePage.LOGIN_BUTTON);
        Assert.assertTrue("Login button should be enabled", loginBtnText);

    }

    @Then("validate color mode button is displayed")
    public void validateColorModeButtonIsDisplayed() {
        boolean colorModeOption = isElementIsDisplayed(HomePage.COLOR_MOOD_BUTTON);
        Assert.assertTrue("Dark mode color button must be displayed", colorModeOption);
    }

}
