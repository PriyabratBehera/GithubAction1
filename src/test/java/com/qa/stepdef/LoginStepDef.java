package com.qa.stepdef;

import com.qa.pages.LoginPage;
import com.qa.utils.TestContext;
import io.cucumber.java.en.*;
import org.apache.commons.lang.StringUtils;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class LoginStepDef {
    TestContext testContext = TestContext.getInstance();

    @When("^user get started with Float app$")
    public void getStarted(List<Map<String, String>> values) throws Exception {
        for (Map<String, String> value : values) {
            String phoneNumber = StringUtils.defaultString(value.get("PhoneNumber"));
            new LoginPage().getStarted(phoneNumber);
        }
    }

    @When("user clicks on get started button")
    public void userClicksOnGetStartedButton() throws Exception {
        new LoginPage().clickGetStarted();
    }

    @When("user enters mobile number as {string}")
    public void userEntersMobileNumberAs(String mobileNo) throws Exception {

        new LoginPage().enterPhoneNumber(mobileNo);
    }

    @When("user clicks on continue")
    public void userClicksOnContinue() {
        new LoginPage().clickContinue();
    }

    @Then("login should fail with error {string}")
    public void loginShouldFailWithError(String error) {
        if (error.contains("OTP")) {
            Assert.assertEquals(new LoginPage().getOTPError(), error);
        } else {
            Assert.assertEquals(new LoginPage().getMobileNoErrorText(), error);
        }
    }

    @When("user enters invalid otp")
    public void userEntersInvalidOtp() {
        new LoginPage().enterOTP("1234");
    }

    @And("user clicks on submit button")
    public void userClicksOnSubmitButton() {
        new LoginPage().clickSubmit();
    }

    @And("user enters otp")
    public void userEntersOtp() {
        new LoginPage().enterOTP("");
    }

    @And("user allows permission")
    public void userAllowsPermission() {
        new LoginPage().allowPermission();
    }

    @Given("user login to app")
    public void userLoginToApp() throws Exception {
        new LoginPage().login("", "");
    }

    @Given("application launched successfully")
    public void applicationLaunchedSuccessfully() throws Exception {
        Assert.assertTrue(new LoginPage().verifyHome());

    }


    @And("user enter profile name as {string}")
    public void userEnterProfileNameAs(String name) throws Exception {
        new LoginPage().enterProfileName(name);
    }

    @And("user delete the new user account")
    public void userDeleteTheNewUserAccountFromExpenseScreen() throws Exception {
        new LoginPage().deleteNewUser();
    }
    @Given("user login with new user")
    public void userLoginWithNewUser() throws Exception {
        new LoginPage().logoutForNewUser();
        String newNumber=new LoginPage().loginNewUser( "");
        testContext.datastore.put("new_user",newNumber);
    }
    @Given("user login with corporate user")
    public void userLoginWithCorporateUser() throws Exception {
        new LoginPage().logoutForNewUser();
        new LoginPage().loginCorporateNewUser( "");
    }
    @Given("user login with user {string}")
    public void userLoginWithKYCCompletedUser(String mobileNumber) throws Exception {
        new LoginPage().logout();
        new LoginPage().loginWithoutPermission(mobileNumber, "");
    }
    @Given("user login with this user {string}")
    public void userLoginWithThisUser(String mobileNumber) throws Exception {
        new LoginPage().logoutForNewUser();
        new LoginPage().loginWithThisUser(mobileNumber, "");
    }
}
