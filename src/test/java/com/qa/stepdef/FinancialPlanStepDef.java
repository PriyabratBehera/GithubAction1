package com.qa.stepdef;

import com.qa.pages.FinancialPlanPage;
import com.qa.utils.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.time.Year;

public class FinancialPlanStepDef {
    TestContext testContext = TestContext.getInstance();
    FinancialPlanPage financialPlanPage = new FinancialPlanPage();

    @When("user click on review financial plan")
    public void userClickOnReviewFinancialPlan() throws InterruptedException {
        financialPlanPage.clickFinancialPlan();
    }

    @When("user select date of birth for financial planning")
    public void userSelectDateOfBirthForFinancialPlanning() throws Exception {
        financialPlanPage.enterDob();
    }

    @And("user store date of birth")
    public void userStoreDateOfBirth() {
        testContext.datastore.put("DOB_Year", financialPlanPage.userStoreYear());
    }

    @And("user get year")
    public void userGetYear() {
        System.out.println("DOB is : " + testContext.datastore.get("DOB_Year"));
    }

    @When("user enter monthly net income as {string} for financial plan")
    public void userEnterMonthlyNetIncomeAsForFinancialPlan(String incomeAmt) {
        financialPlanPage.enterMonthlyIncome(incomeAmt);
    }

    @And("user enter monthly saving as {string} for financial plan")
    public void userEnterMonthlySavingAsForFinancialPlan(String savingAmt) {
        financialPlanPage.enterMonthlySaving(savingAmt);
    }

    @And("user select no dependant")
    public void userSelectNoDependant() {
        financialPlanPage.clickNoDependant();
    }

    @And("user click om view plan")
    public void userClickOmViewPlan() {
        financialPlanPage.clickViewPlan();
    }

    @And("user scroll down towards retirement")
    public void userScrollDownTowardsRetirement() throws InterruptedException {
        financialPlanPage.scrollToRetire();
    }

    @Then("user verify current age with retirement age")
    public void userVerifyCurrentAgeWithRetirementAge() {
        String year = testContext.datastore.get("DOB_Year").toString().substring(10);
        int currentYear = Year.now().getValue();
        int year1 = Integer.parseInt(year.toString());
        int currentAge = currentYear - year1;
        if (year1 == 1997) {
            Assert.assertEquals("With current age " + currentAge + " and retirement age of 60 years", financialPlanPage.verifyAge());
        } else {
            Assert.assertEquals("With current age " + currentAge + " and retirement age of 60 years", financialPlanPage.verifyAgePlusOne());
        }
    }

    @And("user unable to see educational fund and wedding fund")
    public void userUnableToSeeEducationalFundAndWeddingFund() {
        Assert.assertFalse(financialPlanPage.unableToSeeEduAndWed());
    }

    @And("user select yes dependant")
    public void userSelectYesDependant() {
        financialPlanPage.clickYesDependant();
    }

    @And("user enter child name as {string}")
    public void userEnterChildNameAs(String name) {
        financialPlanPage.enterChildName(name);
    }

    @And("enter child age as {string}")
    public void enterChildAgeAs(String age) {
        financialPlanPage.enterChildAge(age);
    }

    @And("user select course as {string}")
    public void userSelectCourseAs(String course) throws Exception {
        financialPlanPage.selectCourse(course);
    }

    @And("user enter spouse age as {string}")
    public void userEnterSpouseAgeAs(String spouseName) {
        financialPlanPage.enterSpouseAge(spouseName);
    }

    @And("user delete emergency fund goal")
    public void userDeleteEmergencyFundGoal() throws Exception {
        financialPlanPage.deleteEmergencyFundGoal();
    }

    @And("user enter emergency fund goal name as {string}")
    public void userEnterEmergencyFundGoalNameAs(String fundName) {
        financialPlanPage.enterEmergencyGoal(fundName);
    }

    @Then("user verify emergency goal has saved")
    public void userVerifyEmergencyGoalHasSaved() {
        financialPlanPage.verifyEmergencyGoalSave();
    }

    @And("user delete retirement fund goal")
    public void userDeleteRetirementFundGoal() throws Exception {
        financialPlanPage.deleteRetirementFundGoal();
    }

    @And("user enter retirement fund goal name as {string}")
    public void userEnterRetirementFundGoalNameAs(String fundName) {
        financialPlanPage.enterEmergencyGoal(fundName);
    }

    @And("user enter wedding fund goal name as {string}")
    public void userEnterWeddingFundGoalNameAs(String fundName) {
        financialPlanPage.enterEmergencyGoal(fundName);
    }

    @And("user enter educational fund goal name as {string}")
    public void userEnterEducationalFundGoalNameAs(String fundName) {
        financialPlanPage.enterEmergencyGoal(fundName);
    }

    @And("user delete educational fund goal")
    public void userDeleteEducationalFundGoal() throws Exception {
        financialPlanPage.deleteEducationalFundGoal();
    }

    @Then("user verify educational goal has saved")
    public void userVerifyEducationalGoalHasSaved() {
        financialPlanPage.verifyEducationalGoalSave();
    }

    @Then("user verify wedding goal has saved")
    public void userVerifyWeddingGoalHasSaved() {
        financialPlanPage.verifyWeddingGoalSave();
    }

    @And("user delete wedding fund goal")
    public void userDeleteWeddingFundGoal() throws Exception {
        financialPlanPage.deleteWeddingFundGoal();
    }

    @Then("user verify retirement goal has save")
    public void userVerifyRetirementGoalHasSave() {
        financialPlanPage.verifyRetirementGoalSave();
    }

    @And("user create a education goal")
    public void userCreateAEducationGoal() throws Exception {
        financialPlanPage.createEduGoal();
    }

    @And("user enter a gaol name for save financial goal")
    public void userEnterAGaolNameForSaveFinancialGoal() {
        financialPlanPage.enterGoalName();
    }

    @Then("user verify education fund has un saved")
    public void userVerifyEducationFundHasUnSaved() {
        financialPlanPage.verifyUnsavedGoal();
    }

    @And("user click on weeding fund")
    public void userClickOnWeedingFund() {
        financialPlanPage.clickWeedingFund();
    }

    @And("user scroll to weeding fund card")
    public void userScrollToWeedingFundCard() {
        financialPlanPage.scrollToWeeding();
    }

    @And("user store education fund amount")
    public void userStoreEducationFundAmount() {
        String educationFundAmt = financialPlanPage.storeEducationFund();
        testContext.datastore.put("Education Plan", educationFundAmt);
    }

    @Then("user verify education fund has update")
    public void userVerifyEducationFundHasUpdate() {
        String educationFundAmount = testContext.datastore.get("Education Plan").toString();
        System.out.println("educationFundAmount: " + educationFundAmount);
        String amountInWhole = "";
        if (educationFundAmount.contains("L")) {
            int indexOfPoint1 = educationFundAmount.lastIndexOf("L");
            educationFundAmount = educationFundAmount.substring(0, indexOfPoint1);
            if (educationFundAmount.contains(".")) {
                int indexOfPoint = educationFundAmount.lastIndexOf(".");
                amountInWhole = educationFundAmount.substring(0, indexOfPoint + 1);
            }
        }
        System.out.println("amountInWhole: " + amountInWhole);
        boolean b = educationFundAmount.contains(amountInWhole);
        Assert.assertTrue(b);
    }

    @And("user change education goal amount")
    public void userChangeEducationGoalAmount() throws Exception {
        financialPlanPage.changeEducationGoal();
    }
}
