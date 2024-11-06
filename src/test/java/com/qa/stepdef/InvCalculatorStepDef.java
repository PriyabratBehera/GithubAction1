package com.qa.stepdef;

import com.qa.pages.InvCalculatorPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InvCalculatorStepDef {

    InvCalculatorPage invCalculatorPage = new InvCalculatorPage();

    @When("user click income tax planner")
    public void userClickIncomeTaxPlanner() throws Exception {
        invCalculatorPage.clickIncomeTaxPlan();
    }

    @And("user enter gross salary as {string}")
    public void userEnterGrossSalaryAs(String salaryAmt) throws Exception {
        invCalculatorPage.enterGrossSalary(salaryAmt);
    }

    @And("the user selects Yes for the question Do you get rent from a residential property?")
    public void theUserSelectsYesForTheQuestionDoYouGetRentFromAResidentialProperty() {
        invCalculatorPage.getRentFromResiYes();
    }

    @And("the user selects Yes for the question Have you taken a home loan from this property?")
    public void theUserSelectsYesForTheQuestionHaveYouTakenAHomeLoanFromThisProperty() {
        invCalculatorPage.takenHomeLoanYes();
    }

    @And("user enter rent received amount as {string}")
    public void userEnterRentReceivedAmountAs(String amt) throws Exception {
        invCalculatorPage.enterRentReceived(amt);
    }

    @And("user enter property tax paid amount as {string}")
    public void userEnterPropertyTaxPaidAmountAs(String amt) throws Exception {
        invCalculatorPage.enterPropertyTaxPaid(amt);
    }

    @And("user scroll to any other income")
    public void userScrollToAnyOtherIncome() throws Exception {
        invCalculatorPage.ScrollToAnyOtherIncome();
    }

    @And("user enter consulting income amount as {string}")
    public void userEnterConsultingIncomeAmountAs(String amt) throws Exception {
        invCalculatorPage.enterConsultingIncome(amt);
    }

    @And("user enter any other income amount as {string}")
    public void userEnterAnyOtherIncomeAmountAs(String amt) throws Exception {
        invCalculatorPage.enterAnyOtherIncome(amt);
    }

    @And("user enter basic salary plus DA as {string}")
    public void userEnterBasicSalaryPlusDAAS(String amt) throws Exception {
        invCalculatorPage.enterBasicSalPlusDa(amt);
    }

    @And("the user selects Yes for the question Are you paying home rent?")
    public void theUserSelectsYesForTheQuestionAreYouPayingHomeRent() {
        invCalculatorPage.areYouPayingHomRentYes();
    }

    @And("the user selects Yes for the question Are you claiming LTA?")
    public void theUserSelectsYesForTheQuestionAreYouClaimingLTA() {
        invCalculatorPage.areYouClaimingLTAYes();
    }

    @And("the user selects Yes for the question Do you stay in a metro city?")
    public void theUserSelectsYesForTheQuestionDoYouStayInAMetroCity() {
        invCalculatorPage.stayMetroCityYes();
    }

    @And("user enter annual hra received amount as {string}")
    public void userEnterAnnualHraReceivedAmountAs(String amt) throws Exception {
        invCalculatorPage.enterAnnualHraReceive(amt);
    }

    @And("user enter rent paid amount as {string}")
    public void userEnterRentPaidAmountAs(String amt) throws Exception {
        invCalculatorPage.enterRentPaid(amt);
    }

    @And("user enter annual LTA received amount as {string}")
    public void userEnterAnnualLTAReceivedAmountAs(String amt) throws Exception {
        invCalculatorPage.enterAnnualLta(amt);
    }

    @And("user enter travel coast amount as {string}")
    public void userEnterTravelCoastAmountAs(String amt) throws Exception {
        invCalculatorPage.enterTravelCoast(amt);
    }

    @And("user enter total PPf as {string}")
    public void userEnterTotalPPfAs(String amt) throws Exception {
        invCalculatorPage.enterPpfAmount(amt);
    }

    @And("user enter life insurance premium as {string}")
    public void userEnterLifeInsurancePremiumAs(String amt) throws Exception {
        invCalculatorPage.enterLifeInsuranceAmt(amt);
    }

    @And("user enter school tuition fees as {string}")
    public void userEnterSchoolTuitionFeesAs(String amt) throws Exception {
        invCalculatorPage.enterTuitionFees(amt);
    }

    @And("user enter self contribution to nps as {string}")
    public void userEnterSelfContributionToNpsAs(String amt) throws Exception {
        invCalculatorPage.enterSelfContribution(amt);
    }

    @And("user enter corporate contribution to nps as {string}")
    public void userEnterCorporateContributionToNpsAs(String amt) throws Exception {
        invCalculatorPage.enterCorporateContribution(amt);
    }

    @And("the user selects Yes for the question  Is any one of you aged above sixty years?")
    public void theUserSelectsYesForTheQuestionIsAnyOneOfYouAgedAboveSixtyYears() {
        invCalculatorPage.ageAbove60Ys();
    }

    @And("user enter Medical Insurance Premium for self and family as {string}")
    public void userEnterMedicalInsurancePremiumForSelfAndFamilyAs(String amt) throws Exception {
        invCalculatorPage.enterMedicalIns(amt);
    }

    @And("the user selects Yes for the question Medical Insurance Premium for self & family")
    public void theUserSelectsYesForTheQuestionMedicalInsurancePremiumForSelfFamily() {
        invCalculatorPage.medicalInsForSelfYs();
    }

    @And("the user selects Yes for the question Do you pay for medical insurance of parents?")
    public void theUserSelectsYesForTheQuestionDoYouPayForMedicalInsuranceOfParents() {
        invCalculatorPage.medicalInsPareYs();
    }

    @And("the user selects Yes for the question Is any of the insured parent aged above sixty years?")
    public void theUserSelectsYesForTheQuestionIsAnyOfTheInsuredParentAgedAboveSixtyYears() {
        invCalculatorPage.parentAgeAbo60();
    }

    @And("user enter medical insurance premium for parents as {string}")
    public void userEnterMedicalInsurancePremiumForParentsAs(String amt) throws Exception {
        invCalculatorPage.medicalInsParents(amt);
    }

    @And("the user selects Yes for the question Do you have loan for self occupied home?")
    public void theUserSelectsYesForTheQuestionDoYouHaveLoanForSelfOccupiedHome() {
        invCalculatorPage.doYouHaveLoanYs();
    }

    @And("user enter annual interest for loan as {string}")
    public void userEnterAnnualInterestForLoanAs(String amt) throws Exception {
        invCalculatorPage.enterAnnualIntPayment(amt);
    }

    @And("user enter annual principle on this loan as {string}")
    public void userEnterAnnualPrincipleOnThisLoanAs(String amt) throws Exception {
        invCalculatorPage.enterAnnualPrinciplePayment(amt);
    }

    @When("user click on exemption drop down")
    public void userClickOnExemptionDropDown() {
        invCalculatorPage.clickExemptionDrDwn();
    }

    @And("user click on information icon for salary")
    public void userClickOnInformationIconForSalary() {
        invCalculatorPage.clickImfIcForSalary();
    }

    @And("close gross salary screen")
    public void closeGrossSalaryScreen() {
        invCalculatorPage.closeImfIcForSalary();
    }

    @And("the user selects NO for the question Do you get rent from a residential property?")
    public void theUserSelectsNOForTheQuestionDoYouGetRentFromAResidentialProperty() {
        invCalculatorPage.getRentFromResiNo();
    }

    @When("user click continue")
    public void userClickContinue() {
        invCalculatorPage.clickContinue();
    }

    @When("user click on re calculator")
    public void userClickOnReCalculator() {
        invCalculatorPage.clickOnReCal();
    }

    @And("the user selects No for the question Are you paying home rent?")
    public void theUserSelectsNoForTheQuestionAreYouPayingHomeRent() {
        invCalculatorPage.areYouPayingHomRentNo();
    }

    @And("the user selects No for the question Do you stay in a metro city?")
    public void theUserSelectsNoForTheQuestionDoYouStayInAMetroCity() {
        invCalculatorPage.areYouClaimingLTANo();
    }
    @And("the user selects No for the question Medical Insurance Premium for self & family")
    public void theUserSelectsNoForTheQuestionMedicalInsurancePremiumForSelfFamily() {
        invCalculatorPage.medicalInsForSelfNo();
    }

    @And("the user selects No for the question Do you pay for medical insurance of parents?")
    public void theUserSelectsNoForTheQuestionDoYouPayForMedicalInsuranceOfParents() {
        invCalculatorPage.medicalInsPareNo();
    }

    @And("user enter annual rented out as {string}")
    public void userEnterAnnualRentedOutAs(String amt) throws Exception {
        invCalculatorPage.enterAnnualIntPaid(amt);
    }

    @And("the user click on tax payable")
    public void theUserClickOnTaxPayable() {
        invCalculatorPage.clickTaxPayable();
    }

    @And("user close income tax break up pop up")
    public void userCloseIncomeTaxBreakUpPopUp() {
        invCalculatorPage.closeIncomeTaxBreak();
    }

    @And("user scroll down to see exemption details")
    public void userScrollDownToSeeExemptionDetails() throws Exception {
        invCalculatorPage.scrollToExemption();
    }

    @When("user click insurance planner")
    public void userClickInsurancePlanner() throws Exception {
        invCalculatorPage.clickInsurancePlan();
    }

    @And("user enter dependents current age as {string}")
    public void userEnterDependentsCurrentAgeAs(String year) throws Exception {
        invCalculatorPage.enterDependentAge(year);
    }

    @And("enter till {string} age to need financial support")
    public void enterTillAgeToNeedFinancialSupport(String year) throws Exception {
        invCalculatorPage.enterFinancialSupportTillAge(year);
    }

    @And("user enter {string} as a family's current annual expenses")
    public void userEnterAsAFamilySCurrentAnnualExpenses(String amt) throws Exception {
        invCalculatorPage.enterFamilyCurrentExpenses(amt);
    }

    @And("user enter {string} to increase annual expenses")
    public void userEnterToIncreaseAnnualExpenses(String percent) throws Exception {
        invCalculatorPage.enterExpectedAnnualIncrease(percent);
    }

    @And("user scroll down towards dependants age list")
    public void userScrollDownTowardsDependantsAgeList() {
        invCalculatorPage.scrollDependantAgeList();
    }

    @And("user enter my current age as {string}")
    public void userEnterMyCurrentAgeAs(String year) throws Exception {
        invCalculatorPage.enterCurrentAge(year);
    }

    @And("user enter retirement age as {string} in life insurance planner screen")
    public void userEnterRetirementAgeAsInLifeInsurancePlannerScreen(String year) throws Exception {
        invCalculatorPage.enterRetirementAge(year);
    }

    @And("user enter {string} as present annual income")
    public void userEnterAsPresentAnnualIncome(String amt) throws Exception {
        invCalculatorPage.enterAnnualIncome(amt);
    }

    @And("user enter {string} as expected annual hike")
    public void userEnterAsExpectedAnnualHike(String percent) throws Exception {
        invCalculatorPage.enterAnnualHike(percent);
    }

    @When("scroll to insurance planner")
    public void scrollToInsurancePlanner() throws InterruptedException {
        invCalculatorPage.scrollInsurancePlan();
    }

    @And("user click on RD and SIP maturity")
    public void userClickOnToRDAndSIPMaturity() throws Exception {
        invCalculatorPage.swipeToRDAndMaturity();
    }

    @And("user enter {string} as monthly SIP amount")
    public void userEnterAsMonthlySIPAmount(String amt) throws Exception {
        invCalculatorPage.enterMonthlySip(amt);
    }

    @And("user enter {string} as investment period")
    public void userEnterAsInvestmentPeriod(String year) throws Exception {
        invCalculatorPage.enterInvestmentPeriod(year);
    }

    @And("user enter {string} as annual rate of return")
    public void userEnterAsAnnualRateOfReturn(String percent) throws Exception {
        invCalculatorPage.enterAnnualRateOfRet(percent);
    }

    @And("user enter annual step-up rate as {string}")
    public void userEnterAnnualStepUpRateAs(String percent) throws Exception {
        invCalculatorPage.enterAnnualStepUp(percent);

    }

    @And("user click on maturity amount")
    public void userClickOnOneTimeInvestment() throws Exception {
        invCalculatorPage.clickOnMaturityAmt();
    }

    @And("user enter {string} as invested amount")
    public void userEnterAsInvestedAmount(String amt) throws Exception {
        invCalculatorPage.enterInvestedAmount(amt);
    }

    @And("user enter {string} as annual rate of return for FD")
    public void userEnterAsAnnualRateOfReturnForFD(String percent) throws Exception {
        invCalculatorPage.enterAnnualRateOfRetForFD(percent);
    }

    @And("user click on present value")
    public void userClickOnPresentValue() throws Exception {
        invCalculatorPage.swipeToPresentValue();
    }

    @And("user enter {string} as time period")
    public void userEnterAsTimePeriod(String year) throws Exception {
        invCalculatorPage.enterTimePeriod(year);
    }

    @And("user enter {string} as future value")
    public void userEnterAsFutureValue(String amt) throws Exception {
        invCalculatorPage.enterFutureValue(amt);
    }

    @And("user enter {string} as annual rate of interest")
    public void userEnterAsAnnualRateOfInterest(String year) throws Exception {
        invCalculatorPage.enterAnnualRateOInt(year);
    }

    @And("user click on future value")
    public void userClickOnFutureValue() throws Exception {
        invCalculatorPage.clickFutureValue();
    }

    @And("user enter {string} as current value")
    public void userEnterAsCurrentValue(String amt) throws Exception {
        invCalculatorPage.enterCurrentValue(amt);
    }

    @And("user enter {string} as annual rate of inflation")
    public void userEnterAsAnnualRateOfInflation(String percent) throws Exception {
        invCalculatorPage.enterAnnualRateOfInfla(percent);
    }

    @Then("user verify validation for this amount {string}")
    public void userVerifyValidationForThisAmount(String validationText) throws Exception {
        invCalculatorPage.verifyValIncomeTax(validationText);
    }

    @Then("user verify value can not exceed then {string}")
    public void userVerifyValueCanNotExceedThen(String text) throws Exception {
        invCalculatorPage.verifyValidationOfSal(text);
    }
}