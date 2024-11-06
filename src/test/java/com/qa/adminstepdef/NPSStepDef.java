package com.qa.adminstepdef;

import com.qa.adminpages.NPSPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NPSStepDef {
    NPSPage npsPage = new NPSPage();

    @When("user enter company name as {string}")
    public void userEnterCompanyNameAs(String companyName) {
        npsPage.enterCompanyName(companyName);
    }

    @And("user enter brand name as {string}")
    public void userEnterBrandNameAs(String brandName) {
        npsPage.enterBrandName(brandName);
    }

    @And("user select CRA")
    public void userSelectCRA() {
        npsPage.selectCRA();
    }

    @And("user select state in add corporates page")
    public void userSelectStateAsInAddCorporatesPage() {
        npsPage.selectState();

    }

    @And("user enter city as {string} in add corporates page")
    public void userEnterCityAsInAddCorporatesPage(String city) {
        npsPage.enterCity(city);
    }

    @And("user enter pin as {string} in add corporates page")
    public void userEnterPinAsInAddCorporatesPage(String pin) {
        npsPage.enterPin(pin);
    }

    @And("user enter CHO as {string}")
    public void userEnterCHOAs(String choNum) {
        npsPage.enterCho(choNum);
    }

    @And("user enter CBO online as {string}")
    public void userEnterCBOOnlineAs(String cboOnline) {
        npsPage.enterCboOnline(cboOnline);
    }

    @And("user enter CBO offline as {string}")
    public void userEnterCBOOfflineAs(String cboOffline) {
        npsPage.enterCboOffline(cboOffline);
    }

    @And("user select subscriber fees")
    public void userSelectSubscriberFeesAs() throws InterruptedException {
        npsPage.selectSubscribeFee();
    }

    @And("user select contribution fees")
    public void userSelectContributionFeesAs() throws InterruptedException {
        npsPage.selectContributeFee();
    }

    @And("user select fees and initial investment")
    public void userSelectFeesAndInitialInvestmentAs() {
        npsPage.selectInitialInvestAmt();
    }

    @And("user select activation date")
    public void userSelectActivationDateAs() throws InterruptedException {
        npsPage.enterActivationDt();
    }

    @And("user enter company email id as {string}")
    public void userEnterCompanyEmailIdAs(String emailId) {
        npsPage.enterCompanyEmail(emailId);
    }

    @And("user enter retirement age as {string}")
    public void userEnterRetirementAgeAs(String age) {
        npsPage.enterRetirementAge(age);
    }

    @And("user select retirement date")
    public void userSelectRetirementDateAs() {
        npsPage.selectRetirementDate();
    }

    @And("user select corporate is co contributor")
    public void userSelectCorporateIsCoContributorAs() throws InterruptedException {
        npsPage.selectCoContribute();
    }

    @And("user select investment preference")
    public void userSelectInvestmentPreferenceAs() {
        npsPage.selectInvestPref();
    }

}
