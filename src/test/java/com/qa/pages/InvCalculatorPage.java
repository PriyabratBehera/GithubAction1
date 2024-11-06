package com.qa.pages;

import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.util.Objects;

public class InvCalculatorPage extends BasePage {
    GlobalParams globalParams = new GlobalParams();
    TestUtils testUtils = new TestUtils();
    @AndroidFindBy(xpath = "//*[@text='Income Tax\n" +
            "Planner']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Income Tax\n" +
            "Planner\"])[2]")
    private MobileElement incomeTaxPlan;
    @AndroidFindBy(xpath = "//*[@text='Insurance\n" +
            "Planner']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Insurance\n" +
            "Planner\"])[2]")
    private MobileElement insurancePlanner;
    @AndroidFindBy(xpath = "//*[@text='RD & SIP\n" +
            "Maturity']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"RD & SIP\n" +
            "Maturity\"])[2]")
    private MobileElement sipAndRD;
    @AndroidFindBy(xpath = "//*[@text='Maturity\n" +
            "Amount']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"One-time\n" +
            "Investment\"])[2]")
    private MobileElement maturityAmount;
    @AndroidFindBy(xpath = "//*[@text='Present\n" +
            "Value']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Present\n" +
            "Value\"])[2]")
    private MobileElement presentValue;
    @AndroidFindBy(xpath = "//*[@text='Future\n" +
            "Value']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Future\n" +
            "Value\"])[2]")
    private MobileElement futureValue;
    @AndroidFindBy(xpath = "//*[@text='Monthly SIP Amount']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Monthly SIP Amount\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement monthlySipBx;
    @AndroidFindBy(xpath = "//*[@text='Investment Period']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Investment Period\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement invPeriodBx;
    @AndroidFindBy(xpath = "//*[@text='Expected rate of return (annual)']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Expected rate of return (annual)\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement rateOfReturnBx;
    @AndroidFindBy(xpath = "//*[@text='Expected Rate of Return (annual)']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Expected Rate of Return (annual)\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement rateOfReturnBx1;
    @AndroidFindBy(xpath = "//*[@text='Annual step-up rate']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Annual step-up rate\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement annualStepUp;
    @AndroidFindBy(xpath = "//*[@text='Amount Invested']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Amount Invested\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement investAmount;
    @AndroidFindBy(xpath = "//*[@text='Set Financial Goals']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Set Financial Goals\"]")
    private MobileElement setFinancialGoal;
    @AndroidFindBy(xpath = "//*[@text='Gross Salary']/following-sibling::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Salary\"])[1]/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement grossSalary;
    @AndroidFindBy(xpath = "//*[@text='Do you get rent from a\n" +
            "residential property?']/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Do you get rent from a\n" +
            "residential property?\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[1]")
    private MobileElement rentFromResiYes;
    @AndroidFindBy(xpath = "//*[@text='Do you get rent from a\n" +
            "residential property?']/following-sibling::android.view.ViewGroup[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Do you get rent from a\n" +
            "residential property?\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[2]")
    private MobileElement rentFromResiNo;
    @AndroidFindBy(xpath = "//*[@text='Have you taken home loan\n" +
            "for this property?']/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Have you taken home loan\n" +
            "for this property?\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[1]")
    private MobileElement takenHomeLoanYes;
    @AndroidFindBy(xpath = "//*[@text='Rent Received']/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Rent Received\"]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement rentReceived;
    @AndroidFindBy(xpath = "//*[@text='Continue']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Continue\"])[2]")
    private MobileElement continueBtn;
    @AndroidFindBy(xpath = "//*[@text='Re-Calculate']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Re-Calculate\"])[2]")
    private MobileElement reCal;
    @AndroidFindBy(xpath = "//*[@text='Property Tax Paid']/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Property Tax Paid\"]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement propertyTaxPaid;
    @AndroidFindBy(xpath = "//*[@text='Any Other Income']/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Any Other Income\"]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement anyOtherIncomeBx;
    @AndroidFindBy(xpath = "//*[@text='Consulting Income']/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Consulting Income\"]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement consultingIncomeBx;
    @AndroidFindBy(xpath = "//*[@text='Basic Salary + DA']/following-sibling::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Basic Salary + DA\"]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement basicSalPlusDa;
    @AndroidFindBy(xpath = "//*[@text='Rental Income']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Rental Income\"]")
    private MobileElement rentalIncome;
    @AndroidFindBy(xpath = "//*[@text='Salary']/following-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Salary\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther")
    private MobileElement infoIcnForSalary;
    @AndroidFindBy(xpath = "//*[@text=' Gross Salary']/parent::android.view.ViewGroup/android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\" Gross Salary\"]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther")
    private MobileElement closeICGroSaSc;
    @AndroidFindBy(xpath = "//*[contains(@text,'Tax Payable : ₹')]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Old Regime\"])[3]/ancestor::XCUIElementTypeOther[3]/following-sibling::XCUIElementTypeOther[1]")
    private MobileElement taxPayable;
    @AndroidFindBy(xpath = "//*[@text='Income Tax Break-up']/following-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Income Tax Break-up\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther")
    private MobileElement taxBreakUp;
    @AndroidFindBy(xpath = "//*[@text='Are you paying home rent?']/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Are you paying home rent?\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[1]")
    private MobileElement aryYouPayingHmRentYes;
    @AndroidFindBy(xpath = "//*[@text=\"Are you paying home rent?\"]/following-sibling::android.view.ViewGroup[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Are you paying home rent?\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[2]")
    private MobileElement aryYouPayingHmRentNo;
    @AndroidFindBy(xpath = "//*[@text='Are you claiming LTA?']/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Are you claiming LTA?\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[1]")
    private MobileElement areYouClaimingLTAYes;
    @AndroidFindBy(xpath = "//*[@text=\"Are you claiming LTA?\"]/following-sibling::android.view.ViewGroup[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Are you claiming LTA?\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[2]")
    private MobileElement areYouClaimingLTANo;
    @AndroidFindBy(xpath = "//*[@text='Do you stay in a metro city?']/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Do you stay in a metro city?\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[1]")
    private MobileElement tayInMetroCity;
    @AndroidFindBy(xpath = "//*[@text='Annual HRA Received']/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Annual HRA Received\"]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement annualHarReceived;
    @AndroidFindBy(xpath = "//*[@text='Rent Paid']/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Rent Paid\"]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement rentPaid;
    @AndroidFindBy(xpath = "//*[@text='Annual LTA Received']/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Annual LTA Received\"]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement annualLTA;
    @AndroidFindBy(xpath = "//*[@text='Travel Cost']/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Travel Cost\"]/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement travelCost;
    @AndroidFindBy(xpath = "//*[@text='Total of PF, PPF,\n" +
            "Sukanya Samriddhi,\n" +
            "ELSS MF, NSC etc']/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Total of PF, PPF,\n" +
            "Sukanya Samriddhi,\n" +
            "ELSS MF, NSC etc']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement ppfAmountBx;
    @AndroidFindBy(xpath = "//*[@text='Life Insurance\n" +
            "Premiums']/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Life Insurance\n" +
            "Premiums']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement lifeInsuranceBx;
    @AndroidFindBy(xpath = "//*[@text='Kid’s School Tuition\n" +
            "Fees']/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Kid’s School Tuition\n" +
            "Fees']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement tuitionFeesBx;
    @AndroidFindBy(xpath = "//*[@text='Self Contribution to\n" +
            "NPS']/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Self Contribution to\n" +
            "NPS']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement selfContributionNps;
    @AndroidFindBy(xpath = "//*[@text='Corporate Contribution\n" +
            "to NPS']/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Corporate Contribution\n" +
            "to NPS']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement corporateContribution;
    @AndroidFindBy(xpath = "//*[@text=' Have you got medical\n" +
            "insurance for self & family?']/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=' Have you got medical\n" +
            "insurance for self & family?']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[1]")
    private MobileElement medicalInsForSelfYes;
    @AndroidFindBy(xpath = "//*[@text=' Have you got medical\n" +
            "insurance for self & family?']//following-sibling::android.view.ViewGroup[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=' Have you got medical\n" +
            "insurance for self & family?']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[2]")
    private MobileElement medicalInsForSelfNo;
    @AndroidFindBy(xpath = "//*[@text=' Is any one of you aged\n" +
            "above 60 years?']/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=' Is any one of you aged\n" +
            "above 60 years?']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[1]")
    private MobileElement ageAbove60Yr;
    @AndroidFindBy(xpath = "//*[@text='Do you pay for medical\n" +
            "insurance of parents?']/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Do you pay for medical\n" +
            "insurance of parents?']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[1]")
    private MobileElement medicalInsForParent;
    @AndroidFindBy(xpath = "//*[@text='Do you pay for medical\n" +
            "insurance of parents?']/following-sibling::android.view.ViewGroup[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Do you pay for medical\n" +
            "insurance of parents?']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[2]")
    private MobileElement medicalInsForParentNo;
    @AndroidFindBy(xpath = "//*[@text='Is any of the insured parent\n" +
            "aged above 60 years?']/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Is any of the insured parent\n" +
            "aged above 60 years?']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[1]")
    private MobileElement parentAgeAbove60;
    @AndroidFindBy(xpath = "//*[@text='Medical Insurance\n" +
            "Premium for self &\n" +
            "family']/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Medical Insurance\n" +
            "Premium for self &\n" +
            "family']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement medicalInsForSelfBx;
    @AndroidFindBy(xpath = "//*[@text='Medical Insurance\n" +
            "Premium for parents']/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Medical Insurance\n" +
            "Premium for parents']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement medicalInsForParentsBx;
    @AndroidFindBy(xpath = "//*[@text='Do you have loan for self\n" +
            "occupied home?']/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Do you have loan for self\n" +
            "occupied home?']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[1]")
    private MobileElement doYouHaveLoanForSelfYs;
    @AndroidFindBy(xpath = "//*[@text='Annual interest\n" +
            "payment on this loan\n" +
            "(upto ₹2 Lakhs)']/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Annual interest\n" +
            "payment on this loan\n" +
            "(upto ₹2 Lakhs)']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement annualIntForLoanBx;
    @AndroidFindBy(xpath = "//*[@text='Annual principal\n" +
            "payment on this loan']/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Annual principal\n" +
            "payment on this loan']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement annualPrincipleForLoanBx;
    @AndroidFindBy(xpath = "//*[@text='Annual interest paid\n" +
            "on property that is\n" +
            "rented out']/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Annual interest paid\n" +
            "on property that is\n" +
            "rented out']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement annualInsPaidForLoanBx;
    @AndroidFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Exemptions\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\" Tax Evaluation\"]")
    private MobileElement taxEvaluation;
    @AndroidFindBy(xpath = "//*[@text='My dependent’s\n" +
            "current age']/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"My dependent’s\n" +
            "current age\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement dependantCurrentAge;
    @AndroidFindBy(xpath = "//*[@text='Till what age they will\n" +
            "need financial support']/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Till what age they will\n" +
            "need financial support\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement financialSupportTillAge;
    @AndroidFindBy(xpath = "//*[@text='Family’s current\n" +
            "annual expenses']/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Family’s current\n" +
            "annual expenses\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement familyAnnualExpenses;
    @AndroidFindBy(xpath = "//*[@text='Expected annual\n" +
            "increase in expenses']/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Expected annual\n" +
            "increase in expenses\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement expectedAnnualExpenses;
    @AndroidFindBy(xpath = "//*[@text='My current age']/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"My current age\"]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement currentAgeBx;
    @AndroidFindBy(xpath = "//*[@text='I will work till the age of\n" +
            "(Retirement age)']/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='I will work till the age of\n" +
            "(Retirement age)']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther")
    private MobileElement retirementAgeBx;
    @AndroidFindBy(xpath = "//*[@text='My present annual\n" +
            "income (₹)']/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='My present annual\n" +
            "income (₹)']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther")
    private MobileElement annualIncomeBx;
    @AndroidFindBy(xpath = "//*[@text='Expected annual hike in\n" +
            "my income (%)']/following-sibling::android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Expected annual hike in\n" +
            "my income (%)']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther")
    private MobileElement annualHikeBx;
    @AndroidFindBy(xpath = "//*[@text='Exemptions']/following-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Exemptions\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther")
    private MobileElement exemption;
    @AndroidFindBy(xpath = "//*[@text='Future Value (Your Goal)']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Future Value (Your Goal)\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement futureValueBx;
    @AndroidFindBy(xpath = "//*[@text='Time Period (in Years)']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Time Period\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement timePeriodBx;
    @AndroidFindBy(xpath = "//*[@text='Annual Rate of Interest']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Annual Rate of Interest\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement annualRateOIPr;
    @AndroidFindBy(xpath = "//*[@text='Current Value']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Current Value\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement currentValueBx;
    @AndroidFindBy(xpath = "//*[@text='Annual Rate of Inflation']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Annual Rate of Inflation\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement annualRateOIFu;

    public void clickIncomeTaxPlan() {
        if (!isVisible(incomeTaxPlan)) {
            if (Objects.equals(globalParams.getPlatformName(), "Android")) {
                andScrollToElementUsingUiScrollable("text", "Income Tax\n" +
                        "Planner");
            } else {
                iOSScrollToElementByName("down", "Income Tax\n" +
                        "Planner");
            }
        }
        click(incomeTaxPlan);
    }
    public void clickInsurancePlan() {
        if (!isVisible(insurancePlanner)) {
            if (Objects.equals(globalParams.getPlatformName(), "Android")) {
                andScrollToElementUsingUiScrollable("text", "Insurance\n" +
                        "Planner");
            } else {
                iOSScrollToElementByName("down", "Insurance\n" +
                        "Planner");
            }
        }
        click(insurancePlanner);
    }

    public void enterGrossSalary(String salaryAmt) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if (grossSalary.getText().equals("₹0")) {
                sendKeys(grossSalary, salaryAmt);
                clickDoneIosKeyboard();
            } else {
                clear(grossSalary);
                sendKeys(grossSalary, salaryAmt);
                clickDoneIosKeyboard();
            }
        }
        else{
            if (grossSalary.getText().equals("₹0")) {
                sendKeys(grossSalary, salaryAmt);
                pressEnter();
            } else {
                clear(grossSalary);
                sendKeys(grossSalary, salaryAmt);
                pressEnter();
            }
        }
    }

    public void getRentFromResiYes() {
        click(rentFromResiYes);
    }

    public void getRentFromResiNo() {
        click(rentFromResiNo);
    }

    public void takenHomeLoanYes() {
        click(takenHomeLoanYes);
    }

    public void clickContinue() {
        click(continueBtn);
    }

    public void clickOnReCal() {
        click(reCal);
    }

    public void enterRentReceived(String amt) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if (rentReceived.getText().equals("₹0")) {
                sendKeys(rentReceived, amt);
                clickDoneIosKeyboard();
            } else {
                click(rentReceived);
                clear(rentReceived);
                clickDoneIosKeyboard();
                sendKeys(rentReceived, amt);
                clickDoneIosKeyboard();
            }
        }
        else{
            if (rentReceived.getText().equals("₹0")) {
                sendKeys(rentReceived, amt);
                pressEnter();
            } else {
                clear(rentReceived);
                sendKeys(rentReceived, amt);
                pressEnter();
            }
        }
    }

    public void enterPropertyTaxPaid(String amt) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if (propertyTaxPaid.getText().equals("₹0")) {
                sendKeys(propertyTaxPaid, amt);
                clickDoneIosKeyboard();
            } else {
                click(propertyTaxPaid);
                clear(propertyTaxPaid);
                clickDoneIosKeyboard();
                sendKeys(propertyTaxPaid, amt);
                clickDoneIosKeyboard();
            }
        }
        else{
            if (propertyTaxPaid.getText().equals("₹0")) {
                sendKeys(propertyTaxPaid, amt);
                pressEnter();
            } else {
                clear(propertyTaxPaid);
                sendKeys(propertyTaxPaid, amt);

            }
        }
    }

    public void ScrollToAnyOtherIncome() throws Exception {
        andIosScroll(anyOtherIncomeBx, "up", rentalIncome);

    }

    public void enterConsultingIncome(String amt) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if (consultingIncomeBx.getText().equals("₹0")) {
                sendKeys(consultingIncomeBx, amt);
                clickDoneIosKeyboard();
            } else {
                click(consultingIncomeBx);
                clear(consultingIncomeBx);
                clickDoneIosKeyboard();
                sendKeys(consultingIncomeBx, amt);
                clickDoneIosKeyboard();
            }
        }
        else{
            if (consultingIncomeBx.getText().equals("₹0")) {
                sendKeys(consultingIncomeBx, amt);
                pressEnter();
            } else {
                clear(consultingIncomeBx);
                sendKeys(consultingIncomeBx, amt);
                pressEnter();
            }
        }
    }

    public void enterAnyOtherIncome(String amt) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if (anyOtherIncomeBx.getText().equals("₹0")) {
                sendKeys(anyOtherIncomeBx, amt);
                clickDoneIosKeyboard();
            } else {
                click(anyOtherIncomeBx);
                clear(anyOtherIncomeBx);
                clickDoneIosKeyboard();
                sendKeys(anyOtherIncomeBx, amt);
                clickDoneIosKeyboard();
            }
        }
        else{
            if (anyOtherIncomeBx.getText().equals("₹0")) {
                sendKeys(anyOtherIncomeBx, amt);
            } else {
                clear(anyOtherIncomeBx);
                sendKeys(anyOtherIncomeBx, amt);
            }
        }
    }

    public void enterBasicSalPlusDa(String amt) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if (basicSalPlusDa.getText().equals("₹0")) {
                sendKeys(basicSalPlusDa, amt);
                clickDoneIosKeyboard();
            } else {
                clear(basicSalPlusDa);
                sendKeys(basicSalPlusDa, amt);
                clickDoneIosKeyboard();
            }
        }
        else{
            if (basicSalPlusDa.getText().equals("₹0")) {
                sendKeys(basicSalPlusDa, amt);
            } else {
                clear(basicSalPlusDa);
                sendKeys(basicSalPlusDa, amt);
            }
        }

    }

    public void areYouPayingHomRentYes() {
        click(aryYouPayingHmRentYes);
    }
    public void areYouPayingHomRentNo() {
        click(aryYouPayingHmRentNo);
    }

    public void areYouClaimingLTAYes() {
        click(areYouClaimingLTAYes);
    }
    public void areYouClaimingLTANo() {
        click(areYouClaimingLTANo);
    }

    public void stayMetroCityYes() {
        click(tayInMetroCity);
    }

    public void enterAnnualHraReceive(String amt) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if (annualHarReceived.getText().equals("₹0")) {
                sendKeys(annualHarReceived, amt);
                clickDoneIosKeyboard();
            } else {
                clear(annualHarReceived);
                sendKeys(annualHarReceived, amt);
                clickDoneIosKeyboard();
            }
        }
        else{
            if (annualHarReceived.getText().equals("₹0")) {
                sendKeys(annualHarReceived, amt);
            } else {
                clear(annualHarReceived);
                sendKeys(annualHarReceived, amt);
            }
        }
    }

    public void enterRentPaid(String amt) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if (rentPaid.getText().equals("₹0")) {
                sendKeys(rentPaid, amt);
                clickDoneIosKeyboard();
            } else {
                clear(rentPaid);
                sendKeys(rentPaid, amt);
                clickDoneIosKeyboard();
            }
        }
        else{
            if (rentPaid.getText().equals("₹0")) {
                sendKeys(rentPaid, amt);
            } else {
                clear(rentPaid);
                sendKeys(rentPaid, amt);
            }
        }
    }

    public void enterAnnualLta(String amt) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if (annualLTA.getText().equals("₹0")) {
                sendKeys(annualLTA, amt);
                clickDoneIosKeyboard();
            } else {
                click(annualLTA);
                clear(annualLTA);
                clickDoneIosKeyboard();
                sendKeys(annualLTA, amt);
                clickDoneIosKeyboard();
            }
        }
        else{
            if (annualLTA.getText().equals("₹0")) {
                sendKeys(annualLTA, amt);
            } else {
                clear(annualLTA);
                sendKeys(annualLTA, amt);
            }
        }
    }

    public void enterTravelCoast(String amt) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if (travelCost.getText().equals("₹0")) {
                sendKeys(travelCost, amt);
                clickDoneIosKeyboard();
            } else {
                click(travelCost);
                clear(travelCost);
                clickDoneIosKeyboard();
                sendKeys(travelCost, amt);
                clickDoneIosKeyboard();
            }
        }
        else{
            if (travelCost.getText().equals("₹0")) {
                sendKeys(travelCost, amt);
            } else {
                clear(travelCost);
                sendKeys(travelCost, amt);
            }
        }
    }

    public void enterPpfAmount(String amt) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if (ppfAmountBx.getText().equals("₹0")) {
                sendKeys(ppfAmountBx, amt);
                clickDoneIosKeyboard();
            } else {
                clear(ppfAmountBx);
                sendKeys(ppfAmountBx, amt);
                clickDoneIosKeyboard();
            }
        }
        else{
            if (ppfAmountBx.getText().equals("₹0")) {
                sendKeys(ppfAmountBx, amt);
            } else {
                clear(ppfAmountBx);
                sendKeys(ppfAmountBx, amt);
            }
        }

    }

    public void enterLifeInsuranceAmt(String amt) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if (lifeInsuranceBx.getText().equals("₹0")) {
                sendKeys(lifeInsuranceBx, amt);
                clickDoneIosKeyboard();
            } else {
                clear(lifeInsuranceBx);
                sendKeys(lifeInsuranceBx, amt);
                clickDoneIosKeyboard();
            }
        }
        else{
            if (lifeInsuranceBx.getText().equals("₹0")) {
                sendKeys(lifeInsuranceBx, amt);
            } else {
                clear(lifeInsuranceBx);
                sendKeys(lifeInsuranceBx, amt);
            }
        }
    }

    public void enterTuitionFees(String amt) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if (tuitionFeesBx.getText().equals("₹0")) {
                sendKeys(tuitionFeesBx, amt);
                clickDoneIosKeyboard();
            } else {
                clear(tuitionFeesBx);
                sendKeys(tuitionFeesBx, amt);
                clickDoneIosKeyboard();
            }
        }
        else{
            if (tuitionFeesBx.getText().equals("₹0")) {
                sendKeys(tuitionFeesBx, amt);
            } else {
                clear(tuitionFeesBx);
                sendKeys(tuitionFeesBx, amt);
            }
        }
    }

    public void enterSelfContribution(String amt) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if (selfContributionNps.getText().equals("₹0")) {
                sendKeys(selfContributionNps, amt);
                clickDoneIosKeyboard();
            } else {
                click(selfContributionNps);
                clear(selfContributionNps);
                clickDoneIosKeyboard();
                sendKeys(selfContributionNps, amt);
                clickDoneIosKeyboard();
            }
        }
        else{
            if (selfContributionNps.getText().equals("₹0")) {
                sendKeys(selfContributionNps, amt);
            } else {
                click(selfContributionNps);
                clear(selfContributionNps);
                sendKeys(selfContributionNps, amt);
            }
        }
    }

    public void enterCorporateContribution(String amt) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if (corporateContribution.getText().equals("₹0")) {
                sendKeys(corporateContribution, amt);
                clickDoneIosKeyboard();
            } else {
                click(corporateContribution);
                clear(corporateContribution);
                clickDoneIosKeyboard();
                sendKeys(corporateContribution, amt);
                clickDoneIosKeyboard();
            }
        }
        else{
            if (corporateContribution.getText().equals("₹0")) {
                sendKeys(corporateContribution, amt);
            } else {
                click(corporateContribution);
                clear(corporateContribution);
                sendKeys(corporateContribution, amt);
            }
        }
    }

    public void medicalInsForSelfYs() {
        click(medicalInsForSelfYes);
    }
    public void medicalInsForSelfNo() {
        click(medicalInsForSelfNo);
    }

    public void ageAbove60Ys() {
        click(ageAbove60Yr);
    }

    public void enterMedicalIns(String amt) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if (medicalInsForSelfBx.getText().equals("₹0")) {
                sendKeys(medicalInsForSelfBx, amt);
                clickDoneIosKeyboard();
            } else {
                clear(medicalInsForSelfBx);
                sendKeys(medicalInsForSelfBx, amt);
                clickDoneIosKeyboard();
            }
        }
        else{
            if (medicalInsForSelfBx.getText().equals("₹0")) {
                sendKeys(medicalInsForSelfBx, amt);
            } else {
                clear(medicalInsForSelfBx);
                sendKeys(medicalInsForSelfBx, amt);
            }
        }
    }

    public void medicalInsPareYs() {
        click(medicalInsForParent);
    }
    public void medicalInsPareNo() {
        click(medicalInsForParentNo);
    }

    public void parentAgeAbo60() {
        click(parentAgeAbove60);
    }

    public void medicalInsParents(String amt) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if (medicalInsForParentsBx.getText().equals("₹0")) {
                sendKeys(medicalInsForParentsBx, amt);
                clickDoneIosKeyboard();
            } else {
                click(medicalInsForParentsBx);
                clear(medicalInsForParentsBx);
                clickDoneIosKeyboard();
                sendKeys(medicalInsForParentsBx, amt);
                clickDoneIosKeyboard();
            }
        }
        else{
            if (medicalInsForParentsBx.getText().equals("₹0")) {
                sendKeys(medicalInsForParentsBx, amt);
            } else {
                click(medicalInsForParentsBx);
                clear(medicalInsForParentsBx);
                clickDoneIosKeyboard();
                pressEnter();
            }
        }
    }

    public void doYouHaveLoanYs() {
        click(doYouHaveLoanForSelfYs);
    }

    public void enterAnnualIntPayment(String amt) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if (annualIntForLoanBx.getText().equals("₹0")) {
                sendKeys(annualIntForLoanBx, amt);
                clickDoneIosKeyboard();
            } else {
                clear(annualIntForLoanBx);
                sendKeys(annualIntForLoanBx, amt);
                clickDoneIosKeyboard();
            }
        }
        else{
            if (annualIntForLoanBx.getText().equals("₹0")) {
                sendKeys(annualIntForLoanBx, amt);
            } else {
                clear(annualIntForLoanBx);
                sendKeys(annualIntForLoanBx, amt);
            }
        }
    }

    public void enterAnnualPrinciplePayment(String amt) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if (annualPrincipleForLoanBx.getText().equals("₹0")) {
                sendKeys(annualPrincipleForLoanBx, amt);
                clickDoneIosKeyboard();
            } else {
                clear(annualPrincipleForLoanBx);
                sendKeys(annualPrincipleForLoanBx, amt);
                clickDoneIosKeyboard();
            }
        }
        else{
            if (annualPrincipleForLoanBx.getText().equals("₹0")) {
                sendKeys(annualPrincipleForLoanBx, amt);
            } else {
                clear(annualPrincipleForLoanBx);
                sendKeys(annualPrincipleForLoanBx, amt);
            }
        }
    }

    public void enterAnnualIntPaid(String amt) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if (annualInsPaidForLoanBx.getText().equals("₹0")) {
                sendKeys(annualInsPaidForLoanBx, amt);
                clickDoneIosKeyboard();
            } else {
                click(annualInsPaidForLoanBx);
                clear(annualInsPaidForLoanBx);
                clickDoneIosKeyboard();
                sendKeys(annualInsPaidForLoanBx, amt);
                clickDoneIosKeyboard();
            }
        }
        else{
            if (annualInsPaidForLoanBx.getText().equals("₹0")) {
                sendKeys(annualInsPaidForLoanBx, amt);
            } else {
                click(annualInsPaidForLoanBx);
                clear(annualInsPaidForLoanBx);
                sendKeys(annualInsPaidForLoanBx, amt);
            }
        }
    }

    public void scrollToExemption() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            swipe(491,1749,523,177,1000);
        } else {
                iOSScrollToElementByName("down", "Exemptions");
            }
        }

    public void clickExemptionDrDwn() {
        click(exemption);
    }

    public void clickImfIcForSalary() {
        click(infoIcnForSalary);
    }

    public void closeImfIcForSalary() {
        click(closeICGroSaSc);
    }

    public void clickTaxPayable() {
        click(taxPayable);
    }
    public void closeIncomeTaxBreak() {
        click(taxBreakUp);
    }

    public void enterDependentAge(String year) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if (dependantCurrentAge.getText().equals("years")) {
                sendKeys(dependantCurrentAge, year);
                clickDoneIosKeyboard();
            } else {
                clear(dependantCurrentAge);
                sendKeys(dependantCurrentAge, year);
                clickDoneIosKeyboard();
            }
        }
        else{
            if (dependantCurrentAge.getText().equals("years")) {
                sendKeys(dependantCurrentAge, year);
            } else {
                clear(dependantCurrentAge);
                sendKeys(dependantCurrentAge, year);
            }
        }
    }
    public void enterFinancialSupportTillAge(String year) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if (financialSupportTillAge.getText().equals("years")) {
                sendKeys(financialSupportTillAge, year);
                clickDoneIosKeyboard();
            } else {
                clear(financialSupportTillAge);
                sendKeys(financialSupportTillAge, year);
                clickDoneIosKeyboard();
            }
        }
        else{
            if (financialSupportTillAge.getText().equals("years")) {
                sendKeys(financialSupportTillAge, year);
            } else {
                clear(financialSupportTillAge);
                sendKeys(financialSupportTillAge, year);
            }
        }
    }
    public void enterFamilyCurrentExpenses(String year) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if (familyAnnualExpenses.getText().equals("₹0")) {
                sendKeys(familyAnnualExpenses, year);
                clickDoneIosKeyboard();
            } else {
                clear(familyAnnualExpenses);
                sendKeys(familyAnnualExpenses, year);
                clickDoneIosKeyboard();
            }
        }
        else{
            if (familyAnnualExpenses.getText().equals("₹0")) {
                sendKeys(familyAnnualExpenses, year);
            } else {
                clear(familyAnnualExpenses);
                sendKeys(familyAnnualExpenses, year);
            }
        }
    }
    public void enterExpectedAnnualIncrease(String year) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if ( expectedAnnualExpenses.getText().equals("%")) {
                sendKeys( expectedAnnualExpenses, year);
                clickDoneIosKeyboard();
            } else {
                click( expectedAnnualExpenses);
                clear( expectedAnnualExpenses);
                clickDoneIosKeyboard();
                sendKeys( expectedAnnualExpenses, year);
                clickDoneIosKeyboard();
            }
        }
        else{
            if ( expectedAnnualExpenses.getText().equals("%")) {
                sendKeys( expectedAnnualExpenses, year);
            } else {
                clear( expectedAnnualExpenses);
                sendKeys( expectedAnnualExpenses, year);
            }
        }
    }
    public void enterCurrentAge(String year) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if ( currentAgeBx.getText().equals("years")) {
                sendKeys( currentAgeBx, year);
                clickDoneIosKeyboard();
            } else {
                clear( currentAgeBx);
                sendKeys( currentAgeBx, year);
                clickDoneIosKeyboard();
            }
        }
        else{
            if ( currentAgeBx.getText().equals("years")) {
                sendKeys( currentAgeBx, year);
            } else {
                clear( currentAgeBx);
                sendKeys( currentAgeBx, year);
            }
        }
    }
    public void enterRetirementAge(String year) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if ( retirementAgeBx.getText().equals("years")) {
                sendKeys( retirementAgeBx, year);
                clickDoneIosKeyboard();
            } else {
                clear( retirementAgeBx);
                sendKeys( retirementAgeBx, year);
                clickDoneIosKeyboard();
            }
        }
        else{
            if ( retirementAgeBx.getText().equals("years")) {
                sendKeys( retirementAgeBx, year);
            } else {
                clear( retirementAgeBx);
                sendKeys( retirementAgeBx, year);
            }
        }
    }
    public void enterFutureValue(String amt) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if (futureValueBx.getText().equals("₹0")) {
                sendKeys(futureValueBx, amt);
                clickDoneIosKeyboard();
            } else {
                clear(futureValueBx);
                sendKeys(futureValueBx, amt);
                clickDoneIosKeyboard();
            }
        }
        else{
            if (futureValueBx.getText().equals("₹0")) {
                sendKeys(futureValueBx, amt);
            } else {
                clear(futureValueBx);
                sendKeys(futureValueBx, amt);
            }
        }
    }
    public void enterAnnualRateOInt(String amt) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if (annualRateOIPr.getText().equals("1 year")) {
                sendKeys(annualRateOIPr, amt);
                clickDoneIosKeyboard();
            } else {
                clear(annualRateOIPr);
                sendKeys(annualRateOIPr, amt);
                clickDoneIosKeyboard();
            }
        }
        else{
            if (annualRateOIPr.getText().equals("1 year")) {
                sendKeys(annualRateOIPr, amt);
            } else {
                clear(annualRateOIPr);
                sendKeys(annualRateOIPr, amt);
            }
        }
    }
    public void enterAnnualRateOfInfla(String amt) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if (annualRateOIFu.getText().equals("2.50%")) {
                sendKeys(annualRateOIFu, amt);
                clickDoneIosKeyboard();
            } else {
                clear(annualRateOIFu);
                sendKeys(annualRateOIFu, amt);
                clickDoneIosKeyboard();
            }
        }
        else{
            if (annualRateOIFu.getText().equals("2.50%")) {
                sendKeys(annualRateOIFu, amt);
            } else {
                clear(annualRateOIFu);
                sendKeys(annualRateOIFu, amt);
            }
        }
    }
    public void enterCurrentValue(String amt) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if (currentValueBx.getText().equals("₹0")) {
                sendKeys(currentValueBx, amt);
                clickDoneIosKeyboard();
            } else {
                clear(currentValueBx);
                sendKeys(currentValueBx, amt);
                clickDoneIosKeyboard();
            }
        }
        else{
            if (currentValueBx.getText().equals("₹0")) {
                sendKeys(currentValueBx, amt);
            } else {
                clear(currentValueBx);
                sendKeys(currentValueBx, amt);
            }
        }
    }
    public void enterTimePeriod(String year) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if (timePeriodBx.getText().equals("1 year")) {
                sendKeys(timePeriodBx, year);
                clickDoneIosKeyboard();
            } else {
                clear(timePeriodBx);
                sendKeys(timePeriodBx, year);
                clickDoneIosKeyboard();
            }
        }
        else{
            if (timePeriodBx.getText().equals("1 year")) {
                sendKeys(timePeriodBx, year);
            } else {
                clear(timePeriodBx);
                sendKeys(timePeriodBx, year);
            }
        }
    }
    public void enterAnnualIncome(String amt) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if ( annualIncomeBx.getText().equals("₹0")) {
                sendKeys( annualIncomeBx, amt);
                clickDoneIosKeyboard();
            } else {
                clear( annualIncomeBx);
                sendKeys( annualIncomeBx, amt);
                clickDoneIosKeyboard();
            }
        }
        else{
            if ( annualIncomeBx.getText().equals("₹0")) {
                sendKeys( annualIncomeBx, amt);
            } else {
                clear( annualIncomeBx);
                sendKeys( annualIncomeBx, amt);
            }
        }
    }
    public void enterAnnualHike(String percent) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if ( annualHikeBx.getText().equals("%")) {
                sendKeys( annualHikeBx, percent);
                clickDoneIosKeyboard();
            } else {
                click(annualHikeBx);
                clear( annualHikeBx);
                clickDoneIosKeyboard();
                sendKeys( annualHikeBx, percent);
                clickDoneIosKeyboard();
            }
        }
        else{
            if ( annualHikeBx.getText().equals("%")) {
                sendKeys( annualHikeBx, percent);
            } else {
                clear( annualHikeBx);
                sendKeys( annualHikeBx, percent);
            }
        }
    }
    public void scrollDependantAgeList(){
        if(Objects.equals(globalParams.getPlatformName(),"iOS")){
            iOSScrollToElementByName("down", "79 years");
        }
    }
    public void scrollInsurancePlan() throws InterruptedException {
        if(Objects.equals(globalParams.getPlatformName(),"iOS")){
            iOSScrollToElementByName("down", "Insurance\n" +
                    "Planner");
            iOSSwipe(setFinancialGoal,"up",incomeTaxPlan);
        }
        else{
            andScrollToElementUsingUiScrollable("text", "Insurance\n" +
                    "Planner");
        }
    }
    public void swipeToRDAndMaturity() {
        click(sipAndRD);
    }
    public void clickOnMaturityAmt() {
        click(maturityAmount);
    }
    public void swipeToPresentValue() {
        click(presentValue);
    }
    public void clickFutureValue() {
        click(futureValue);
    }
    public void enterMonthlySip(String amt) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if ( monthlySipBx.getText().equals("₹0")) {
                sendKeys( monthlySipBx, amt);
                clickDoneIosKeyboard();
            } else {
                clear( monthlySipBx);
                sendKeys( monthlySipBx, amt);
                clickDoneIosKeyboard();
            }
        }
        else{
            if ( monthlySipBx.getText().equals("₹0")) {
                sendKeys( monthlySipBx, amt);
            } else {
                clear( monthlySipBx);
                sendKeys( monthlySipBx, amt);
            }
        }
    }
    public void enterInvestmentPeriod(String year) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if ( invPeriodBx.getText().equals("1 year")) {
                sendKeys( invPeriodBx, year);
                clickDoneIosKeyboard();
            } else {
                clear( invPeriodBx);
                sendKeys( invPeriodBx, year);
                clickDoneIosKeyboard();
            }
        }
        else{
            if ( invPeriodBx.getText().equals("1 year")) {
                sendKeys( invPeriodBx, year);
            } else {
                clear( invPeriodBx);
                sendKeys( invPeriodBx, year);
            }
        }
    }
    public void enterAnnualRateOfRet(String percent) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if ( rateOfReturnBx.getText().equals("2.50%")) {
                sendKeys( rateOfReturnBx, percent);
                clickDoneIosKeyboard();
            } else {
                clear( rateOfReturnBx);
                sendKeys( rateOfReturnBx, percent);
                clickDoneIosKeyboard();
            }
        }
        else{
            if ( rateOfReturnBx.getText().equals("2.50%")) {
                sendKeys( rateOfReturnBx, percent);
            } else {
                clear( rateOfReturnBx);
                sendKeys( rateOfReturnBx, percent);
            }
        }
    }
    public void enterAnnualRateOfRetForFD(String percent) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if ( rateOfReturnBx1.getText().equals("2.50%")) {
                sendKeys( rateOfReturnBx1, percent);
                clickDoneIosKeyboard();
            } else {
                clear( rateOfReturnBx1);
                sendKeys( rateOfReturnBx1, percent);
                clickDoneIosKeyboard();
            }
        }
        else{
            if ( rateOfReturnBx1.getText().equals("2.50%")) {
                sendKeys( rateOfReturnBx1, percent);
            } else {
                clear( rateOfReturnBx1);
                sendKeys( rateOfReturnBx1, percent);
            }
        }
    }
    public void enterAnnualStepUp(String percent) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if ( annualStepUp.getText().equals("2.50%")) {
                sendKeys( annualStepUp, percent);
                clickDoneIosKeyboard();
            } else {
                clear( annualStepUp);
                sendKeys( annualStepUp, percent);
                clickDoneIosKeyboard();
            }
        }
        else{
            if ( annualStepUp.getText().equals("2.50%")) {
                sendKeys( annualStepUp, percent);
            } else {
                clear( annualStepUp);
                sendKeys( annualStepUp, percent);
            }
        }
    }
    public void enterInvestedAmount(String amt) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if ( investAmount.getText().equals("₹0")) {
                sendKeys( investAmount, amt);
                clickDoneIosKeyboard();
            } else {
                clear( investAmount);
                sendKeys( investAmount, amt);
                clickDoneIosKeyboard();
            }
        }
        else{
            if ( investAmount.getText().equals("₹0")) {
                sendKeys( investAmount, amt);
            } else {
                clear( investAmount);
                sendKeys( investAmount, amt);
            }
        }
    }
    public void verifyValIncomeTax(String text) throws Exception {
        if(Objects.equals(globalParams.getPlatformName(),"iOS")){
            verifyPartialText("Value cannot exceed ₹ "+text);
        }
        else{
            verifyText("Value cannot exceed ₹"+text);
        }
    }
    public void verifyValidationOfSal(String text) throws Exception {
        if(Objects.equals(globalParams.getPlatformName(),"iOS")){
            verifyPartialText("Value cannot exceed ₹ "+text);
        }
        else{
            verifyText("Value cannot exceed ₹"+text);
        }
    }
}

