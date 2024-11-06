package com.qa.stepdef;

import com.qa.pages.InsurancePage;
import com.qa.pages.PayBillPage;
import com.qa.utils.GlobalParams;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InsuranceStepDef {

    GlobalParams params = new GlobalParams();
    InsurancePage insurancePage=new InsurancePage();

    @When("user click on insurance tab")
    public void userClickOnInsuranceTab() throws Exception {
        insurancePage.clickInsurance();
    }

    @Then("user click on life insurance")
    public void userClickOnLifeInsurance() {
        insurancePage.clickLifeInsu();
    }

    @When("user click on mediclaim card")
    public void userClickOnMediclaimCard() {
        insurancePage.clickMediclaim();
    }

    @When("user click on daily hospital cash card")
    public void userClickOnDailyHospitalCashCard() {
        insurancePage.clickDailyHospitalCard();
    }

    @When("user click cash benefit twenty thousand per day")
    public void userClickCashBenefitTwentyThousandPerDay() {
        insurancePage.clickTwentyThousandPerDay();
    }

    @When("user click on Let's Calculate in insurance screen")
    public void userClickOnLetSCalculateInInsuranceScreen() {
        insurancePage.clickLetsCalculate();
    }

    @Then("user select insurance type as {string}")
    public void userSelectInsuranceTypeAs(String insType) throws Exception {
        insurancePage.selectInsuranceType(insType);
    }

    @And("user enter policy number as {string}")
    public void userEnterPolicyNumberAs(String policyNum) throws Exception {
        insurancePage.enterPolicyNum(policyNum);
    }

    @And("user select insurance company as {string}")
    public void userSelectInsuranceCompanyAs(String compName) throws Exception {
        insurancePage.selectInsuranceCompany(compName);
    }

    @And("user enter sum assured as {string}")
    public void userEnterSumAssuredAs(String amount) throws Exception {
        insurancePage.enterSumAssured(amount);
    }

    @And("user enter premium paid as {string}")
    public void userEnterPremiumPaidAs(String amount) throws Exception {
        insurancePage.enterPremiumPaid(amount);
    }

    @And("user scroll to view  policy document")
    public void userScrollToViewPolicyDocument() throws Exception {
        insurancePage.scrollToPolicyDoc();
    }

    @And("user select premium frequency as {string}")
    public void userSelectPremiumFrequencyAs(String frequencyType) throws Exception {
        insurancePage.selectPremiumPayingFreq(frequencyType);
    }

    @And("user select next premium due date")
    public void userSelectNextPremiumDueDate() throws Exception {
        insurancePage.selectNextPremiumDt();
    }

    @And("user select next annual premium due date")
    public void userSelectNextAnnualPremiumDueDate() throws Exception {
        insurancePage.selectNextAnnualPremiumDt();
    }

    @And("user select next quarterly premium due date")
    public void userSelectNextQuarterlyPremiumDueDate() throws Exception {
        insurancePage.selectNextQuarterlyPremiumDt();
    }

    @And("user select next monthly premium due date")
    public void userSelectNextMonthlyPremiumDueDate() throws Exception {
        insurancePage.selectNextMonthlyPremiumDt();
    }

    @When("user click on insurance card slide drow")
    public void userClickOnInsuranceCardSlideDrow() throws Exception {
        insurancePage.clickSlideDrow();
    }

    @And("user verify next premium due in policy detail screen")
    public void userVerifyNextPremiumDueInPolicyDetailScreen() throws Exception {
        insurancePage.verifyNextPremiumDue();
    }

    @And("user delete insurance card from policy detail screen")
    public void userDeleteInsuranceCardFromPolicyDetailScreen() throws Exception {
        insurancePage.deleteInsuranceCard();
    }
}
