package com.qa.adminpages;

import com.qa.utils.TestUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends WebBasePage {
    TestUtils utils = new TestUtils();
    @FindBy(xpath = "//span[@id='username']")
    private WebElement admin;
    @FindBy(xpath = "//span[@id='username']")
    private WebElement dashboard;
    @FindBy(xpath = "//span[text()='Manage Admins']")
    private WebElement manageAdmins;
    @FindBy(xpath = "//span[text()='Admin List']")
    private WebElement adminList;

    public boolean verifyAdmin() {
        return isVisible(admin);
    }


}
