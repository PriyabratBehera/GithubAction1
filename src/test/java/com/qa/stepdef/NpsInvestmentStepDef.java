package com.qa.stepdef;

import com.qa.pages.NpsInvestmentPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class NpsInvestmentStepDef {
    NpsInvestmentPage npsInvestmentPage = new NpsInvestmentPage();

    @And("user click on NPS Investment")
    public void userClickOnNPSInvestment() {
        npsInvestmentPage.clickNpsInvestment();
    }

    @And("user scroll to view auto choice of investment")
    public void userScrollToViewAutoChoiceOfInvestment() throws Exception {
        npsInvestmentPage.scrollToAutoChoice();
    }

    @When("user scroll to view more about NPS")
    public void userScrollToViewMoreAboutNPS() throws Exception {
        npsInvestmentPage.scrollToMoreAboutNps();
    }

    @When("user enter monthly retirement income needed as {string}")
    public void userEnterMonthlyRetirementIncomeNeededAs(String MonthlyIncome) {
        npsInvestmentPage.enterMonRetirementIncome(MonthlyIncome);
    }

    @And("enter current age as {string}")
    public void enterCurrentAgeAs(String currentAge) throws Exception {
        npsInvestmentPage.enterCurrentAge(currentAge);
    }

    @And("enter retirement age as {string}")
    public void enterRetirementAgeAs(String retirementAge) throws Exception {
        npsInvestmentPage.enterRetirementAge(retirementAge);
    }

    @And("user enter income till age of {string} after retirement")
    public void userEnterIncomeTillAgeOfAfterRetirement(String age) throws Exception {
        npsInvestmentPage.enterIncomeAfterRetire(age);
    }

    @And("user invest at annual interest of {string} till retire")
    public void userInvestAtAnnualInterestOfTillRetire(String interest) throws Exception {
        npsInvestmentPage.enterInvestTillRetire(interest);
    }

    @And("user invest at annual interest of {string} post retirement")
    public void userInvestAtAnnualInterestOfPostRetirement(String interest) throws Exception {
        npsInvestmentPage.enterInvestPostRetire(interest);
    }

    @And("user search company name as {string} in company name screen")
    public void userSearchCompanyNameAsInPersonalDetailScreen(String compName) throws Exception {
        npsInvestmentPage.searchCompanyName(compName);
    }

    @And("user click on crop details")
    public void userClickOnCropDetails() {
        npsInvestmentPage.clickCorpDetail();
    }

    @And("user enter employee number as {string}")
    public void userEnterEmployeeNumberAs(String empNum) throws Exception {
        npsInvestmentPage.enterEmpNum(empNum);
    }

    @And("user enter company joining date as {string}")
    public void userEnterCompanyJoiningDateAs(String compJoinDt) throws Exception {
        npsInvestmentPage.enterCompJoinDt(compJoinDt);
    }

    @Then("user not able to see invest tab")
    public void userNotVerifyStaticInvestTab() {
        Assert.assertFalse(npsInvestmentPage.verifyInvestTab());
    }

    @And("user click on pension fund manager drop down")
    public void userClickOnPensionFundManagerDropDown() {
        npsInvestmentPage.clickPFMDropDwn();
    }

    @And("user scroll down")
    public void userScrollDown() throws Exception {
        npsInvestmentPage.scrollD0wn();
    }

    @And("user enter alternative fund \\(A) as {string}")
    public void userEnterAlternativeFundAAs(String fund) throws Exception {
        npsInvestmentPage.enterAlterFund(fund);
    }

    @When("user enter equity \\(E) as {string}")
    public void userEnterEuityEAs(String equity) throws Exception {
        npsInvestmentPage.enterEquityFund(equity);
    }

    @And("enter nominee name as {string}")
    public void enterNomineeNameAs(String name) throws Exception {
        npsInvestmentPage.enterNomineeName(name);
    }

    @And("user select relation with guardians")
    public void userSelectRelationWithGuardians() {
        npsInvestmentPage.selectGuardianRelationship();
    }

    @And("user enter guardians name as {string}")
    public void userEnterGuardiansNameAs(String name) throws Exception {
        npsInvestmentPage.enterGuardianName(name);
    }

    @When("user select life cycle fund type as moderate LC fifty")
    public void userSelectLifeCycleFundTypeAsModerateLCFiftyFive() {
        npsInvestmentPage.selectModerateLCF();
    }

    @When("user select life cycle fund type as conservative LC twentyFive")
    public void userSelectLifeCycleFundTypeAsConservativeLCTwentyFive() {
        npsInvestmentPage.selectConservativeLCF();
    }

    @When("user select life cycle fund type as moderate LC seventyFive")
    public void userSelectLifeCycleFundTypeAsModerateLCSeventyFive() {
        npsInvestmentPage.selectAggressiveLCF();
    }

    @When("user close the auto choice investment screen")
    public void userCloseTheAutoChoiceInvestmentScreen() {
        npsInvestmentPage.closeAutoChoiceInvest();
    }

    @And("user not able to select investment fund manager")
    public void userNotAbleToSelectInvestmentFundManager() {
        npsInvestmentPage.verifyIsPFMClickable();
    }

    @And("user not able to select active choice")
    public void userNotAbleToSelectActiveChoice() throws Exception {
        npsInvestmentPage.verifyActiveChoice();
    }

    @And("user not able to select portfolio option")
    public void userNotAbleToSelectPortfolioOption() {
        npsInvestmentPage.verifyPortFoOpt();
    }

    @And("user not able to select auto choice")
    public void userNotAbleToSelectAutoChoice() throws Exception {
        npsInvestmentPage.verifyAutoChoice();
    }

    @When("user enter govt security as {string}")
    public void userEnterGovtSecurityAs(String rate) throws Exception {
        npsInvestmentPage.oenterGovtSecurity(rate);
    }

    @When("user enter corporate bond as {string}")
    public void userEnterCorporateBondAs(String rate) throws Exception {
        npsInvestmentPage.enterCorporateBnd(rate);
    }

    @And("user enter guardian DOB greater than eighteen")
    public void userEnterGuardianDOBGreaterThanEighteen() throws Exception {
        npsInvestmentPage.enterGuardianDob();
    }

    @And("user enter guardian DOB below eighteen")
    public void userEnterGuardianDOBBelowEighteen() throws Exception {
        npsInvestmentPage.enterBelow18GuDob();
    }

    @And("user click on DEF technologies")
    public void userClickOnDEFTechnologies() {
        npsInvestmentPage.clickDefTechnologies();
    }

    @When("user enter account number in bank as {string} account screen")
    public void userEnterAccountNumberInBankAsAccountScreen(String accNo) {
        npsInvestmentPage.enterAccNo(accNo);
    }

    @When("user enter ifsc code as {string}")
    public void userEnterIfscCodeAs(String ifscCode) throws Exception {
        npsInvestmentPage.enterIfscCode(ifscCode);
    }

    @And("user Select bank name as {string}")
    public void userSelectBankNameAs(String bankName) throws Exception {
        npsInvestmentPage.selectBankName(bankName);
    }

    @When("user enter contribution amount as {string}")
    public void userEnterContributionAmountAs(String amt) {
        npsInvestmentPage.enterContributionAmt(amt);
    }

    @And("user delete nps account {string}")
    public void userDeleteNpsAccount(String mobNo) {
        npsInvestmentPage.deleteNps(mobNo);
    }

    @And("user do payment for nps contribution")
    public void userDoPaymentForNpsContribution() throws Exception {
        npsInvestmentPage.doPaymentForNps();
    }

    @When("user click on home button")
    public void userOnHomeButton() {
        npsInvestmentPage.clickHome();
    }

    @And("user do payment fail for nps contribution")
    public void userDoPaymentFailForNpsContribution() throws Exception {
        npsInvestmentPage.paymentFailForNps();
    }

    @When("user close reason of failure screen")
    public void userCloseReasonOfFailureScreen() {
        npsInvestmentPage.closeFailureScreen();
    }

    @And("user verify successful nps registration transaction as {string}")
    public void userVerifySuccessTransaction(String amount) throws Exception {
        npsInvestmentPage.verifySuccessTransaction(amount);
    }

    @And("user click on hombale technologies")
    public void userClickOnHombaleTechnologies() {
        npsInvestmentPage.clickHombal();
    }

    @When("user select corporate subscriber")
    public void userSelectCorporateSubscriber() {
        npsInvestmentPage.clickCorporateSub();
    }

    @When("user close restart nps application screen")
    public void userCloseRestartNpsApplicationScreen() {
        npsInvestmentPage.closeRestartNpsScreen();
    }

    @When("user select one nominee")
    public void userSelectOneNominee() {
        npsInvestmentPage.chooseOneNominee();
    }

    @Then("user verify 100 percent")
    public void userVerify100Percent() {
        npsInvestmentPage.verify100PercentNominee();
    }

    @Then("user verify 50 percent")
    public void userVerify50Percent() {
        npsInvestmentPage.verify50PercentNominee();
    }

    @And("user select two nominee")
    public void userSelectTwoNominee() {
        npsInvestmentPage.chooseTwoNominee();
    }

    @Then("user verify validation maximum three banks are allowed")
    public void userVerifyValidationMaximumThreeBanksAreAllowed() {
        npsInvestmentPage.verifyAddLimitBank();
    }

    @When("user close adding bank popup")
    public void userCloseAddingBankPopup() {
        npsInvestmentPage.closeAddingBankPopup();
    }

    @And("user select pension fund manager as {string}")
    public void userSelectPensionFundManagerAs(String pfm) throws Exception {
        npsInvestmentPage.selectPFM(pfm);
    }

    @When("user click on submit application")
    public void userClickOnSubmitApplication() {
        npsInvestmentPage.clickSubmitApplication();
    }

    @And("user scroll to view corporate name")
    public void userScrollToViewCorporateName() throws Exception {
        npsInvestmentPage.scrollCorporateName();
    }

    @And("user verify bellow corporate nps application status")
    public void userVerifyBellowCorporateNpsApplicationStatus(DataTable dataTable) {
        npsInvestmentPage.verifyAppliStatus(dataTable);
    }

    @And("user select nomination DOB")
    public void userSelectNominationDOB() throws Exception {
        npsInvestmentPage.enterNomineDob();
    }

    @And("user select individual subscriber")
    public void userSelectIndividualSubscriber() {
        npsInvestmentPage.clickIndividualSub();
    }

    @And("user select Portfolio option as {string}")
    public void userSelectPortfolioOptionAs(String portfolioName) throws Exception {
        npsInvestmentPage.selectPortfolioOpt(portfolioName);
    }

    @When("user click on open nps account")
    public void userClickOnRegisterForNps() {
        npsInvestmentPage.clickRegisterNps();
    }

    @And("user scroll to view active choice of investment")
    public void userScrollToViewActiveChoiceOfInvestment() throws Exception {
        npsInvestmentPage.scrollToActiveChoice();
    }

    @And("user click ABC Technologies \\(ABC Tek)")
    public void userClickABCTechnologiesABCTek() {
        npsInvestmentPage.clickAbcTec();
    }

    @Then("user verify invest tab")
    public void userVerifyInvestTab() {
        Assert.assertTrue(npsInvestmentPage.verifyInvestTab());
    }

    @And("user verify bellow individual nps registration status")
    public void userVerifyBellowIndividualNpsRegistrationStatus(DataTable dataTable) {
        npsInvestmentPage.verifyNPSAppliStatus(dataTable);
    }

    @Then("user verify Retirement Age must be smaller than seventyFive")
    public void userVerifyRetirementAgeMustBeSmallerThanSeventyFive() throws Exception {
        npsInvestmentPage.verifyRetireAgeValidation();
    }

    @Then("verify Current Age must be smaller than sixtyFive")
    public void verifyCurrentAgeMustBeSmallerThanSixtyFive() throws Exception {
        npsInvestmentPage.verifyCurrentAgeValidation();
    }

    @And("user enter pop-sp code as {string}")
    public void userEnterPopSpCodeAs(String popSpCd) {
        npsInvestmentPage.enterPopSpCode(popSpCd);
    }

    @And("user enter pran number as {string}")
    public void userEnterPranNumberAs(String pranNum) throws Exception {
        npsInvestmentPage.enterPranNum(pranNum);
    }

    @And("user enter pran shifting otp")
    public void userEnterPranShiftingOtp() {
        npsInvestmentPage.enterOTPForPranShift();
    }

    @And("user click on original value floatr")
    public void userClickOnOriginalValueFloatr() {
        npsInvestmentPage.clickOriginalValueFloatr();
    }

    @And("user delete bank account as {string}")
    public void userDeleteBankAccount(String accNo) {
        npsInvestmentPage.deleteBankDetail(accNo);
    }

    @And("user enter invalid pran shifting otp")
    public void userEnterInvalidPranShiftingOtp() {
        npsInvestmentPage.enterWrongOTPForPranShift();
    }

    @Then("user verify successful nps contribution transaction as {string}")
    public void userVerifySuccessfulNpsContributionTransactionAs(String amount) throws Exception {
        npsInvestmentPage.verifySuccessContribution(amount);
    }

    @And("user verify increasing registration amount")
    public void userVerifyIncreasingRegistrationAmount() {
        npsInvestmentPage.verifyRegiIncreaseAmt();
    }

    @And("user enter OTP for in NPS screen")
    public void userEnterOTPForInNPSScreen() {
        npsInvestmentPage.enterOTP();
    }

    @And("user enter corporate email as {string}")
    public void userEnterCorporateEmailAs(String email) {
        npsInvestmentPage.enterCorporateEmail(email);
    }

    @And("user click nominee select box")
    public void userClickNomineeSelectBox() {
        npsInvestmentPage.clickNomineeBx();
    }

    @Then("user verify bellow PRAN information after individual registration")
    public void userVerifyBellowPRANInformationAfterindividualRegistration(DataTable dataTable) {
        npsInvestmentPage.individualRegiInfo(dataTable);
    }

    @And("user select corporate contribution amount")
    public void userSelectCorporateContributionAmount() {
        npsInvestmentPage.selectContributionAmount();
    }

    @And("user scroll to view shifting acknowledgement")
    public void userScrollToViewShiftingAcknowledgement() throws Exception {
        npsInvestmentPage.scrollToAckn();
    }

    @When("NPS shifting will be done with this {string}")
    public void npsShiftingWillBeDoneWithThis(String mobileNumber) {
        npsInvestmentPage.corporateShiftingDone(mobileNumber);
    }

    @Then("user verify bellow PRAN information after shifting floatr POP individual to corporate")
    public void userVerifyBellowPRANInformationAfterShiftingFloatrPOPIndividualToCorporate(DataTable dataTable) {
        npsInvestmentPage.verifyPranInfoIndToCop(dataTable);
    }

    @When("user select company name as {string} in company details screen")
    public void userSelectCompanyNameAsInCompanyDetailsScreen(String companyName) throws Exception {
        npsInvestmentPage.selectCompanyName(companyName);
    }

    @And("user enter name in pran cars as {string}")
    public void userEnterNameInPranCarsAs(String name) {
        npsInvestmentPage.enterNameInPran(name);
    }

    @And("user click register corporate if display")
    public void userClickRegisterCorporateIfDisplay() throws Exception {
        npsInvestmentPage.clickRegisterCorporate();
    }

    @And("user enter amount as {string} in  NPS Contribution screen")
    public void userEnterAmountAsInNPSContributionScreen(String amt) {
        npsInvestmentPage.enterInvAmount(amt);
    }

    @Then("user verify bellow PRAN information after corporate registration")
    public void userVerifyBellowPRANInformationAfterCorporateRegistration(DataTable dataTable) {
        npsInvestmentPage.corporateRegiInfo(dataTable);
    }

    @And("user scroll to post-retirement wealth")
    public void userScrollToPostRetirementWealth() throws Exception {
        npsInvestmentPage.scrollToPost();
    }

    @And("user enter cbo code as {string}")
    public void userEnterCboCodeAs(String popSpCd) {
        npsInvestmentPage.enterPopSpCode(popSpCd);
    }

    @And("user wait for NPS registration successful screen")
    public void userWaitForNPSRegistrationSuccessfulScreen() {
        npsInvestmentPage.waitForNpsSuccessSc();
    }

    @And("user wait for NPS registration failed screen")
    public void userWaitForNPSRegistrationFailedScreen() {
        npsInvestmentPage.waitForNpsFailSc();
    }

    @And("user wait for successful contribution screen")
    public void userWaitForSuccessfulContributionScreen() {
        npsInvestmentPage.waitForSuccessContribution();
    }

    @And("user wait for failed contribution screen")
    public void userWaitForFailedContributionScreen() {
        npsInvestmentPage.waitForFailedContribution();
    }

    @And("user check is there already have NPS account in floatr")
    public void userCheckIsThereAlreadyHaveNPSAccountInFloatr() throws Exception {
        npsInvestmentPage.checkAlreadyHaveFloatrPRAN();
    }

    @And("user check has he NPS account")
    public void userCheckHasHeNPSAccount() throws Exception {
        npsInvestmentPage.checkNPSAccount();
    }
}
