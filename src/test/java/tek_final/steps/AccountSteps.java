package tek_final.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import tek_final.pages.AccountPage;
import tek_final.utilities.SeleniumUtility;

public class AccountSteps extends SeleniumUtility {
    @Then("click on Accounts button")
    public void clickOnAccountsButton() {
        clickOnElement(AccountPage.ACCOUNTS_BUTTON);

    }

    @Then("validate Primary Accounts title is exist")
    public void validatePrimaryAccountsTitleIsExist() {
        String actualPrimaryAccountsTitle = getElementText(AccountPage.PRIMARY_ACCOUNT_TITLE);
        Assert.assertEquals("Primary Accounts", actualPrimaryAccountsTitle);

    }

    @Then("validate table row count to be {int}")
    public void validateTableRowCountToBe(int expectedRows) {
        List<WebElement> tableRow = getElements(AccountPage.TABLE_ROW_ELEMENT);
        Assert.assertEquals("validate table rows", tableRow.size(), expectedRows);
    }

    @When("change item per page to {string}")
    public void changeItemPerPageTo(String itemPerPage) {
        selectFromDropDown(AccountPage.ITEM_PER_PAGE_SELECT, "Show " + itemPerPage);
    }

}
