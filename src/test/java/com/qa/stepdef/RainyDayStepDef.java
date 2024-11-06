package com.qa.stepdef;

import com.qa.pages.RainyDayPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class RainyDayStepDef {
    RainyDayPage rainyDayPage=new RainyDayPage();
    @When("user enter rainy day saving amount as {string}")
    public void userEnterRainyDaySavingAmountAs(String amount) throws Exception {
        rainyDayPage.enterRainyDaySavingAmount(amount);
    }

    @And("user click partial static text {string}")
    public void userClickPartialStaticText(String text) throws Exception {
        rainyDayPage.clickPartialStaticText(text);
    }
    @And("user click on set your financial goal")
    public void userClickOnSetYourFinancialGoal() throws InterruptedException {
        rainyDayPage.clickSetFinancialGoalBanner();
    }

    @And("user click on I  We have read the related Scheme Document of the selected fund before investing check box")
    public void userClickOnIWeHaveReadTheRelatedSchemeDocumentOfTheSelectedFundBeforeInvestingCheckBox() {
        rainyDayPage.clickIWeHaveCheckBox();
    }

    @When("user click Complete KYC")
    public void userClickCompleteKYC() {
        rainyDayPage.clickCompleteKyc();
    }

    @When("user enter monthly expenses amount as {string}")
    public void userEnterMonthlyExpensesAmountAs(String amount) throws Exception {
        rainyDayPage.enterMonthlyExpensesAmount(amount);
    }

    @And("user go back from household expenses screen")
    public void userGoBackFromHouseholdExpensesScreen() {
        rainyDayPage.clickBackButtonInHouseHoldExpensesScreen();
    }

    @And("user further invest as {string}")
    public void userFurtherInvestAs(String amt) throws Exception {
        rainyDayPage.enterInvestsAmount(amt);
    }
    @And("user select schemes in rainy day saving screen")
    public void userSelectSchemesInRainyDaySavingScreen() throws Exception {
        rainyDayPage.selectFund();
    }

    @And("user click on rainy day on home screen")
    public void userClickOnRainyDayOnHomeScreen() throws InterruptedException {
        rainyDayPage.clickRainyDayBan();
    }

    @And("user scroll to I we have read the related schemes")
    public void userScrollToIWeHaveReadTheRelatedSchemes() throws Exception {
        rainyDayPage.scrollIWeHaveCheckBox();
    }

    @And("user scroll down to checkbox in rainy day screen")
    public void userScrollDownToCheckboxInRainyDayScreen() throws Exception {
        rainyDayPage.scrollDownRainy();
    }

    @And("user enter amount as {string} for rainy day")
    public void userEnterAmountAsForRainyDay(String amount) {
        rainyDayPage.enterAmountForInvMore(amount);
    }

    @And("user wait for rainy day sip successful page")
    public void userWaitForRainyDaySipSuccessfulPage() {
        rainyDayPage.waitForSuccessfulSipPage();
    }

    @And("user do payment for rainy day")
    public void userDoPaymentForRainyDay() throws Exception {
        rainyDayPage.doPaymentRainyDay();
    }
}
