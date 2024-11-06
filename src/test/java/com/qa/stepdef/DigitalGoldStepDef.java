package com.qa.stepdef;

import com.qa.pages.*;
import com.qa.utils.GlobalParams;
import com.qa.utils.TestContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Objects;

public class DigitalGoldStepDef {

    GlobalParams params = new GlobalParams();
    DigitalGoldPage digitalGoldPage = new DigitalGoldPage();
    TestContext testContext = TestContext.getInstance();

    @When("user clicks on Digital Gold")
    public void userClicksOnDigitalGold() {
        digitalGoldPage.clickDigitalGold();
    }

    @And("user enters weight {string}")
    public void userEntersWeight(String weight) {
        digitalGoldPage.enterWeight(weight);
    }

    @And("user click on Gift in Grams")
    public void userClickOnGiftInGrams() {
        digitalGoldPage.clickGiftInGrams();
    }

    @And("user click on Gift in RS")
    public void userClickOnGiftInRS() {
        digitalGoldPage.clickGiftInRS();
    }

    @When("user clicks on start now button")
    public void userClicksContinueButton() throws Exception {
        new Mission1CrPage().clickStartNow();
    }

    @And("user selects state {string}")
    public void userSelectsState(String state) throws Exception {
        digitalGoldPage.selectState(state);
    }

    @And("user enters value {string}")
    public void userEntersValue(String value) {
        digitalGoldPage.enterValue(value);
    }

    @And("user selects Financial Goal {string}")
    public void userSelectsFinancialGoal(String goal) throws Exception {
        digitalGoldPage.clickFinancialGoal();
        digitalGoldPage.clickMutualGoal(goal);
    }

    @Then("user verify text {string}")
    public void userVerifyText(String text) throws Exception {
        new BasePage().verifyText(text);
    }

    @And("user clicks on ellipsis against {string}")
    public void userClicksOnEllipsisAgainst(String goalType) throws Exception {
        digitalGoldPage.clickEllipsisGoal(goalType);
    }

    @And("user enters Full Name {string}")
    public void userEntersFullName(String fullName) {
        digitalGoldPage.enterFullName(fullName);
    }

    @And("user enters Mobile Number {string}")
    public void userEntersMobileNumber(String mobileNumber) {
        digitalGoldPage.enterMobileNumber(mobileNumber);
    }

    @And("user verify partial text {string}")
    public void userVerifyPartialText(String text) throws Exception {
        new BasePage().verifyPartialText(text);
    }

    @And("user move to goal {string}")
    public void userMoveToGoal(String goalName) throws Exception {
        digitalGoldPage.clickMoveTo();
        new BasePage().clickByTextContains(goalName);
    }

    @And("user wait for {string} milli second")
    public void userWainForMinute(String waitInSec) throws InterruptedException {
        Thread.sleep(Integer.parseInt(waitInSec));
    }

    @And("user enters OTP for Sell Gold")
    public void userEntersOTPForSellGold() {
        digitalGoldPage.enterOTPSellGold();
    }

    @And("user change the interval for {string}")
    public void userChangeTheIntervalFor(String mobileNumber) {
        digitalGoldPage.changeTheIntervalFor(mobileNumber);
    }

    @And("user click on View details transaction")
    public void userClickOnViewDetailsTransaction() {
        digitalGoldPage.clickView();
    }

    @And("user selects Transaction Type as {string}")
    public void userSelectsTransactionTypeAs(String transactionType) throws Exception {
        digitalGoldPage.clickTransactionType();
        new BasePage().clickByText(transactionType);
    }

    @And("user click on simulate success")
    public void userClickOnSimulateSuccess() {
        digitalGoldPage.clickSimulateSuccess();
    }

    @And("user select Financial Goal to Debit as {string}")
    public void userSelectFinancialGoalToDebitAs(String goalType) throws Exception {
        digitalGoldPage.clickFinancialGoalToDebit();
        digitalGoldPage.scrollToLiquidFundsGoalInFinancialGoalToDebitBox();
        new BasePage().clickByText(goalType);
    }

    @And("user select SIP start date as {string}")
    public void userSelectSIPStartDateAs(String sipStartDate) throws Exception {
        digitalGoldPage.clickSIPStartDate();
        new BasePage().clickByText(sipStartDate);
        if (new BasePage().isElementExist("//*[@text='This is a Sunday. Please choose another date']")) {
            new BasePage().clickByText(Integer.toString(Integer.parseInt(sipStartDate) + 1));
        }
        new BasePage().clickByText("Confirm");
    }

    @And("user set SIP duration as {string}")
    public void userSetSIPDurationAs(String sipDuration) {
        digitalGoldPage.setSipDuration(sipDuration);
        if (Objects.equals(params.getPlatformName(), "iOS")) {
            new BasePage().clickDone();
        } else {
            new BasePage().pressEnter();
        }
    }

    @And("user enters investment amount {string}")
    public void userEntersInvestmentAmount(String investmentAmount) {
        digitalGoldPage.setInvestmentAmount(investmentAmount);
    }

    @And("user verify static text {string}")
    public void userVerifyStaticText(String text) throws Exception {
        new BasePage().verifyStaticText(text);
    }

    @And("user click static text {string}")
    public void userClickStaticText(String text) throws Exception {
        new BasePage().clickStaticText(text);
    }

    @And("user click on Netbanking All Indian banks")
    public void userClickOnNetbankingAllIndianBanks() throws Exception {
        digitalGoldPage.clickNetBanking();
    }

    @And("user click on ICICI")
    public void userClickOnICICI() {
        digitalGoldPage.clickICICI();
    }

    @And("user click on Success")
    public void userClickOnSuccess() {
        digitalGoldPage.clickSuccess();
    }

