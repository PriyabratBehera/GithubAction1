package com.qa.stepdef;

import com.qa.pages.ReportsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class ReportsStepDef {
    ReportsPage reportsPage=new ReportsPage();
    @When("user click on reports")
    public void userClickOnReports() throws Exception {
        reportsPage.clickOnReport();
    }

    @And("user select from date as {string}")
    public void userSelectFromDateAs(String dt) {

    }

    @And("user select to date as {string}")
    public void userSelectToDateAs(String arg0) {
    }

    @And("user select from date as today")
    public void userSelectFromDateAsToday() throws Exception {
        reportsPage.userSelectFromDrToday();
    }

    @And("user select to date as one month back")
    public void userSelectToDateAsOneMonthBack() throws Exception {
        reportsPage.userSelectToDtOneMBack();
    }

    @When("user select from date as march three")
    public void userSelectFromDateAsMarchThree() throws Exception {
        reportsPage.userSelectMarThree();
    }

    @And("user select to date as april three")
    public void userSelectToDateAsAprilThree() throws Exception {
        reportsPage.userSelectAprThree();
    }

    @And("user select NPS download from date as today")
    public void userSelectNPSDownloadFromDateAsToday() {

    }

    @And("user select NPS download from date as one month back")
    public void userSelectNPSDownloadFromDateAsOneMonthBack() {

    }

    @And("user select from date as may first")
    public void userSelectFromDateAsMayFirst() throws Exception {
        reportsPage.userSelectMayFirst();
    }

    @And("user select to date as may twentyFive")
    public void userSelectToDateAsMayTwentyFive() throws Exception {
        reportsPage.userSelectMayTwentyFive();
    }

    @And("user click done for in download page")
    public void userClickDoneForInDownloadPage() throws Exception {
        reportsPage.clickDoneInTranPage();
    }
}
