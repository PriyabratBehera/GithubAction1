package com.qa.stepdef;

import com.qa.pages.KYCPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class KYCStepDef {

    KYCPage kycPage = new KYCPage();

    @When("user enter mobile number as {string} for complete KYC")
    public void userEnterMobileNumberAsForCompleteKYC(String mobileNumber) throws Exception {
        kycPage.enterInvalidMobileNumber(mobileNumber);
    }

    @And("user enter email id as {string} for complete KYC")
    public void userEnterEmailIdAsForCompleteKYC(String emailId) throws Exception {
        kycPage.enterInvalidEmailAddress(emailId);
    }

    @When("user enter invalid OTP for verifying mobile number for KYC")
    public void userEnterInvalidOTPForVerifyingMobileNumberForKYC() throws Exception {
        kycPage.enterInvalidMobileOTP();
    }

    @When("user enter valid OTP for verifying email id for KYC")
    public void userEnterValidOTPForVerifyingEmailIdForKYC() throws Exception {
        kycPage.enterValidEmailOTP();
    }

    @When("user enter invalid OTP for verifying email address for KYC")
    public void userEnterInvalidOTPForVerifyingEmailAddressForKYC() throws Exception {
        kycPage.enterInvalidEmailOTP();
    }

    @When("user enter valid OTP for verifying mobile number for KYC")
    public void userEnterValidOTPForVerifyingMobileNumberForKYC() throws Exception {
        kycPage.enterValidMobileOTP();
    }

    @When("user keep father's name as empty")
    public void userKeepFatherNameAsEmpty() throws Exception {
        kycPage.doNotEnterFathersName();
    }

    @And("user keep mother's name as empty")
    public void userKeepMatherNameAsEmpty() throws Exception {
        kycPage.doNotEnterMothersName();
    }

    @When("user enters all required field in declaration and other detail screen")
    public void userEntersAllRequiredFieldInDeclarationAndOtherDetailScreen() throws Exception {
        kycPage.selectPoliticalExposedPersonYes();
        kycPage.selectPoliticalExposedPersonNo();
        kycPage.selectRelatedPoliticalExposedPersonYes();
        kycPage.selectRelatedPoliticalExposedPersonNo();
        kycPage.selectOccupationTypeProfessional();
        kycPage.selectOccupationTypeSelfEmploy();
        kycPage.scrollToAnnualIncome();
        kycPage.selectMainSourceOfIncomeRental();
        kycPage.selectAnnualIncomeFiveToTen();
        kycPage.selectAnnualIncomeOneToFive();
    }

    @When("user select nomination DOB  as {string}")
    public void userSelectNominationDOBAs(String dob) throws Exception {
        kycPage.selectDobOfNominee(dob);
    }

    @And("user scroll to view guardians DOB")
    public void userScrollToViewGuardiansDOB() throws Exception {
        kycPage.scrollGuardiansDOB();
    }

    @When("user select relation with nominee")
    public void userSelectRelationWithNominee() throws Exception {
        kycPage.selectNomineeRelationship();
    }

    @When("user take pan photo")
    public void userTakePanPhoto() throws Exception {
        kycPage.uploadPan();
    }

    @When("user click resend otp for email")
    public void userClickResendOtpForEmail() {
        kycPage.clickResendOTPEmail();
    }

    @And("user click on start new application")
    public void userClickOnStartNewApplication() throws Exception {
        kycPage.clickStartNewApplication();
    }

    @And("user keep place of birth as empty")
    public void userKeepPlaceOfBirthAsEmpty() throws Exception {
        kycPage.doNotEnterPlaceOfBirth();
    }

    @And("user scroll to marital status")
    public void userScrollToMaritalStatus() throws Exception {
        kycPage.scrollToMaritalSta();
    }

    @And("user scroll to spouse name")
    public void userScrollToSpouseName() throws Exception {
        kycPage.scrollToSpouseName();
    }

    @And("user verify spouse name can not be empty")
    public void userVerifySpouseNameCanNotBeEmpty() throws Exception {
        kycPage.verifySpouseName();
    }

    @And("user enter father's name as {string}")
    public void userEnterFatherSNameAs(String fatherName) throws Exception {
        kycPage.enterFathersName(fatherName);
    }

    @And("user enter mother's name as {string}")
    public void userEnterMotherSNameAs(String motherName) throws Exception {
        kycPage.enterMothersName(motherName);
    }

    @And("user enter place of birth as {string}")
    public void userEnterPlaceOfBirthAs(String placeOfBirth) throws Exception {
        kycPage.enterPlaceOfBirth(placeOfBirth);
    }

    @When("user click on Upload PAN \\(jpeg or png)")
    public void userClickOnUploadPANJpegOrPng() {
        kycPage.clickUploadPan();
    }

    @And("user click on Upload Photo \\(jpeg or png)")
    public void userClickOnUploadPhotoJpegOrPng() {
        kycPage.clickUploadPhoto();
    }

    @And("user click on Upload Signature \\(jpeg or png)")
    public void userClickOnUploadSignatureJpegOrPng() {
        kycPage.clickUploadSign();
    }

    @And("user give location")
    public void userGiveLocation() {
        kycPage.giveLocation();
    }

    @And("user close sign sample popup")
    public void userCloseSignSamplePopup() {
        kycPage.closeSignPopup();
    }

    @And("user scroll to a sample image of signature")
    public void userScrollToASampleImageOfSignature() throws Exception {
        kycPage.scrollToViewSampleSign();
    }

    @And("user select relation with nominee as father")
    public void userSelectRelationWithNomineeAsFather() throws Exception {
        kycPage.selectNomineeAsFather();
    }

    @Then("user verify Tahaliprasad as nominee name")
    public void userVerifyTahaliprasadAsNomineeName() {
        kycPage.verifyTahaliPrasadNominee();
    }

    @And("user click on Get OTP")
    public void userClickOnGetOTP() {
        kycPage.clickGetOTP();
    }

    @And("user take selfie photo")
    public void userTakeSelfiePhoto() {
        kycPage.uploadPhoto();
    }

    @And("user take signature")
    public void userTakeSignature() {
        kycPage.uploadSignature();
    }

    @And("user click on {string} tab")
    public void userClickOnTab(String tab) throws Exception {
        kycPage.clickHeaderTab(tab);
    }
}
