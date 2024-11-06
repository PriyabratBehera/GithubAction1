package com.qa.stepdef;

import com.qa.pages.MFBasketPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MFBasketStepDef {
    MFBasketPage mfBasketPage = new MFBasketPage();

    @And("user scroll to view Disclaimer")
    public void userScrollToViewDisclaimer() throws Exception {
        mfBasketPage.scrollToDisclaimer();
    }

    @And("user enter goal name in name of my goal input box as {string}")
    public void userEnterGoalNameInNameOfMyGoalInputBoxAs(String goalName) {
        mfBasketPage.enterGoalName(goalName);
    }

    @And("user enter target goal amount as {string}")
    public void userEnterTargetGoalAmountAs(String goalAmt) {
        mfBasketPage.enterTargetAmt(goalAmt);
    }

    @And("user enter existing savings for this goal as {string}")
    public void userEnterExistingSavingsForThisGoalAs(String savingGoalAmt) {
        mfBasketPage.enterExistingAmt(savingGoalAmt);
    }

    @And("user enter number of years to achieve this goal as {string}")
    public void userEnterNumberOfYearsToAchieveThisGoalAs(String achieveGoalByYr) {
        mfBasketPage.enterNoYrAchieveGoal(achieveGoalByYr);
    }

    @And("user enter MF basket invest amount lower than minimum amount")
    public void userEnterMFBasketInvestAmountLowerThanMinimumAmount() {
        mfBasketPage.enterLowerThanMinEnvAmt();
    }

    @And("verify validation error Amount is required in personal financial goal screen")
    public void verifyValidationErrorAmountIsRequiredInPersonalFinancialGoalScreen() {
        Assert.assertTrue(mfBasketPage.verifyValidAmtReq());
    }

    @When("user close investment needed for this goal screen")
    public void userCloseInvestmentNeededForThisGoalScreen() {
        mfBasketPage.closeInvNeedForGoal();
    }

    @Then("verify validation error Amount must be greater than or equal to min amount")
    public void verifyValidationErrorAmountMustBeGreaterThanOrEqualToMinAmount() throws Exception {
        mfBasketPage.verifyLowerMinValida();
    }

    @When("user enter MF basket invest amount higher than minimum amount")
    public void userEnterMFBasketInvestAmountHigherThanMinimumAmount() {
        mfBasketPage.enterHigherThanMinEnvAmt();
    }

    @And("user select first investment date")
    public void userSelectFirstInvestmentDate() throws Exception {
        mfBasketPage.selectFirstInvDt();
    }

    @And("user enter investment duration as {string}")
    public void userEnterInvestmentDurationAs(String duration) throws Exception {
        mfBasketPage.enterInvestmentDuration(duration);
    }

    @And("user delete existing goal")
    public void userDeleteExistingGoal() throws Exception {
        mfBasketPage.verifyGoalExist();
    }

    @When("user click on personalize basket")
    public void userClickOnPersonalizeBasket() {
        mfBasketPage.clickPersonalizeBasket();
    }

    @When("user close personal portfolio model")
    public void userClosePersonalPortfolioModel() {
        mfBasketPage.closePersonPortModel();
    }


    @And("user select one of the basket from basket list")
    public void userSelectOneBasketFromBasketList() throws InterruptedException {
        mfBasketPage.scrollToSmartWealth();
    }

    @And("user click first scheme from scheme allocation")
    public void userClickFirstSchemeFromSchemeAllocation() {
        mfBasketPage.clickFirstSc();
    }

    @And("user create a goal category named as {string} with the goal name {string}")
    public void userCreateAGoalCategoryNameAsWithTheGoalName(String category, String goalName) throws Exception {
        mfBasketPage.createGoal(category, goalName);
    }

    @And("user click existing goal to invest")
    public void userClickExistingGoalToInvest() {
        mfBasketPage.clickExistingBasketGoal();
    }

    @And("user enter monthly MF basket investment amount lower than minimum amount")
    public void userEnterMonthlyMFBasketInvestmentAmountLowerThanMinimumAmount() {
        mfBasketPage.enterLowerMontAmt();
    }

    @And("user enter monthly MF basket investment amount higher than minimum amount")
    public void userEnterMonthlyMFBasketInvestmentAmountHigherThanMinimumAmount() {
        mfBasketPage.enterHigherMontAmt();
    }

    @And("user swipe till personalised tab")
    public void userSwipeTillPersonalisedTab() throws InterruptedException {
        mfBasketPage.swipeTillPersonalised();
    }

    @Then("user verify moderate basket card")
    public void userVerifyModerateBasketCard() {
        mfBasketPage.verifyModerateCard();
    }

    @Then("user verify aggressive basket card")
    public void userVerifyAggressiveBasketCard() {
        mfBasketPage.verifyAggressiveCard();
    }

    @And("user expand security allocation")
    public void userExpandSecurityAllocation() {
        mfBasketPage.expandSecurity();
    }

    @And("user expand sector allocation")
    public void userExpandSectorAllocation() {
        mfBasketPage.expandSector();
    }

    @And("user select amount from suggest amount tab")
    public void userSelectAmountFromSuggestAmountTab() {
        mfBasketPage.selectSuggestAmount();
    }

    @And("user do payment for MF basket")
    public void userDoPaymentForMFBasket() throws Exception {
        mfBasketPage.doPayment();
    }

    @And("user wait for basket investment successful screen")
    public void userWaitForBasketInvestmentSuccessfulScreen() {
        mfBasketPage.waitForMfBuySuccessfulSc();
    }

    @And("user select investment duration")
    public void userSelectInvestmentDuration() throws InterruptedException {
        mfBasketPage.selectInvDuration();
    }

    @And("user enter otp for MF investment")
    public void userEnterOtpForMFInvestment() {
        mfBasketPage.enterMfOTP();
    }

}
