package com.qa.adminstepdef;

import com.qa.adminpages.ManageAdminPage;
import com.qa.adminpages.MutualFundPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.io.IOException;

public class MutualFundStepDef {
    MutualFundPage mutualFundPage = new MutualFundPage();

    @When("user select amc name")
    public void userSelectAmcName() throws InterruptedException {
        mutualFundPage.selectAmc();
    }

    @And("user enter scheme name as {string}")
    public void userEnterSchemeNameAs(String schemeName) {
        mutualFundPage.enterSchemeName(schemeName);
    }

    @And("user select scheme category")
    public void userSelectSchemeCategory() {
        mutualFundPage.selectCategory();
    }

    @And("user select scheme sub category")
    public void userSelectSchemeSubCategory() throws InterruptedException {
        mutualFundPage.selectSubCategory();
    }

    @And("user select schemes type")
    public void userSelectSchemesType() {

    }

    @And("user select IDCW options")
    public void userSelectIDCWOptions() {
    }

    @And("user enter ISIN code as {string}")
    public void userEnterISINCodeAs(String isinCd) {
        mutualFundPage.enterISINCode(isinCd);
    }

    @And("user enter AMFI code as {string}")
    public void userEnterAMFICodeAs(String amfiCd) {
        mutualFundPage.enteramfi(amfiCd);
    }

    @And("user select active now")
    public void userSelectActiveNow() throws InterruptedException {
        mutualFundPage.clickSchemeActiveChk();
    }

    @And("click on submit")
    public void clickOnSubmit() throws InterruptedException {
        Thread.sleep(10000);
    }

    @And("user submit button in add mutual fund scheme page")
    public void userSubmitButtonInAddMutualFundSchemePage() {
        mutualFundPage.clickSubmit();
    }

    @When("user click on edit {string} schemes")
    public void userClickOnEditSchemes(String schemes) {
        mutualFundPage.editMfSchemes(schemes);
    }

    @When("user edit amc name")
    public void userEditAmcName() {
        mutualFundPage.editAmc();
    }

    @And("user edit scheme category")
    public void userEditSchemeCategory() {
        mutualFundPage.editCategory();
    }

    @And("user edit scheme sub category")
    public void userEditSchemeSubCategory() throws InterruptedException {
        mutualFundPage.editSubCategory();
    }

    @And("user submit button in edit mutual fund scheme page")
    public void userSubmitButtonInEditMutualFundSchemePage() {
        mutualFundPage.clickSubmitBtn();
    }

    @When("user delete {string} schemes")
    public void userDeleteSchemes(String schemes) throws InterruptedException {
        mutualFundPage.deleteMfSchemes(schemes);
    }

    @And("user click on add amcs")
    public void userClickOnAddAmcs() {
        new ManageAdminPage().clickAmcs();
    }

    @And("upload file")
    public void uploadFile() throws IOException, InterruptedException {
        new ManageAdminPage().fileUpload();
    }

    @And("user get size of element")
    public void userGetSizeOfElement() {
        new ManageAdminPage().getSize();
    }
}
