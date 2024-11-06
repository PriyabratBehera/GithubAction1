package com.qa.adminstepdef;

import com.qa.adminpages.WebBasePage;
import com.qa.utils.TestUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class HomeStepDef {
    WebBasePage basePage = new WebBasePage();
    TestUtils utils = new TestUtils();
    @And("user click on link {string}")
    public void clickOnLink(String link) throws Exception {
        basePage.clickLinkText(link);
    }

}
