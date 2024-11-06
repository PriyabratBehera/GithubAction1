package com.qa.pages;

import com.qa.utils.GlobalParams;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;

import java.util.List;
import java.util.Objects;

public class MFBasketPage extends BasePage {
    GlobalParams globalParams = new GlobalParams();
    int oneTimeLowAmount;
    int amount;
    @AndroidFindBy(xpath = "//*[@text='Disclaimer:']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Disclaimer: Mutual fund investments are subject to market risks. Please read the scheme information and other related documents before investing. Past performance is not indicative of future returns of the schemes. Please consider your specific investment goal before choosing to invest in a fund.\"]")
    private MobileElement disclaimer;
    @AndroidFindBy(xpath = "//*[@text='Calculate My Returns']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Portfolio Detail\"]")
    private MobileElement calculateReturns;
    @AndroidFindBy(xpath = "//*[@text='Goal Name']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Name of my Goal\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement goalNameInputBx;
    @AndroidFindBy(xpath = "//*[@text='Target Goal Amount']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Target Goal Amount\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement targetAmountBx;
    @AndroidFindBy(xpath = "//*[@text='How much savings you have for this goal?']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Existing Savings for this Goal\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement existingGoalBx;
    @AndroidFindBy(xpath = "//*[@text='Number of years to achieve this Goal']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Number of years to achieve this Goal\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement yearAchieveGoalBx;
    @AndroidFindBy(xpath = "//*[@text='Investment Amount']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Amount\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement investAmtBx;
    @AndroidFindBy(xpath = "//*[@text='Monthly SIP Amount']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Amount\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement monthlyInpBx;
    @AndroidFindBy(xpath = "//*[@text='Aggressive']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Amount\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement aggressive;
    @AndroidFindBy(xpath = "//*[@text='Number\n" +
            "of Securities']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup[4]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Amount\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement securityAllocation;
    @AndroidFindBy(xpath = "//*[@text='Number\n" +
            "of Sectors']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup[4]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Amount\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement sectorAllocation;
    @AndroidFindBy(xpath = "(//*[@text='Moderate'])[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Amount\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement moderateCard;
    @AndroidFindBy(xpath = "//*[@text='Personalised']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Amount\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement personalise;
    @AndroidFindBy(xpath = "//*[@text='All']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Amount\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement allBasket;
    @AndroidFindBy(xpath = "//*[@text='Amount is required']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Amount is required\"])[2]")
    private MobileElement amtIsRequire;
    @AndroidFindBy(xpath = "//*[@text='How to achieve this goal?']/preceding-sibling::android.view.ViewGroup[1]/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Investment needed for this goal\"]/following-sibling::XCUIElementTypeOther")
    private MobileElement closeIconInvNeedForGoal;
    @AndroidFindBy(xpath = "//*[@text='Investment Amount']//following-sibling::android.widget.TextView[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Amount\"]/following-sibling::XCUIElementTypeStaticText")
    private MobileElement minInvAmount;
    @AndroidFindBy(xpath = "//*[@text='Monthly SIP Amount']//following-sibling::android.widget.TextView[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Amount\"]/following-sibling::XCUIElementTypeStaticText")
    private MobileElement monthlyMinAmt;
    @AndroidFindBy(xpath = "//*[@text='Select']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Select\"])[2]")
    private MobileElement sipSelectDate;
    @AndroidFindBy(xpath = "//*[@text='How long do you want to invest?']//following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"How long do you want to invest?\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement InvDurationBx;
    @AndroidFindBy(xpath = "//*[@text='RetirementGoal']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"RetirementGoal\"]")
    private MobileElement ongoing1;
    @AndroidFindBy(xpath = "//*[@text='Goal Name']/following-sibling::android.view.ViewGroup/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Ongoing(1)\"]")
    private MobileElement enterGoalName;
    @AndroidFindBy(xpath = "//*[@text='Select Financial Goal']/following-sibling::android.widget.ScrollView/descendant::android.view.ViewGroup[3]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Ongoing(1)\"]")
    private MobileElement existingBasketGoal;
    @AndroidFindBy(xpath = "(//*[@text='Personalised'])[2]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Goal : Tax Savings Automation Personalize Basket Goal Tenure 2+ years Invest\"])[2]")
    private MobileElement personalizeBasket;
    @AndroidFindBy(xpath = "//*[@text='Personalised Portfolio ']/preceding-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Goal : Tax Savings Automation Personalize Basket Goal Tenure 2+ years Invest\"])[2]")
    private MobileElement personalPortModal;
    @AndroidFindBy(xpath = "//*[@text='Schemes']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Goal : Tax Savings Automation Personalize Basket Goal Tenure 2+ years Invest\"])[2]")
    private MobileElement firstScheme;
    @AndroidFindBy(xpath = "//*[@text='Invest in FundCase']/following-sibling::android.widget.HorizontalScrollView/child::android.view.ViewGroup/child::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Goal : Tax Savings Automation Personalize Basket Goal Tenure 2+ years Invest\"])[2]")
    private MobileElement aquafine;
    @AndroidFindBy(xpath = "//*[@text='SmartStart Wealth']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Goal : Tax Savings Automation Personalize Basket Goal Tenure 2+ years Invest\"])[2]")
    private MobileElement smartStartWealth;
    @AndroidFindBy(xpath = "//*[@text='Automation Testing Basket']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Goal : Tax Savings Automation Personalize Basket Goal Tenure 2+ years Invest\"])[2]")
    private MobileElement automationTesting;
    @AndroidFindBy(xpath = "//*[@text='Invest in FundCase']/following-sibling::android.widget.HorizontalScrollView/child::android.view.ViewGroup/child::android.view.ViewGroup[2]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Goal : Tax Savings Automation Personalize Basket Goal Tenure 2+ years Invest\"])[2]")
    private MobileElement smartStartCollege;
    @AndroidFindBy(xpath = "//*[@text='Suggested Amount']/following-sibling::android.view.ViewGroup[1]/android.view.ViewGroup[3]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Goal : Tax Savings Automation Personalize Basket Goal Tenure 2+ years Invest\"])[2]")
    private MobileElement suggestAmtBx;
    @AndroidFindBy(xpath = "//*[@text='Authenticate Using']")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Netbanking'")
    private MobileElement netBankingViaBankDetails;
    @AndroidFindBy(xpath = "//*[@text='Netbanking']")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Netbanking'")
    private MobileElement netBankingAllBanks;
    @AndroidFindBy(xpath = "//*[@text='Authenticate']")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Netbanking'")
    private MobileElement authenticateBtn;
    @AndroidFindBy(xpath = "//*[@text='All Payment Options']/following-sibling::android.view.View")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Netbanking'")
    private MobileElement selectBank;
    @AndroidFindBy(xpath = "//*[@text='All Payment Options']/following-sibling::android.view.View/android.view.View[2]")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Netbanking'")
    private MobileElement bankName;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"View SIPs\"]")
    @AndroidFindBy(xpath = "//*[@text='Purchase Processing']")
    private MobileElement purchaseSuccessfulPage;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"View SIPs\"]")
    @AndroidFindBy(xpath = "//*[@text='How long do you want to invest?']/following-sibling::android.view.ViewGroup[1]/android.view.ViewGroup[3]")
    private MobileElement invDurationBx;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"View SIPs\"]")
    @AndroidFindBy(xpath = "//*[@text='Enter OTP to Confirm']/following-sibling::android.widget.TextView[1]")
    private MobileElement mfBasketOTPText;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"View SIPs\"]")
    @AndroidFindBy(xpath = "//*[@text='Enter OTP to Confirm']/following-sibling::android.widget.EditText")
    private MobileElement mfBasketOTPTBx;

    public void scrollToDisclaimer() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andIosScroll(disclaimer, "up", calculateReturns);

        } else {
            andIosScroll(disclaimer, "up", calculateReturns);
        }
    }

    public void enterTargetAmt(String tarGoalAmt) {
        clear(targetAmountBx);
        sendKeys(targetAmountBx, tarGoalAmt);
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            pressEnter();
        }
    }

    public void enterExistingAmt(String existingGaolAmt) {
        clear(existingGoalBx);
        sendKeys(existingGoalBx, existingGaolAmt);
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            pressEnter();
        }
    }

    public void enterNoYrAchieveGoal(String achieveGoal) {
        clear(yearAchieveGoalBx);
        sendKeys(yearAchieveGoalBx, achieveGoal);
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            pressEnter();
        }
    }

    public void enterLowerThanMinEnvAmt() {
        String invAmt = minInvAmount.getText();
        String amt = invAmt.split("Min. ₹")[1];
        amount = Integer.parseInt(amt);
        oneTimeLowAmount = Integer.parseInt(amt) - 100;
        clear(investAmtBx);
        sendKeys(investAmtBx, Integer.toString(oneTimeLowAmount));
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            pressEnter();
        }
    }

    public void enterHigherThanMinEnvAmt() {
        clear(investAmtBx);
        sendKeys(investAmtBx, Long.toString(9999999999L));
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            pressEnter();
        }
    }

    public boolean verifyValidAmtReq() {
        return isVisible(amtIsRequire);
    }

    public void closeInvNeedForGoal() {
        click(closeIconInvNeedForGoal);
    }

    public void verifyLowerMinValida() throws Exception {
        verifyStaticText("Amount must be greater than or equal to " + amount);
    }

    public void selectFirstInvDt() throws Exception {
        click(sipSelectDate);
        clickByText("5");
    }

    public void enterInvestmentDuration(String duration) throws Exception {
        clear(InvDurationBx);
        sendKeys(InvDurationBx, duration);
        clickStaticText("How long do you want to invest?");
    }

    public void verifyGoalExist() throws Exception {
        if (isVisible(ongoing1)) {
            SetGoalsPage setGoalsPage = new SetGoalsPage();
            setGoalsPage.clickOneFinancialGoal();
            setGoalsPage.clickEditIcon();
            Thread.sleep(2000);
            setGoalsPage.clickDeleteIcon();
            Thread.sleep(3000);
            new CreateBudgetPage().clickYesButton();
            Thread.sleep(3000);
        }
        new MutualFundPage().goBackFromScreen("Financial Goals");
    }

    public void clickPersonalizeBasket() {
        click(personalizeBasket);
    }

    public void closePersonPortModel() {
        click(personalPortModal);
    }

    public void scrollToSmartWealth() throws InterruptedException {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            iOSSwipe(smartStartWealth, "left", aquafine);
        } else {
            androidSwipe(smartStartCollege, aquafine, automationTesting);
        }
        click(automationTesting);
    }

    public void clickFirstSc() {
        click(firstScheme);
    }

    public void createGoal(String category,String goalName) throws Exception {
        String xpath="";
        if(Objects.equals(globalParams.getPlatformName(),"Android")){
            xpath="//*[@text='" +goalName+ "']";
        }
        else{
            xpath="//XCUIElementTypeOther[@name='"+ goalName +"']";
        }
        if (!isElementExist(xpath)) {
            SetGoalsPage setGoalsPage = new SetGoalsPage();
            clickByText("Add New Goal");
            clickByText(category);
            setGoalsPage.enterGoalAmount("2000000");
            clickByText("Yes");
            setGoalsPage.enterAchieveGoalAmt("2");
            setGoalsPage.enterRateOfReturn("10");
            setGoalsPage.clickNoExistGoal();
            clickByText("Show the Plan");
            clickByText("Save this Goal");
            sendKeys(enterGoalName, goalName);
            clickByText("Save Now");
            clickByText("View My Goals");

        }
        new MutualFundPage().goBackFromScreen("Financial Goals");
    }

    public void clickExistingBasketGoal() {
        click(existingBasketGoal);
    }

    public void enterLowerMontAmt() {
        String invAmt = monthlyMinAmt.getText();
        String amt = invAmt.split("Min. ₹")[1];
        amount = Integer.parseInt(amt);
        oneTimeLowAmount = Integer.parseInt(amt) - 100;
        clear(monthlyInpBx);
        sendKeys(monthlyInpBx, Integer.toString(oneTimeLowAmount));
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            pressEnter();
        }
    }

