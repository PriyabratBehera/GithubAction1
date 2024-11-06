package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.Objects;

public class FinancialPlanPage extends BasePage {

    @AndroidFindBy(xpath = "//*[@text='Review\n" +
            "Financial Plan']")
    private MobileElement financialPlan;
    @AndroidFindBy(xpath = "//*[@text='My Date of Birth']/following-sibling::android.view.ViewGroup[1]/android.widget.ImageView")
    private MobileElement DOBBx;
    @AndroidFindBy(xpath = "//*[@text=\"S\"]/preceding-sibling::android.view.ViewGroup/child::android.view.ViewGroup[2]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"S\"])[1]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther")
    private MobileElement currentYear;
    @AndroidFindBy(xpath = "//*[@text=\"scroll down\"]/preceding-sibling::android.widget.ScrollView/descendant::android.view.ViewGroup[4]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"scroll down\"]/preceding-sibling::XCUIElementTypeOther[2]/descendant::XCUIElementTypeOther[8]")
    private MobileElement year;
    @AndroidFindBy(xpath = "//*[@text=\"1997\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"1997\"])[1]")
    private MobileElement dt1998;
    @AndroidFindBy(xpath = "//*[@text='Monthly Net Income']/following-sibling::android.view.ViewGroup/descendant::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"1997\"])[1]")
    private MobileElement monthlyIncBx;
    @AndroidFindBy(xpath = "//*[@text='Monthly Savings']/following-sibling::android.view.ViewGroup/descendant::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"1997\"])[1]")
    private MobileElement monthlySavingBx;
    @AndroidFindBy(xpath = "//*[@text='Do you have\n" +
            "dependent children']/following-sibling::android.view.ViewGroup/android.view.ViewGroup[2]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"1997\"])[1]")
    private MobileElement noDependant;
    @AndroidFindBy(xpath = "//*[@text='Do you have\n" +
            "dependent children']/following-sibling::android.view.ViewGroup/android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"1997\"])[1]")
    private MobileElement yesDependant;
    @AndroidFindBy(xpath = "//*[@text=\"My Date of Birth\"]/following-sibling::android.view.ViewGroup/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"1997\"])[1]")
    private MobileElement DOBYear;
    @AndroidFindBy(xpath = "//*[@text=\"Protection against unknowns\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"1997\"])[1]")
    private MobileElement protectUnknown;
    @AndroidFindBy(xpath = "(//*[contains(@text,'For')])[2]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"1997\"])[1]")
    private MobileElement weedingGoal;
    @AndroidFindBy(xpath = "(//*[contains(@text,'For')])[3]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"1997\"])[1]")
    private MobileElement weedingGoal2;
    @AndroidFindBy(xpath = "//*[@text=\"For a financially stable retirement\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"1997\"])[1]")
    private MobileElement stableRetire;
    @AndroidFindBy(xpath = "//*[@text=\"Education Fund\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"1997\"])[1]")
    private MobileElement eduFund;
    @AndroidFindBy(xpath = "//*[@text='Name']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"1997\"])[1]")
    private MobileElement childNameBx;
    @AndroidFindBy(xpath = "//*[@text='Age']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"1997\"])[1]")
    private MobileElement childAgeBx;
    @AndroidFindBy(xpath = "//*[@text='Wants to study']/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"1997\"])[1]")
    private MobileElement wantsToStudy;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Financial Goals'])[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
    @AndroidFindBy(xpath = "//*[@text='Financial Goals']//following-sibling::android.view.ViewGroup")
    private MobileElement editIcon;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"My Finantial Goal\"]/ancestor::XCUIElementTypeOther[2]/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[2]")
    @AndroidFindBy(xpath = "//*[@text='My Financial Goal']/ancestor::android.view.ViewGroup[3]/descendant::android.view.ViewGroup[4]")
    private MobileElement deleteIcon;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"My Finantial Goal\"]/ancestor::XCUIElementTypeOther[2]/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[2]")
    @AndroidFindBy(xpath = "//*[@text='Goal Name']/following-sibling::android.view.ViewGroup/descendant::android.widget.EditText")
    private MobileElement goalNameBx;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"My Finantial Goal\"]/ancestor::XCUIElementTypeOther[2]/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[2]")
    @AndroidFindBy(xpath = "//*[@text='Emergency Funds']/preceding-sibling::android.view.ViewGroup[1]/android.widget.TextView")
    private MobileElement emergencyGoalSave;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"My Finantial Goal\"]/ancestor::XCUIElementTypeOther[2]/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[2]")
    @AndroidFindBy(xpath = "//*[@text='Retirement Fund']/preceding-sibling::android.view.ViewGroup[1]/android.widget.TextView")
    private MobileElement retirementGoalSave;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"My Finantial Goal\"]/ancestor::XCUIElementTypeOther[2]/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[2]")
    @AndroidFindBy(xpath = "(//*[@text='Education Fund'])[1]/preceding-sibling::android.view.ViewGroup[1]/android.widget.TextView")
    private MobileElement educationGoalSave;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"My Finantial Goal\"]/ancestor::XCUIElementTypeOther[2]/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[1]")
    @AndroidFindBy(xpath = "(//*[@text='Wedding Fund'])[1]/preceding-sibling::android.view.ViewGroup[1]")
    private MobileElement weddingGoalSave;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"My Finantial Goal\"]/ancestor::XCUIElementTypeOther[2]/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[1]")
    @AndroidFindBy(xpath = "(//*[@text='Wedding Fund'])[2]/preceding-sibling::android.view.ViewGroup[1]/android.widget.TextView")
    private MobileElement weddingGoalSave1;
    @AndroidFindBy(xpath = "//*[@text='Education Fund']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Ongoing(1)\"]")
    private MobileElement eduGoal;
    @AndroidFindBy(xpath = "//*[@text='Goal Name']/following-sibling::android.view.ViewGroup/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Ongoing(1)\"]")
    private MobileElement enterGoalName;
    @AndroidFindBy(xpath = "//*[@text='Goal Name']/following-sibling::android.view.ViewGroup/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Ongoing(1)\"]")
    private MobileElement goalNameInputBx;
    @AndroidFindBy(xpath = "(//*[@text='Wedding Fund'])[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Ongoing(1)\"]")
    private MobileElement weedingFund;
    @AndroidFindBy(xpath = "//*[@text='Education Fund']/following-sibling::android.widget.TextView[3]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Ongoing(1)\"]")
    private MobileElement educationGoalAmt;

    public void clickFinancialPlan() throws InterruptedException {
        if (!isVisible(financialPlan)) {
            if (Objects.equals(globalParams.getPlatformName(), "Android")) {
                swipe(491, 1749, 523, 177, 1000);
            } else {
                iOSScrollToElementByName(financialPlan, "up", "Review\n" +
                        "Financial Plan");
            }
        }
        click(financialPlan);
    }

    public void enterDob() throws Exception {
        click(DOBBx);
        click(currentYear);
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andScrollToElementUsingUiScrollable("text", "1996");
            click(year);
        } else {
            scrollToElement(dt1998, "up", year, 20000, 10);
            click(dt1998);
        }
        clickByText("1");
        clickByText("OK");
    }

    public String userStoreYear() {
        return DOBYear.getText();
    }

    public void enterMonthlyIncome(String incAmt) {
        clear(monthlyIncBx);
        sendKeys(monthlyIncBx, incAmt);
    }

    public void enterMonthlySaving(String savAmt) {
        clear(monthlySavingBx);
        sendKeys(monthlySavingBx, savAmt);
    }

    public void clickNoDependant() {
        click(noDependant);
    }

    public void clickYesDependant() {
        click(yesDependant);
    }

    public void clickViewPlan() {
        tapOn(527, 2123);
    }

    public void scrollToRetire() throws InterruptedException {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            scrollInAndroid(stableRetire, protectUnknown);
        }
    }

    public String verifyAge() {
        String text = "With current age 27 and retirement age of 60 years";
        return text;
    }

    public String verifyAgePlusOne() {
        String text = "With current age 28 and retirement age of 60 years";
        return text;
    }

    public boolean unableToSeeEduAndWed() {
        return isVisible(eduFund);
    }

    public void enterChildName(String childName) {
        clear(childNameBx);
        sendKeys(childNameBx, childName);
    }

    public void enterChildAge(String childAge) {
        clear(childAgeBx);
        sendKeys(childAgeBx, childAge);
    }

    public void selectCourse(String childAge) throws Exception {
        click(wantsToStudy);
        if (!isElementExist("//*[@text='" + childAge + "']")) {
            if (Objects.equals(globalParams.getPlatformName(), "Android")) {
                andScrollToElementUsingUiScrollable("text", childAge);
            } else {
//            iOSScrollToElementByName(kotakMahindra, "up", name);
            }
        }
        clickByText(childAge);
    }

    public void enterSpouseAge(String childAge) {
        clear(childAgeBx);
        sendKeys(childAgeBx, childAge);
    }

    public void deleteEmergencyFundGoal() throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "(//XCUIElementTypeOther[contains(@name,\"Other Goal\")])[23]";
        } else {
            xpath = "//*[@text='Emergency Fund']";
        }
        if (isElementExist(xpath)) {
            click(getElement(xpath));
            click(editIcon);
            click(deleteIcon);
            Thread.sleep(2000);
            new CreateBudgetPage().clickYesButton();
            Thread.sleep(2000);
            verifyStaticText("Financial Goals");
        }
    }

    public void enterEmergencyGoal(String goalName) {
        clear(goalNameBx);
        sendKeys(goalNameBx, goalName);
    }

    public void verifyEmergencyGoalSave() {
        waitForVisibility(emergencyGoalSave, 15);
        Assert.assertEquals("Saved", emergencyGoalSave.getText());
    }

    public void verifyRetirementGoalSave() {
        waitForVisibility(retirementGoalSave, 15);
        Assert.assertEquals("Saved", retirementGoalSave.getText());
    }

    public void verifyEducationalGoalSave() {
        waitForVisibility(educationGoalSave, 15);
        Assert.assertEquals(educationGoalSave.getText(), "Saved");
    }

    public void verifyWeddingGoalSave() {
        waitForVisibility(weddingGoalSave1, 15);
        Assert.assertEquals(weddingGoalSave1.getText(), "Saved");
    }

    public void deleteRetirementFundGoal() throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "(//XCUIElementTypeOther[contains(@name,\"Other Goal\")])[23]";
        } else {
            xpath = "//*[@text='Retirement Fund']";
        }
        if (isElementExist(xpath)) {
            click(getElement(xpath));
            click(editIcon);
            click(deleteIcon);
            Thread.sleep(2000);
            new CreateBudgetPage().clickYesButton();
            Thread.sleep(2000);
            verifyStaticText("Financial Goals");
        }
    }

    public void deleteEducationalFundGoal() throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "(//XCUIElementTypeOther[contains(@name,\"Other Goal\")])[23]";
        } else {
            xpath = "//*[@text='Education Fund']";
        }
        if (isElementExist(xpath)) {
            click(getElement(xpath));
            click(editIcon);
            click(deleteIcon);
            Thread.sleep(2000);
            new CreateBudgetPage().clickYesButton();
            Thread.sleep(2000);
            verifyStaticText("Financial Goals");
        }
    }

    public void deleteWeddingFundGoal() throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "(//XCUIElementTypeOther[contains(@name,\"Other Goal\")])[23]";
        } else {
            xpath = "//*[@text='Wedding Fund']";
        }
        if (isElementExist(xpath)) {
            click(getElement(xpath));
            click(editIcon);
            click(deleteIcon);
            new CreateBudgetPage().clickYesButton();
            Thread.sleep(2000);
            verifyStaticText("Financial Goals");
        }
    }

    public void createEduGoal() throws Exception {
        if (!isVisible(eduGoal)) {
            SetGoalsPage setGoalsPage = new SetGoalsPage();
            clickByText("Add New Goal");
            clickByText("Education");
            setGoalsPage.enterGoalAmount("2000000");
            clickByText("Yes");
            setGoalsPage.enterAchieveGoalAmt("2");
            setGoalsPage.enterRateOfReturn("10");
            setGoalsPage.clickNoExistGoal();
            clickByText("Show the Plan");
            clickByText("Save this Goal");
            sendKeys(enterGoalName, "Education Fund");
            clickByText("Save Now");
            clickByText("View My Goals");

        }
    }

    public void enterGoalName() {
        sendKeys(goalNameInputBx, "For wedding");
    }

    public void verifyUnsavedGoal() {
        Assert.assertNotEquals(educationGoalSave.getText(), "Saved");
    }

    public void clickWeedingFund() {
        click(weedingFund);
    }

    public void scrollToWeeding() {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            scrollInAndroid(weedingGoal2, weedingGoal);
        }
    }

    public String storeEducationFund() {
        return getText(educationGoalAmt, ": Education Gaol Amount");
    }

    public void changeEducationGoal() throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "(//XCUIElementTypeOther[contains(@name,\"Other Goal\")])[23]";
        } else {
            xpath = "//*[@text='Education Fund']";
        }
        if (isElementExist(xpath)) {
            click(getElement(xpath));
            click(editIcon);
            clickByText("Re-Plan");
            new SetGoalsPage().enterGoalAmount("5000");
            clickByText("Edit");
            clickByText("Save this Goal");
            clickByText("Save Now");
            clickByText("View My Goals");
        } else {
            SetGoalsPage setGoalsPage = new SetGoalsPage();
            clickByText("Add New Goal");
            clickByText("Education");
            setGoalsPage.enterGoalAmount("5000");
            clickByText("Yes");
            setGoalsPage.enterAchieveGoalAmt("2");
            setGoalsPage.enterRateOfReturn("10");
            setGoalsPage.clickNoExistGoal();
            clickByText("Show the Plan");
            clickByText("Save this Goal");
            sendKeys(enterGoalName, "Education Fund");
            clickByText("Save Now");
            clickByText("View My Goals");
        }
    }

}
