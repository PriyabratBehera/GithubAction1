package com.qa.adminpages;

import com.qa.utils.GlobalParams;
import com.qa.utils.PropertyManager;
import com.qa.utils.TestUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class LoginPage extends WebBasePage {
    TestUtils utils = new TestUtils();
    GlobalParams params = new GlobalParams();
    @FindBy(xpath = "//*[@id=\"yourUsername\"]")
    private WebElement usrName;
    @FindBy(xpath = "//*[@id=\"yourPassword\"]")
    private WebElement password;
    @FindBy(xpath = "//*[@id=\"loginbtn\"]")
    private WebElement loginBtn;
    @FindBy(xpath = "//*[@id=\"ma\"]/div[1]/div/div/h1")
    private WebElement dashBoard;

    public void loginFloatrAccount() throws IOException {
        Properties properties = new PropertyManager().getProps();
        if (Objects.equals(params.getDeviceName(), "Admin")) {
            sendKeys(usrName, properties.getProperty("adminUserName"));
            sendKeys(password, properties.getProperty("adminPassword"));
            click(loginBtn);
        }
        else if (Objects.equals(params.getDeviceName(), "Floatr")) {
            sendKeys(usrName, properties.getProperty("floatrUserName"));
            sendKeys(password, properties.getProperty("floatrPassword"));
            click(loginBtn);
        }
    }

}

