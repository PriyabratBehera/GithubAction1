package com.qa.adminstepdef;

import com.qa.adminpages.RewardsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RewardsStepDef {
    RewardsPage rewardsPage = new RewardsPage();

    @When("user click on link Add membership")
    public void userClickOnLinkAddMembership() {
        rewardsPage.clickAddMember();
    }

    @And("enter points required for the level")
    public void enterPointsRequiredForTheLevel() {
        rewardsPage.enterPoints();
    }

    @And("user enter redemption limit")
    public void userEnterRedemptionLimit() {
        rewardsPage.enterRedemptionLimit();
    }

    @And("user enter redemption ratio")
    public void userEnterRedemptionRatio() {
        rewardsPage.enterRedemptionRatio();
    }

    @And("user enter minimum redemption")
    public void userEnterMinimumRedemption() {
        rewardsPage.enterMinRedemption();
    }

    @And("user enter maximum redemption")
    public void userEnterMaximumRedemption() {
        rewardsPage.enterMaxRedemption();
    }

    @And("click on submit in  membership page")
    public void clickOnSubmitInMembershipPage() {
        rewardsPage.clickSubmit();
    }

    @When("user enter membership name as {string}")
    public void userEnterMembershipNameAs(String membershipName) {
        rewardsPage.enterMemberName(membershipName);
    }

    @When("user click on edit {string} membership")
    public void userClickOnEditMembership(String membershipName) {
        rewardsPage.editMembership(membershipName);
    }

    @When("user click on delete {string} membership")
    public void userClickOnDeleteMembership(String membName) {
        rewardsPage.deleteMembership(membName);
    }

    @Then("user verify add membership successful")
    public void userVerifyAddMembershipSuccessful() {
        rewardsPage.addMembSuccess();
    }

    @Then("user verify delete membership successful")
    public void userVerifyDeleteMembershipSuccessful() {
        rewardsPage.deleteMembSuccess();
    }

    @Then("user verify edit membership successful")
    public void userVerifyEditMembershipSuccessful() {
        rewardsPage.editMembSuccess();
    }

}
