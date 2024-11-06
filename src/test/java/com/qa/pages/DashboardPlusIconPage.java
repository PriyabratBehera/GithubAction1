package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class DashboardPlusIconPage extends BasePage{
    @AndroidFindBy(xpath = "//*[@text='Invest in\n" +
            "Mutual Fund']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Invest in\n" +
            "Mutual Fund\"]")
    private MobileElement investInMutual;
    @AndroidFindBy(xpath = "//*[@text='Invest in Mutual\n" +
            "Fund Baskets']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Invest in Mutual\n" +
            "Fund Baskets\"]")
    private MobileElement investInMutualBasket;
    @AndroidFindBy(xpath = "//*[@text='Invest in\n" +
            "Gold & Silver']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Invest in\n" +
            "Gold & Silver\"]")
    private MobileElement investInGoldSilver;
    @AndroidFindBy(xpath = "//*[@text='Import  Mutual\n" +
            "Funds']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Import  Mutual\n" +
            "Funds\"]")
    private MobileElement importMF;
    @AndroidFindBy(xpath = "//*[@text='Add Insurance\n" +
            "Policies']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Add Insurance\n" +
            "Policies\"]")
    private MobileElement addPolicy;
    @AndroidFindBy(xpath = "//*[@text='Pay Utility Bills']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Pay Utility Bills\"])[3]")
    private MobileElement payUtilityBill;
    @AndroidFindBy(xpath = "//*[@text='Download Reports']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Download Reports\"])[3]")
    private MobileElement downloadReport;

    public void clickInvestInMutual(){
        click(investInMutual);
    }
    public void clickInvestInMutualBasket(){
        click(investInMutualBasket);
    }
    public void clickInvestInGoldSilver(){
        click(investInGoldSilver);
    }
    public void clickImportMF(){
        click(importMF);
    }
    public void clickAddPolicy(){
        click(addPolicy);
    }
    public void clickPayUtilityBills(){
        click(payUtilityBill);
    }
    public void clickDownloadReports(){
        click(downloadReport);
    }

}
