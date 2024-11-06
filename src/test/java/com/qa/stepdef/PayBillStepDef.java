package com.qa.stepdef;

import com.qa.pages.PayBillPage;
import com.qa.utils.GlobalParams;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class PayBillStepDef {

    GlobalParams params = new GlobalParams();
    PayBillPage payBillPage=new PayBillPage();
    @And("user search biller as {string}")
    public void userSearchBillerAs(String biller) throws Exception {
        payBillPage.searchBiller(biller);
    }

    @Then("user click airtel postpaid")
    public void userClickAirtelPostpaid() {
        payBillPage.clickAirtelPostpaid();
    }

    @And("user enter mobile number as {string} for mobile recharge")
    public void userEnterMobileNumberAsForMobileRecharge(String mobNo) throws Exception {
        payBillPage.enterMobileNumber(mobNo);
    }


    @And("user enter bill amount as {string}")
    public void userEnterBillAmountAs(String billAmt) throws Exception {
        payBillPage.enterBillAmount(billAmt);
    }

    @Then("user enter OTP for mobile recharge")
    public void userEnterOTPForMobileRecharge() {
        payBillPage.enterOTP();
    }

    @And("user close the payment receipt pop up")
    public void userCloseThePaymentReceiptPopUp() {
        payBillPage.closePaymentReceipt();
    }


    @And("user click my favourite billers slide drow")
    public void userClickMyFavouriteBillersSlideDrow() throws Exception {
        payBillPage.clickFavouriteSlideDrow();
    }

    @And("user click on drop down in review and pay screen")
    public void userClickOnDropDownInReviewAndPayScreen() {
        payBillPage.clickDropDownAdd();
    }

    @And("user click jio postpaid")
    public void userClickJioPostpaid() {
        payBillPage.clickJioPostpaid();
    }


    @When("user click view all in favourite biller section")
    public void userClickViewAllInFavouriteBillerSection() {
        payBillPage.clickVieAllFavourite();
    }

    @And("user scroll to view last five transaction")
    public void userScrollToViewLastFiveTransaction() throws InterruptedException {
        payBillPage.scrollToDown();
    }

//    @And("user verify recharge transaction datails")
//    public void userVerifyRechargeTransactionDatails() throws Exception {
//        Assert.assertTrue(payBillPage.verifyRechargeTimeDate());
//    }

    @When("user click on view all for see transaction")
    public void userClickOnViewAllForSeeTransaction() {
        payBillPage.clickVieAllLastTran();
    }

    @And("user see the time of transaction")
    public void userSeeTheTimeOfTransaction() {
        payBillPage.seeTranTime();
    }

    @And("user verify recharge transaction of {string} in {string}")
    public void userVerifyRechargeTransactionOfIn(String amount, String billerName) throws Exception {
        Assert.assertTrue(payBillPage.verifyRechargeTimeDate(amount,billerName));
    }

    @Then("user verify transaction completed of {string} in {string}")
    public void userVerifyTransactionCompletedOfIn(String amount, String billerName) throws Exception {
        Assert.assertTrue(payBillPage.verifyTransacHis(amount,billerName));
    }

    @And("user do recharge of {string} amount")
    public void userDoRechargeOfAmount(String amount) throws Exception {
        payBillPage.doRecharge(amount);
    }

    @And("user click mobile for prepaid")
    public void userClickMobileForPrepaid() {
        payBillPage.clickMobile();
    }

    @And("user search {string} recharge plan")
    public void userSearchRechargePlan(String plan) throws Exception {
        payBillPage.searchRechargePlan(plan);
    }

    @And("user click bharat gas bpcl")
    public void userClickBharatGasBpcl() {
        payBillPage.clickBhartGasBpcl();
    }

    @And("user enter register contact number {string}")
    public void userEnterRegisterContactNumber(String mobNo) throws Exception {
        payBillPage.enterContactNumber(mobNo);
    }

    @And("user click on SUCCESS")
    public void userClickOnSUCCESS() throws Exception {
        payBillPage.clickSuccess();
    }

    @And("user click on icic bank icon")
    public void userClickOnIcicBankIcon() throws Exception {
        payBillPage.clickicicBank();
    }

    @And("user do payment for cylinder")
    public void userDoPaymentForCylinder() throws Exception {
        payBillPage.doPayCylinder();
    }
}
