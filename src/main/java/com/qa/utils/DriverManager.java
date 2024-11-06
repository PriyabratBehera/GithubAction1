package com.qa.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.safari.SafariDriver;

import java.io.IOException;
import java.util.Objects;

public class DriverManager {
    private static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();
    private static ThreadLocal<WebDriver> driver1 = new ThreadLocal<>();
    TestUtils utils = new TestUtils();

    public AppiumDriver getDriver() {
        return driver.get();
    }

    public WebDriver getWebDriver() {
        return driver1.get();
    }

    public void setDriver(AppiumDriver driver2) {
        driver.set(driver2);
    }

    public void setWebDriver(WebDriver driver3) {
        driver1.set(driver3);
    }

    public void initializeDriver() throws Exception {
        AppiumDriver driver = null;
        WebDriver driver1 = null;
        GlobalParams params = new GlobalParams();
        PropertyManager props = new PropertyManager();

        if (Objects.equals(params.getPlatformName(), "iOS") || Objects.equals(params.getPlatformName(), "Android")) {
            if (driver == null) {
                try {
                    utils.log().info("initializing Appium driver");
                    switch (params.getPlatformName()) {
                        case "Android":
                            driver = new AndroidDriver(new ServerManager().getServer().getUrl(), new CapabilitiesManager().getCaps());
                            break;
                        case "iOS":
                            driver = new IOSDriver(new ServerManager().getServer().getUrl(), new CapabilitiesManager().getCaps());
                            break;
                    }
                    if (driver == null) {
                        throw new Exception("driver is null. ABORT!!!");
                    }
                    utils.log().info("Driver is initialized");
                    this.driver.set(driver);
                } catch (IOException e) {
                    e.printStackTrace();
                    utils.log().fatal("Driver initialization failure. ABORT !!!!" + e.toString());
                    throw e;
                }
            }

        } else {
            if (driver1 == null) {
                try {
                    if (Objects.equals(params.getBrowserType(), "Chrome")) {
                        utils.log().info("initializing chrome driver");
                    } else if (Objects.equals(params.getBrowserType(), "Edge")) {
                        utils.log().info("initializing edge driver");
                    } else {
                        utils.log().info("initializing driver");
                    }
                    switch (params.getBrowserType()) {
                        case "Chrome":
                            WebDriverManager.chromedriver().setup();
                            driver1 = new ChromeDriver(new CapabilitiesManager().getChromeOptions());
                            break;
                        case "Edge":
                            WebDriverManager.edgedriver().setup();
                            driver1 = new EdgeDriver(new CapabilitiesManager().getEdgeOptions());
                            break;
                    }
                    if (driver1 == null) {
                        if (Objects.equals(params.getBrowserType(), "Chrome")) {
                            throw new Exception("chrome driver is null. ABORT!!!");
                        } else if (Objects.equals(params.getBrowserType(), "Edge")) {
                            throw new Exception("edge driver is null. ABORT!!!");
                        } else {
                            throw new Exception("driver is null. ABORT!!!");
                        }
                    }
                    if (Objects.equals(params.getBrowserType(), "Chrome")) {
                        utils.log().info("Chrome driver is initialized");
                    } else if (Objects.equals(params.getBrowserType(), "Edge")) {
                        utils.log().info("edge driver is initialized");
                    } else {
                        utils.log().info("driver is initialized");
                    }
                    this.driver1.set(driver1);
                } catch (IOException e) {
                    e.printStackTrace();
                    if (Objects.equals(params.getBrowserType(), "Chrome")) {
                        utils.log().fatal(" Chrome driver initialization failure. ABORT !!!!" + e.toString());
                    } else if (Objects.equals(params.getBrowserType(), "Edge")) {
                        utils.log().fatal(" Edge driver initialization failure. ABORT !!!!" + e.toString());
                    } else {
                        utils.log().fatal("Driver initialization failure. ABORT !!!!" + e.toString());
                    }
                    throw e;
                }
            }
        }

    }
}
