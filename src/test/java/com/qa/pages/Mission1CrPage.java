

package com.qa.pages;

import com.qa.stepdef.DigitalGoldStepDef;
import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.util.Objects;

public class Mission1CrPage extends BasePage {

    TestUtils utils = new TestUtils();

    GlobalParams globalParams = new GlobalParams();

    @AndroidFindBy(xpath = "//*[@text='What do I need to do?']/parent::android.view.ViewGroup/android.view.ViewGroup[5]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"What do I need to do?\"]/following-sibling::XCUIElementTypeOther[2]")
    private MobileElement letsCalculate;

    @AndroidFindBy(xpath = "//*[@text='Monthly SIP Date']//following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Monthly SIP Date']/following-sibling::XCUIElementTypeOther")
    private MobileElement monthlySIPDate;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Authenticate & Save'])[2]")
    @AndroidFindBy(xpath = "//*[@text='Authenticate & Save']")
    private MobileElement AuthenticateAndSave;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Goal Based Investing\"]/ancestor::XCUIElementTypeOther[3]/preceding-sibling::XCUIElementTypeOther[1]/XCUIElementTypeOther[2]")
    @AndroidFindBy(xpath = "//*[@text='Goal Based Investing']/parent::android.view.ViewGroup/child::android.view.ViewGroup[1]/android.view.ViewGroup[2]")
    private MobileElement becomeACrorePatiBanner;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Where should I invest?']")
    @AndroidFindBy(xpath = "//*[@text='Where should I invest?']")
    private MobileElement whereIShouldInvest;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='How should I start?']")
    @AndroidFindBy(xpath = "//*[@text='How should I start?']")
    private MobileElement howShouldIStart;

    @iOSXCUITFindBy(iOSNsPredicate = "value == '20 years'")
    @AndroidFindBy(xpath = "//*[@text='20 years']")
    private MobileElement numberOfYearsIWantToInvest;

    @iOSXCUITFindBy(iOSNsPredicate = "value == '88 years'")
    @AndroidFindBy(xpath = "//*[@text='88 years']")
    private MobileElement eightyEighty;

    @iOSXCUITFindBy(iOSNsPredicate = "value == '55 years'")
    @AndroidFindBy(xpath = "//*[@text='55 years']")
    private MobileElement fiftyFive;

    @iOSXCUITFindBy(iOSNsPredicate = "//XCUIElementTypeStaticText[@name=\"Number of years I want to invest for this goal\"]/ancestor::XCUIElementTypeOther[1]/following-sibling::XCUIElementTypeOther[2]/descendant::XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='88 years']")
    private MobileElement yearIWantToInvest;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Investment per month (₹)'])[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='₹6,000']")
    private MobileElement monthlyInvest;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='6,000'])[2]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='6,000']")
    private MobileElement monthlyInvestAfterClear;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Every year I will increase my investment by (%)'])[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='10%']")
    private MobileElement yearlyIncreaseInvest;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='10.00%'])[2]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='10.00%']")
    private MobileElement yearlyIncreaseInvestAfterClear;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Expected annual rate of return on investment (% RoI)'])[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='11%']")
    private MobileElement annualRateOfReturn;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='11.00%'])[2]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='11.00%']")
    private MobileElement annualRateOfReturnAfterClear;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Horizontal scroll bar, 1 page']")
    @AndroidFindBy(xpath = "//*[@text='Invest for this Goal']")
    private MobileElement investForThisGoal;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Create SIP']")
    @AndroidFindBy(xpath = "//*[@text='Create SIP']")
    private MobileElement createSIP;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"SIP Duration   \"]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='240 Months']")
    private MobileElement defaultSIPDuration;

    @AndroidFindBy(xpath = "//*[@text='Investment Maturity Calculator']/ancestor::android.view.ViewGroup[2]/preceding-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[3]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Investment Maturity Calculator']/parent::XCUIElementTypeOther/ancestor::XCUIElementTypeOther[5]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeOther[5]")
    private MobileElement BackIconInvestmentMaturityScreen;

    @AndroidFindBy(xpath = "//*[@text='How should I start?']/parent::android.view.ViewGroup/ancestor::android.view.ViewGroup[2]/preceding-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[3]")
    private MobileElement backIconMission1CrScreen;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='CALCULATE1CR']")
    @AndroidFindBy(xpath = "//*[@text='Calculate']")
    private MobileElement calculate;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeKey[@name='Delete']")
    private MobileElement deleteButtonOfIos;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='ICICI Bank']")
    @AndroidFindBy(xpath = "//*[@text='Via Bank Account and Netbanking details']")
    private MobileElement iciciBank;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"What do I need to do?\"]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeImage")
    @AndroidFindBy(xpath = "//*[@text='What do I need to do?']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/android.widget.ImageView")
    private MobileElement withOnly200;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"is not available for transaction\"]/parent::XCUIElementTypeOther/parent::XCUIElementTypeOther/XCUIElementTypeOther[1]")
    @AndroidFindBy(xpath = "//*[@text='is not available for transaction']/preceding-sibling::android.view.ViewGroup/android.view.ViewGroup")
    private MobileElement notAvailableTransaction;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Set Financial Goals\"]")
    @AndroidFindBy(xpath = "//*[@text='Set Financial Goals']")
    private MobileElement setFinancialGoal;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Personal Financial Planners\"]")
    @AndroidFindBy(xpath = "//*[@text='Personal Financial Planners']")
    private MobileElement personalFinGoal;
    @AndroidFindBy(xpath = "//*[@text='Goal Based Investing']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Goal Based Investing\"]")
    private MobileElement goalBasedInvesting;
    @AndroidFindBy(xpath = "//*[@text='Pay Now']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Pay Now']")
    private MobileElement payNow;
    public void clickLetsCalculate() {
        click(letsCalculate);
    }

    public void selectMonthlySIPDate(String date) throws Exception {
        click(monthlySIPDate);
        new BasePage().clickByText(date);
    }

    public void scrollDown() throws InterruptedException {
        swipe(197, 802, 194, 144, 500);
    }

    public void scrollToBecomeACrorePatiBanner() throws Exception {
//        for (int i = 0; i < 10; i++) {
//            scrollDown();
//            if (isVisible(becomeACrorePatiBanner)) {
//                break;
//            }
//        }
        if(Objects.equals(globalParams.getPlatformName(),"Android")){
            scrollInAndroid(goalBasedInvesting,204,793,201,252);
        }
        scrollToElement(goalBasedInvesting,"up",setFinancialGoal,2000,10);
    }

    public void clickBecomeACrorePati() {
        click(becomeACrorePatiBanner);
    }

    public void scrollToViewWhereIShouldInvest() throws Exception {
        if(Objects.equals(globalParams.getPlatformName(),"Android")){
            scrollInAndroid(whereIShouldInvest,204,793,201,252);
        }
        scrollToElement(whereIShouldInvest, "up", howShouldIStart,3000,10);
    }

    public boolean verifyInvestPerMonth() {
        return isVisible(monthlyInvest);
    }

    public boolean verifyNumberOfYearsIWantToInvest() {
        return isVisible(numberOfYearsIWantToInvest);
    }

    public boolean verifyIncreaseInvestmentEveryYear() {
        return isVisible(yearlyIncreaseInvest);
    }

    public boolean verifyAnnualRateOfReturn() {
        return isVisible(annualRateOfReturn);
    }

    public void enterNumberOfYearsInvest(String year) throws Exception {
        clear(numberOfYearsIWantToInvest);
        sendKeys(numberOfYearsIWantToInvest, year);
        clickStaticText("Investment Maturity Calculator");
//        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
//            if (Objects.equals(getAttribute(eightyEighty, "value"), "88 years")) {
//                click(eightyEighty);
//                click(deleteButtonOfIos);
//                clickStaticText("Investment Maturity Calculator");
//            }
//        }
    }

    public void enterNumberOfYearInvest(String year) throws Exception {
        clear(numberOfYearsIWantToInvest);
        sendKeys(numberOfYearsIWantToInvest, year);
    }

    public void enterNumberOfYearsInvests(String year) throws Exception {
        clear(numberOfYearsIWantToInvest);
        sendKeys(numberOfYearsIWantToInvest, year);
        clickStaticText("Investment Maturity Calculator");
//        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
//            if (Objects.equals(getAttribute(fiftyFive, "value"), "55 years")) {
//                click(fiftyFive);
//                click(deleteButtonOfIos);
//                clickStaticText("Investment Maturity Calculator");
//            }
//        }
    }

    public void enterInvestmentOfPerMonth(String month) throws Exception {
        clear(monthlyInvest);
        sendKeys(monthlyInvestAfterClear, month);
    }

    public void enterEveryYearIncreaseOfInvestment(String percent) {
        clear(yearlyIncreaseInvest);
        sendKeys(yearlyIncreaseInvestAfterClear, percent);
    }

    public void enterExpectedAnnualRateIncome(String percent) {
        clear(annualRateOfReturn);
        sendKeys(annualRateOfReturnAfterClear, percent);

    }

    public void clickInvestForThisGoal() {
        click(investForThisGoal);
    }

    public boolean verifyBankWithMinSIPAmount(String bank, String amount) throws Exception {
        String xpathForBank = "";
        String xpathForAmount = "";
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpathForBank = "//XCUIElementTypeStaticText[@name='" + bank + "']";
            xpathForAmount = "//XCUIElementTypeStaticText[@name='" + amount + "']";
        } else if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            xpathForBank = "//*[@text='" + bank + "']";
            xpathForAmount = "//*[@text='" + amount + "']";
        }
        return (isVisible(getElement(xpathForAmount)) && isVisible(getElement(xpathForBank)));
    }

    public void scrollToAuthenticateAndSave() throws Exception {
        if(Objects.equals(globalParams.getPlatformName(),"Android")){
            scrollInAndroid(AuthenticateAndSave,204,793,201,252);
        }
        scrollToElement(AuthenticateAndSave, "up", createSIP,3000,10);
    }

    public boolean verifyDefaultSIPDuration() {
        return isVisible(defaultSIPDuration);
    }

    public boolean verifyFundWithStatus(String fund, String status) throws Exception {
        String xpathForFund = "";
        String xpathForStatus = "";
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpathForFund = "//XCUIElementTypeStaticText[@name='" + fund + "']";
            xpathForStatus = "//XCUIElementTypeOther[@name='" + status + "']";
        } else if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            xpathForFund = "//*[@text='" + fund + "']";
            xpathForStatus = "//*[@text='" + status + "']";
        }
        return (isVisible(getElement(xpathForFund)) && isVisible(getElement(xpathForStatus)));
    }

    public boolean verifyAdityaBirlaFundWithStatus(String fund) throws Exception {
        String xpathForFund = "";
        String xpathForStatus = "";
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpathForFund = "//XCUIElementTypeStaticText[@name='" + fund + "']";
            xpathForStatus = "//XCUIElementTypeStaticText[@name='Success']";
        } else if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            xpathForFund = "//*[@text='" + fund + "']";
            xpathForStatus = "//*[@text='Success']";
        }
        return (isVisible(getElement(xpathForFund)) && isVisible(getElement(xpathForStatus)));
    }

    public void verifyExpectedMaturityAmount(String text) throws Exception {
        new DigitalGoldStepDef().userVerifyStaticText(text);
    }

    public void verifyMyInvestedAmount(String text) throws Exception {
        new DigitalGoldStepDef().userVerifyStaticText(text);
    }

    public void verifyInterestEarnedAmount(String text) throws Exception {
        new DigitalGoldStepDef().userVerifyStaticText(text);
    }

    public void clickBackIconInInvestmentMaturityScreen() {
        click(BackIconInvestmentMaturityScreen);
    }

    public void clickBackIconInMissionScreenScreen() {
        click(backIconMission1CrScreen);
    }

    public void clickOnCalculate() {
        click(calculate);
    }

    public void clickStartNow() throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            xpath = "//*[@text='Start Now']";
        } else if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "//XCUIElementTypeOther[@name='Submit Button']";
        }
        getElement(xpath).click();
    }

//    public void doPayment() throws Exception {
//        String xpath = "";
//        String xpath1="";
//        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
//            xpath = "//*[@text='ICICI Bank']";
//            xpath1="//*[@text='Pay Now']";
//        } else if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
//            xpath = "//XCUIElementTypeStaticText[@name='ICICI Bank']";
//            xpath1 = "//XCUIElementTypeOther[@name='Pay Now']";
//        }
//        if (new MutualFundPage().verifyNeyBanking()) {
//            click(netBankingAllBanks);
//            click(fdrlBank);
//            String text1="Pay Now";
//            String text = "Authenticate";
//            String time = "15000";
//            new MutualFundPage().clickNetBankingViaBankDetails();
//            if(isVisible(payNow)){
//                clickByText(text1);
//            }
//            else{
//                new MutualFundPage().clickButtonTypeText(text);
//            }
//            new DigitalGoldStepDef().userWainForMinute(time);
//            new DigitalGoldPage().clickSuccess();
//        }
//
//    }
    public boolean verifyWithOnly200(){
        return isVisible(withOnly200);
    }
    public void closeNotAvaTra(){
        click(notAvailableTransaction);
    }
    }









