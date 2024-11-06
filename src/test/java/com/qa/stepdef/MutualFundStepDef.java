package com.qa.stepdef;

import com.qa.pages.BasePage;
import com.qa.pages.DigitalGoldPage;
import com.qa.pages.MutualFundPage;
import com.qa.utils.GlobalParams;
import com.qa.utils.TestContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Date;
import java.util.Objects;

public class MutualFundStepDef {

    GlobalParams params = new GlobalParams();
    MutualFundPage mutualFundPage = new MutualFundPage();

    TestContext testContext = TestContext.getInstance();

    @When("user clicks on Mutual Funds")
    public void userClicksOnMutualFunds() throws InterruptedException {
        mutualFundPage.clickMutualFunds();
    }

    @And("user search for mutual fund {string}")
    public void userSearchForMutualFund(String mutualFundName) throws Exception {
        mutualFundPage.enterMutualFund(mutualFundName);
    }

    @And("user enters invest amount for One Time {string}")
    public void userEntersInvestAmountForOneTime(String investmentAmount) {
        mutualFundPage.enterInvestmentAmountForOneTime(investmentAmount);
    }

    @And("user select SIP Duration as {string} from Recommended Duration Box")
    public void userSelectSIPDurationAsFromRecommendedDuration(String text) throws Exception {
        mutualFundPage.selectRecommenedDuration(text);
    }

    @And("user select investment amount as {string} from Suggested Amount box")
    public void userSelectInvestmentAmountAsFromSuggestedAmountBox(String text) throws Exception {
        mutualFundPage.selectInvestmentAmount(text);
    }

    @And("user selects monthly SIP date as {string}")
    public void userSelectsMonthlySIPDateAs(String sipDate) throws Exception {
        mutualFundPage.clickMonthlySIPDate();
        new BasePage().clickByText(sipDate);
    }

    @And("user enters SIP Duration as {string}")
    public void userEntersTenure(String sipDuration) {
        mutualFundPage.enterSIPDuration(sipDuration);
    }


    @And("user click Select Button on MutualFund scheme")
    public void userClickSelectButtonOnMutualFundScheme() {
        mutualFundPage.clickSelectButton();
    }

    @When("user click Add to Cart for Aditya Birla")
    public void userClickAddToCart() {
        mutualFundPage.clickAddMFForAdityaBirla();
    }

    @And("user click Add to Cart")
    public void userClickAddMutualfund() {
        mutualFundPage.clickOneMF();
    }

    @And("user scroll to value oriented")
    public void userScrollToValueOriented() throws Exception {
        mutualFundPage.scrollToValueOriented();
    }

    @And("user scroll to others")
    public void userScrollToOthers() throws Exception {
        mutualFundPage.scrollToOthers();
    }

    @And("user enter investment amount as {string}")
    public void userEnterInvestmentAmountAs(String amt) {
        mutualFundPage.enterAmtInCalSc(amt);
    }

    @And("user click on close icon in Returns Calculator")
    public void userClickOnCloseIconInReturnsCalculator() {
        mutualFundPage.clickCloseIconOfReturnsScreen();
    }

    @And("user selects Goal {string}")
    public void userSelectsGoal(String goalName) throws Exception {
        mutualFundPage.SelectGoal(goalName);
    }

    @And("user click {string} check box")
    public void userClickIWeHaveReadTheRelatedSchemeCheckBox(String text) throws Exception {
        mutualFundPage.clickIWeHaveReadTheRelatedSchemeCheckBox(text);
    }

    @And("user enter otp for purchase MF Scheme")
    public void userEnterOtpForPurchaseMFScheme() {
        mutualFundPage.enterOTPForMFBuy();
    }

    @And("user enters invalid otp for purchase MF Scheme")
    public void userEntersInvalidOtpForPurchaseMFScheme() {
        mutualFundPage.enterInvalidPurchaseOtp();
    }


    @And("user go back from {string} screen")
    public void userGoBackFromScreen(String text) throws Exception {
        mutualFundPage.goBackFromScreen(text);
    }

    @When("user click three dot icon in My SIP Screen")
    public void userClickThreeDotIconInMySIPScreen() {
        mutualFundPage.clickThreeDotInMySip();
    }


    @And("user click Add to Cart for different schemes")
    public void userClickAddToCartForDifferentSchemes() throws InterruptedException {
        mutualFundPage.clickAddToCartForDifferentSchemes();
    }

