package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.testng.Assert;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class InsurancePage extends BasePage {

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Life Insurance Guaranteed payment\n" +
            "in case of your death\"]")
    @AndroidFindBy(xpath = "//*[@text='Life Insurance']")
    private MobileElement lifeInsurance;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Daily Hospital Cash Fixed allowance for\n" +
            "hospitalization days\"])[3]")
    @AndroidFindBy(xpath = "//*[@text='Daily Hospital Cash']")
    private MobileElement dailyHospoitalCard;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Mediclaim Cashless treatment\n" +
            "when you are hospitalized\"]")
    @AndroidFindBy(xpath = "//*[@text='Mediclaim']")
    private MobileElement mediclaim;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Cash Benefit Premium (All Incl.) ₹2,000 per day ₹943\"]")
    @AndroidFindBy(xpath = "//*[@text='₹2,000 per day']")
    private MobileElement twentyThousandPerDay;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"What is a term insurance?\"]/following-sibling::XCUIElementTypeOther[2]")
    @AndroidFindBy(xpath = "//*[@text='What is a term insurance?']/parent::android.view.ViewGroup/android.view.ViewGroup")
    private MobileElement letUsCalculate;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Insurance Type\"]/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Insurance Type']/following-sibling::android.view.ViewGroup[1]")
    private MobileElement insTypeBx;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Policy Number\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Policy Number']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    private MobileElement policyNumBx;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Insurance Company\"]/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Insurance Company']/following-sibling::android.view.ViewGroup[1]")
    private MobileElement insCompBx;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Sum Assured\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Sum Assured']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    private MobileElement sumAssureBx;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Premium Paid\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Premium Paid']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    private MobileElement premiumPaid;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Premium Paying Frequency\"]/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Premium Paying Frequency']/following-sibling::android.view.ViewGroup[1]")
    private MobileElement premiumPayingFreq;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Next Premium Due Date\"]/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Next Premium Due Date']/following-sibling::android.view.ViewGroup[1]")
    private MobileElement nextPreDt;
    @AndroidFindBy(xpath = "//*[@text=\"S\"]/preceding-sibling::android.view.ViewGroup/child::android.view.ViewGroup[2]/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"S\"])[1]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeOther[3]")
    private MobileElement currentYear;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Select Insurance Company\"]/parent::XCUIElementTypeOther/ancestor::XCUIElementTypeOther[3]/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeOther[3]/descendant::XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text=\"Select Insurance Company\"]/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[2]/descendant::android.widget.EditText")
    private MobileElement searchCompName;
    @AndroidFindBy(xpath = "//*[@text=\"scroll down\"]/preceding-sibling::android.widget.ScrollView/descendant::android.view.ViewGroup[4]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"scroll down\"]/preceding-sibling::XCUIElementTypeOther[2]/descendant::XCUIElementTypeOther[8]")
    private MobileElement dtPicker;
    @AndroidFindBy(xpath = "//*[@text=\"2025\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"2025\"])[1]")
    private MobileElement Two24;
    @AndroidFindBy(xpath = "//*[@text=\"Health Insurance\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Health Insurance\"])[2]")
    private MobileElement healthInsu;
    @AndroidFindBy(xpath = "//*[@text=\"Sum Assured\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Sum Assured\"]")
    private MobileElement sumAssured;
    @AndroidFindBy(xpath = "//*[@text=\"Policy Document (for your future reference)\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Policy Document (for your future reference)\"]")
    private MobileElement policyDocs;
    @AndroidFindBy(xpath = "//*[@text=\"S\"]/preceding-sibling::android.view.ViewGroup/child::android.view.ViewGroup[3]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"S\"])[1]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeOther[2]")
    private MobileElement calForwardBtn;

    @AndroidFindBy(xpath = "//*[@text=\"Policy Number\"]/preceding-sibling::android.view.ViewGroup[3]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Policy Number\"]/parent::XCUIElementTypeOther/ancestor::XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]")
    private MobileElement slideDraw;

    @AndroidFindBy(xpath = "//*[@text=\"S\"]/preceding-sibling::android.view.ViewGroup/child::android.view.ViewGroup[3]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Half Yearly\"])[1]")
    private MobileElement quarterly;
    @AndroidFindBy(xpath = "//*[@text=\"S\"]/preceding-sibling::android.view.ViewGroup/child::android.view.ViewGroup[3]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Monthly\"])[1]")
    private MobileElement monthly;
    @AndroidFindBy(xpath = "//*[@text=\"Policy Number\"]/preceding-sibling::android.view.ViewGroup[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"My Insurance Policies\"]/ancestor::XCUIElementTypeOther[6]/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeOther[16]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]")
    private MobileElement insuranceCard;

    @AndroidFindBy(xpath = "//*[@text=\"Policy Number\"]/preceding-sibling::android.view.ViewGroup[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Policy Detail\"]/ancestor::XCUIElementTypeOther[6]/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeOther[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]")
    private MobileElement deleteIcon;

    public void clickInsurance() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            tapOn(298, 881);
        } else {
            clickByText("Insurance");
        }
    }

    public void clickLifeInsu() {
        click(lifeInsurance);
    }

    public void clickMediclaim() {
        click(mediclaim);
    }

    public void clickDailyHospitalCard() {
        click(dailyHospoitalCard);
    }

    public void clickTwentyThousandPerDay() {
        click(twentyThousandPerDay);
    }

    public void clickLetsCalculate() {
        click(letUsCalculate);
    }

    public void selectInsuranceType(String InsName) throws Exception {
        click(insTypeBx);
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "(//XCUIElementTypeOther[@name='" + InsName + "'])[2]";
            if (!isElementExist(xpath)) {
                swipe(154, 517, 151, 437, 100);
                click(getElement(xpath));
            } else {
                click(getElement(xpath));
            }
        }
        else{
            xpath="//*[@text='"+InsName+"']";
            if(! isElementExist(xpath)){
                andScrollToElementUsingUiScrollable("text",InsName);
            }
            else{
                click(getElement(xpath));
            }
        }
    }

    public void enterPolicyNum(String policyNum) throws Exception {
        if (policyNumBx.getText().equals("Enter policy number")) {
            sendKeys(policyNumBx, policyNum);
        } else {
            clear(policyNumBx);
            sendKeys(policyNumBx, policyNum);
        }
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            clickDoneIosKeyboard();
        } else {
            clickByText("Policy Number");
        }
    }

    public void selectInsuranceCompany(String compName) throws Exception {
        click(insCompBx);
        String firstCompName = compName.split(" ")[0];
        sendKeys(searchCompName, firstCompName);
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            clickDoneIosKeyboard();
        }
        clickByText(compName);
    }

    public void enterSumAssured(String amount) throws Exception {
        if (sumAssureBx.getText().equals("Amount in ₹")) {
            sendKeys(sumAssureBx, amount);
        } else {
            clear(sumAssureBx);
            sendKeys(sumAssureBx, amount);
        }
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            clickDoneIosKeyboard();
        } else {
            clickByText("Sum Assured");
        }
    }

    public void enterPremiumPaid(String amount) throws Exception {
        if (premiumPaid.getText().equals("Amount in ₹")) {
            sendKeys(premiumPaid, amount);
        } else {
            clear(premiumPaid);
            sendKeys(premiumPaid, amount);
        }
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            clickDoneIosKeyboard();
        } else {
            clickByText("Premium Paid");
        }
    }

    public void scrollToPolicyDoc() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
