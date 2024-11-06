package com.qa.pages;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import io.cucumber.datatable.DataTable;
import org.testng.Assert;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static java.lang.String.valueOf;
import static org.testng.Assert.assertTrue;


public class NpsInvestmentPage extends BasePage {
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='NPS'])[2]")
    @AndroidFindBy(xpath = "//*[@text='NPS\n']")
    private MobileElement npsInvestment;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tax Benefits on NPS']")
    @AndroidFindBy(xpath = "//*[@text='Tax Benefits on NPS']")
    private MobileElement taxBenefitsNPS;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='More About NPS']")
    @AndroidFindBy(xpath = "//*[@text='More About NPS']")
    private MobileElement moreAboutNps;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Auto Choice of Investment\"]")
    @AndroidFindBy(xpath = "//*[@text='Auto Choice of Investment']")
    private MobileElement autoChoiceInvest;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Active Choice of Investment\"]")
    @AndroidFindBy(xpath = "//*[@text='Active Choice of Investment']")
    private MobileElement activeChoiceInvest;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"NPS Advantage\"]")
    @AndroidFindBy(xpath = "//*[@text='NPS Advantage']")
    private MobileElement npsAdvantages;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"At today’s value, I need a \n" +
            "monthly retirement income of\"]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='At today’s value, I need a \n" +
            "monthly retirement income of']/following-sibling::android.widget.EditText[1]")
    private MobileElement monthlyRetirementIncomeTxtBx;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"At today’s value, I need a \n" +
            "monthly retirement income of\"]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='At today’s value, I need a \n" +
            "monthly retirement income of']/following-sibling::android.view.ViewGroup[1]/android.widget.SeekBar")
    private MobileElement monthlyRetirementIncomeTxtBar;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"My current age is\"]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='My current age is']/following-sibling::android.widget.EditText[1]")
    private MobileElement currentAgeTxtBx;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"My current age is\"]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='My current age is']/following-sibling::android.view.ViewGroup[1]/android.widget.SeekBar")
    private MobileElement currentAgeTxtBar;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"I will retire at the age of\"]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='I will retire at the age of']/following-sibling::android.widget.EditText[1]")
    private MobileElement retirementAgeTxtBx;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"I will retire at the age of\"]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='I will retire at the age of']/following-sibling::android.view.ViewGroup[1]/android.widget.SeekBar")
    private MobileElement retirementAgeTxtBar;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"After retirement, I need\n" +
            "income till the age of\"]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='After retirement, I need\n" +
            "income till the age of']/following-sibling::android.widget.EditText[1]")
    private MobileElement incomeAfterRetirement;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"After retirement, I need\n" +
            "income till the age of\"]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='After retirement, I need\n" +
            "income till the age of']/following-sibling::android.view.ViewGroup[1]/android.widget.SeekBar")
    private MobileElement incomeAfterRetirementBar;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Till I retire, I will invest at\n" +
            "an annual interest rate of\"]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Till I retire, I will invest at\n" +
            "an annual interest rate of']/following-sibling::android.widget.EditText[1]")
    private MobileElement investTillRetire;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Till I retire, I will invest at\n" +
            "an annual interest rate of\"]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Till I retire, I will invest at\n" +
            "an annual interest rate of']/following-sibling::android.view.ViewGroup[1]/android.widget.SeekBar[1]")
    private MobileElement investTillRetireBar;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Post-Retirement, I will invest\n" +
            "at an annual interest rate of\"]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Post-Retirement, I will invest\n" +
            "at an annual interest rate of']/following-sibling::android.widget.EditText[1]")
    private MobileElement investPostRetire;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Post-Retirement, I will invest\n" +
            "at an annual interest rate of\"]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Post-Retirement, I will invest\n" +
            "at an annual interest rate of']/following-sibling::android.view.ViewGroup[1]/android.widget.SeekBar[1]")
    private MobileElement investPostRetireBar;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Company\n" +
            "Detail'])[3]")
    @AndroidFindBy(xpath = "//*[@text='Company\n" +
            "Detail']")
    private MobileElement corpDetailThick;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"1 Corp\n" +
            "Detail\"])[3]")
    @AndroidFindBy(xpath = "//*[@text='Company\n" +
            "Detail']")
    private MobileElement corpDetail;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Which company are you working?\"]/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Which company are you working?']/following-sibling::android.view.ViewGroup[1]")
    private MobileElement compSearchBx;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Search Company & Select\"])[4]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text=\"Search Company & Select\"]")
    private MobileElement compSearchSelect;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Employee ID\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Employee ID']/following-sibling::android.widget.EditText")
    private MobileElement empNumber;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Date of Joining the Company\"]/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Date of Joining the Company']/following-sibling::android.view.ViewGroup")
    private MobileElement compJoinDt;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Date of Joining the Company\"]/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Pre-retirement Wealth Creation']")
    private MobileElement postRetirement;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Date of Joining the Company\"]/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Post retirement pension plan']")
    private MobileElement postRePen;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"5 Invest\"])[3]")
    @AndroidFindBy(xpath = "//*[@text='Initial\n" +
            "Contribution']")
    private MobileElement investTab;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Pension Fund Manager (PFM)\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Pension Fund Manager (PFM)']/following-sibling::android.view.ViewGroup/child::android.view.ViewGroup")
    private MobileElement pensionFundManager;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Alternative Fund (A) - Upto 5%\"])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Alternative Fund (A) - Upto 5%']/following-sibling::android.widget.EditText[1]")
    private MobileElement alternativeFund;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Alternative Fund (A) - Upto 5%\"])[1]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Alternative Fund (A) - Upto 5%']/following-sibling::android.widget.EditText[1]")
    private MobileElement alterFundAfterClear;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Equity (E) - Upto 75%\"])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Equity (E) - Upto 75%']/following-sibling::android.widget.EditText[1]")
    private MobileElement equityFund;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Equity (E) - Upto 75%\"]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Equity (E) - Upto 75%']/following-sibling::android.widget.EditText[1]")
    private MobileElement equityFundAftClear;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Govt. Securities (G) - Upto 100%\"])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Govt. Securities (G) - Upto 100%']/following-sibling::android.widget.EditText[1]")
    private MobileElement govtSecurity;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Govt. Securities (G) - Upto 100%\"])[1]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Govt. Securities (G) - Upto 100%']/following-sibling::android.widget.EditText[1]")
    private MobileElement govtSecurityAftClear;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Corporate Bond (C) - Upto 100%\"])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Corporate Bond (C) - Upto 100%']/following-sibling::android.widget.EditText[1]")
    private MobileElement corporateBnd;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Corporate Bond (C) - Upto 100%\"])[1]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Corporate Bond (C) - Upto 100%']/following-sibling::android.widget.EditText[1]")
    private MobileElement corporateBndAftClear;
    @AndroidFindBy(xpath = "//*[@text=\"Nominee Name\"]/following-sibling::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Nominee Name\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
    private MobileElement nomineeNameTxtBox;
    @AndroidFindBy(xpath = "//*[@text=\"Guardian is nominee’s\"]/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Guardian is nominee’s\"]/following-sibling::XCUIElementTypeOther")
    private MobileElement guardianIsMyTxtBox;
    @AndroidFindBy(xpath = "//*[@text='Auto Investment Choice']/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Auto Investment Choice\"]/following-sibling::XCUIElementTypeOther")
    private MobileElement closeBtnAutoInvest;
    @AndroidFindBy(xpath = "//*[@text=\"Pension Fund Manager (PFM)\"]/following-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Pension Fund Manager (PFM)\"]/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeOther")
    private MobileElement pfmDropDwn;
    @AndroidFindBy(xpath = "//*[@text=\"SBI PENSION FUNDS PRIVATE LIMITED\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"SBI PENSION FUNDS PRIVATE LIMITED\"])[2]")
    private MobileElement sbiPFM;
    @AndroidFindBy(xpath = "//*[@text=\"Choose Asset Allocation (Total should be 100%)\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Choose Asset Allocation (Total should be 100%)\"]")
    private MobileElement choiceAssertAlo;
    @AndroidFindBy(xpath = "//*[@text=\"Portfolio Option\"]/following-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Portfolio Option\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther")
    private MobileElement portFoOpt;
    @AndroidFindBy(xpath = "//*[@text=\"Guardian’s Date of Birth (Must be adult)\"]/following-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Guardian’s Date of Birth (Must be adult)\"]/following-sibling::XCUIElementTypeOther")
    private MobileElement guardianDOB;
    @AndroidFindBy(xpath = "//*[@text=\"scroll down\"]/preceding-sibling::android.widget.ScrollView/descendant::android.view.ViewGroup[4]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"scroll down\"]/preceding-sibling::XCUIElementTypeOther[2]/descendant::XCUIElementTypeOther[8]")
    private MobileElement dtPicker;
    @AndroidFindBy(xpath = "//*[@text=\"1997\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"1997\"])[1]")
    private MobileElement dt1998;
    @AndroidFindBy(xpath = "//*[@text=\"scroll up\"]/following-sibling::android.widget.ScrollView/descendant::android.view.ViewGroup[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"scroll up\"]/following-sibling::XCUIElementTypeOther[2]/descendant::XCUIElementTypeOther[4]")
    private MobileElement currYr;
    @AndroidFindBy(xpath = "//*[@text=\"Father\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Father\"])[2]")
    private MobileElement father;
    @AndroidFindBy(xpath = "//*[@text=\"S\"]/preceding-sibling::android.view.ViewGroup/child::android.view.ViewGroup[2]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"S\"])[1]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther")
    private MobileElement currentYear;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Guardian’s Name\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text=\"Guardian’s Name\"]/following-sibling::android.widget.EditText")
    private MobileElement guardianName;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"DEF Technologies (DEF Enterprises)\"])[3]")
    @AndroidFindBy(xpath = "(//*[contains(@text,'DEF Technologies')])[2]")
    private MobileElement defTechnologies;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"ABC Technologies (ABC Tek)\"])[3]")
    @AndroidFindBy(xpath = "//*[@text='ABC Technologies (ABC Tek)']")
    private MobileElement abcTecno;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Hombale Films (KGF 3)\"])[3]")
    @AndroidFindBy(xpath = "(//*[contains(@text,'Hombale Films (KGF 3)')])[2]")
    private MobileElement hombalFilms;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Original Valuefloat Technologies Pvt Ltd (Floatr)']")
    @AndroidFindBy(xpath = "//*[@text='Original Valuefloat Technologies Pvt Ltd (Floatr)']")
    private MobileElement originalValueFloatr;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Life Cycle Fund Type\"]/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text=\"Life Cycle Fund Type\"]/following-sibling::android.view.ViewGroup[1]")
    private MobileElement lifCycleFundDropDw;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"IFSC Code\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text=\"IFSC Code\"]/following-sibling::android.widget.EditText")
    private MobileElement ifscCode;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Account Number (Must be Savings Account)\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text=\"Account Number (Must be Savings Account)\"]/following-sibling::android.widget.EditText[1]")
    private MobileElement accountNumber;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Bank Name\"]/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text=\"Bank Name\"]/following-sibling::android.view.ViewGroup[1]")
    private MobileElement bankNameDrpDwn;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Submit Application\"])[2]")
    @AndroidFindBy(xpath = "//*[@text='Submit Application']")
    private MobileElement submitApplication;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Amount\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text=\"Amount\"]/following-sibling::android.widget.EditText")
    private MobileElement contributionAmt;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Contribution Amount\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text=\"Contribution Amount\"]/following-sibling::android.widget.EditText")
    private MobileElement contributionAmt1;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Contribution Amount\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text=\"Corporate Contribution\"]/following-sibling::android.widget.ScrollView/descendant::android.view.ViewGroup[3]")
    private MobileElement corporateContri;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Contribution Amount\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text=\"Shifting Status\"]")
    private MobileElement shiftingsta;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Contribution Amount\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text=\"Shifting Acknowledgement\"]")
    private MobileElement shiftAckn;
    @iOSXCUITFindBy(iOSNsPredicate = "value == \"Search...\"")
    @AndroidFindBy(xpath = "//*[@text='Select Bank']/parent::android.view.View/parent::android.view.View/following-sibling::android.view.View[1]")
    private MobileElement bankName;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Test Bank\"]")
    @AndroidFindBy(xpath = "//*[@text='SBI Bank']")
    private MobileElement sbiBank;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,\"Make Payment for ₹\")]")
    @AndroidFindBy(xpath = "//*[contains(@text,'Make Payment for ₹')]")
    private MobileElement makeAPayment;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"BillDesk\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]")
    @AndroidFindBy(xpath = "//*[@text='Select your option']")
    private MobileElement selectTrType;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Success\"]")
    @AndroidFindBy(xpath = "//*[@text='Success']")
    private MobileElement success;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Failure\"]")
    @AndroidFindBy(xpath = "//*[@text='Failure']")
    private MobileElement failure;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Submit\"]")
    @AndroidFindBy(xpath = "(//*[@text='Submit'])[1]")
    private MobileElement submitBtn;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Home\"])[2]")
    @AndroidFindBy(xpath = "//*[@text='Home']")
    private MobileElement homeBtn;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Reasons of Failure\"]/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Reasons of Failure']/following-sibling::android.view.ViewGroup[1]")
    private MobileElement closeIconFailureScreen;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"\uE836 Corporate Subscriber\"]")
    @AndroidFindBy(xpath = "//*[@text='Corporate Subscriber']")
    private MobileElement corporateSubRadioBtn;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"\uE836 Individual Subscriber\"]")
    @AndroidFindBy(xpath = "//*[@text='Individual Subscriber']")
    private MobileElement individualSubRadioBtn;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Portfolio Option\"]/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text=\"Portfolio Option\"]/following-sibling::android.view.ViewGroup")
    private MobileElement portfolioOpt;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Re-start NPS Application\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther[1]")
    @AndroidFindBy(xpath = "//*[@text=\"Re-start NPS Application\"]/following-sibling::android.view.ViewGroup[1]")
    private MobileElement closeIconRestartPopup;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,\"Select Nominee\")]/following-sibling::XCUIElementTypeOther[1]/descendant::XCUIElementTypeOther[3]")
    @AndroidFindBy(xpath = "//*[contains(@text,\"Select Nominee\")]/following-sibling::android.view.ViewGroup[1]")
    private MobileElement oneNominee;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,\"Select Nominee\")]/following-sibling::XCUIElementTypeOther[2]/descendant::XCUIElementTypeOther[3]")
    @AndroidFindBy(xpath = "//*[contains(@text,\"Select Nominee\")]/following-sibling::android.view.ViewGroup[2]")
    private MobileElement twoNominee;
    @iOSXCUITFindBy(iOSNsPredicate = "value == \"100 %\"")
    @AndroidFindBy(xpath = "//*[@text='100 %']")
    private MobileElement hundredPer;
    @iOSXCUITFindBy(iOSNsPredicate = "value == '50 %'")
    @AndroidFindBy(xpath = "//*[@text='50 %']")
    private MobileElement fiftyPer;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Maximum 3 banks\n" +
            "are allowed']")
    @AndroidFindBy(xpath = "//*[@text='Maximum 3 banks\n" +
            "are allowed']")
    private MobileElement threeBankAllowed;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Maximum 3 banks\n" +
            "are allowed']/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Maximum 3 banks\n" +
            "are allowed']/preceding-sibling::android.view.ViewGroup/android.widget.ImageView")
    private MobileElement addingBankPopup;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"KOTAK MAHINDRA PENSION FUND LIMITED\"])[2]")
    @AndroidFindBy(xpath = "//*[@text='KOTAK MAHINDRA PENSION FUND LIMITED']")
    private MobileElement kotakMahindra;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Open NPS Account\"])[3]")
    @AndroidFindBy(xpath = "//*[@text='Open NPS Account']")
    private MobileElement openNpsAcc;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Subscriber Name\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
    @AndroidFindBy(xpath = "//*[@text='Subscriber Name']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup[1]/android.widget.TextView")
    private MobileElement subscriberName2;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Subscriber Name\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
    @AndroidFindBy(xpath = "//*[@text='Subscriber Name']/following-sibling::android.widget.TextView[2]")
    private MobileElement subscriberName;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"PRAN Number\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
    @AndroidFindBy(xpath = "//*[@text='PRAN Number']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup[1]/android.widget.TextView")
    private MobileElement pranNumber;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"PRAN Number\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
    @AndroidFindBy(xpath = "//*[@text='Acknowledgement\n" +
            "Number']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup[2]/android.widget.TextView")
    private MobileElement ackNum4;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"PRAN Status\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
    @AndroidFindBy(xpath = "//*[@text='PRAN Status']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup[1]/android.widget.TextView")
    private MobileElement pranStatus;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"PRAN Status\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
    @AndroidFindBy(xpath = "//*[@text='PRAN Status']/parent::android.view.ViewGroup/following-sibling::android.widget.TextView")
    private MobileElement pranStatus3;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"PRAN Status\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
    @AndroidFindBy(xpath = "//*[@text='PRAN Status']/following-sibling::android.widget.TextView[2]")
    private MobileElement pranStatus1;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"NPS Sector\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
    @AndroidFindBy(xpath = "//*[@text='NPS Sector']/following-sibling::android.widget.TextView[2]")
    private MobileElement npsSector;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"NPS Sector\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
    @AndroidFindBy(xpath = "//*[@text='CRA']/following-sibling::android.widget.TextView[2]")
    private MobileElement cra1;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"NPS Sector\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
    @AndroidFindBy(xpath = "//*[@text='POP Name']/following-sibling::android.widget.TextView[2]")
    private MobileElement popName;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"NPS Sector\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
    @AndroidFindBy(xpath = "//*[@text='CHO Name']/following-sibling::android.widget.TextView[2]")
    private MobileElement choName1;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"NPS Sector\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
    @AndroidFindBy(xpath = "//*[@text='POP Code']/following-sibling::android.widget.TextView[2]")
    private MobileElement popCode;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"NPS Sector\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
    @AndroidFindBy(xpath = "//*[@text='CBO Name']/following-sibling::android.widget.TextView[2]")
    private MobileElement cboName;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"NPS Sector\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
    @AndroidFindBy(xpath = "//*[@text='POP-SP Name']/following-sibling::android.widget.TextView[2]")
    private MobileElement popSpName;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"NPS Sector\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
    @AndroidFindBy(xpath = "//*[@text='CBO Code']/following-sibling::android.widget.TextView[2]")
    private MobileElement cboCode;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"NPS Sector\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
    @AndroidFindBy(xpath = "//*[@text='POP-SP Code']/following-sibling::android.widget.TextView[2]")
    private MobileElement popSpCode;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"NPS Sector\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
    @AndroidFindBy(xpath = "//*[@text='Company Name']//following-sibling::android.view.ViewGroup[1]")
    private MobileElement companynameBx;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Corporate Name\"]/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
    @AndroidFindBy(xpath = "//*[@text='Corporate Name']/parent::android.view.ViewGroup/following-sibling::android.widget.TextView")
    private MobileElement corporateName;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Acknowledgement\n" +
            "Number']/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
    @AndroidFindBy(xpath = "//*[@text='Acknowledgement\n" +
            "Number']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup[1]/android.widget.TextView")
    private MobileElement acknowledgeNo;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Acknowledgement\n" +
            "Number']/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
    @AndroidFindBy(xpath = "//*[@text='PRAN Status']/parent::android.view.ViewGroup/following-sibling::android.widget.TextView")
    private MobileElement pranNum4;
    @AndroidFindBy(xpath = "//*[@text=\"Nominee's Date of Birth\"]/following-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Nominee's Date of Birth\"]/following-sibling::XCUIElementTypeOther")
    private MobileElement nomineeDob;
    @AndroidFindBy(xpath = "//*[@text=\"S\"]/preceding-sibling::android.view.ViewGroup/child::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"S\"])[1]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeOther[1]")
    private MobileElement calBackwardBtn;
    @AndroidFindBy(xpath = "//*[@text=\"S\"]/preceding-sibling::android.view.ViewGroup/child::android.view.ViewGroup[3]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"S\"])[1]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeOther[2]")
    private MobileElement calForwardBtn;
    @AndroidFindBy(xpath = "//*[@text=\"Moderate (LC-50)\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"S\"])[1]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeOther[2]")
    private MobileElement moderateLC50;
    @AndroidFindBy(xpath = "//*[@text=\"Aggressive (LC-75)\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"S\"])[1]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeOther[2]")
    private MobileElement aggressiveLC75;
    @AndroidFindBy(xpath = "//*[@text=\"Conservative (LC-25)\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"S\"])[1]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeOther[2]")
    private MobileElement conservativeLC25;
    @AndroidFindBy(xpath = "//*[@text='Enter value upto 5 % ']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter value upto 5 % \"]")
    private MobileElement enterValue5per;
    @AndroidFindBy(xpath = "//*[@text='Corporate Bond (C) - Upto 100%']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Corporate Bond (C) - Upto 100\"]")
    private MobileElement corporateBond;
    @AndroidFindBy(xpath = "//*[@text='Internet Banking']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Internet Banking\"]")
    private MobileElement internetBanking;
    @AndroidFindBy(xpath = "//*[@text='Popular Banks']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Popular Banks\"]")
    private MobileElement popularBank;
    @AndroidFindBy(xpath = "//*[@text='Select Bank']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Select Bank\"]")
    private MobileElement selectBank;
    @AndroidFindBy(xpath = "//*[@text='I have POP-SP Code']/ancestor::android.view.ViewGroup[2]/following-sibling::android.view.ViewGroup/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Current POP-SP Code\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement popSpCdInBx;
    @AndroidFindBy(xpath = "//*[@text='NPS Account Number (PRAN)']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"PRAN Number\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement pranNumInBx;
    @AndroidFindBy(xpath = "//*[@text='Name as in PRAN Card (case sensitive)']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Name as in PRAN Card (case sensitive)\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement nameInPranBx;
    @AndroidFindBy(xpath = "//*[contains(@text,'OTP Confirmation')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Enter OTP to Confirm')]")
    private MobileElement pranShiftOtp;
    @AndroidFindBy(xpath = "//*[contains(@text,'OTP Sent to')]/following-sibling::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[contains(@name,\"Enter OTP received \")]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    private MobileElement pranShiftOtp1;
    @AndroidFindBy(xpath = "//*[@text='Contribution Amount']/following-sibling::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Contribution Amount\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    private MobileElement increaseRegiAmt;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Corporate \"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Corporate Email']/following-sibling::android.widget.EditText")
    private MobileElement corporateMail;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Corporate \"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Nomination']/following-sibling::android.view.ViewGroup")
    private MobileElement nomineeBx;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Corporate \"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Subscriber Name']")
    private MobileElement successfulSc;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Corporate \"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Know More']")
    private MobileElement failedSc;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Corporate \"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Home']")
    private MobileElement succcofulcontribution;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Corporate \"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Apply for Shifting']")
    private MobileElement applyForShifting;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Corporate \"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Tier-1 Account']")
    private MobileElement tire1Acc;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Corporate \"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='PRAN not found']")
    private MobileElement pranNotFound;

    public void scrollToMoreAboutNps() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            scrollInAndroid(moreAboutNps, 503, 1958, 535, 555);
        } else {
            scrollToElement(moreAboutNps, "up", taxBenefitsNPS, 3000, 10);
        }
    }

    public void scrollToAutoChoice() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andIosScroll(autoChoiceInvest, "up", npsAdvantages, 4);
        } else {
            scrollToElement(autoChoiceInvest, "up", npsAdvantages, 5000, 10);
        }
    }

    public void scrollToActiveChoice() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andIosScroll(activeChoiceInvest, "up", npsAdvantages, 5);
        } else {
            scrollToElement(activeChoiceInvest, "up", npsAdvantages, 3000, 10);
        }
    }

    public void clickNpsInvestment() {
        if (!isVisible(npsInvestment)) {
            if (Objects.equals(globalParams.getPlatformName(), "Android")) {
                andScrollToElementUsingUiScrollable("text", "NPS\n");
            } else {
                iOSScrollToElementByName(npsInvestment, "up", "NPS\n");
            }
        }
        click(npsInvestment);
    }

    public void enterMonRetirementIncome(String incomeAmt) {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            click(monthlyRetirementIncomeTxtBx);
            clear(monthlyRetirementIncomeTxtBx);
            sendKeys(monthlyRetirementIncomeTxtBar, incomeAmt);
        } else {
            click(monthlyRetirementIncomeTxtBx);
            clear(monthlyRetirementIncomeTxtBx);
            sendKeys(monthlyRetirementIncomeTxtBx, valueOf(incomeAmt.charAt(0)));
            sendKeys(monthlyRetirementIncomeTxtBx, valueOf(incomeAmt.charAt(1)));
        }
    }

    public void enterCurrentAge(String incomeAmt) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            click(currentAgeTxtBx);
            clear(currentAgeTxtBx);
            sendKeys(currentAgeTxtBar, incomeAmt);
            clickStaticText("My current age is");
        } else {
            click(currentAgeTxtBx);
            clear(currentAgeTxtBx);
            sendKeys(currentAgeTxtBx, valueOf(incomeAmt.charAt(0)));
            sendKeys(currentAgeTxtBx, valueOf(incomeAmt.charAt(1)));
            clickStaticText("My current age is");
        }
    }

    public void enterRetirementAge(String incomeAmt) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            click(retirementAgeTxtBx);
            clear(retirementAgeTxtBx);
            sendKeys(retirementAgeTxtBar, incomeAmt);
            clickStaticText("My current age is");
        } else {
            click(retirementAgeTxtBx);
            clear(retirementAgeTxtBx);
            sendKeys(retirementAgeTxtBx, valueOf(incomeAmt.charAt(0)));
            sendKeys(retirementAgeTxtBx, valueOf(incomeAmt.charAt(1)));
            clickStaticText("My current age is");
        }
    }

    public void enterIncomeAfterRetire(String incomeAmt) throws Exception {

        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            click(incomeAfterRetirement);
            clear(incomeAfterRetirement);
            sendKeys(incomeAfterRetirementBar, incomeAmt);
            clickStaticText("My current age is");
        } else {
            click(incomeAfterRetirement);
            clear(incomeAfterRetirement);
            sendKeys(incomeAfterRetirement, valueOf(incomeAmt.charAt(0)));
            sendKeys(incomeAfterRetirement, valueOf(incomeAmt.charAt(1)));
            clickStaticText("My current age is");
        }
    }

    public void enterInvestTillRetire(String incomeAmt) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            int retireAge = Integer.parseInt(incomeAmt);
            int twice = retireAge * 2;
            String str = Integer.toString(twice);
            click(investTillRetire);
            clear(investTillRetire);
            sendKeys(investTillRetireBar, str);
            clickStaticText("My current age is");
        } else {
            click(investTillRetire);
            for (int i = 0; i < 3; i++) {
                clickTypeKeyDelete();
            }
            sendKeys(investTillRetire, valueOf(incomeAmt.charAt(0)));
            click(investTillRetire);
            sendKeys(investTillRetire, valueOf(incomeAmt.charAt(1)));
            clickStaticText("My current age is");
        }
    }

    public void enterInvestPostRetire(String incomeAmt) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            int retireAge = Integer.parseInt(incomeAmt);
            int twice = retireAge * 2;
            String str = Integer.toString(twice);
            click(investPostRetire);
            clear(investPostRetire);
            sendKeys(investPostRetireBar, str);
            pressEnter();
        } else {
            click(investPostRetire);
            for (int i = 0; i < 2; i++) {
                clickTypeKeyDelete();
            }
            sendKeys(investPostRetire, valueOf(incomeAmt.charAt(0)));
            click(investTillRetire);
            sendKeys(investPostRetire, valueOf(incomeAmt.charAt(1)));
            clickStaticText("My current age is");
        }
    }

    public void searchCompanyName(String compName) throws Exception {
        click(compSearchBx);
        sendKeys(compSearchSelect, compName);
        Thread.sleep(1000);
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            clickDoneIosKeyboard();
        }
    }

    public void clickCorpDetail() {
        if (isVisible(corpDetailThick)) {
            click(corpDetailThick);
        } else {
            click(corpDetail);
        }
    }

    public void enterEmpNum(String EmpNum) throws Exception {
        click(empNumber);
        clear(empNumber);
        sendKeys(empNumber, EmpNum);
        clickStaticText("Employee ID");
    }

    public void enterCompJoinDt(String date) throws Exception {
        click(compJoinDt);
        clickByText(date);
        clickByText("OK");
        clickStaticText("Date of Joining the Company");
    }

    public boolean verifyInvestTab() {
        return isVisible(investTab);
    }

    public void clickPFMDropDwn() {
        click(pensionFundManager);
    }

    public void scrollD0wn() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andIosScroll(enterValue5per, "up", corporateBond);
        } else {
            iOSScrollToElementByName(enterValue5per, "Up", "Enter value upto 5 % ");
        }
    }

    public void enterAlterFund(String fund) throws Exception {
        clear(alternativeFund);
        clickStaticText("Choose Asset Allocation Total should be 100%");
        click(alterFundAfterClear);
        sendKeys(alterFundAfterClear, fund);
        clickStaticText("Choose Asset Allocation Total should be 100%");
    }

    public void enterEquityFund(String fund) throws Exception {
        click(equityFund);
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            for (int i = 0; i < 3; i++) {
                clickTypeKeyDelete();
            }
        } else {
            clear(equityFund);
        }
        sendKeys(equityFundAftClear, fund);
        clickStaticText("Choose Asset Allocation Total should be 100%");
    }

    public void oenterGovtSecurity(String fund) throws Exception {
        click(govtSecurity);
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            for (int i = 0; i < 3; i++) {
                clickTypeKeyDelete();
            }
        } else {
            clear(govtSecurity);
        }
        sendKeys(govtSecurityAftClear, fund);
        clickStaticText("Choose Asset Allocation Total should be 100%");
    }

    public void enterCorporateBnd(String fund) throws Exception {
        click(corporateBnd);
        clear(corporateBnd);
        clickStaticText("Choose Asset Allocation Total should be 100%");
        click(corporateBndAftClear);
        sendKeys(corporateBndAftClear, fund);
        clickStaticText("Choose Asset Allocation Total should be 100%");
    }

    public void enterNomineeName(String name) throws Exception {
        clear(nomineeNameTxtBox);
        sendKeys(nomineeNameTxtBox, name);
        clickStaticText("Nominee Name");
    }

    public void selectGuardianRelationship() {
        click(guardianIsMyTxtBox);
        click(father);
    }

    public void enterGuardianName(String name) throws Exception {
        clear(guardianName);
        clickStaticText("Guardian Detail");
        sendKeys(guardianName, name);
        clickStaticText("Guardian Detail");
    }

    public void closeAutoChoiceInvest() {
        click(closeBtnAutoInvest);
    }

    public void verifyIsPFMClickable() {
        click(pfmDropDwn);
        Assert.assertFalse(isVisible(sbiPFM));
    }

    public void verifyActiveChoice() throws Exception {
        clickByText("Active Choice");
        Assert.assertFalse(isVisible(choiceAssertAlo));
    }

    public void verifyAutoChoice() throws Exception {
        clickByText("Auto Choice");
        Assert.assertFalse(isVisible(portFoOpt));
    }

    public void verifyPortFoOpt() {
        click(portFoOpt);
        Assert.assertFalse(isVisible(choiceAssertAlo));
    }

    public void enterGuardianDob() throws Exception {
        click(guardianDOB);
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

    public void enterNomineDob() throws Exception {
        click(nomineeDob);
        clickByText("Cancel");
        click(nomineeDob);
        click(calBackwardBtn);
        click(calForwardBtn);
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

    public void enterBelow18GuDob() throws Exception {
        click(guardianDOB);
        click(currentYear);
        click(currYr);
        clickByText("1");
        clickByText("OK");
    }

    public void clickDefTechnologies() {
        click(defTechnologies);
    }

    public void selectModerateLCF() {
        click(lifCycleFundDropDw);
        click(moderateLC50);
    }

    public void selectConservativeLCF() {
        click(lifCycleFundDropDw);
        click(conservativeLC25);
    }

    public void selectAggressiveLCF() {
        click(lifCycleFundDropDw);
        click(aggressiveLC75);
    }

    public void enterIfscCode(String IFSCCode) throws Exception {
        clear(ifscCode);
        sendKeys(ifscCode, IFSCCode);
        clickStaticText("IFSC Code");
    }

    public void enterAccNo(String ACCNo) {
        clear(accountNumber);
        sendKeys(accountNumber, ACCNo);
    }

    public void selectBankName(String bankName) throws Exception {
        click(bankNameDrpDwn);
        Thread.sleep(3000);
        clickByText(bankName);
    }

    public void clickSubmitApplication() {
        click(submitApplication);
    }

    public void enterContributionAmt(String amt) {
        clear(contributionAmt1);
        sendKeys(contributionAmt1, amt);
        pressEnter();
    }

    public void enterInvAmount(String amt) {
        clear(contributionAmt);
        sendKeys(contributionAmt, amt);
        pressEnter();
    }

    public void deleteNps(String mobileNumber) {
        String[] mobNo = mobileNumber.split(" ");
        try {
            if (Objects.equals(globalParams.getPlatformName(), "Android")) {
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("https://dev.floatr.in/api/testing/deletedata"))
                        .timeout(Duration.ofMinutes(2))
                        .header("Content-Type", "application/json")
                        .POST(HttpRequest.BodyPublishers.ofString("{  \n" +
                                "    \"type\" :\"token\",\n" +
                                "     \"contact\":\"" + mobNo[0] + "\",\n" +
                                "     \"pan\":\"CBFJG5746H\",\n" +
                                "     \"account_number\":\"3553533\",\n" +
                                "     \"account_type\": \"Personal\",\n" +
                                "     \"firstname\": \"Nishath\",\n" +
                                "      \"middlename\": \"Khanum\",\n" +
                                "      \"lastname\": \"S\"\n" +
                                "}"))
                        .build();
                HttpClient client = HttpClient.newHttpClient();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                String[] arr = response.body().split("\"token\":\"");
                String[] responce = arr[1].split("\"}}");
                HttpRequest request1 = HttpRequest.newBuilder()
                        .uri(URI.create("https://dev.floatr.in/api/nps/delete?type=deleted"))
                        .timeout(Duration.ofMinutes(2))
                        .header("Authorization", responce[0])
                        .DELETE()
                        .build();
                HttpClient client1 = HttpClient.newBuilder().build();

                HttpResponse<String> resp = client1.send(request1, HttpResponse.BodyHandlers.ofString());
                System.out.println("Floatr API Status Code: " + resp.statusCode());
            } else {
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("https://dev.floatr.in/api/testing/deletedata"))
                        .timeout(Duration.ofMinutes(2))
                        .header("Content-Type", "application/json")
                        .POST(HttpRequest.BodyPublishers.ofString("{  \n" +
                                "    \"type\" :\"token\",\n" +
                                "     \"contact\":\"" + mobNo[2] + "\",\n" +
                                "     \"pan\":\"CBFJG5746H\",\n" +
                                "     \"account_number\":\"3553533\",\n" +
                                "     \"account_type\": \"Personal\",\n" +
                                "     \"firstname\": \"Nishath\",\n" +
                                "      \"middlename\": \"Khanum\",\n" +
                                "      \"lastname\": \"S\"\n" +
                                "}"))
                        .build();
                HttpClient client = HttpClient.newHttpClient();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                String[] arr = response.body().split("\"token\":\"");
                String[] responce = arr[1].split("\"}}");


                HttpRequest request1 = HttpRequest.newBuilder()
                        .uri(URI.create("https://dev.floatr.in/api/nps/delete"))
                        .timeout(Duration.ofMinutes(2))
                        .header("Authorization", responce[0])
                        .DELETE()
                        .build();
                HttpClient client1 = HttpClient.newBuilder().build();

                HttpResponse<String> resp = client1.send(request1, HttpResponse.BodyHandlers.ofString());
                System.out.println("Floatr API Status Code: " + resp.statusCode());
            }
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void scrollInBillDeskSc() {
        scrollInAndroid(selectBank, popularBank);
    }

    public void doPaymentForNps() throws Exception {
        if (!isVisible(internetBanking)) {
            waitForVisibility(internetBanking, 120);
        }
        click(internetBanking);
        Thread.sleep(2000);
        click(bankName);
        scrollInBillDeskSc();
        click(sbiBank);
        click(makeAPayment);
        click(selectTrType);
        click(success);
        click(submitBtn);

    }

    public void clickHome() {
        click(homeBtn);
    }

    public void paymentFailForNps() throws Exception {
        if (!isVisible(internetBanking)) {
            waitForVisibility(internetBanking, 120);
        }
        clickStaticText("Internet Banking");
        Thread.sleep(2000);
        click(bankName);
        click(sbiBank);
        click(makeAPayment);
        click(selectTrType);
        click(failure);
        click(submitBtn);
    }

    public void closeFailureScreen() {
        click(closeIconFailureScreen);
    }

    public String getCurrentDat() {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        String formattedDate = today.format(formatter);
        return formattedDate;
    }

    public void verifySuccessTransaction(String amount) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            verifyText("Tier 1");
            verifyText(getCurrentDat() + " • ");
            verifyText("Buy");
            verifyPartialText(amount);
        } else {
            verifyPartialText("Tier 1 " + getCurrentDat() + " •  Buy" + amount);
        }
    }

    public void verifySuccessContribution(String amount) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            verifyText("Tier 1");
            verifyText(getCurrentDat() + " • ");
            verifyText(amount);
        } else {
            verifyPartialText("Tier 1 " + getCurrentDat() + " •  " + amount);
        }
    }

    public void clickHombal() {
        click(hombalFilms);
    }

    public void clickOriginalValueFloatr() {
        click(originalValueFloatr);
    }

    public void deleteBankDetail(String accNo) {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://dev.floatr.in/api/testing/deletedata"))
                    .timeout(Duration.ofMinutes(2))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString("{\n" +
                            "    \"type\" : \"bankaccount\", \n" +
                            "    \"account_number\":\"" + accNo + "\",\n" +
                            "    \"account_type\": \"Personal\"\n" +
                            "} "))
                    .build();
            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("Response Body: " + response.body());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickCorporateSub() {
        click(corporateSubRadioBtn);
    }

    public void clickIndividualSub() {
        click(individualSubRadioBtn);
    }

    public void selectPortfolioOpt(String portFName) throws Exception {
        click(portfolioOpt);
        clickByText(portFName);
    }

    public void closeRestartNpsScreen() {
        click(closeIconRestartPopup);
    }

    public void chooseOneNominee() {
        click(oneNominee);
    }

    public void chooseTwoNominee() {
        click(twoNominee);
    }

    public void verify100PercentNominee() {
        assertTrue(isVisible(hundredPer));
    }

    public void verify50PercentNominee() {
        assertTrue(isVisible(fiftyPer));
    }

    public void verifyAddLimitBank() {
        assertTrue(isVisible(threeBankAllowed));
    }

    public void closeAddingBankPopup() {
        click(addingBankPopup);
    }

    public void selectPFM(String name) throws Exception {
        click(pfmDropDwn);
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andScrollToElementUsingUiScrollable("text", "KOTAK MAHINDRA PENSION FUND");
        } else {
            iOSScrollToElementByName(kotakMahindra, "up", name);
        }
        clickByText(name);
    }

    public void clickRegisterNps() {
        click(openNpsAcc);
    }

    public void scrollCorporateName() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            andScrollToElementUsingUiScrollable("text", "Corporate Name");
        } else {
            scrollToElement(corporateName, "up", pranStatus, 3000, 10);
        }
    }

    public void verifyAppliStatus(DataTable dataTable) {
        List<Map<String, String>> userMap = dataTable.asMaps(String.class, String.class);
        String subscribername = userMap.get(0).get("Subscriber Name");
        Assert.assertEquals(subscriberName2.getText(), subscribername);
        String pranstatus = userMap.get(0).get("PRAN Status");
        Assert.assertEquals(pranStatus.getText(), pranstatus);
        String corporatename = userMap.get(0).get("Corporate Name");
        Assert.assertEquals(corporateName.getText(), corporatename);
        String pranNo = getText(pranNumber, "PRAN Number: ");
        utils.log().info("PRAN Number: " + pranNo);
        String acckNo = getText(acknowledgeNo, "Acknowledgement Number: ");
        utils.log().info("Acknowledgement Number: " + acckNo);
    }

    public void verifyNPSAppliStatus(DataTable dataTable) {
        List<Map<String, String>> userMap = dataTable.asMaps(String.class, String.class);
        String subscribername = userMap.get(0).get("Subscriber Name");
        Assert.assertEquals(subscriberName2.getText(), subscribername);
        String pranstatus = userMap.get(0).get("PRAN Status");
        Assert.assertEquals(pranStatus3.getText(), pranstatus);
        String pranNo = getText(pranNum4, "PRAN Number: ");
        utils.log().info("PRAN Number: " + pranNo);
        String acckNo = getText(ackNum4, "Acknowledgement Number: ");
        utils.log().info("Acknowledgement Number: " + acckNo);
    }

    public void clickAbcTec() {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            click(abcTecno);
        } else {
            click(abcTecno);
        }
    }

    public void verifyRetireAgeValidation() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            verifyStaticText("Retirement Age must be smaller than 75");
        }
    }

    public void verifyCurrentAgeValidation() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            verifyStaticText("Current Age must be smaller than 65");
        }
    }

    public void enterPopSpCode(String popSpCd) {
        clear(popSpCdInBx);
        sendKeys(popSpCdInBx, popSpCd);
        pressEnter();
    }

    public void enterPranNum(String pranNum) {
        clear(pranNumInBx);
        sendKeys(pranNumInBx, pranNum);
        pressEnter();
    }

    public void enterOTPForPranShift() {
        String text = pranShiftOtp.getText();
        String[] str = text.split("OTP Confirmation ");
        String pranOTP = str[1];
        sendKeys(pranShiftOtp1, pranOTP);
    }

    public void enterWrongOTPForPranShift() {

        String text = pranShiftOtp.getText();
        String[] str = text.split("OTP Confirmation ");
        String pranOTP = str[1];
        String reversedStr = "";
        for (int i = 0; i < pranOTP.length(); i++) {
            reversedStr = pranOTP.charAt(i) + reversedStr;
        }
        sendKeys(pranShiftOtp1, reversedStr);
    }

    public void verifyRegiIncreaseAmt() {
        String increaseAmt = increaseRegiAmt.getText();
        if (increaseAmt.contains("600")) {
            assertTrue(increaseAmt.contains("600"));
        } else if (increaseAmt.contains("600.1")) {
            assertTrue(increaseAmt.contains("600.1"));
        } else if (increaseAmt.contains("600.2")) {
            assertTrue(increaseAmt.contains("600.2"));
        } else if (increaseAmt.contains("600.3")) {
            assertTrue(increaseAmt.contains("600.3"));
        } else if (increaseAmt.contains("600.4")) {
            assertTrue(increaseAmt.contains("600.4"));
        }

        getText(increaseRegiAmt, "Registration amount of this register: " + increaseAmt);
    }

    public void enterOTP() {
        new MutualFundPage().enterPurchaseOtp();
    }

    public void enterCorporateEmail(String email) {
        clear(corporateMail);
        sendKeys(corporateMail, email);
    }

    public void clickNomineeBx() {
        click(nomineeBx);
    }

    public void individualRegiInfo(DataTable dataTable) {
        List<Map<String, String>> userMap = dataTable.asMaps(String.class, String.class);
        String subscribername = userMap.get(0).get("Subscriber Name");
        Assert.assertEquals(subscriberName.getText(), subscribername);
        String pranstatus = userMap.get(0).get("PRAN Status");
        Assert.assertEquals(pranStatus1.getText(), pranstatus);
        String npsSector1 = userMap.get(0).get("NPS Sector");
        Assert.assertEquals(npsSector.getText(), npsSector1);
        String cra = userMap.get(0).get("CRA");
        Assert.assertEquals(cra1.getText(), cra);
        String popName1 = userMap.get(0).get("POP Name");
        Assert.assertEquals(popName.getText(), popName1);
        String popCode1 = userMap.get(0).get("POP Code");
        Assert.assertEquals(popCode.getText(), popCode1);
        String popSpName1 = userMap.get(0).get("POP-SP Name");
        Assert.assertEquals(popSpName.getText(), popSpName1);
        String popSpCode1 = userMap.get(0).get("POP-SP Code");
        Assert.assertEquals(popSpCode.getText(), popSpCode1);
    }

    public void corporateRegiInfo(DataTable dataTable) {
        List<Map<String, String>> userMap = dataTable.asMaps(String.class, String.class);
        String subscribername = userMap.get(0).get("Subscriber Name");
        Assert.assertEquals(subscriberName.getText(), subscribername);
        String pranstatus = userMap.get(0).get("PRAN Status");
        Assert.assertEquals(pranStatus1.getText(), pranstatus);
        String npsSector1 = userMap.get(0).get("NPS Sector");
        Assert.assertEquals(npsSector.getText(), npsSector1);
        String cra = userMap.get(0).get("CRA");
        Assert.assertEquals(cra1.getText(), cra);
        String choName = userMap.get(0).get("CHO Name");
        Assert.assertEquals(choName1.getText(), choName);
        String cboName1 = userMap.get(0).get("CBO Name");
        Assert.assertEquals(cboName.getText(), cboName1);
        String popName1 = userMap.get(0).get("POP Name");
        Assert.assertEquals(popName.getText(), popName1);
        String popCode1 = userMap.get(0).get("POP Code");
        Assert.assertEquals(popCode.getText(), popCode1);
    }

    public void selectContributionAmount() {
        click(corporateContri);
    }

    public void scrollToAckn() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            scrollInAndroid(shiftAckn, 503, 1958, 535, 555);
        } else {
            andIosScroll(shiftAckn, "up", shiftingsta);
        }
    }

    public void corporateShiftingDone(String mobileNumber) {
        String[] mobNo = mobileNumber.split(" ");
        try {
            if (Objects.equals(globalParams.getPlatformName(), "Android")) {
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("https://dev.floatr.in/api/testing/deletedata"))
                        .timeout(Duration.ofMinutes(2))
                        .header("Content-Type", "application/json")
                        .POST(HttpRequest.BodyPublishers.ofString("{  \n" +
                                "    \"type\" :\"token\",\n" +
                                "     \"contact\":\"" + mobNo[0] + "\",\n" +
                                "     \"pan\":\"CBFJG5746H\",\n" +
                                "     \"account_number\":\"3553533\",\n" +
                                "     \"account_type\": \"Personal\",\n" +
                                "     \"firstname\": \"Nishath\",\n" +
                                "      \"middlename\": \"Khanum\",\n" +
                                "      \"lastname\": \"S\"\n" +
                                "}"))
                        .build();
                HttpClient client = HttpClient.newHttpClient();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                String[] arr = response.body().split("\"token\":\"");
                String[] responce = arr[1].split("\"}}");
                HttpRequest request1 = HttpRequest.newBuilder()
                        .uri(URI.create("https://dev.floatr.in/api/nps/delete?type=statuschange&status=shifted"))
                        .timeout(Duration.ofMinutes(2))
                        .header("Authorization", responce[0])
                        .DELETE()
                        .build();
                HttpClient client1 = HttpClient.newBuilder().build();

                HttpResponse<String> resp = client1.send(request1, HttpResponse.BodyHandlers.ofString());
                System.out.println("Floatr API Status Code: " + resp.statusCode());
            } else {
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("https://dev.floatr.in/api/testing/deletedata"))
                        .timeout(Duration.ofMinutes(2))
                        .header("Content-Type", "application/json")
                        .POST(HttpRequest.BodyPublishers.ofString("{  \n" +
                                "    \"type\" :\"token\",\n" +
                                "     \"contact\":\"" + mobNo[2] + "\",\n" +
                                "     \"pan\":\"CBFJG5746H\",\n" +
                                "     \"account_number\":\"3553533\",\n" +
                                "     \"account_type\": \"Personal\",\n" +
                                "     \"firstname\": \"Nishath\",\n" +
                                "      \"middlename\": \"Khanum\",\n" +
                                "      \"lastname\": \"S\"\n" +
                                "}"))
                        .build();
                HttpClient client = HttpClient.newHttpClient();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                String[] arr = response.body().split("\"token\":\"");
                String[] responce = arr[1].split("\"}}");


                HttpRequest request1 = HttpRequest.newBuilder()
                        .uri(URI.create("https://dev.floatr.in/api/nps/delete"))
                        .timeout(Duration.ofMinutes(2))
                        .header("Authorization", responce[0])
                        .DELETE()
                        .build();
                HttpClient client1 = HttpClient.newBuilder().build();

                HttpResponse<String> resp = client1.send(request1, HttpResponse.BodyHandlers.ofString());
                System.out.println("Floatr API Status Code: " + resp.statusCode());
            }
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void verifyPranInfoIndToCop(DataTable dataTable) {
        List<Map<String, String>> userMap = dataTable.asMaps(String.class, String.class);
        String subscribername = userMap.get(0).get("Subscriber Name");
        Assert.assertEquals(subscriberName.getText(), subscribername);
        String pranstatus = userMap.get(0).get("PRAN Status");
        Assert.assertEquals(pranStatus1.getText(), pranstatus);
        String npsSector1 = userMap.get(0).get("NPS Sector");
        Assert.assertEquals(npsSector.getText(), npsSector1);
        String cra = userMap.get(0).get("CRA");
        Assert.assertEquals(cra1.getText(), cra);
        String popName1 = userMap.get(0).get("POP Name");
        Assert.assertEquals(popName.getText(), popName1);
        String popCode1 = userMap.get(0).get("POP Code");
        Assert.assertEquals(popCode.getText(), popCode1);
        String cboName1 = userMap.get(0).get("CBO Name");
        Assert.assertEquals(cboName.getText(), cboName1);
        String CboCode1 = userMap.get(0).get("CBO Code");
        Assert.assertEquals(cboCode.getText(), CboCode1);
    }

    public void selectCompanyName(String compName) throws Exception {
        click(companynameBx);
        sendKeys(compSearchSelect, compName);
        Thread.sleep(1000);
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            clickDoneIosKeyboard();
        }
    }

    public void enterNameInPran(String name) {
        clear(nameInPranBx);
        sendKeys(nameInPranBx, name);
        pressEnter();
    }

    public void clickRegisterCorporate() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            if (isElementExist("//*[@text=' Register for Corporate NPS']")) {
                clickByText(" Register for Corporate NPS");
            } else {
                clickByText("Complete Pending Application");
                if (isVisible(corpDetailThick)) {
                    click(corpDetailThick);
                } else {
                    click(corpDetail);
                }

            }
        }
    }

    public void scrollToPost() throws Exception {
        andIosScroll(postRePen, "up", postRetirement);

    }

    public void waitForNpsSuccessSc() {
        if (!isVisible(successfulSc)) {
            waitForVisibility(successfulSc, 8);
        }
    }

    public void waitForNpsFailSc() {
        if (!isVisible(failedSc)) {
            waitForVisibility(failedSc, 8);
        }
    }

    public void waitForSuccessContribution() {
        if (!isVisible(succcofulcontribution)) {
            waitForVisibility(succcofulcontribution, 8);
        }
    }

    public void waitForFailedContribution() {
        if (!isVisible(failedSc)) {
            waitForVisibility(failedSc, 8);
        }
    }

    public void checkAlreadyHaveFloatrPRAN() throws Exception {
        if (isVisible(applyForShifting)) {
            new MutualFundPage().goBackFromScreen("PRAN Shifting");
            click(openNpsAcc);
            clickByText(" Register for Corporate NPS");
            selectCompanyName("ABC Technologies");
            clickByText("ABC Technologies (ABC Tek)");
            enterEmpNum("FR12G34");
            enterCompJoinDt("2");
            new MutualFundPage().clickIWeHaveReadTheRelatedSchemeCheckBox("I am signing up for the Corporate Sector NPS and understand how it operates, including the contribution process and applicable POP charges as outlined by the NPS Trust. I have read and agree to the details provided here");
            clickByText("Continue");
            Thread.sleep(2000);
            clickByText("Continue");
            Thread.sleep(2000);
            clickByText("Continue");
            enterOTP();
            clickSubmitApplication();
            clickByText("Home");
            clickByText("Shift My PRAN");
        }
    }

    public void checkNPSAccount() throws Exception {
        if (isVisible(pranNotFound)) {
            click(openNpsAcc);
            clickByText("Register for Individual NPS");
            Thread.sleep(3000);
            clickByText("Continue");
            Thread.sleep(3000);
            clickByText("Continue");
            clickStaticText("Declaration under the Prevention of Money Laundering Act 2002");
            clickByText("Continue");
            new MutualFundPage().enterPurchaseOtp();
            clickSubmitApplication();
            doPaymentForNps();
            waitForNpsSuccessSc();
            clickHome();
            Thread.sleep(2000);
            clickByText("Invest in NPS");
        }
    }
}

