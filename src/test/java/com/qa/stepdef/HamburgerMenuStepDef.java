package com.qa.stepdef;

import com.qa.pages.HamburgerMenuPage;
import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.core.appender.HttpURLConnectionManager;
import org.testng.Assert;

public class HamburgerMenuStepDef {
    GlobalParams params = new GlobalParams();
    TestUtils testUtils=new TestUtils();
    HamburgerMenuPage hamburgerMenuPage=new HamburgerMenuPage();
    @When("user click on hamburger menu")
    public void userClickOnHamburgerMenu() {
        hamburgerMenuPage.clickHamburgerIcon();
    }

    @Then("user verify my avatar icon with name and email id")
    public void userVerifyMyAvatarIconWithNameAndEmailId() {
        Assert.assertTrue(hamburgerMenuPage.verifyMyAvatarIcon());
    }

    @When("user click on close icon in account side menu")
    public void userClickOnCloseIconInAccountSideMenu() {
        hamburgerMenuPage.clickCloseIconInSideMenu();
    }

    @When("user click on my avatar icon")
    public void userClickOnMyAvatarIcon() {
        hamburgerMenuPage.clickMyAvatarIcon();
    }

    @When("user click back button in my profile screen")
    public void userClickBackButtonInMyProfileScreen() {
        hamburgerMenuPage.clickBackIconMyProfileScreen();
    }

    @When("user click on profile edit icon present in my profile screen")
    public void userClickOnProfileEditIconPresentInMyProfileScreen() {
        hamburgerMenuPage.clickOnProfileEditIcon();
    }

    @When("user click on close icon in update display name screen")
    public void userClickOnCloseIconInUpdateDisplayNameScreen() {
        hamburgerMenuPage.clickUpdateDisplayNameCloseIcon();
    }

    @When("user edit profile name as {string}")
    public void userEditProfileNameAs(String profileName) {
        hamburgerMenuPage.editProfileName(profileName);
    }

    @And("user clicks on Save button in update display name screen")
    public void userClicksOnSaveButtonInUpdateDisplayNameScreen() {
        hamburgerMenuPage.clickSaveButton();
    }

    @When("user click on add photo")
    public void userClickOnAddPhoto() {
        hamburgerMenuPage.clickAddPhoto();
    }

    @And("user click on I did not find what I wanted option in delete account screen")
    public void userClickOnIDidNotFindWhatIWantedOptionInDeleteAccountScreen() {
        hamburgerMenuPage.clickIDidNotFindWhatIWanted();
    }

    @And("user create a new profile name as {string}")
    public void userCreateANewProfile(String name) throws Exception {
        if (hamburgerMenuPage.verifyPersonalizeYourApp()) {
            hamburgerMenuPage.createProfile(name);
        }
    }

    @And("user go back from account for basic KYC screen")
    public void userGoBackFromAccountForBasicKYCScreen() {
        hamburgerMenuPage.clickBackButtonInBasicKYCScreen();
    }

    @And("user click on five star")
    public void userClickOnFiveStar() {
        hamburgerMenuPage.clickSecondStarInFeedBackScreen();
    }

    @When("user click on three dot icon in my sip screen")
    public void userClickOnThreeDotIconInMySipScreen() {
        hamburgerMenuPage.clickThreeDotIconInSipScreen();
    }

    @When("user rename profile name")
    public void userRenameProfileName() throws Exception {
            Assert.assertEquals(hamburgerMenuPage.editProfileName(),hamburgerMenuPage.verifyProfileName());
    }

    @When("user edit profile name as one character")
    public void userEditProfileNameAsOneCharacter() throws Exception {
        hamburgerMenuPage.editProfileNameAs();
    }

    @When("user choose other options in delete account screen")
    public void userChooseOtherOptionsInDeleteAccountScreen() {
        hamburgerMenuPage.clickOtherOptions();
    }

    @And("user write some reason")
    public void userWriteSomeReason() throws Exception {
        hamburgerMenuPage.writeReason();
    }

    @And("user close the select language slider")
    public void userCloseTheSelectLanguageSlider() {
        hamburgerMenuPage.closeSelectLanSlider();
    }

    @And("user scroll to Address for Privacy Related Questions")
    public void userScrollToAddressForPrivacyRelatedQuestions() {
        hamburgerMenuPage.scrollToAdressOfPrivate();
    }

    @When("user click on notification icon in dashboard")
    public void userClickOnNotificationIconInDashboard() {
        hamburgerMenuPage.clickNotificationIcon();
    }

    @When("user click on spendings on dashboard")
    public void userClickOnSpendingsOnDashboard() {
        hamburgerMenuPage.clickSpendings();
    }

    @When("user click on my wealth")
    public void userClickOnMyWealth() {
        hamburgerMenuPage.clickMyWealth();
    }

    @And("user click on my systematic plan")
    public void userClickOnMySystematicPlan() {
hamburgerMenuPage.clickmySystematicPlan();
    }

    @When("user click on create a new saving goal")
    public void userClickOnCreateANewSavingGoal() {
        hamburgerMenuPage.clickCreateANewSavingGoal();
    }

    @When("user scroll to short term deposits")
    public void userScrollToShortTermDeposits() throws Exception {
        hamburgerMenuPage.scrollShortTermDepo();
    }

    @Then("user verify ‎facebook.com, secure")
    public void userVerify‎facebookComSecure() {
        hamburgerMenuPage.verifyFacebookSc();
    }

    @And("user select complaint category as {string}")
    public void userSelectComplaintCategoryAs(String text) throws Exception {
        hamburgerMenuPage.selectComplaintCat(text);
    }

    @And("user enter concern as {string}")
    public void userEnterConcernAs(String text) {
        hamburgerMenuPage.enterConcern(text);
    }

    @And("user upload screenshot")
    public void userUploadScreenshot() throws Exception {
        hamburgerMenuPage.uploadScreenshot();
    }

    @When("user search compl history as {string}")
    public void userSearchComplHistoryAs(String text) {
        hamburgerMenuPage.searchComplaintHis(text);
    }

    @When("user scroll to validity section")
    public void userScrollToValiditySection() {
        hamburgerMenuPage.scrollToValiditySec();
    }

    @And("user click on I don't have referal code")
    public void userClickOnIDonTHaveReferalCode() {
        hamburgerMenuPage.clickIDoNotHaveRef();
    }

    @Then("user verify message screen")
    public void userVerifyMessageScreen() {
        hamburgerMenuPage.verifyMsgSc();
    }
}