    @And("user click Add to Cart icon in Mutual Fund schemes screen")
    public void userClickAddToCartIconInMutualFundSchemesScreen() {
        mutualFundPage.clickAddToCartIconInMutualFundSchemesScreen();
    }

    @And("user select One Time radio button")
    public void userSelectOneTimeRadioButton() {
        mutualFundPage.clickOneTime();
    }

    @And("user select Monthly SIP radio button")
    public void userSelectMonthlySIPRadioButton() {
        mutualFundPage.unCheckMonthlySip();
    }

    @And("user enter monthly sip amount as {string} for Aditya Birla Sun Life Forntline Equity Fund")
    public void userEnterMonthlySipAmountAsForAdityaBirlaSunLifeForntlineEquityFundG(String amount) {
        mutualFundPage.enterMonthlyAmountForAdityaBirla(amount);
    }

    @And("user click button text {string}")
    public void userClickButtonText(String text) throws Exception {
        mutualFundPage.clickButtonTypeText(text);
    }

    @And("user enters invest amount for monthly SIP {string}")
    public void userEntersInvestAmountForMonthlySIP(String amount) {
        mutualFundPage.enterInvestmentAmountForMonthlySIP(amount);
    }

    @And("user select {string} check box")
    public void userSelectCheckBox(String text) throws Exception {
        mutualFundPage.selectCheckBox(text);
    }

    @And("user scroll to view Calculate")
    public void userScrollToViewCalculate() throws Exception {
        mutualFundPage.scrollToIWeHaveCheckBox();
    }

    @Then("user clicks on Cancel button")
    public void userClicksOnCancelButton() throws Exception {
        mutualFundPage.clickCancelButton();
    }

    @And("user clicks on continue button")
    public void userClicksOnContinueButton() throws Exception {
        mutualFundPage.clickContinueButton();
    }

    @And("user click on three dot icon in wealth screen")
    public void userClickOnThreeDotIconInWealthScreen() {
        mutualFundPage.clickThreeDotIconInWealthScreen();
    }


    @And("user remove all Schemes from One Click Invest screen")
    public void userRemoveAllSchemesFromOneClickInvestScreen() throws Exception {
        mutualFundPage.clickCloseIconForAllSchemes();
    }

    @And("user enter partial funds amount as {string}")
    public void userEnterPartialFundsAmount(String partialAmount) {
        mutualFundPage.enterPartialFundAmount(partialAmount);
    }

    @And("user enter otp for redeem partial funds")
    public void userEnterOtpForRedeemPartialFunds() {
        mutualFundPage.sellOtp();
    }

    @When("user enter partial units as {string}")
    public void userEnterPartialUnitsAs(String units) {
        mutualFundPage.enterPartialUnits(units);
    }

    @And("user click on in Process transaction view")
    public void userClickOnInProcessTransactionHistory() {
        mutualFundPage.clickMfInProcessView();
    }

    @And("user enter amount more than fund value")
    public void userEnterAmountMoreThanFundValue() throws Exception {
        mutualFundPage.enterAmountMoreThanFundValue();
    }

    @And("user enter otp for invest in mutualFund")
    public void userEnterOtpForInvestInMutualFund() {
        mutualFundPage.enterPurchaseOtp();
    }

    @When("user clicks on complete KYC")
    public void userClicksOnCompleteKYC() {
        mutualFundPage.clickOnCompleteKYC();
    }

    @And("user close the fund card in one click invest screen")
    public void userCloseTheFundCardInOneClickInvestScreen() throws Exception {
        mutualFundPage.closeFundCardSc();
    }

    @And("user select button of {string} schemes")
    public void userSelectButtonOfSchemes(String schemeName) throws Exception {
        mutualFundPage.selectSchemes(schemeName);
    }

    @When("user remove {string} schemes from swith screen")
    public void userRemoveSchemesFromSwithScreen(String schemeName) throws Exception {
        mutualFundPage.removeSchemeSwiScv(schemeName);
    }

    @Then("user verify bellow switch schemes status")
    public void userVerifyBellowSwitchSchemesStatus(DataTable dataTable) {
        mutualFundPage.verifySwitchStatus(dataTable);
    }

    @When("user select stp start date as {string}")
    public void userSelectSTPStartDateAs(String dt) throws Exception {
        mutualFundPage.enterStpStartDt(dt);
    }

