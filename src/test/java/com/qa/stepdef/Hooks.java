package com.qa.stepdef;

import com.qa.pages.BasePage;
import com.qa.utils.*;
import com.qa.adminpages.LoginPage;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.*;
import java.util.Objects;
import java.util.Properties;

public class Hooks {

    GlobalParams params = new GlobalParams();

    @Before
    public void initialize() throws Exception {
//        new VideoManager().startRecording();
        if (Objects.equals(params.getPlatformName(), "Android") || Objects.equals(params.getPlatformName(), "iOS")) {
            new BasePage().launchApp();
//            new LoginPage().clickOkSecurityAlert();
        } else if (Objects.equals(params.getPlatformName(), "Web")) {
            new DriverManager().initializeDriver();
            Properties properties = new PropertyManager().getProps();
            LoginPage loginPage = new LoginPage();
            if (Objects.equals(params.getDeviceName(), "Admin")) {
                new DriverManager().getWebDriver().get(properties.getProperty("adminUrl"));
            } else if (Objects.equals(params.getDeviceName(), "Floatr")) {
                new DriverManager().getWebDriver().get(properties.getProperty("floatrUrl"));
            }
//            loginPage.loginFloatrAccount();
        }
    }

    @After
    public void quit(Scenario scenario) throws IOException, InterruptedException {
        if (Objects.equals(params.getPlatformName(), "Android") || Objects.equals(params.getPlatformName(), "iOS")) {
            if (scenario.isFailed()) {
                byte[] screenshot = new DriverManager().getDriver().getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName());
//                if (Objects.equals(params.getPlatformName(), "Android")) {
//                    Thread.sleep(10000);
//                }
            }
//        new VideoManager().stopRecording(scenario.getName());
//            new BasePage().closeApp();
            new BasePage().terminateApp();

        } else if (Objects.equals(params.getPlatformName(), "Web")) {
            if (scenario.isFailed()) {
                byte[] screenshot = ((TakesScreenshot) new DriverManager().getWebDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName());
            }
            new DriverManager().getWebDriver().quit();
        }

    }

}

