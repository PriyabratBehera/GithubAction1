package com.qa.stepdef;

import com.qa.pages.*;
import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class TrackExpensesStepDef {
    TestUtils utils = new TestUtils();
    GlobalParams globalParams = new GlobalParams();

    @When("user clicks on Track Expenses")
    public void userClicksOnTrackExpenses() throws Exception {
        new TrackExpensesPage().clickTrackExpenses();
    }

    @And("user click on add Transaction")
    public void userClickOnAddTransaction() {
        new TrackExpensesPage().clickAddTransaction();
    }

    @And("user select transaction type as {string}")
    public void userSelectTransactionTypeAs(String transType) throws Exception {
        new TrackExpensesPage().selectTranType(transType);
    }

    @And("user choose transaction done for {string}")
    public void userChooseTransactionDoneFor(String tranDone) throws Exception {
        new TrackExpensesPage().selectCate(tranDone);
    }

    @And("user select sub category as {string}")
    public void userSelectSubCategoryAs(String subCate) throws Exception {
        new TrackExpensesPage().selectSubCate(subCate);
    }

    @And("user enters amount {string} in add transaction screen")
    public void userEntersAmountInAddTransactionScreen(String amt) throws Exception {
        new TrackExpensesPage().enterBudAmt(amt);
    }

    @And("user select date of transaction as today")
    public void userSelectDateOfTransactionAsToday() throws Exception {
        new TrackExpensesPage().dateOfTranCurMon();
    }

    @And("user select date of transaction as one month back")
    public void userSelectDateOfTransactionAsOneMonthBack() throws Exception {
        new TrackExpensesPage().dateOfTranOneMonBac();
    }

    @And("user select date of transaction as last year")
    public void userSelectDateOfTransactionAsLastYear() throws Exception {
        new TrackExpensesPage().dateOfTranLastYear();
    }

    @And("user select date of transaction as last year as jul")
    public void userSelectDateOfTransactionAsLastYearAsJul() throws Exception {
        new TrackExpensesPage().dateOfTranLastYearJul();
    }

    @When("user filter {string} of expense")
    public void userFilterOfExpense(String duration) throws Exception {
        new TrackExpensesPage().selectLastMonth(duration);
    }

    @And("user click on Investment Equity")
    public void userClickOnInvestmentEquity() {
        new TrackExpensesPage().clickInvEquity();
    }

    @And("user click on delete icon in track expense screen")
    public void userClickOnDeleteIconInTrackExpenseScreen() {
        new TrackExpensesPage().clickDeleteExpense();
    }

    @Then("user unable to see investment in equity transaction")
    public void userUnableToSeeInvestmentInEquityTransaction() {
        Assert.assertFalse(new TrackExpensesPage().unableToSeeEquityTran());
    }

    @When("user click plus icon in dashboard")
    public void userClickPlusIconInDashboard() {
        new TrackExpensesPage().clickPlusIconDash();
    }

    @Then("user enter fund as {string}")
    public void userEnterFundAs(String amount) {
        new CreateBudgetPage().enterSpendAmountForMedicalCategory(amount);
    }

    @Then("user can see the budget transaction as {string}")
    public void userCanSeeTheBudgetTransactionAs(String text) throws Exception {
        new TrackExpensesPage().verifyBudgetTransaction(text);
    }

    @And("user verify budget income card")
    public void userVerifyBudgetIncomeCard() throws Exception {
        new TrackExpensesPage().verifyBudgetIncome();
    }

    @And("user verify investment remaining budget card")
    public void userVerifyInvestmentRemainingBudgetCard() throws Exception {
        new TrackExpensesPage().verifyInvestBudget();
    }

    @Then("user verify household remaining")
    public void userVerifyHouseholdRemaining() throws Exception {
        new TrackExpensesPage().verifyHouseHoldBudget();

    }

    @And("user wait for expense dashboard")
    public void userWaitForExpenseDashboard() {
        new TrackExpensesPage().waitForExpenseSc();
    }
}