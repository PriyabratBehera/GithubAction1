package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.util.Objects;

public class ReportsPage extends BasePage{
    @AndroidFindBy(xpath = "//*[@text='From']/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"From\"]/following-sibling::XCUIElementTypeOther")
    private MobileElement fromDt;
    @AndroidFindBy(xpath = "//*[@text='To']/following-sibling::android.view.ViewGroup[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"To\"]/following-sibling::XCUIElementTypeOther")
    private MobileElement toDt;
    @AndroidFindBy(xpath = "//*[@text=\"S\"]/preceding-sibling::android.view.ViewGroup/child::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"S\"])[1]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeOther[1]")
    private MobileElement calBackwardBtn;
    @AndroidFindBy(xpath = "//*[@text=\"S\"]/preceding-sibling::android.view.ViewGroup/child::android.view.ViewGroup[2]/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"S\"])[1]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeOther[3]")
    private MobileElement currentYear;
    @AndroidFindBy(xpath = "//XCUIElementTypeButton[@name=\"QLOverlayDoneButtonAccessibilityIdentifier\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"S\"])[1]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeOther[3]")
    private MobileElement doneDownload;

    public void clickOnReport() throws Exception {
        if(Objects.equals(globalParams.getPlatformName(),"iOS")){
            tapOn(383,881);
        }
        else{
            clickByText("Reports");
        }
    }
    public void userSelectFromDt(String dt) throws Exception {
        click(fromDt);
        clickByText("OK");
    }
    public void userSelectFromDrToday() throws Exception {
        click(fromDt);
        clickByText("OK");
    }
    public void userSelectToDtOneMBack() throws Exception {
        click(toDt);
        click(calBackwardBtn);
        clickByText("1");
        clickByText("OK");
    }
    public void userSelectMarThree() throws Exception {
        click(fromDt);
        for(int i=0;i<24;i++){
            if(! currentYear.getText().equals("2024 Mar")){
                click(calBackwardBtn);
            }
            else{
                break;
            }
        }
        clickByText("1");
        clickByText("OK");
    }
    public void userSelectAprThree() throws Exception {
        click(toDt);
        for(int i=0;i<24;i++){
            if(! currentYear.getText().equals("2024 Apr")){
                click(calBackwardBtn);
            }
            else{
                break;
            }
        }
        clickByText("1");
        clickByText("OK");
    }
    public void userSelectMayFirst() throws Exception {
        click(fromDt);
        for(int i=0;i<24;i++){
            if(! currentYear.getText().equals("2024 May")){
                click(calBackwardBtn);
            }
            else{
                break;
            }
        }
        clickByText("1");
        clickByText("OK");
    }
    public void userSelectMayTwentyFive() throws Exception {
        click(toDt);
        for(int i=0;i<24;i++){
            if(! currentYear.getText().equals("2024 May")){
                click(calBackwardBtn);
            }
            else{
                break;
            }
        }
        clickByText("25");
        clickByText("OK");
    }
    public void clickDoneInTranPage() throws Exception {
        if(Objects.equals(globalParams.getPlatformName(),"iOS")){
            click(doneDownload);
        }
        else{
            verifyText("Chrome");
            clickByText("Download reports");
        }
    }
}