    @And("user enter number of transfer as {string}")
    public void userEnterNumberOfTransferAs(String freq) throws Exception {
        mutualFundPage.enterTransferFrequency(freq);
    }

    @And("user enter amount as {string} for stp")
    public void userEnterAmountAsForStp(String stpAmount) throws Exception {
        mutualFundPage.enterStpAmount(stpAmount);
    }

    @And("user verify bellow STP status")
    public void userVerifyBellowSTPStatus(DataTable dataTable) {
        mutualFundPage.verifyStpStatus(dataTable);
    }

    @And("user select weekly swp radio button")
    public void userSelectWeeklySwpRadioButton() {
        mutualFundPage.selectWeeklySwp();
    }

    @And("user enter amount as {string} for swp")
    public void userEnterAmountAsForSwp(String amount) throws Exception {
        mutualFundPage.enterSwpAmount(amount);
    }

    @And("user verify bellow SWP status")
    public void userVerifyBellowSWPStatus(DataTable dataTable) {
        mutualFundPage.verifySwpStatus(dataTable);
    }

    @When("user select swp start day as {string}")
    public void userSelectSwpStartDayAs(String day) throws Exception {
        mutualFundPage.enterSwpStartDt(day);
    }

    @And("user enter swp duration as {string}")
    public void userEnterSwpDurationAs(String duration) throws Exception {
        mutualFundPage.enterSwpDuration(duration);
    }

    @Then("number of transfer input box is disappear")
    public void numberOfTransferInputBoxIsDisappear() {
        mutualFundPage.unableToSeeNOTBx();
    }

    @And("user select Monthly STP radio button")
    public void userSelectMonthlySTPRadioButton() {
        mutualFundPage.enterMonthlyStp();
    }

    @When("user click three dot icon for stp")
    public void userClickThreeDotIconForStp() {
        mutualFundPage.clickThreeDotForStp();
    }

    @When("user click three dot icon for swp")
    public void userClickThreeDotIconForSwp() {
        mutualFundPage.clickThreeDotForStp();
    }

    @And("user scroll to I we have read in stp screen")
    public void userScrollToIWeHaveReadInStpScreen() throws Exception {
        mutualFundPage.scrollIWeHave();
    }

    @And("user enter investment amount {string}")
    public void userEnterInvestmentAmount(String amt) {
        mutualFundPage.setInvestmentAmount(amt);
    }


    @And("user do payment")
    public void userDoPayment() throws Exception {
        mutualFundPage.doPayment();
    }

    @And("user select federal bank")
    public void userSelectFederalBank() {
        mutualFundPage.clickFederalBank();
    }


    @And("user click bar graph button")
    public void userClickBarGraphButton() {
        mutualFundPage.clickBarGraph();
    }

    @And("user click line graph button")
    public void userClickLineGraphButton() {
        mutualFundPage.clickLineGraph();
    }

    @And("user scroll to view basic information")
    public void userScrollToViewBasicInformation() throws Exception {
        mutualFundPage.scrollToBasicInf();
    }

    @When("user scroll to data source")
    public void userScrollToDataSource() throws Exception {
        mutualFundPage.scrollToDataSource();
    }

    @When("user click on view more in fund details screen")
    public void userClickOnViewMoreInFundDetailsScreen() {
        mutualFundPage.clickViewMore();
    }

    @And("user scroll to top mutual fund basket section")
    public void userScrollToTopMutualFundBasketSection() throws Exception {
        mutualFundPage.scrollToSetFinancial();
    }

    @Then("user not able to see category avg")
    public void userNotAbleToSeeCategoryAvg() {
        Assert.assertFalse((mutualFundPage.notAbleToSeeCat()));
    }

    @And("user close purchase not allow pop uo")
    public void userClosePurchaseNotAllowPopUo() {
        mutualFundPage.closePurchaseNotAllow();
    }

    @When("user search for scheme category as {string}")
    public void userSearchForSchemeCategoryAs(String category) throws Exception {
        mutualFundPage.enterCategory(category);
    }

    @And("user verify {string} transaction history")
    public void userVerifyTransactionHistory(String tranType) {
        mutualFundPage.verifyTranType(tranType);
    }

    @Then("user verify SIP transaction amount as {string}")
    public void userVerifySIPTransactionAmountAs(String sipAmount) {
        mutualFundPage.verifySIPAmount(sipAmount);
    }

