package tek_final.steps;


import io.cucumber.java.en.Then;
import org.junit.Assert;

import tek_final.pages.PlansPage;
import tek_final.utilities.SeleniumUtility;

public class PlanSteps extends SeleniumUtility{

    @Then("click on plans button")
    public void clickOnPlansButton() {
        clickOnElement(PlansPage.PLANS_ICON);

    }
    @Then("validate {int} row of the data is present")
    public void validate4RowOfTheDataIsPresent(Integer row) {

        String planType = getElementText(PlansPage.PLAN_TYPE);
        Assert.assertEquals("PLAN TYPE", planType);

        String planBasePrice = getElementText(PlansPage.PLAN_BASE_PRICE);
        Assert.assertEquals("PLAN BASE PRICE", planBasePrice);

        String dateCreated = getElementText(PlansPage.DATE_CREATED);
        Assert.assertEquals("DATE CREATED", dateCreated);

        String dateExpire = getElementText(PlansPage.DATE_EXPIRE);
        Assert.assertEquals("DATE EXPIRE", dateExpire);

    }

    @Then("validate Create Date is today's date in EST Time zone")
    public void validateCreateDate() {
        String currentDate = getElementText(PlansPage.CREATE_DATE_IS_TODAY_DATE);
        Assert.assertEquals("August 21, 2024", currentDate);

    }
    @Then("validate Date Expire is a day after EST Time Zone")
    public void validateDateExpire() {
        String expireDate = getElementText(PlansPage.EXPIRE_DATE_IS_AFTER_TODAY_DATE);
        Assert.assertEquals("August 22, 2024", expireDate);

    }

}
