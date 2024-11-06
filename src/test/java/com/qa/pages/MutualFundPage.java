
package com.qa.pages;

import com.qa.utils.DriverManager;
import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.cucumber.datatable.DataTable;
import org.testng.Assert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class MutualFundPage extends BasePage {
    TestUtils utils = new TestUtils();
    GlobalParams globalParams = new GlobalParams();

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Mutual\n" +
            "Funds\"])[2]")
    @AndroidFindBy(xpath = "//*[@text='Mutual\n" +
            "Funds']")
    private MobileElement mutualFunds;
    @AndroidFindBy(xpath = "//*[@text='Search']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Search']")
    private MobileElement searchCategory;
    @AndroidFindBy(xpath = "//*[@text='Invest in FundCase']/following-sibling::android.widget.HorizontalScrollView/android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Search']")
    private MobileElement basketCard;
    @AndroidFindBy(xpath = "//*[@text='Search scheme name']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Search scheme name']")
    private MobileElement searchMFScheme;
    @AndroidFindBy(xpath = "//*[@text='Create Budget']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Search scheme name']")
    private MobileElement createBudget;
    @AndroidFindBy(xpath = "//*[@text='Category Avg.']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Category Avg.']")
    private MobileElement categoryAvg;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Add to Cart'])[2]")
    @AndroidFindBy(xpath = "//*[@text='Add to Cart']")
    private MobileElement firstMF;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='\uE836 Monthly SIP']")
    @AndroidFindBy(xpath = "//*[@text='Monthly SIP']")
    private MobileElement uncheckedMonthlySip;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='\uE836 Daily']")
    @AndroidFindBy(xpath = "//*[@text='Daily']")
    private MobileElement uncheckedDailySTp;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='\uE836 Monthly']")
    @AndroidFindBy(xpath = "//*[@text='Monthly']")
    private MobileElement uncheckdMonthlySTp;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='\uE836 Weekly']")
    @AndroidFindBy(xpath = "//*[@text='Weekly']")
    private MobileElement uncheckdWeeklySTp;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='\uE836 Weekly']")
    @AndroidFindBy(xpath = "//*[@text='Weekly']")
    private MobileElement uncheckedWeeklySdp;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='\uE836 One-Time']")
    @AndroidFindBy(xpath = "//*[@text='One-Time']")
    private MobileElement oneTime;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tax Saver']")
    @AndroidFindBy(xpath = "//*[@text='Tax Saver']")
    private MobileElement taxServer;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Value Oriented / Contra Invest in stocks that are undervalued & potential to grow in long term'])[2]")
    @AndroidFindBy(xpath = "//*[@text='Value Oriented / Contra']")
    private MobileElement valueOriented;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Low Duration Average maturity of the invested bonds is between 6 to 12 months'])[2]")
    @AndroidFindBy(xpath = "//*[@text='Low Duration']")
    private MobileElement lowDuration;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Others']")
    @AndroidFindBy(xpath = "//*[@text='Others']")
    private MobileElement others;
    @AndroidFindBy(xpath = "//*[@text='Investment Amount']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Investment Amount']/parent::XCUIElementTypeOther//following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement investmentAmount;
    @AndroidFindBy(xpath = "//*[contains(@text,'SIP Date')]/following-sibling::android.view.ViewGroup[1]//android.widget.TextView[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='SIP Date']/parent::XCUIElementTypeOther/child::XCUIElementTypeOther")
    private MobileElement monthlySIPDate;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Select\"])[2]")
    @AndroidFindBy(xpath = "(//*[@text='Select'])[1]")
    private MobileElement selectButton;
    @AndroidFindBy(xpath = "(//*[@text='Investment Amount'])[1]/following-sibling::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Investment Amount']/XCUIElementTypeOther/XCUIElementTypeTextField")
    private MobileElement investmentAmountBox;
    @AndroidFindBy(xpath = "//*[@text='Duration']/following-sibling::android.view.ViewGroup[1]/descendant::android.view.ViewGroup[4]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='5Y']")
    private MobileElement durationBox5Y;
    @AndroidFindBy(xpath = "//*[@text='Returns Calculator']/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Returns Calculator']/XCUIElementTypeOther[2]")
    private MobileElement closeIconInReturnsScreen;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Suggested Amount']")
    @AndroidFindBy(xpath = "//*[@text='Purchase in this scheme\n" +
            "is not allowed at this time']/parent::android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
    private MobileElement purchaseNotAloPop;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"I / We have read the related Scheme Document of the selected fund before investing\"]/preceding-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[contains(@text,'I / We have read the related Scheme Document')]/preceding-sibling::android.view.ViewGroup")
    private MobileElement calculate;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"I / We have read the related Scheme Document of the selected fund before investing\"]/preceding-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Transactions']/following-sibling::android.view.ViewGroup[2]/descendant::android.view.ViewGroup[4]/child::android.widget.TextView[4]")
    private MobileElement sellTran;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"I / We have read the related Scheme Document of the selected fund before investing\"]/preceding-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Mutual Funds']/ancestor::android.view.ViewGroup[2]/following-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[4]/child::android.widget.TextView[4]")
    private MobileElement sipAmount;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"I / We have read the related Scheme Document of the selected fund before investing\"]/preceding-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Mutual Funds']/ancestor::android.view.ViewGroup[2]/following-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[4]/child::android.widget.TextView[3]")
    private MobileElement sipAmountText;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"I / We have read the related Scheme Document of the selected fund before investing\"]/preceding-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Mutual Funds']/ancestor::android.view.ViewGroup[2]/following-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[4]/child::android.widget.TextView[8]")
    private MobileElement sipFrequency;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"I / We have read the related Scheme Document of the selected fund before investing\"]/preceding-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "(//*[@text='Source Scheme']/following-sibling::android.widget.TextView[7])[1]")
    private MobileElement stpAmount;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"I / We have read the related Scheme Document of the selected fund before investing\"]/preceding-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "(//*[@text='Source Scheme']/following-sibling::android.widget.TextView[13])[1]")
    private MobileElement stpInstallment;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"I / We have read the related Scheme Document of the selected fund before investing\"]/preceding-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "(//*[@text='Source Scheme']/following-sibling::android.widget.TextView[6])[1]")
    private MobileElement stpAmountText;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"I / We have read the related Scheme Document of the selected fund before investing\"]/preceding-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='SWP']/parent::android.view.ViewGroup/ancestor::android.view.ViewGroup[1]/following-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[4]/descendant::android.widget.TextView[4]")
    private MobileElement swpAmountText;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"I / We have read the related Scheme Document of the selected fund before investing\"]/preceding-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='SWP']/parent::android.view.ViewGroup/ancestor::android.view.ViewGroup[1]/following-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[4]/descendant::android.widget.TextView[5]")
    private MobileElement swpAmount;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"I / We have read the related Scheme Document of the selected fund before investing\"]/preceding-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "(//*[@text='Source Scheme']/following-sibling::android.widget.TextView[11])[1]")
    private MobileElement stpFrequencyInSPPage;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"I / We have read the related Scheme Document of the selected fund before investing\"]/preceding-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='SWP']/parent::android.view.ViewGroup/ancestor::android.view.ViewGroup[1]/following-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[4]/descendant::android.widget.TextView[9]")
    private MobileElement swpFrequencyInSPPage;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[contains(@name, 'FDRL')])[last()]")
    @AndroidFindBy(xpath = "//*[contains(@text, 'FDRL')]")
    private MobileElement federalBank;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[contains(@name, 'FDRL')])[last()]")
    @AndroidFindBy(xpath = "//*[@text='Name Your Financial Goal']")
    private MobileElement financialGoal;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[contains(@name, 'FDRL')])[last()]")
    @AndroidFindBy(xpath = "//*[@text='Mode of Investment']")
    private MobileElement modeOfInv;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Investment Amount\"]")
    @AndroidFindBy(xpath = "//*[@text='Investment Amount']")
    private MobileElement folioNum;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Transactions\"]/ancestor::XCUIElementTypeOther[2]/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeOther[3]")
    @AndroidFindBy(xpath = "//*[@text='Transactions']/following-sibling::android.view.ViewGroup[2]/descendant::android.view.ViewGroup[4]")
    private MobileElement mfInProcess;
    @AndroidFindBy(xpath = "(//*[contains(@text,\"Installments\")]/preceding-sibling::android.view.ViewGroup[2])[1]")
    @iOSXCUITFindBy(xpath = "(*//XCUIElementTypeStaticText[contains(@name,'Installments')])[1]/parent::XCUIElementTypeOther/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther[1]/descendant::XCUIElementTypeOther[4]")
    private MobileElement threeDtIcnForTwoIns;
    @AndroidFindBy(xpath = "//*[contains(@text,\"Installments\")]/preceding-sibling::android.view.ViewGroup[2]")
    @iOSXCUITFindBy(xpath = "(*//XCUIElementTypeStaticText[contains(@name,'Installments')])[1]/parent::XCUIElementTypeOther/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther[1]/descendant::XCUIElementTypeOther[4]")
    private MobileElement threeDtIcnForSTP;
    @AndroidFindBy(xpath = "(//*[contains(@text,'SIP Duration')]/following-sibling::android.view.ViewGroup//android.widget.EditText)[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='SIP Duration']/ancestor::XCUIElementTypeOther[2]/descendant::XCUIElementTypeOther[2]/descendant::XCUIElementTypeTextField")
    private MobileElement sipDuration;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Mutual Fund Schemes']/ancestor::XCUIElementTypeOther[3]/descendant::XCUIElementTypeOther[7]")
    @AndroidFindBy(xpath = "//*[@text='Mutual Fund Schemes']//following-sibling::android.view.ViewGroup")
    private MobileElement addToCartIcon;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,\"Minimum ₹\")]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[contains(@text,'Minimum ₹')]/following-sibling::android.widget.EditText")
    private MobileElement MonthlySipAmountBox;
    @AndroidFindBy(xpath = "//*[contains(@text,'You can add only 4 schemes')]")
    private MobileElement youCanAdd4OnlySchemesPopup;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[contains(@name,\"Aditya Birla Sun Life Frontline Equity Fund (G)\")])[1]/parent::XCUIElementTypeOther/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[contains(@text, 'Mutual Fund > ')]/following-sibling::android.view.ViewGroup/child::android.widget.ScrollView/descendant::android.view.ViewGroup[5]")
    private MobileElement threeDotIconInWealthScreen;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Mode of Investment']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeScrollView/descendant::XCUIElementTypeOther[3]/XCUIElementTypeOther[1]")
    @AndroidFindBy(xpath = "//*[@text='Choose minimum amount for all schemes']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup[2]/android.view.ViewGroup[1]")
    private MobileElement mfSchemeCloseIcon;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Done']")
    private MobileElement DoneButtonInIOS;
    @AndroidFindBy(xpath = "//*[@text='Amount']/following-sibling::android.view.ViewGroup/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Amount']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement partialFundAmountBox;
    @AndroidFindBy(xpath = "//*[@text='Number of Units']/following-sibling::android.view.ViewGroup/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Number of Units']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement partialUnitBox;
    @AndroidFindBy(xpath = "//*[@text='Authenticate Using']")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Netbanking'")
    private MobileElement netBankingViaBankDetails;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Fund Value')]")
    @AndroidFindBy(xpath = "//*[contains(@text,'Fund Value')]")
    private MobileElement fundValueInRedeemScreen;
    @AndroidFindBy(xpath = "//*[contains(@text,'Enter Mobile OTP')]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Enter OTP to Confirm']/following-sibling::XCUIElementTypeStaticText)[1]")
    private MobileElement purchaseOTPText;
    @AndroidFindBy(xpath = "//*[@text=' Enter OTP to Confirm']/following-sibling::android.widget.TextView[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Enter OTP to Confirm']/following-sibling::XCUIElementTypeStaticText)[1]")
    private MobileElement purchaseOTPText1;
    @AndroidFindBy(xpath = "//*[@text='Enter OTP to Confirm']/following-sibling::android.widget.TextView[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Enter OTP to Confirm']/following-sibling::XCUIElementTypeStaticText)[1]")
    private MobileElement mfBuyOtp;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Resend OTP']/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField[1]")
    @AndroidFindBy(xpath = "//*[@text='Resend OTP']/ancestor::android.view.ViewGroup[2]/descendant::android.widget.EditText[1]")
    private MobileElement purchaseOTP;
    @AndroidFindBy(xpath = "//*[@text='Complete KYC']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Complete KYC\"])[2]")
    private MobileElement completeKYC;
    @AndroidFindBy(xpath = "//*[contains(@text,'You can add only 4 schemes')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'You can add only 4 schemes')]")
    private MobileElement youCanAdd4Sch;
    @AndroidFindBy(xpath = "//*[@text='Source Scheme:']/following-sibling::android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Source Scheme:\"]/following-sibling::XCUIElementTypeStaticText")
    private MobileElement sourceScheme;
    @AndroidFindBy(xpath = "//*[@text='Scheme:']/following-sibling::android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Scheme:']/following-sibling::XCUIElementTypeStaticText")
    private MobileElement swpScheme;
    @AndroidFindBy(xpath = "//*[@text='Target Scheme:']/following-sibling::android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Target Scheme:\"]/following-sibling::XCUIElementTypeStaticText")
    private MobileElement targetScheme;
    @AndroidFindBy(xpath = "//*[@text='Amount:']/following-sibling::android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Amount:']/following-sibling::XCUIElementTypeStaticText")
    private MobileElement switchingAmount;
    @AndroidFindBy(xpath = "//*[@text='Frequency:']/following-sibling::android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Frequency:']/following-sibling::XCUIElementTypeStaticText")
    private MobileElement stpFrequency;
    @AndroidFindBy(xpath = "//*[@text='Date:']/following-sibling::android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Date:']/following-sibling::XCUIElementTypeStaticText")
    private MobileElement switchingDate;
    @AndroidFindBy(xpath = "//*[contains(@text,'Start Date')]/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Start Date\"]/following-sibling::XCUIElementTypeOther")
    private MobileElement stpStartDate;
    @AndroidFindBy(xpath = "//*[contains(@text,'Start Date')]/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Start Date\"]/following-sibling::XCUIElementTypeOther")
    private MobileElement swpStartDate;
    @AndroidFindBy(xpath = "//*[@text='Number of Transfer']/following-sibling::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Number of Transfer\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
    private MobileElement numOfTransfer;
    @AndroidFindBy(xpath = "//*[@text='SWP Duration']/following-sibling::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='SWP Duration']/parent::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement swpDuration;
    @AndroidFindBy(xpath = "//*[@text='Amount']/following-sibling::android.view.ViewGroup/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Amount']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement stpAmtBx;
    @AndroidFindBy(xpath = "//*[@text='Withdrawal Amount']/following-sibling::android.view.ViewGroup/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Withdrawal Amount']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement swpAmtBx;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Number of Transfer\"]")
    @AndroidFindBy(xpath = "//*[@text='Number of Transfer']")
    private MobileElement numberOfTransfer;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='I / We have read the related Scheme Document of the selected fund before investing']")
    @AndroidFindBy(xpath = "//*[@text='I / We have read the related Scheme Document of the selected fund before investing']/preceding-sibling::android.view.ViewGroup")
    private MobileElement iWeHaveCheckBox;
    @AndroidFindBy(xpath = "//*[@text='Netbanking']")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Netbanking'")
    private MobileElement netBankingAllBanks;
    @AndroidFindBy(xpath = "//*[@text='Authenticate']")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Netbanking'")
    private MobileElement authenticateBtn;
    @AndroidFindBy(xpath = "//*[@text='Fund Performance']/following-sibling::android.view.ViewGroup[2]")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Netbanking'")
    private MobileElement barGraph;
    @AndroidFindBy(xpath = "//*[@text='Fund Performance']/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Netbanking'")
    private MobileElement lineGraph;
    @AndroidFindBy(xpath = "//*[@text='View More']")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Netbanking'")
    private MobileElement viewMore;
    @AndroidFindBy(xpath = "//*[@text='View More']")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Netbanking'")
    private MobileElement basicInf;
    @AndroidFindBy(xpath = "//*[@text='Read Scheme Information Document']")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Netbanking'")
    private MobileElement readScheme;
    @AndroidFindBy(xpath = "(//*[@text='View More'])[2]")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Netbanking'")
    private MobileElement viewMore2;
    @AndroidFindBy(xpath = "//*[@text='All Payment Options']/following-sibling::android.view.View")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Netbanking'")
    private MobileElement selectBank;
    @AndroidFindBy(xpath = "//*[@text='All Payment Options']/following-sibling::android.view.View\n")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Netbanking'")
    private MobileElement bankName;
    @AndroidFindBy(xpath = "//*[@text='Select Bank Account']/following-sibling::android.view.ViewGroup[2]")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Netbanking'")
    private MobileElement selectBankForBuy;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"View SIPs\"]")
    @AndroidFindBy(xpath = "//*[@text='Purchase Processing']")
    private MobileElement purchaseSuccessfulPage;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"View SIPs\"]")
    @AndroidFindBy(xpath = "//*[contains(@text,'You can try again after some time')]")
    private MobileElement purchaseFailedPage;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"View SIPs\"]")
    @AndroidFindBy(xpath = "(//*[@text='₹580'])[1]/preceding-sibling::android.view.ViewGroup[2]")
    private MobileElement threeDotInManageSip;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"View SIPs\"]")
    @AndroidFindBy(xpath = "(//*[@text='₹580'])[1]/preceding-sibling::android.view.ViewGroup[2]")
    private MobileElement threeDotSwpInManageSip;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"View SIPs\"]")
    @AndroidFindBy(xpath = "//*[@text='View SIPs']")
    private MobileElement viewSip;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"View SIPs\"]")
    @AndroidFindBy(xpath = "//*[@text='₹580']")
    private List<MobileElement> stpAmountCount;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"View SIPs\"]")
    @AndroidFindBy(xpath = "//*[@text='₹580']")
    private MobileElement stpAmountCount1;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"View SIPs\"]")
    @AndroidFindBy(xpath = "//*[@text='₹550']")
    private List<MobileElement> swpAmountCount;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"View SIPs\"]")
    @AndroidFindBy(xpath = "//*[@text='₹550']")
    private MobileElement swpAmountCount1;


    public void SelectGoal(String goalName) throws Exception {
        new DigitalGoldPage().clickFinancialGoal();
        new BasePage().clickByText(goalName);
    }

    public String getCurrentDate() {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        String formattedDate = today.format(formatter);
        return formattedDate;
    }

    public void selectRecommenedDuration(String text) throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            xpath = "//*[@text='" + text + "']";
        } else if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "//XCUIElementTypeOther[@name='" + text + "']";
        }
        new BasePage().click(new BasePage().getElement(xpath));
    }

    public void selectInvestmentAmount(String text) throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            xpath = "//*[@text='" + text + "']";
        } else if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "//XCUIElementTypeOther[@name='" + text + "']";
        }
        new BasePage().click(new BasePage().getElement(xpath));
    }

    public void enterPurchaseOtp() {
        if (isVisible(purchaseOTPText)) {
            String otp = purchaseOTPText.getText().substring(17, 21);
            sendKeys(purchaseOTP, otp);
        }
    }

    public void sellOtp() {
        if (isVisible(purchaseOTPText1)) {
            String otp = purchaseOTPText1.getText();
            sendKeys(purchaseOTP, otp);
        }
    }

    public void enterOTPForMFBuy() {
        if (!isVisible(mfBuyOtp)) {
            waitForVisibility(mfBuyOtp, 10);
        }
        String otp = mfBuyOtp.getText();
        sendKeys(purchaseOTP, otp);
    }

    public void enterInvalidPurchaseOtp() {
        if (!isVisible(purchaseOTP)) {
            waitForVisibility(purchaseOTP, 10);
        }
        String otp = "1234";
        sendKeys(purchaseOTP, otp);
    }

    public void clickCloseIconOfReturnsScreen() {
        click(closeIconInReturnsScreen);
    }

    public void clickMutualFunds() throws InterruptedException {
        if (!isVisible(mutualFunds)) {
            if (Objects.equals(globalParams.getPlatformName(), "Android")) {
                andScrollToElementUsingUiScrollable("text", "Mutual\n" +
                        "Funds");
            } else {
                iOSScrollToElementByName(mutualFunds, "up", "Mutual\n" +
                        "Funds");
            }
        }
        click(mutualFunds);
    }

    public void enterMutualFund(String mutualFundName) throws Exception {
        sendKeys(searchMFScheme, mutualFundName);
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            new BasePage().clickReturnIosKeyboard();
        } else {
            new BasePage().pressEnter();
        }
    }

    public void enterCategory(String category) throws Exception {
        sendKeys(searchCategory, category);
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            new BasePage().clickReturnIosKeyboard();
        } else {
            new BasePage().pressEnter();
        }

    }

    public void enterInvestmentAmountForOneTime(String investmentAmounts) {
        clear(investmentAmount);
        sendKeys(investmentAmount, investmentAmounts);
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            new BasePage().clickDone();
        }
    }

    public void enterInvestmentAmountForMonthlySIP(String investmentAmounts) {
        clear(investmentAmount);
        sendKeys(investmentAmount, investmentAmounts);
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            new BasePage().clickDone();
        }
    }

    public void clickMonthlySIPDate() {
        click(monthlySIPDate);
    }

    public void enterSIPDuration(String sipDurations) {
        clear(sipDuration);
        sendKeys(sipDuration, sipDurations);
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            new BasePage().clickDone();
        }
    }

    public void enterAmtInCalSc(String amt) {
        clear(investmentAmountBox);
        sendKeys(investmentAmountBox, amt);
        click(durationBox5Y);
    }

    public void clickSelectButton() {
        click(selectButton);
    }

    public void clickAddMFForAdityaBirla() {
        clickIfExist(firstMF);
        clickIfExist(firstMF);
    }

    public void clickAddToCartForDifferentSchemes() throws InterruptedException {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            clickIfExist(firstMF);
            Thread.sleep(4000);
            clickIfExist(firstMF);
            clickIfExist(firstMF);
        } else if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            while (!isVisible(youCanAdd4OnlySchemesPopup)) {
                clickIfExist(firstMF);
            }
        }
    }

    public void clickOneMF() {
        clickIfExist(firstMF);
    }


    public void unCheckMonthlySip() {
        click(uncheckedMonthlySip);
    }


    public void clickOneTime() {
        click(oneTime);
    }

    public void scrollToValueOriented() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andScrollToElementUsingUiScrollable("text", "Value Oriented / Contra");
        } else {
            scrollToElement(valueOriented, "up", taxServer);
        }
    }

    public void scrollToOthers() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andScrollToElementUsingUiScrollable("text", "Others");
        } else {
            scrollToElement(others, "up", lowDuration);
        }
    }

    public void scrollToIWeHaveCheckBox() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andIosScroll(calculate, "up", folioNum);
        } else {
            scrollToElement(calculate, "up", folioNum);
        }
    }

    public void scrollDown() throws InterruptedException {
        swipe(200, 842, 210, 147, 2000);
    }

    public void clickMfInProcessView() {
        click(mfInProcess);
    }


    public void clickThreeDotInMySip() {
        click(threeDtIcnForTwoIns);
    }


    public void clickAddToCartIconInMutualFundSchemesScreen() {
        clickIfExist(addToCartIcon);

    }

    public void enterMonthlyAmountForAdityaBirla(String text) {
        clear(MonthlySipAmountBox);
        sendKeys(MonthlySipAmountBox, text);
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            new BasePage().clickDone();
        }
    }

    public void clickButtonTypeText(String text) throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            xpath = "//*[@text='" + text + "']";
        } else if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "//XCUIElementTypeButton[@name='" + text + "']";
        }
        getElement(xpath).click();
    }


    public void clickCancelButton() throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            xpath = "//*[@text='Cancel']";
        } else if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "//XCUIElementTypeOther[@name='Close Button']";
        }
        getElement(xpath).click();
    }

    public void clickContinueButton() throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            xpath = "//*[@text='Continue']";
        } else if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "//XCUIElementTypeOther[@name='Submit Button']";
        }
        getElement(xpath).click();
    }

    public void clickThreeDotIconInWealthScreen() {
        click(threeDotIconInWealthScreen);
    }


    public void clickCloseIconForAllSchemes() throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            xpath = "//*[contains(@text,'One-Click Invest')]/preceding-sibling::android.view.ViewGroup";
        } else if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "//XCUIElementTypeStaticText[@name='One-Click Invest']/ancestor::XCUIElementTypeOther[2]/XCUIElementTypeOther[1]";
        }
        if (isVisible(mfSchemeCloseIcon)) {
            for (int i = 0; i < 5; i++) {
                if (isVisible(mfSchemeCloseIcon)) {
                    clickIfExist(mfSchemeCloseIcon);
                } else {
                    break;
                }
            }
            if (isElementExist(xpath)) {
                goBackFromScreen("One-Click Invest");

            }
        }

    }


    public void enterPartialFundAmount(String amount) {
        click(partialFundAmountBox);
        clear(partialFundAmountBox);
        sendKeys(partialFundAmountBox, amount);
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            new BasePage().clickDone();
        } else {
            pressEnter();

        }
    }

    public void enterAmountMoreThanFundValue() throws Exception {
        String a = new BasePage().getText(fundValueInRedeemScreen, "Fund value is :");
        String text[] = a.split("Fund Value  ₹");
        String replaceComma = text[1].replace(",", "");
        double fundValue = Double.parseDouble(replaceComma) + 50;
        String amount = Double.toString(fundValue);
        click(partialFundAmountBox);
        clear(partialFundAmountBox);
        sendKeys(partialFundAmountBox, amount);
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            {
                new BasePage().clickDoneIosKeyboard();
            }
        } else {
            pressEnter();

        }
    }

    public void enterPartialUnits(String units) {
        click(partialUnitBox);
        clear(partialUnitBox);
        sendKeys(partialUnitBox, units);
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            new BasePage().clickDone();
        } else {
            pressEnter();
        }
    }

    public boolean verifyNeyBanking() {
        return isVisible(netBankingViaBankDetails);
    }

    public void clickIWeHaveReadTheRelatedSchemeCheckBox(String text) throws Exception {
        String xpath = " ";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            xpath = "//*[@text='" + text + "']/preceding-sibling::android.view.ViewGroup";
        } else if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "//XCUIElementTypeStaticText[@name= '" + text + "']/preceding-sibling::XCUIElementTypeOther";
        }
        new BasePage().click(new BasePage().getElement(xpath));
    }

    public void goBackFromScreen(String text) throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            xpath = "//*[contains(@text,'" + text + "')]/preceding-sibling::android.view.ViewGroup";
        } else if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "//XCUIElementTypeStaticText[@name='" + text + "']/ancestor::XCUIElementTypeOther[2]/XCUIElementTypeOther[1]";
        }
        new BasePage().click(new BasePage().getElement(xpath));
    }

    public void selectCheckBox(String text) throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            xpath = "//*[contains(@text,'Choose minimum amount for all schemes')]/preceding-sibling::android.view.ViewGroup";

        } else if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "//XCUIElementTypeOther[@name= '" + text + "']";

        }
        new BasePage().click(new BasePage().getElement(xpath));
    }

    public void clickOnCompleteKYC() {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            click(completeKYC);
        } else {
            click(completeKYC);
        }

    }

    public void closeFundCardSc() throws Exception {
        if (isVisible(youCanAdd4Sch)) {
            clickCancelButton();
            clickByText("Review & Confirm Investment");
            clickCloseIconForAllSchemes();
            if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
                new BasePage().clickReturnIosKeyboard();
            }
            Thread.sleep(3000);
            clickAddMFForAdityaBirla();
        }
    }

    public void selectSchemes(String schemeName) throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            clickByText("Select");
        } else {
            xpath = "//XCUIElementTypeStaticText[@name='" + schemeName + "']/ancestor::XCUIElementTypeOther[3]/following-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther";
            click(getElement(xpath));
        }
    }

    public void removeSchemeSwiScv(String schemeName) throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            xpath = "//*[@text='" + schemeName + "']/preceding-sibling::android.view.ViewGroup";
        } else {
            xpath = "//XCUIElementTypeStaticText[@name='" + schemeName + "']/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther";
        }
        click(getElement(xpath));
    }

    public void verifySwitchStatus(DataTable dataTable) {
        List<Map<String, String>> userMap = dataTable.asMaps(String.class, String.class);
        String sourceSch = userMap.get(0).get("Source Scheme");
        Assert.assertEquals(sourceSch, sourceScheme.getText());
        String targetSch = userMap.get(0).get("Target Scheme");
        Assert.assertEquals(targetSch, targetScheme.getText());
        String switchAmount = userMap.get(0).get("Amount");
        Assert.assertEquals(" " + switchAmount, switchingAmount.getText());
        String switchDate = getCurrentDate();
        Assert.assertEquals(" " + switchDate, switchingDate.getText());
    }

    public void verifyStpStatus(DataTable dataTable) {
        List<Map<String, String>> userMap = dataTable.asMaps(String.class, String.class);
        String sourceSch = userMap.get(0).get("Source Scheme");
        Assert.assertEquals(sourceSch, sourceScheme.getText());
        String targetSch = userMap.get(0).get("Target Scheme");
        Assert.assertEquals(targetSch, targetScheme.getText());
        String switchAmount = userMap.get(0).get("Amount");
        Assert.assertEquals(" " + switchAmount, switchingAmount.getText());
        String stpFreq = userMap.get(0).get("Frequency");
        Assert.assertEquals(" " + stpFreq, stpFrequency.getText());
    }

    public void verifySwpStatus(DataTable dataTable) {
        List<Map<String, String>> userMap = dataTable.asMaps(String.class, String.class);
        String sourceSch = userMap.get(0).get("Scheme");
        Assert.assertEquals(sourceSch, swpScheme.getText());
        String switchAmount = userMap.get(0).get("Amount");
        Assert.assertEquals(" " + switchAmount, switchingAmount.getText());
        String stpFreq = userMap.get(0).get("Frequency");
        Assert.assertEquals(" " + stpFreq, stpFrequency.getText());
    }

    public void selectWeeklySwp() {
        click(uncheckedWeeklySdp);
    }

    public void enterStpStartDt(String date) throws Exception {
        click(stpStartDate);
        new BasePage().clickByText(date);
    }

    public void enterSwpStartDt(String date) throws Exception {
        click(swpStartDate);
        new BasePage().clickByText(date);
    }

    public void enterTransferFrequency(String frequency) throws Exception {
        clear(numOfTransfer);
        sendKeys(numOfTransfer, frequency);
        new BasePage().clickStaticText("Number of Transfer");
    }

    public void enterSwpDuration(String frequency) throws Exception {
        clear(swpDuration);
        sendKeys(swpDuration, frequency);
        new BasePage().clickStaticText("SWP Duration");
    }

    public void enterStpAmount(String stpAmt) throws Exception {
        clear(stpAmtBx);
        sendKeys(stpAmtBx, stpAmt);
        new BasePage().clickStaticText("Amount");
    }

    public void enterSwpAmount(String stpAmt) throws Exception {
        clear(swpAmtBx);
        sendKeys(swpAmtBx, stpAmt);
        new BasePage().clickStaticText("Withdrawal Amount");
    }

    public void unableToSeeNOTBx() {
        Assert.assertFalse(isVisible(numOfTransfer));
    }

    public void enterMonthlyStp() {
        click(uncheckdMonthlySTp);
    }
    public void enterWeeklyStp() {
        click(uncheckdWeeklySTp);
    }


    public void clickThreeDotForStp() {
        click(threeDtIcnForSTP);
    }

    public void scrollIWeHave() throws Exception {
        andIosScroll(iWeHaveCheckBox, "up", numberOfTransfer);
    }

    public void setInvestmentAmount(String investmentAmounts) {
        clear(investmentAmount);
        sendKeys(investmentAmount, investmentAmounts);
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            new BasePage().clickDone();
        }
    }

    public void doPayment() throws Exception {
        if (!isVisible(netBankingViaBankDetails)) {
            waitForVisibility(netBankingViaBankDetails, 120);
        }
            click(netBankingAllBanks);
            click(authenticateBtn);
            Thread.sleep(5000);
            clickByText("Success");
        }

    public void clickBarGraph() {
        click(barGraph);
    }

    public void clickLineGraph() {
        click(lineGraph);
    }

    public void scrollToBasicInf() throws Exception {
        andIosScroll(basicInf, "up", viewMore, 5);
    }

    public void scrollToDataSource() throws Exception {
        andIosScroll(readScheme, "up", basicInf);
    }

    public void clickViewMore() {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            if (isElementExist("(//*[@text='View More'])[2]")) {
                click(viewMore2);
            } else {
                click(viewMore);
            }
        }
    }

    public void scrollToSetFinancial() throws Exception {
        if (!isVisible(basketCard)) {
            if (Objects.equals(globalParams.getPlatformName(), "Android")) {
                  andScrollToElementUsingUiScrollable("text", "Invest in FundCase");
            } else {
                iOSScrollToElementByName(mutualFunds, "up", "Top Mutual Fund Baskets");
            }
        }
    }

    public boolean notAbleToSeeCat() {
        return isVisible(categoryAvg);
    }

    public void closePurchaseNotAllow() {
        click(purchaseNotAloPop);
    }

    public void verifyTranType(String tranType) {
        Assert.assertEquals(tranType, sellTran.getText());
    }

    public void verifySIPAmount(String SIPAmount) {
        Assert.assertEquals("SIP Amount ",sipAmountText.getText());
        Assert.assertEquals(SIPAmount, sipAmount.getText());
    }

    public void verifySIPFrequency(String SIPFrequency) {
        Assert.assertEquals(SIPFrequency, sipFrequency.getText());
    }

    public void verifySTPAmount(String STPAmount) {
        Assert.assertEquals("STP Amount ", stpAmountText.getText());
        Assert.assertEquals(STPAmount, stpAmount.getText());

    }
    public void verifySWPAmount(String STPAmount) {
        Assert.assertEquals("SWP Amount ", swpAmountText.getText());
        Assert.assertEquals(STPAmount, swpAmount.getText());

    }

    public void verifySTPFrequency(String STPFrequency) {
        Assert.assertEquals(STPFrequency, stpFrequencyInSPPage.getText());
    }
    public void verifySWPFrequency(String STPFrequency) {
        Assert.assertEquals(STPFrequency, swpFrequencyInSPPage.getText());
    }

    public void clickFederalBank() {
        clickIfExist(federalBank);
    }

    public void scrollToSIPAmount() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andIosScroll(modeOfInv, "down", financialGoal);

        } else {
            scrollToElement(modeOfInv, "down", financialGoal, 3000, 10);

        }
    }
    public void paymentForMF() throws Exception {
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
    public void paymentFail() throws Exception {
        waitForEitherElementToBeVisible(netBankingViaBankDetails,netBankingAllBanks,20);
        if (isVisible(netBankingViaBankDetails)) {
            click(netBankingAllBanks);
            click(authenticateBtn);
            Thread.sleep(5000);
            clickByText("Failure");
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
                Thread.sleep(5000);
                clickByText("Failure");
            }
        }
    }
    public void selectBankForBuy(){
        clickIfExist(selectBankForBuy);
    }
    public void waitForBuySuccessfulPage(){
        if (!isVisible(purchaseSuccessfulPage)) {
            waitForVisibility(purchaseSuccessfulPage, 18);
        }
    }
    public void waitForBuyFailedPage(){
        if (!isVisible(purchaseFailedPage)) {
            waitForVisibility(purchaseFailedPage, 18);
        }
    }
    public void waitForSIPSuccessPage(){
        if (!isVisible(viewSip)) {
            waitForVisibility(viewSip, 18);
        }
    }
    public String [] storeSTPAmtInstallments(){
        String [] stpDetails=new String[2];
        stpDetails[0]=stpAmount.getText();
        stpDetails[1]=stpInstallment.getText();
        return stpDetails;
    }
    public void stopSIP() throws Exception {
        click(threeDotInManageSip);
        clickByText("Stop STP");
        clickByText("Confirm");
    }

    public void stopSWP() throws Exception {
        click(threeDotSwpInManageSip);
        clickByText("Stop SWP");
        clickByText("Confirm");
    }
    public int stpCount(){
        return stpAmountCount.size();
    }
    public MobileElement getStpAmt(){
        return stpAmountCount1;
    }

    public MobileElement getSwpAmt(){
        return swpAmountCount1;
    }

    public int swpCount(){
        return swpAmountCount.size();
    }

    }
