package com.qa.pages;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class PayBillPage extends BasePage {

    public static String currentTime = "";
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Search billers\"])[2]")
    @AndroidFindBy(xpath = "//*[@text='Search billers']")
    private MobileElement billerSearchBx;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Airtel Postpaid\"])[2]")
    @AndroidFindBy(xpath = "//*[@text='Airtel Postpaid']")
    private MobileElement airtelPostpaid;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Jio Postpaid\"])[2]")
    @AndroidFindBy(xpath = "//*[@text='Jio Postpaid']")
    private MobileElement jioPostpaid;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Mobile Number\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "(//*[@text='Mobile Number']/following-sibling::android.view.ViewGroup/descendant::android.widget.EditText)[1]")
    private MobileElement mobileNumberBx;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Enter amount\"]")
    @AndroidFindBy(xpath = "//*[@text='Enter amount']/following-sibling::android.widget.EditText")
    private MobileElement billAmount;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='OTP']/following-sibling::android.widget.EditText")
    private MobileElement otpBx;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Payment Receipt\"])[1]/XCUIElementTypeOther[2]")
    @AndroidFindBy(xpath = "//*[@text='Payment Receipt']/following-sibling::android.view.ViewGroup")
    private MobileElement paymentReceiptPopup;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"My Favourite Billers\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[1]")
    @AndroidFindBy(xpath = "//*[@text='My Favourite Billers']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup[2]/android.widget.TextView[1]")
    private MobileElement favouriteSlideDrow;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Review & Pay\"]/ancestor::XCUIElementTypeOther[6]/following-sibling::XCUIElementTypeOther/child::XCUIElementTypeOther/XCUIElementTypeOther[1]/descendant::XCUIElementTypeOther[6]")
    @AndroidFindBy(xpath = "//*[@text='Review & Pay']/parent::android.view.ViewGroup/ancestor::android.view.ViewGroup[2]/following-sibling::android.view.ViewGroup/android.view.ViewGroup[1]/descendant::android.view.ViewGroup[2]")
    private MobileElement addMobDropDn;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"View All\"])[1]")
    @AndroidFindBy(xpath = "//*[@text='View All']")
    private MobileElement viewAllFav;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"View All\"])[2]")
    @AndroidFindBy(xpath = "(//*[@text='View All'])[2]")
    private MobileElement viewAllLastTran;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Mobile\"])[2]")
    @AndroidFindBy(xpath = "(//*[@text='Mobile'])[2]")
    private MobileElement mobilePrepaid;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Bharat Gas (BPCL)\"])[2]")
    @AndroidFindBy(xpath = "//*[@text='Bharat Gas (BPCL)']")
    private MobileElement bhartGasBpcl;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Registered Contact Number / LPG ID\"])[5]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Registered Contact Number / LPG ID']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    private MobileElement lpgContactNoBx;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Search for a plan, eg 249 or 28 days\"]")
    @AndroidFindBy(xpath = "//*[@text='Search for a plan, eg 249 or 28 days']")
    private MobileElement searchPlan;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Search for a plan, eg 249 or 28 days\"]")
    @AndroidFindBy(xpath = "//*[@text='View All']")
    private MobileElement viewAll;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Search for a plan, eg 249 or 28 days\"]")
    @AndroidFindBy(xpath = "//*[@text='ICICI']/preceding-sibling::androidx.cardview.widget.CardView")
    private MobileElement icicCard;

    public void searchBiller(String biller) throws Exception {
        sendKeys(billerSearchBx, biller);
        clickStaticText("Select a Biller");
    }

    public void clickAirtelPostpaid() {
        click(airtelPostpaid);
    }

    public void clickJioPostpaid() {
        click(jioPostpaid);
    }

    public void enterMobileNumber(String mobNum) throws Exception {
        sendKeys(mobileNumberBx, mobNum);
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            clickDoneIosKeyboard();
        }
//            else{
//                clickByText("Mobile Number");
//            }
    }

    public void enterBillAmount(String amount) throws Exception {
        sendKeys(billAmount, amount);
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            clickDoneIosKeyboard();
        }
