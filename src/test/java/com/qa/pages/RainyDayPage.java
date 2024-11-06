package com.qa.pages;

import com.qa.utils.GlobalParams;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.util.Objects;

public class RainyDayPage extends BasePage {
    GlobalParams globalParams = new GlobalParams();
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='My existing savings for this goal']/preceding-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='My existing savings for this goal']//preceding-sibling::android.view.ViewGroup[3]/android.widget.EditText")
    private MobileElement rainySavingAmountBox;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Vertical scroll bar, 2 pages'])[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Set Your\n" +
            "Financial Goals']")
    private MobileElement setFinancialGoal;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='I / We have read the related Scheme Document of the selected fund before investing']")
    @AndroidFindBy(xpath = "//*[@text='I / We have read the related Scheme Document of the selected fund before investing']/preceding-sibling::android.view.ViewGroup")
    private MobileElement iWeHaveCheckBox;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='I / We have read the related Scheme Document of the selected fund before investing']")
    @AndroidFindBy(xpath = "//*[@text='Amount I want to invest']//preceding-sibling::android.view.ViewGroup[3]/android.widget.EditText")
    private MobileElement investMoreBx;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Complete KYC'])[2]")
    @AndroidFindBy(xpath = "//*[@text='Complete KYC']")
    private MobileElement completeKyc;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='My monthly expenses']/preceding-sibling::XCUIElementTypeOther[1]")
    @AndroidFindBy(xpath = "//*[@text='My monthly expenses']/preceding-sibling::android.view.ViewGroup/android.widget.EditText")
    private MobileElement monthlyExpensesAmountBox;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Household Expenses']/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Household Expenses']/preceding-sibling::android.view.ViewGroup")
    private MobileElement backIconHouseholdExpensesScreen;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"I want to invest now\"]/following::XCUIElementTypeOther[5]")
    @AndroidFindBy(xpath = "//*[@text='I want to invest now']/following-sibling::android.view.ViewGroup[3]/android.widget.EditText")
    private MobileElement investFurther;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Investment Amount\"]")
    @AndroidFindBy(xpath = "//*[@text='Investment Amount']")
    private MobileElement schemes;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Investment Amount\"]")
    @AndroidFindBy(xpath = "//*[@text='Schemes to invest']")
    private MobileElement schemesToInvest;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Investment Amount\"]")
    @AndroidFindBy(xpath = "//*[@text='I / We have read the related Scheme Document of the selected fund before investing']")
    private MobileElement ioWeHave;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"View SIPs\"]")
    @AndroidFindBy(xpath = "//*[@text='View SIPs']")
    private MobileElement viewSip;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Rainy Days\"]")
    @AndroidFindBy(xpath = "//*[@text='Rainy Day\n" +
            "Funds']")
    private MobileElement rainyDayBan;
    @AndroidFindBy(xpath = "//*[@text='All Payment Options']/following-sibling::android.view.View")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Netbanking'")
    private MobileElement fdrlBank;
    @AndroidFindBy(xpath = "//*[@text='Authenticate Using']")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Netbanking'")
    private MobileElement netBankingViaBankDetails;
    @AndroidFindBy(xpath = "//*[@text='Netbanking']")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Netbanking'")
    private MobileElement netBankingAllBanks;
    @AndroidFindBy(xpath = "//*[@text='Authenticate']")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Netbanking'")
    private MobileElement authenticateBtn;
    @AndroidFindBy(xpath = "//*[@text='Select']")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Netbanking'")
    private MobileElement selectBtn;
    @AndroidFindBy(xpath = "//*[@text='All Payment Options']/following-sibling::android.view.View")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Netbanking'")
    private MobileElement selectBank;
    @AndroidFindBy(xpath = "//*[@text='All Payment Options']/following-sibling::android.view.View\n")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Netbanking'")
    private MobileElement bankName;


    public void enterRainyDaySavingAmount(String amount) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOs")) {
            click(rainySavingAmountBox);
            for (int i = 0; i < 10; i++) {
                clickTypeKeyDelete();
            }
            sendKeys(rainySavingAmountBox, amount);
        } else {
            clear(rainySavingAmountBox);
            sendKeys(rainySavingAmountBox, amount);
        }
    }

    public void clickSetFinancialGoalBanner() throws InterruptedException {
        if (!isVisible(setFinancialGoal)) {
            if (Objects.equals(globalParams.getPlatformName(), "Android")) {
                andScrollToElementUsingUiScrollable("text","Set Your\n" +
                        "Financial Goals");
            } else {
                iOSScrollToElementByName(setFinancialGoal, "up", "Set Your\n" +
                        "Financial Goals");
            }
        }
        click(setFinancialGoal);
    }

    public void clickIWeHaveCheckBox() {
        click(iWeHaveCheckBox);
    }

    public void clickCompleteKyc() {
        click(completeKyc);
    }

    public void enterMonthlyExpensesAmount(String amount) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOs")) {
            click(monthlyExpensesAmountBox);
            for (int i = 0; i < 10; i++) {
                clickTypeKeyDelete();
            }
            sendKeys(monthlyExpensesAmountBox, amount);
        } else {
            clear(monthlyExpensesAmountBox);
            sendKeys(monthlyExpensesAmountBox, amount);
        }
    }

    public void enterInvestsAmount(String amount) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOs")) {
            click(investFurther);
            for (int i = 0; i < 10; i++) {
                clickTypeKeyDelete();
            }
        } else {
            clear(investFurther);
            sendKeys(investFurther, amount);
        }
    }

    public void clickBackButtonInHouseHoldExpensesScreen() {
        click(backIconHouseholdExpensesScreen);
    }

    public void selectFund() {
        click(selectBtn);
    }

    public void clickRainyDayBan() throws InterruptedException {
        Thread.sleep(3000);
        if (!isVisible(rainyDayBan)) {
            if (Objects.equals(globalParams.getPlatformName(), "Android")) {
                andScrollToElementUsingUiScrollable("text", "Rainy Day\n" +
                        "Funds");
            } else {
                iOSScrollToElementByName(rainyDayBan, "up", "Rainy Day\n" +
                        "Funds");
            }
        }
        click(rainyDayBan);
    }

    public void scrollIWeHaveCheckBox() throws Exception {
        andIosScroll(iWeHaveCheckBox, "up", schemes);
    }

    public void scrollDownRainy() throws Exception {
        andIosScroll(iWeHaveCheckBox,"up",schemesToInvest);
    }

    public void enterAmountForInvMore(String amount) {
        clear(investMoreBx);
        sendKeys(investMoreBx, amount);
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            pressEnter();
        }
    }

    public void waitForSuccessfulSipPage() {
        if (!isVisible(viewSip)) {
            waitForVisibility(viewSip, 18);
        }
    }

    public void doPaymentRainyDay() throws Exception {
        Thread.sleep(18000);
        if(isVisible(netBankingViaBankDetails)){
            click(netBankingAllBanks);
            click(authenticateBtn);
            Thread.sleep(5000);
            clickByText("Success");
        }
        else if(isVisible(netBankingAllBanks)){
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
    }