    @And("user verify partial static text {string}")
    public void userVerifyPartialStaticText(String text) throws Exception {
        new BasePage().verifyPartialStaticText(text);
    }

    @And("user click on Buy in grams")
    public void userClickOnBuyInGrams() {
        digitalGoldPage.clickBuyInGrams();
    }

    @And("user click on Buy in Rupees")
    public void userClickOnBuyInRupees() {
        digitalGoldPage.clickBuyInRupees();
    }

    @And("user click on Sell in Grams")
    public void userClickOnSellInGrams() {
        digitalGoldPage.clickSellInGrams();
    }

    @And("user selects Goal Type as {string}")
    public void userSelectsGoalTppeAs(String portofolio) throws Exception {
        digitalGoldPage.clickPortfolio();
        new BasePage().clickByText(portofolio);
    }

    @And("user click weekly SIP")
    public void userClickWeeklySIP() {
        digitalGoldPage.clickWeeklySIP();
    }

    @And("user remove coin from add to cart")
    public void userRemoveCoinFromAddToCart() throws Exception {
        digitalGoldPage.clickRemoveButton();
    }

    @Then("verify below in Gold Delivery History")
    public void verifyBelowGoldDeliveryHistory(DataTable dataTable) throws Exception {
        digitalGoldPage.verifyGoldOrderHis(dataTable);
    }

    @Then("verify below transaction History")
    public void verifyBelowTransactionHistory(DataTable dataTable) {
        digitalGoldPage.verifyGoldBuyHis(dataTable);
    }

    @Then("verify below transaction History for gift gold")
    public void verifyBelowTransactionHistoryForGiftGold(DataTable dataTable) throws Exception {
        digitalGoldPage.verifyGoldGiftHis(dataTable);
    }

    @Then("user edit shipping address")
    public void userEditShippingAddress() throws Exception {
        digitalGoldPage.editShippingAdd();
    }

    @And("user reedit shipping address")
    public void userReeditShippingAddress() throws Exception {
        digitalGoldPage.reeditShippingAdd();
    }

    @And("user select Financial for digital gold as {string}")
    public void userSelectFinancialForDigitalGold(String goalName) throws Exception {
        digitalGoldPage.selectFinancialGoalDi(goalName);
    }

    @And("user click on Wealth goal")
    public void userClickOnWealthGoal() {
        digitalGoldPage.clickOnWealthGoal();
    }

    @And("user close gold promotion pop up")
    public void userCloseGoldPromotionPopUp() throws InterruptedException {
        digitalGoldPage.closePromotionPopup();
    }

    @Then("verify below sell transaction History")
    public void verifyBelowSellTransactionHistory(DataTable dataTable) {
        digitalGoldPage.verifyGoldSellHis(dataTable);
    }

    @And("user enter amount as {string} for sell gold")
    public void userEnterAmountAsForSellGold(String value) {
        digitalGoldPage.enterSellAmt(value);
    }

    @And("user verify Buyer name")
    public void userVerifyBuyerName() {
        Assert.assertTrue(digitalGoldPage.verifyBuyerName());
    }

    @And("user do payment for gold silver investment")
    public void userDoPaymentForGoldSilverInvestment() throws Exception {
        digitalGoldPage.paymentForGoldSilver();
    }

    @And("user select bank for gold sip SIP")
    public void userSelectBankForGoldSipSIP() {
        digitalGoldPage.selectBankForSIP();
    }

    @And("user enter gold silver buy value {string}")
    public void userEnterGoldSilverBuyValue(String value) {
        digitalGoldPage.enterGoldSilverValue(value);
    }

    @And("user wait for gold silver purchase successful screen")
    public void userWaitForGoldSilverPurchaseSuccessfulScreen() {
        digitalGoldPage.waitForGoldSilverSuccessSc();
    }

    @And("user waite sell gold silver otp screen")
    public void userWaiteSellGoldSilverOtpScreen() {
        digitalGoldPage.waitForGoldSilverSellOtpSc();
    }

    @And("user wait for gold silver sell successful screen")
    public void userWaitForGoldSilverSellSuccessfulScreen() {
        digitalGoldPage.waitForGoldSilverSuccessSc();
    }

    @And("user enters OTP for Sell silver")
    public void userEntersOTPForSellSilver() {
        digitalGoldPage.enterOTPSellGold();
    }

    @And("user wait gold silver portfolio screen")
    public void userWaitGoldSilverPortfolioScreen() {
        digitalGoldPage.waitPortfolioSc();
    }

    @And("user wait for gold silver gift successful screen")
    public void userWaitForGoldSilverGiftSuccessfulScreen() {
        digitalGoldPage.waitForGoldSilverSuccessSc();
    }

    @And("user wait for gold silver receiver details screen")
    public void userWaitForGoldSilverReceiverDetailsScreen() {
        digitalGoldPage.waitReceiverScreen();
    }

    @And("user wait for gold silver order successful screen")
    public void userWaitForGoldSilverOrderSuccessfulScreen() {
        digitalGoldPage.waitForOrderSuccessScr();
    }

    @And("user wait gold silver wealth screen")
    public void userWaitGoldSilverWealthScreen() {
        digitalGoldPage.waitForWealthScr();
    }

    @And("user store gold silver sender name and mobile number")
    public void userStoreGoldSilverSenderNameAndMobileNumber() {
        String[] nameAndMobile = digitalGoldPage.getNameMobile();
        testContext.datastore.put("Gold_receiver_name", nameAndMobile[0]);
        testContext.datastore.put("Gold_receiver_mobile", nameAndMobile[1]);
    }

    @And("user select shipping address for gold silver order")
    public void userSelectShippingAddressForGoldSilverOrder() throws Exception {
        digitalGoldPage.selectShippingAddress();
    }
}

