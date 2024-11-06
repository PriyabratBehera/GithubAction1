package com.qa.stepdef;

import com.qa.pages.BasePage;
import com.qa.pages.CreateBudgetPage;
import com.qa.pages.SetGoalsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CreateBudgetStepDef {
    CreateBudgetPage createBudget = new CreateBudgetPage();

    @And("user click on manage budget")
    public void userClickOnManageBudget() {
        createBudget.clickBudget();
    }

    @And("user scroll to view Utility")
    public void userScrollToViewUtility() throws Exception {
        createBudget.ScrollToViewUtility();
    }

    @And("user click on medical budget card")
    public void userClickOnMedicalBudget() {
        createBudget.clickMedicalBudget();
    }

    @Given("user clean up the app data for {string}")
    public void userCleanUpTheAppDataFor(String mobileNumber) {
        createBudget.userCleanUpTheAppDataFor(mobileNumber);
    }

    @And("user click by text {string}")
    public void userClickByText(String text) throws Exception {
        new BasePage().clickByText(text);
    }

    @When("user enter budget fund as {string}")
    public void userEnterBudgetFundAs(String text) {
        createBudget.enterFirstBudgetAmount(text);
    }

    @Then("verify validation error {string}")
    public void verifyValidationError(String error) throws Exception {
        Assert.assertEquals(new SetGoalsPage().getValidationError(error), error);
    }

    @When("user enter budget amount as more than available funds")
    public void userEnterBudgetAmountAsMoreThanAvailableFunds() {
        createBudget.enterMoreThanAvailableFunds();
    }

    @And("user enter save and invest amount as {string}")
    public void userEnterSaveAndInvestAmountAs(String text) {
        createBudget.enterSaveAndInvestAmount(text);
    }

    @And("user enter home rant amount as {string}")
    public void userEnterHomeRantAmountAs(String text) {
        createBudget.enterHomeRentAmount(text);
    }

    @And("user enter for loan amount as {string}")
    public void userEnterForLoanAmountAs(String text) {
        createBudget.enterPayForLoanAmount(text);
    }

    @And("user enter utility bills as {string}")
    public void userEnterUtilityBillsAs(String text) {
        createBudget.enterUtilityLoanAmount(text);
    }

    @When("user click on Add more")
    public void userClickOnAddMore() {
        createBudget.clickAddMore();
    }

    @When("user click on I am done")
    public void userClickOnIAmDone() {
        createBudget.clickIAmDone();
    }

    @And("user verify Report")
    public void userVerifyReport() {
        Assert.assertTrue(createBudget.verifyReport());
    }

    @And("user verify Select")
    public void userVerifySelect() {
        Assert.assertTrue(createBudget.verifySelect());
    }

    @And("user verify percent tab")
    public void userVerifyPercentTab() {
        Assert.assertTrue(createBudget.verifyPercentTab());
    }

    @And("user click on select")
    public void userClickOnSelect() {
        createBudget.clickSelect();
    }

    @When("user select spend category as {string}")
    public void userSelectSpendCategoryAs(String text) throws Exception {
        new BasePage().clickByText(text);
    }

    @Then("user verify medical category in create budget screen")
    public void userVerifyMedicalCategoryInCreateBudgetScreen() {
        Assert.assertTrue(createBudget.verifyMedicalCategory());
    }

    @And("user select fifty percentage tab")
    public void userSelectFiftyPercentageTab() {
        createBudget.clickFiftyPercentTab();
    }

    @And("user enter amount as {string} for medical spend category")
    public void userEnterAmountAsForMedicalSpendCategory(String text) {
        createBudget.enterSpendAmountForMedicalCategory(text);
    }

    @And("user verify Edit")
    public void userVerifyEdit() {
        createBudget.verifyEdit();
    }

    @When("user click on edit budget")
    public void userClickOnEditBudget() {
        createBudget.clickEditBudget();
    }

    @When("user click on information icon")
    public void userClickOnInformationIcon() {
        createBudget.clickInformationIcon();
    }

    @And("user enter amount as {string} for edit budget")
    public void userEnterAmountAsForEditBudget(String text) {
        createBudget.enterEditBudgetAmount(text);
    }

    @When("user clicks on Save Budget button")
    public void userClicksOnSaveBudgetButton() {
        createBudget.clickSaveBudget();
    }

    @And("user click delete icon in edit budget screen")
    public void userClickDeleteIconInEditBudgetScreen() {
        createBudget.clickDeleteIcon();
    }

    @When("user click on report")
    public void userClickOnReport() {
        createBudget.clickReport();
    }

    @And("user select seventy percentage tab")
    public void userSelectSeventyPercentageTab() {
        createBudget.clickSeventyFivePercentTab();
    }

    @And("user close the popup")
    public void userCloseThePopup() {
        createBudget.clickClosePopupButton();
    }

    @And("user click on yes button")
    public void userClickOnYesButton() throws Exception {
        createBudget.clickYesButton();
    }

    @And("user close you already have this popup")
    public void userCloseYouAlreadyHaveThisPopup() {
        createBudget.clickYouAlreadyPopupCloseIcon();
    }

    @When("user click on information icon in edit budget screen")
    public void userClickOnInformationIconInEditBudgetScreen() {
        createBudget.clickInformIconInEditBudSc();
    }

    @When("user scroll to view medical")
    public void userScrollToViewMedical() throws Exception {
        createBudget.scrollToMedical();
    }

    @And("user close update amount validation pop up")
    public void userCloseUpdateAmountValidationPopUp() {
        createBudget.closeUpdateValiText();
    }

    @And("user check is there any existing budget")
    public void userCheckIsThereAnyExistingBudget() throws Exception {
        createBudget.checkBudget();

    }
}