//            iOSScrollToElementByName("down","Policy Document (for your future reference)");
            andIosScroll(policyDocs, "up", sumAssured);
        }
        else{
            andScrollToElementUsingUiScrollable("text","Policy Document (for your future reference)");
        }
    }

    public void selectPremiumPayingFreq(String freName) throws Exception {
        click(premiumPayingFreq);
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "(//XCUIElementTypeOther[@name='" + freName + "'])[1]";
            if (!isElementExist(xpath)) {
                for (int i = 0; i < 10; i++) {
                    swipe(77, 802, 96, 714, 2000);
                    if (getElement(xpath).isDisplayed()) {
                        click(getElement(xpath));
                        break;
                    }

                }


            } else {
                click(getElement(xpath));
            }
        }
        else{
            xpath="//*[@text='"+ freName +"']";
            if (!isElementExist(xpath)) {
                for (int i = 0; i < 10; i++) {
//                    swipe(77, 802, 96, 714, 2000);
                    andScrollToElementUsingUiScrollable("text",getElement(xpath).getText());
                    if (getElement(xpath).isDisplayed()) {
                        click(getElement(xpath));
                        break;
                    }

                }


            } else {
                click(getElement(xpath));
            }
        }
    }

    public void selectNextAnnualPremiumDt() throws Exception {
        click(nextPreDt);
        String currentYr = currentYear.getText().split(" ")[0];
        int year = Integer.parseInt(currentYr);
        click(currentYear);
        int nextYear = year + 1;
        String nextYr = Integer.toString(nextYear);
        Thread.sleep(2000);
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            for(int i=0;i<2;i++){
//                andScrollToElementUsingUiScrollable("text", currentYr);
                andIosScroll(Two24, "up", dtPicker, 50);
            }
            String xpath = "//*[@text='" + nextYr + "']";
            if(! isElementExist(xpath)){
                xpath = "(//*[@text='" + nextYr + "'])[2]";
            }
            click(getElement(xpath));
        } else {
            scrollToElement(Two24, "up", dtPicker, 100, 20);
            String xpath = "(//XCUIElementTypeOther[@name='" + nextYr + "'])[1]";
            if(! isElementExist(xpath)){
                xpath = "(//XCUIElementTypeOther[@name='" + nextYr + "'])[2]";
            }
            click(getElement(xpath));
        }
        clickByText("1");
        clickByText("OK");
    }

    public void selectNextQuarterlyPremiumDt() throws Exception {
        click(nextPreDt);
        String currentYr = currentYear.getText().split(" ")[0];
        int year = Integer.parseInt(currentYr);
        click(currentYear);
        int nextYear = year + 1;
        String nextYr = Integer.toString(nextYear);
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
//            andScrollToElementUsingUiScrollable("text", currentYr);
            andIosScroll(Two24, "up", dtPicker, 50);
            String xpath = "//*[@text='" + nextYr + "']";
            if(! isElementExist(xpath)){
                xpath = "(//*[@text='" + nextYr + "'])[2]";
            }
            click(getElement(xpath));
        } else {
            scrollToElement(Two24, "up", dtPicker, 100, 20);
            String xpath = "(//XCUIElementTypeOther[@name='" + nextYr + "'])[1]";
            if(! isElementExist(xpath)){
                xpath = "(//XCUIElementTypeOther[@name='" + nextYr + "'])[2]";
            }
            click(getElement(xpath));
        }
        clickByText("7");
        clickByText("OK");
    }

    public void selectNextMonthlyPremiumDt() throws Exception {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d");
        String formattedDate1 = formatter.format(now);
        click(nextPreDt);
        click(calForwardBtn);
        String xpath = "";
        if(formattedDate1.equals("31")){
            formattedDate1="30";
        }
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "(//XCUIElementTypeOther[@name='" + formattedDate1 + "'])[2]";
            if(! isElementExist(xpath)){
                xpath = "(//XCUIElementTypeOther[@name='" + formattedDate1 + "'])[1]";
            }
        } else {
            xpath = "(//*[@text='" + formattedDate1 + "'])[2]";
            if(! isElementExist(xpath)){
                xpath = "(//*[@text='" + formattedDate1 + "'])[1]";
            }
        }
        click(getElement(xpath));
        clickByText("OK");
    }

    public void clickSlideDrow() throws Exception {
        String xpath=" ";
        if(Objects.equals(globalParams.getPlatformName(),"Android")){
            xpath="//*[@text=\"Policy Number\"]/preceding-sibling::android.view.ViewGroup[2]";
            if(isElementExist(xpath)){
                click(getElement(xpath));
            }
            else{
                String xpath1="//*[@text=\"Policy Number\"]/preceding-sibling::android.view.ViewGroup[3]";
                click(getElement(xpath1));
            }
        }
        else{
            click(slideDraw);
        }

    }

    public void verifyNextPremiumDue() throws Exception {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nextMonth = now.plusMonths(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        String formattedDate1 = formatter.format(nextMonth);
        String xpath=" ";
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "//XCUIElementTypeStaticText[@name='" + formattedDate1 + "']";
        }
        else{
            xpath="//*[@text='"+ formattedDate1 +"']";
        }
        isVisible(getElement(xpath));
    }

    public void deleteInsuranceCard() throws Exception {
        String xpath = " ";
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "//XCUIElementTypeStaticText[@name=\"My Insurance Policies\"]/ancestor::XCUIElementTypeOther[6]/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeOther[16]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]";
        }
        else{
                xpath="//*[@text=\"Policy Number\"]/preceding-sibling::android.view.ViewGroup[3]";
            }
        for (int i = 0; i < 10; i++) {
            if (!isElementExist(xpath)) {
                if (isVisible(insuranceCard)) {
                    click(insuranceCard);
                    Thread.sleep(2000);
                    click(deleteIcon);
                    clickByText("Yes");
                } else {
                    break;
                }
            } else {
                if (isVisible(getElement(xpath))) {
                    click(getElement(xpath));
                    System.out.println("Manas");
                    Thread.sleep(2000);
                    click(deleteIcon);
                    clickByText("Yes");
                } else {
                    break;
                }
            }

        }
        clickByText("Health");
        for (int i = 0; i < 10; i++) {
            if (!isElementExist(xpath)) {
                if (isVisible(insuranceCard)) {
                    click(insuranceCard);
                    Thread.sleep(2000);
                    click(deleteIcon);
                    clickByText("Yes");
                } else {
                    break;
                }
            } else {
                if (isVisible(getElement(xpath))) {
                    click(getElement(xpath));
                    Thread.sleep(2000);
                    click(deleteIcon);
                    clickByText("Yes");
                } else {
                    break;
                }
            }
        }
        clickByText("Accident");
        for (int i = 0; i < 10; i++) {
            if (!isElementExist(xpath)) {
                if (isVisible(insuranceCard)) {
                    click(insuranceCard);
                    Thread.sleep(2000);
                    click(deleteIcon);
                    clickByText("Yes");
                } else {
                    break;
                }
            } else {
                if (isVisible(getElement(xpath))) {
                    click(getElement(xpath));
                    Thread.sleep(2000);
                    click(deleteIcon);
                    clickByText("Yes");
                } else {
                    break;
                }
            }
        }
        clickByText("Others");
        for (int i = 0; i < 10; i++) {
            if (!isElementExist(xpath)) {
                if (isVisible(insuranceCard)) {
                    click(insuranceCard);
                    Thread.sleep(2000);
                    click(deleteIcon);
                    clickByText("Yes");
                } else {
                    break;
                }
            } else {
                if (isVisible(getElement(xpath))) {
                    click(getElement(xpath));
                    Thread.sleep(2000);
                    click(deleteIcon);
                    clickByText("Yes");
                } else {
                    break;
                }
            }
        }

    }
    public void selectNextPremiumDt() throws Exception {
        click(nextPreDt);
        clickByText("1");
        clickByText("OK");
    }

}