    public void enterHigherMontAmt() {
        clear(monthlyInpBx);
        sendKeys(monthlyInpBx, "9999999999");
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            pressEnter();
        }
    }

    public void swipeTillPersonalised() throws InterruptedException {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            iOSSwipe(aggressive, "left", allBasket);
        } else {
            androidSwipe(aggressive, allBasket, personalise);
        }
    }

    public void verifyModerateCard() {
        Assert.assertTrue(isVisible(moderateCard));
    }

    public void verifyAggressiveCard() {
        Assert.assertTrue(isVisible(aggressive));
    }

    public void expandSecurity() {
        click(securityAllocation);
    }

    public void expandSector() {
        click(sectorAllocation);
    }

    public void enterGoalName(String goalName) {
        clear(goalNameInputBx);
        sendKeys(goalNameInputBx, goalName);
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            pressEnter();
        }
    }

    public void selectSuggestAmount() {
        waitForVisibility(suggestAmtBx,6);
        click(suggestAmtBx);
    }

    public void doPayment() throws Exception {
        waitForEitherElementToBeVisible(netBankingViaBankDetails, netBankingAllBanks, 15);
        if (isVisible(netBankingViaBankDetails)) {
            click(netBankingAllBanks);
            click(authenticateBtn);
            Thread.sleep(5000);
            clickByText("Success");
        } else if (isVisible(netBankingAllBanks)) {
            click(selectBank);
            click(bankName);
            if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
                if (isElementExist("//XCUIElementTypeButton[@name='Continue & Pay']")) {
                    new MutualFundPage().clickButtonTypeText("Continue & Pay");
                }
            } else {
                if (isElementExist("//*[@text='Continue & Pay']")) {
                    new MutualFundPage().clickButtonTypeText("Continue & Pay");
                }
            }
            Thread.sleep(5000);
            clickByText("Success");
        }
    }
    public void waitForMfBuySuccessfulSc(){
        if (!isVisible(purchaseSuccessfulPage)) {
            waitForVisibility(purchaseSuccessfulPage, 12);
        }
    }
    public void selectInvDuration() throws InterruptedException {
        Thread.sleep(3000);
        click(invDurationBx);
    }
    public void enterMfOTP(){
        String otp = mfBasketOTPText.getText();
        sendKeys(mfBasketOTPTBx, otp);
    }

    }