//        else {
//            clickByText("Enter Your Bill Amount");
//        }
    }

    public void enterOTP() {
        sendKeys(otpBx, "111000");
    }

    public void closePaymentReceipt() {
        click(paymentReceiptPopup);
    }

    public void clickFavouriteSlideDrow() throws Exception {
        if (favouriteSlideDrow.getText().contains("Postpaid")) {
            click(favouriteSlideDrow);
        } else {
            if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
                String xpath = "//XCUIElementTypeOther[@name=\"My Favourite Billers\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[2]";
                click(getElement(xpath));
            } else {
                String xpath = "//*[@text='My Favourite Billers']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup[3]/android.widget.TextView[1]";
                click(getElement(xpath));
            }

        }
    }

    public void clickDropDownAdd() {
        click(addMobDropDn);
    }

    public void clickVieAllFavourite() {
        click(viewAllFav);
    }

    public void clickVieAllLastTran() {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            click(viewAllLastTran);
        } else {
            if (isElementExist("(//*[@text='View All'])[2]")) {
                click(viewAllLastTran);
            } else {
                click(viewAllFav);
            }
        }
    }

    public void scrollToDown() throws InterruptedException {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            swipe(202, 754, 207, 186, 200);
        } else {
//            if(isVisible(viewAll)){
//            seeTranTime();
//            String today=currentTime;
//
//            String str=today.split(", ")[1];
            andScrollToElementUsingUiScrollable("text", "Bill Paid");
//            }

        }

    }

    public boolean verifyRechargeTimeDate(String amount, String billerName) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            String xpath = "//XCUIElementTypeOther[@name='" + billerName + " " + currentTime + " " + amount + " Bill Paid']";
            if (!isElementExist(xpath)) {
                LocalDateTime now = LocalDateTime.now();
                LocalDateTime oneMinuteBack = now.minusMinutes(1);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM, yyyy h:mm a");
                String formattedDate1 = oneMinuteBack.format(formatter);
                formattedDate1 = formattedDate1.replace("am", "AM").replace("pm", "PM");
                xpath = "//XCUIElementTypeOther[contains(@name,'" + billerName + "')]";
            }
            return getElement(xpath).isDisplayed();
        } else {
//            seeTranTime();
            String today = currentTime;
            String str = today.split(", ")[1];
            String xpath1 = "//*[@text='" + billerName + "']";
            String xpath2 = "//*[@text='" + amount + "']";
            String xpath3 = "//*[contains(@text,'" + str + "')]";
            String xpath4 = "//*[@text='Bill Paid']";
//            if(! isElementExist(xpath3)){
//                xpath3=
//            }
            return getElement(xpath1).isDisplayed() && getElement(xpath2).isDisplayed() && getElement(xpath3).isDisplayed() && getElement(xpath4).isDisplayed();
        }

    }

    public boolean verifyTransacHis(String amount, String billerName) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            String xpath = "//XCUIElementTypeOther[@name='" + billerName + " " + currentTime + " " + amount + " Completed']";
            if (!isElementExist(xpath)) {
                LocalDateTime now = LocalDateTime.now();
                LocalDateTime oneMinuteBack = now.minusMinutes(1);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM, yyyy h:mm a");
                String formattedDate1 = oneMinuteBack.format(formatter);
                formattedDate1 = formattedDate1.replace("am", "AM").replace("pm", "PM");
                xpath = "//XCUIElementTypeOther[@name='" + billerName + " " + formattedDate1 + " " + amount + " Completed']";
            }
            return getElement(xpath).isDisplayed();
        } else {
//            seeTranTime();
            String today = currentTime;
            String str = today.split(", ")[1];
            String xpath1 = "//*[@text='" + billerName + "']";
            String xpath2 = "//*[@text='" + amount + "']";
            String xpath3 = "//*[contains(@text,'" + str + "')]";
            String xpath4 = "//*[@text='Completed']";
            return getElement(xpath1).isDisplayed() && getElement(xpath2).isDisplayed() && getElement(xpath3).isDisplayed() && getElement(xpath4).isDisplayed();
        }
    }

    public void seeTranTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM, yyyy h:mm a");
        String formattedDate = now.format(formatter);
        formattedDate = formattedDate.replace("am", "AM").replace("pm", "PM");
        currentTime = formattedDate;
    }

    public void doRecharge(String amount) throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            String netBanking = "//XCUIElementTypeStaticText[@name='Net Banking']";
            String icic = "//XCUIElementTypeStaticText[@name='ICICI Bank']";
            String xpath = "//XCUIElementTypeStaticText[@name='Pay ₹ " + amount + "']";
            String checkout = "//XCUIElementTypeStaticText[@name='Select from recently used payment mode']";
            if(isElementExist(checkout)){
                click(getElement(xpath));
            }
            else{
                click(getElement(netBanking));
                click(getElement(icic));
                click(getElement(xpath));
            }
        } else {
            String netBanking = "//*[@text='Net Banking']";
            String xpath = "//*[@text='Save mode for quick checkout']/following-sibling::android.widget.Button";
            String iccCard = "//*[@text='ICICI']/preceding-sibling::androidx.cardview.widget.CardView";
            String amountPay="//*[contains(@text,'Pay ₹')]";
            if (isElementExist(amountPay)) {
                click(getElement(amountPay));
            }
            else{
                click(getElement(netBanking));
                    click(getElement(iccCard));
                    click(getElement(xpath));
                }
        }
    }

    public void clickMobile() {
        click(mobilePrepaid);
    }

    public void searchRechargePlan(String plan) throws Exception {
        sendKeys(searchPlan, plan);
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            clickReturnIosKeyboard();
        }
//    else {
//        clickByText("OTHER PLAN");
//    }


    }

    public void clickBhartGasBpcl() {
        click(bhartGasBpcl);
    }

    public void enterContactNumber(String mobNo) throws Exception {
        sendKeys(lpgContactNoBx, mobNo);
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            clickDoneIosKeyboard();
        } else {
            clickByText("Add Biller");
        }

    }

    public void clickSuccess() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            clickStaticText("SUCCESS");
        } else {
            clickByText(" SUCCESS");
        }
    }

    public void clickicicBank() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            clickStaticText("ICICI Bank");
        } else {
            click(icicCard);
        }
    }

    public void doPayCylinder() throws Exception {
        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            String netBanking = "//XCUIElementTypeStaticText[@name='Net Banking']";
            String icic = "//XCUIElementTypeStaticText[@name='ICICI Bank']";
            String xpath = "//XCUIElementTypeStaticText[contains(@name,'Pay ₹ ')]";
            String checkout = "//XCUIElementTypeStaticText[@name='Select from recently used payment mode']";
            if(isElementExist(checkout)){
                click(getElement(xpath));
            }
            else{
                click(getElement(netBanking));
                click(getElement(icic));
                click(getElement(xpath));
            }
        } else {
            String netBanking = "//*[@text='Net Banking']";
            String xpath = "//*[@text='Save mode for quick checkout']/following-sibling::android.widget.Button";
            String iccCard = "//*[@text='ICICI']/preceding-sibling::androidx.cardview.widget.CardView";
            String amountPay="//*[contains(@text,'Pay ₹')]";
            if (isElementExist(amountPay)) {
                click(getElement(amountPay));
            }
            else{
                click(getElement(netBanking));
                click(getElement(iccCard));
                click(getElement(xpath));
            }
        }
    }
}
