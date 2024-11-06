package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.testng.Assert;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class RiskScorePage extends BasePage {

    @AndroidFindBy(xpath = "//*[@text=\"Date of Birth\"]/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Date of Birth\"]/following-sibling::XCUIElementTypeOther")
    private MobileElement dateOfBirth;
    @AndroidFindBy(xpath = "//*[@text=\"S\"]/preceding-sibling::android.view.ViewGroup/child::android.view.ViewGroup[2]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"S\"])[1]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther")
    private MobileElement currentYear;
    @AndroidFindBy(xpath = "//*[@text=\"scroll down\"]/preceding-sibling::android.widget.ScrollView/descendant::android.view.ViewGroup[4]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"scroll down\"]/preceding-sibling::XCUIElementTypeOther[2]/descendant::XCUIElementTypeOther[8]")
    private MobileElement dtPicker;
    @AndroidFindBy(xpath = "//*[@text=\"1997\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"1997\"])[1]")
    private MobileElement dt1998;
    @AndroidFindBy(xpath = "//*[@text=\"Do it Later\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"1997\"])[1]")
    private MobileElement doItLater;
    @AndroidFindBy(xpath = "//*[@text='Risk Profiling-\n" +
            "My Risk Score']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Check your personal risk score Discover about your risk tolerance\"])[2]")
    private MobileElement checkRisk;

    public void enterDateOfBirth() throws Exception {
        click(dateOfBirth);
        click(currentYear);
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andScrollToElementUsingUiScrollable("text", "2002");
            click(dtPicker);
        } else {
            scrollToElement(dt1998, "up", dtPicker, 20000, 10);
            click(dt1998);
        }
        clickByText("1");
        clickByText("OK");
    }

    public void clickDoItLater() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            waitForVisibility(doItLater,10);
            click(doItLater);
        }

    }

    public void clickPersonalRisk() {
        if (!isVisible(checkRisk)) {
            if (Objects.equals(globalParams.getPlatformName(), "Android")) {
                andScrollToElementUsingUiScrollable("text", "Risk Profiling-\n" +
                        "My Risk Score");
            }
        }
        click(checkRisk);
    }

    public void verifyPersonalRisk() {
        Assert.assertTrue(isVisible(checkRisk));
    }
}