    @And("user verify frequency as {string}")
    public void userVerifyFrequencyAs(String sipFrequency) {
        mutualFundPage.verifySIPFrequency(sipFrequency);
    }

    @Then("user verify STP transaction amount as {string}")
    public void userVerifySTPTransactionAmountAs(String stpAmt) {
        mutualFundPage.verifySTPAmount(stpAmt);
    }

    @And("user verify STP frequency as {string}")
    public void userVerifySTPFrequencyAs(String stpFreq) {
        mutualFundPage.verifySTPFrequency(stpFreq);
    }

    @Then("user verify SWP transaction amount as {string}")
    public void userVerifySWPTransactionAmountAs(String swpAmt) {
        mutualFundPage.verifySWPAmount(swpAmt);
    }

    @And("user verify SWP frequency as {string}")
    public void userVerifySWPFrequencyAs(String swpFreq) {
        mutualFundPage.verifySWPFrequency(swpFreq);
    }

    @And("user click federal bank")
    public void userClickFederalBank() {
        mutualFundPage.clickFederalBank();
    }

    @And("user scroll to SIP amount box")
    public void userScrollToSIPAmountBox() throws Exception {
        mutualFundPage.scrollToSIPAmount();
    }

    @And("user do payment for mutualFund investment")
    public void userDoPaymentForMutualFundInvestment() throws Exception {
        mutualFundPage.paymentForMF();
    }

    @And("user do payment fail for mutualFund investment")
    public void userDoPaymentFailForMutualFundInvestment() throws Exception {
        mutualFundPage.paymentFail();
    }

    @And("user select bank for MF buy or sip")
    public void userSelectBankForMFBuyOrSip() {
        mutualFundPage.selectBankForBuy();
    }

    @And("user wait for MF purchase successful page")
    public void userWaitForMFPurchaseSuccessfulPage() {
        mutualFundPage.waitForBuySuccessfulPage();
    }

    @And("user wait for MF SIP successful page")
    public void userWaitForMFSIPSuccessfulPage() {
        mutualFundPage.waitForSIPSuccessPage();
    }

    @And("user select weekly STP button")
    public void userSelectWeeklySTPButton() {
        mutualFundPage.enterWeeklyStp();
    }

    @And("user store stp amount and installments from manage sip screen")
    public void userStoreStpAmountAndInstallmentsFromManageSipScreen() {
        String[] stpDetails = mutualFundPage.storeSTPAmtInstallments();
        testContext.datastore.put("STP_Amount", stpDetails[0]);
        testContext.datastore.put("STP_Installment", stpDetails[1]);
    }

    @And("user check stp to stop")
    public void userCheckStpToStop() {
        testContext.datastore.put("STP_Count", mutualFundPage.stpCount());
    }

    @Then("user assert that stp has disappear from manage sip screen")
    public void userAssertThatStpHasDisappearFromManageSipScreen() {
        int stpAmt= (Integer) testContext.datastore.get("STP_Count");
        if(stpAmt == 1){
            Assert.assertFalse(mutualFundPage.isVisible(mutualFundPage.getStpAmt()));
        }
        else{
            System.out.println("same amount stp is : "+(stpAmt-1));
            Assert.assertEquals(stpAmt-1,mutualFundPage.stpCount());
        }
    }

    @And("user check swp to stop")
    public void userCheckSwpToStop() {
        testContext.datastore.put("SWP_Count", mutualFundPage.swpCount());
    }

    @Then("user assert that swp has disappear from manage sip screen")
    public void userAssertThatSwpHasDisappearFromManageSipScreen() {
        int swpAmt= (Integer) testContext.datastore.get("SWP_Count");
        if(swpAmt == 1){
            Assert.assertFalse(mutualFundPage.isVisible(mutualFundPage.getSwpAmt()));
        }
        else{
            System.out.println("same amount stp is : "+(swpAmt-1));
            Assert.assertEquals(swpAmt-1,mutualFundPage.swpCount());
        }
    }

    @And("user stop the stp")
    public void userStopTheStp() throws Exception {
        mutualFundPage.stopSIP();
    }

    @And("user stop the swp")
    public void userStopTheSwp() throws Exception {
        mutualFundPage.stopSWP();
    }

    @And("user wait for MF purchase failed screen")
    public void userWaitForMFPurchaseFailedScreen() {
        mutualFundPage.waitForBuyFailedPage();
    }
}