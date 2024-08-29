package tek_final.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import tek_final.pages.UserProfile;
import tek_final.utilities.SeleniumUtility;


public class UserProfileSteps extends SeleniumUtility{

    @Then("click on profile button")
    public void clickCnProfileButton() throws InterruptedException {
        clickOnElement(UserProfile.ACCOUNT_PROFILE);
        Thread.sleep(5000);

    }
    @Then("validate information in Profile Side Drawer is correct")
    public void validateInformationInProfileSideDrawerIsCorrect() {
        String actualProfile = getElementText(UserProfile.PROFILE_INFORMATION);
        Assert.assertEquals("Profile", actualProfile);

    }
    @Then("click on logout button")
    public void clickCnLogoutButton() {
        getElementText(UserProfile.LOGOUT_BUTTON);

    }
}
