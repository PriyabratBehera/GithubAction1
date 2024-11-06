package com.qa.stepdef;

import com.qa.pages.DashboardPlusIconPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class DashboardPlusIconStepDef {
    DashboardPlusIconPage dashboardPlusIconPage=new DashboardPlusIconPage();

    @When("user click on invest in mutual fund")
    public void userClickOnInvestInMutualFund() {
        dashboardPlusIconPage.clickInvestInMutual();
    }

    @When("user click on invest in mutual fund basket")
    public void userClickOnInvestInMutualFundBasket() {
        dashboardPlusIconPage.clickInvestInMutualBasket();
    }

    @When("user click on invest in gold and silver")
    public void userClickOnInvestInGoldAndSilver() {
        dashboardPlusIconPage.clickInvestInGoldSilver();
    }

    @And("user click on import mutual fund")
    public void userClickOnImportMutualFund() {
        dashboardPlusIconPage.clickImportMF();
    }

    @When("user click on add insurance policies")
    public void userClickOnAddInsurancePolicies() {
        dashboardPlusIconPage.clickAddPolicy();
    }

    @And("user click on pay utility bills")
    public void userClickOnPayUtilityBills() {
        dashboardPlusIconPage.clickPayUtilityBills();
    }

    @When("user click on download reports")
    public void userClickOnDownloadReports() {
        dashboardPlusIconPage.clickDownloadReports();
    }
}
