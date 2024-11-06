package com.qa.adminstepdef;

import com.qa.adminpages.CreateAdminPage;
import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Objects;

public class CreateAdminStepDef {
    CreateAdminPage createAdminPage = new CreateAdminPage();
    TestUtils utils = new TestUtils();
    GlobalParams globalParams = new GlobalParams();

    @And("user select Role")
    public void userSelectRole() throws InterruptedException {
        createAdminPage.selectRole();
    }

    @And("user enter user name as {string}")
    public void userEnterUserNameAs(String usrName) {
        createAdminPage.enterUserName(usrName);
    }

    @And("user enter first name as {string}")
    public void userEnterFirstNameAs(String firstName) {
        createAdminPage.enterFirstName(firstName);
    }

    @And("user enter last name as {string}")
    public void userEnterLastNameAs(String lastName) {
        createAdminPage.enterLastName(lastName);
    }

    @And("user enter contact as {string}")
    public void userEnterContactAs(String contactNo) {
        createAdminPage.enterContact(contactNo);
    }

    @And("user enter password as {string}")
    public void userEnterPasswordAs(String password) {
        createAdminPage.enterPassword(password);
    }

    @And("user click on submit in create admin page")
    public void userClickOnSubmitInCreateAdminPage() {
        createAdminPage.clickOnSubmit();
    }

    @Then("user verify user created successfully")
    public void userVerifyUserCreatedSuccessfully() {
        createAdminPage.UserCreateSuccess();
    }

    @When("user edit {string} details")
    public void userEditDetails(String adminName) throws Exception {
        createAdminPage.editAdminDetails(adminName);
    }

    @And("user enter referral code as {string}")
    public void userEnterReferralCodeAs(String referCode) {
        createAdminPage.enterReferralCode(referCode);
    }

    @And("click on submit button in edit admin page")
    public void clickOnSubmitButtonInEditAdminPage() {
        createAdminPage.clickOnSubmit();
    }

    @Then("user verify edit successful")
    public void userVerifyEditSuccessful() {
        createAdminPage.editUserSuccess();
    }

    @When("user delete {string} details")
    public void userDeleteDetails(String adminName) {
        createAdminPage.deleteAdminDetails(adminName);
    }

    @Then("user verify delete successful")
    public void userVerifyDeleteSuccessful() throws InterruptedException {
        createAdminPage.deleteUserSuccess();
    }

    @And("user verify is {string} exist")
    public void userVerifyIsExist(String admin) {
        createAdminPage.isUserExist(admin);
    }

    @And("user check exiting admin Priyabrat")
    public void userCheckExitingAdminPriyabrat() {
        if (Objects.equals(globalParams.getBrowserType(), "Chrome")) {
            createAdminPage.verifyExitingUser("Priyabrat");
        } else if (Objects.equals(globalParams.getBrowserType(), "Edge")) {
            createAdminPage.verifyExitingUser("Priyabrat ");
        }
    }

    @And("user check admin to edit details")
    public void userCheckAdminToEditDetails() throws Exception {
        createAdminPage.userCheckToEdit();
    }
}
