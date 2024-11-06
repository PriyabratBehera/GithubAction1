package com.qa.adminstepdef;


import com.qa.adminpages.HomePage;
import com.qa.utils.GlobalParams;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.Assert;

import java.util.Objects;

public class LoginStepDef {
    HomePage homePage = new HomePage();
    GlobalParams globalParams = new GlobalParams();
    @Given("page load successfully")
    public void pageLoadSuccessfully() throws InterruptedException {
        if (Objects.equals(globalParams.getBrowserType(), "Edge")) {
            Thread.sleep(2000);
        }
        Assert.assertTrue(homePage.verifyAdmin());
    }

}
