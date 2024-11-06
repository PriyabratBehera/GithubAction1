package com.qa.stepdef;

import com.qa.pages.RiskScorePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RiskScoreStepDef {

    RiskScorePage riskScorePage = new RiskScorePage();

    @And("user select date of birth")
    public void userSelectDateOfBirth() throws Exception {
        riskScorePage.enterDateOfBirth();
    }

    @Then("user click do it later for sms permission")
    public void userClickDoItLaterForSmsPermission() throws Exception {
        riskScorePage.clickDoItLater();
    }

    @When("user click on check your personal risk score")
    public void userClickOnCheckYourPersonalRiskScore() {
        riskScorePage.clickPersonalRisk();
    }

    @Then("user verify check your personal risk score")
    public void userVerifyCheckYourPersonalRiskScore() {
        riskScorePage.verifyPersonalRisk();
    }


}
