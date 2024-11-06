

package com.qa.pages;

import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
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
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class DigitalGoldPage extends BasePage {

    TestUtils utils = new TestUtils();
    GlobalParams params = new GlobalParams();
    @AndroidFindBy(xpath = "//*[@text='Digital\n" +
            "Gold']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"24K Gold\n" +
            "& Silver\"]")
    private MobileElement digitalGold;
    @AndroidFindBy(xpath = "//*[@text='Buy in grams']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='\uE836 Buy in grams']")
    private MobileElement buyInGrams;
    @AndroidFindBy(xpath = "//*[@text='Sell in Grams']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='\uE836 Sell in Grams']")
    private MobileElement sellInGrams;
    @AndroidFindBy(xpath = "//*[@text='Buy in rupees']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='\uE836 Buy in rupees']")
    private MobileElement buyInRupees;
    @AndroidFindBy(xpath = "(//*[@text='Netbanking'])[2]")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Netbanking'")
    private MobileElement netBankingAllBanks;
    @AndroidFindBy(xpath = "//*[@text='All Payment Options']/following-sibling::android.view.View")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Netbanking'")
    private MobileElement fdrlBank;
    @AndroidFindBy(xpath = "//*[contains(@text, 'ICICI')]")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'ICICI'")
    private MobileElement ICICI;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Min. ₹51']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[contains(@text,'Min. ₹51')]/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    private MobileElement enterValue;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Min. ₹51']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[contains(@text,'Min. ₹51')]/following-sibling::android.view.ViewGroup[2]/descendant::android.widget.EditText")
    private MobileElement goldSilverAmtBx;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Min. ₹51']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[contains(@text,'Min. ₹51')]/following-sibling::android.view.ViewGroup[1]//android.widget.EditText")
    private MobileElement enterWeight;
    @AndroidFindBy(xpath = "//*[contains(@text, 'Success')]")
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Success'")
    private MobileElement success;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Receiver's State\"]/following-sibling::XCUIElementTypeOther//XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text=\"Receiver's State\"]//following-sibling::android.view.ViewGroup[1]")
    private MobileElement state;
    @AndroidFindBy(xpath = "//*[contains(@text,'Name Your Financial Goal')]//following-sibling::android.view.ViewGroup[1]/descendant::android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Name Your Financial Goal']//following-sibling::XCUIElementTypeOther")
    private MobileElement financialGoal;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Full Name']/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[contains(@text,'Full Name')]/following-sibling::android.view.ViewGroup[1]//android.widget.EditText")
    private MobileElement fullName;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Receiver Mobile Number']/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Receiver Mobile Number']/following-sibling::android.view.ViewGroup[1]//android.widget.EditText")
    private MobileElement mobileNumber;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[1]")
    @AndroidFindBy(xpath = "//*[contains(@text,'Sell Price')]/preceding-sibling::android.widget.EditText[1]")
    private MobileElement sendGiftOTP;
    @AndroidFindBy(xpath = "//*[contains(@text,'Verification Code')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name, 'Verification Code')]")
    private MobileElement sellGoldOTPText;
    @AndroidFindBy(xpath = "//*[contains(@text,'Move to')]/following-sibling::android.view.ViewGroup[1]//android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Move to']//following-sibling::XCUIElementTypeOther[1]/descendant::XCUIElementTypeOther[3]")
    private MobileElement moveTo;
    @AndroidFindBy(xpath = "//*[contains(@text,'Transaction Type')]/following-sibling::android.view.ViewGroup[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Transaction Type']//following-sibling::XCUIElementTypeOther")
    private MobileElement selectTransactionType;
    @AndroidFindBy(xpath = "//*[contains(@text,'Portfolio')]/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Portfolio']//following-sibling::XCUIElementTypeOther")
    private MobileElement selectPortofolio;
    @AndroidFindBy(xpath = "(//*[contains(@text,'Financial Goal to Debit')]/following-sibling::android.view.ViewGroup[1]//android.widget.TextView)[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Financial Goal to Debit']//following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
    private MobileElement selectFinancialGoalDebit;
    @AndroidFindBy(xpath = "//*[contains(@text,'SIP Start Date')]/following-sibling::android.view.ViewGroup[1]//android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='SIP Start Date']//following-sibling::XCUIElementTypeOther")
    private MobileElement sipStartDate;
    @AndroidFindBy(xpath = "//*[@text='Payment Options']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='SIP Start Date']//following-sibling::XCUIElementTypeOther")
    private MobileElement paymentOption;
    @AndroidFindBy(xpath = "//*[contains(@text,'SIP Duration')]/following-sibling::android.view.ViewGroup[2]//android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='SIP Duration']//following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement sipDuration;
    @AndroidFindBy(xpath = "//*[@text='Investment amount']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Investment amount']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    private MobileElement investmentAmount;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='\uE836 Weekly']")
    @AndroidFindBy(xpath = "//*[@text='Weekly']")
    private MobileElement weeklySIP;
    @AndroidFindBy(xpath = "//*[@text='View']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='View']")
    private MobileElement viewInTransactionHistory;
    @AndroidFindBy(xpath = "//*[@text='Your Products']//following-sibling::android.widget.ScrollView/descendant::android.view.ViewGroup[4]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Your Products']//following-sibling::XCUIElementTypeOther[1]/descendant::XCUIElementTypeOther[7]/child::XCUIElementTypeOther[1]")
    private MobileElement removeCoinFromAddToCart;
    @AndroidFindBy(xpath = "//*[@text='Your Products']//following-sibling::android.widget.ScrollView/descendant::android.view.ViewGroup[3]/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Your Products']//following-sibling::XCUIElementTypeOther[1]/descendant::XCUIElementTypeOther[7]/child::XCUIElementTypeStaticText")
    private MobileElement numberOfCoinsInCartSummaryScreen;
    @AndroidFindBy(xpath = "//*[@text='Mission 1 Crore']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Mission 1 Crore']")
    private MobileElement mission1Crore;
    @AndroidFindBy(xpath = "//*[@text='Liquid FundsGoal 123']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Liquid FundsGoal 123']")
    private MobileElement liquidFundsGoal123;
    @AndroidFindBy(xpath = "//*[@text='Your Cart is Empty']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Your Cart is Empty']")
    private MobileElement cartIsEmpty;
    @AndroidFindBy(xpath = "//*[@text='Simulate Success']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Simulate Success']")
    private MobileElement simulateSuccess;
    @AndroidFindBy(xpath = "//*[@text='Transaction History']/parent::android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Transaction History\"]/following-sibling::XCUIElementTypeOther[2]/descendant::XCUIElementTypeOther[3]/descendant::XCUIElementTypeStaticText[1]")
    private MobileElement transactionfor;
    @AndroidFindBy(xpath = "//*[@text='Transaction History']/parent::android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[4]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Transaction History\"]/following-sibling::XCUIElementTypeOther[2]/descendant::XCUIElementTypeOther[3]/descendant::XCUIElementTypeStaticText[3]")
    private MobileElement transactiontype;
    @AndroidFindBy(xpath = "//*[@text='Transaction History']/parent::android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[4]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Transaction History\"]/following-sibling::XCUIElementTypeOther[2]/descendant::XCUIElementTypeOther[3]/descendant::XCUIElementTypeStaticText[3]")
    private MobileElement transactionTypeSell;
    @AndroidFindBy(xpath = "//*[@text='Transaction History']/parent::android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Transaction History\"]/following-sibling::XCUIElementTypeOther[2]/descendant::XCUIElementTypeOther[3]/descendant::XCUIElementTypeStaticText[4]")
    private MobileElement transactionamount1;
    @AndroidFindBy(xpath = "//*[@text='Transaction History']/parent::android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[3]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Transaction History\"]/following-sibling::XCUIElementTypeOther[2]/descendant::XCUIElementTypeOther[3]/descendant::XCUIElementTypeStaticText[2]")
    private MobileElement transactiondate;
    @AndroidFindBy(xpath = "//*[@text='In process']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"In process\"]")
    private MobileElement transactionstatus;
    @AndroidFindBy(xpath = "//*[@text='Add New']/following-sibling::android.view.ViewGroup/android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Add New\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther[2]")
    private MobileElement editBtnShippingAdd;
    @AndroidFindBy(xpath = "//*[@text='State']/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"In process\"]")
    private MobileElement stateInShippAdd;
    @AndroidFindBy(xpath = "//*[@text='District / City']/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"In process\"]")
    private MobileElement districtInShippAdd;
    @AndroidFindBy(xpath = "//*[@text='Area PIN Code']/following-sibling::android.view.ViewGroup/descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"In process\"]")
    private MobileElement areaPinCodeShippAdd;
    @AndroidFindBy(xpath = "//*[@text='Name your financial goal']/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Name your financial goal']//following-sibling::XCUIElementTypeOther")
    private MobileElement selectFiGoBx;
    @AndroidFindBy(xpath = "(//*[contains(@text,'Wealth')])[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Total Amount\"]/following-sibling::XCUIElementTypeStaticText[2]")
    private MobileElement wealthGoal;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"View\"])[1]/preceding-sibling::XCUIElementTypeStaticText")
    private MobileElement closePromotion;
    @AndroidFindBy(xpath = "//*[contains(@text,'Min. ₹51')]/following-sibling::android.view.ViewGroup[1]//descendant::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"View\"])[1]/preceding-sibling::XCUIElementTypeStaticText")
    private MobileElement sellGoldBx;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='\uE836 Gift in Grams']")
    @AndroidFindBy(xpath = "//*[contains(@text,'Gift in Grams')]")
    private MobileElement giftInGrams;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='\uE836 Gift in ₹']")
    @AndroidFindBy(xpath = "//*[contains(@text,'Gift in ₹')]")
    private MobileElement giftIn₹;
    @AndroidFindBy(xpath = "//*[@text='Buyer Details']/following-sibling::android.widget.TextView[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Buyer Details\"]/following-sibling::XCUIElementTypeStaticText[1]")
    private MobileElement buyerName;
    @AndroidFindBy(xpath = "//*[@text='Netbanking']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Buyer Details\"]/following-sibling::XCUIElementTypeStaticText[1]")
    private MobileElement netBankDropDn;
    @AndroidFindBy(xpath = "(//*[@text='ICICI ICICI'])[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Buyer Details\"]/following-sibling::XCUIElementTypeStaticText[1]")
    private MobileElement bankName;
    @AndroidFindBy(xpath = "//*[@text='List of Bank']/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Buyer Details\"]/following-sibling::XCUIElementTypeStaticText[1]")
    private MobileElement bankAccList;
    @AndroidFindBy(xpath = "//*[@text='ICICI Bank Netbanking']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Buyer Details\"]/following-sibling::XCUIElementTypeStaticText[1]")
    private MobileElement iciciNetBank;
    @AndroidFindBy(xpath = "//*[@text='List of Bank']/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Buyer Details\"]/following-sibling::XCUIElementTypeStaticText[1]")
    private MobileElement bankList;
    @AndroidFindBy(xpath = "//*[@text='View Transaction History']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Buyer Details\"]/following-sibling::XCUIElementTypeStaticText[1]")
    private MobileElement purchaseSuccessSc;
    @AndroidFindBy(xpath = "//*[@text='My Portfolio']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Buyer Details\"]/following-sibling::XCUIElementTypeStaticText[1]")
    private MobileElement goldPortfolio;
    @AndroidFindBy(xpath = "//*[@text='Receiver Details']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Buyer Details\"]/following-sibling::XCUIElementTypeStaticText[1]")
    private MobileElement receiverDetails;
    @AndroidFindBy(xpath = "//*[@text='All']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Buyer Details\"]/following-sibling::XCUIElementTypeStaticText[1]")
    private MobileElement goldWealthSc;
    @AndroidFindBy(xpath = "//*[@text=' Shipping Address']/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Buyer Details\"]/following-sibling::XCUIElementTypeStaticText[1]")
    private MobileElement shippingAddressBx;
    @AndroidFindBy(xpath = "//*[@text='please edit address']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Buyer Details\"]/following-sibling::XCUIElementTypeStaticText[1]")
    private MobileElement pleaseEditAddress;

    public void clickEllipsisGoal(String goalType) throws Exception {
        String xpath = "";
        if (Objects.equals(params.getPlatformName(), "iOS")) {
            xpath = "(//XCUIElementTypeOther[@name='" + goalType + "'])[1]/descendant::XCUIElementTypeOther[5]";
        } else {
            xpath = "//*[contains(@text,'" + goalType + "')]/following-sibling::android.view.ViewGroup[1]";
        }
        click(getElement(xpath));
    }

    public void clickSIPStartDate() {
        click(sipStartDate);
    }

    public void clickNetBanking() throws Exception {
        if (!isVisible(paymentOption)) {
            waitForVisibility(paymentOption, 120);
        }
        click(netBankingAllBanks);
        click(fdrlBank);

        if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            if (isElementExist("//XCUIElementTypeButton[@name='Pay Now']")) {
                new MutualFundPage().clickButtonTypeText("Pay Now");
            } else if (isElementExist("//XCUIElementTypeButton[@name='Pay']")) {
                new MutualFundPage().clickButtonTypeText("Pay");
            } else if (isElementExist("//XCUIElementTypeButton[@name='Continue & Pay']")) {
                new MutualFundPage().clickButtonTypeText("Continue & Pay");
            }
        } else {
            if (isElementExist("//*[@text='Pay Now']")) {
                new MutualFundPage().clickButtonTypeText("Pay Now");
            } else if (isElementExist("//*[@text='Pay']")) {
                new MutualFundPage().clickButtonTypeText("Pay");
            } else if (isElementExist("//*[@text='Continue & Pay']")) {
                new MutualFundPage().clickButtonTypeText("Continue & Pay");
            }
        }
    }

    public void clickICICI() {
        if (isVisible(ICICI)) {
            click(ICICI);
        }
    }

    public void clickSuccess() {
        click(success);
    }

    public void clickFinancialGoalToDebit() {
        click(selectFinancialGoalDebit);
    }

    public void scrollToLiquidFundsGoalInFinancialGoalToDebitBox() throws Exception {
        if (Objects.equals(params.getPlatformName(), "iOS") && !isVisible(liquidFundsGoal123)) {
            iOSScrollToElementByName(liquidFundsGoal123, "down", "Liquid FundsGoal 123");
        } else {
            while (!isVisible(liquidFundsGoal123)) {
                new BasePage().scrollToElement(liquidFundsGoal123, "up", mission1Crore);
            }
        }
    }

    public void clickDigitalGold() {
        if (!isVisible(digitalGold)) {
            if (Objects.equals(globalParams.getPlatformName(), "Android")) {
                andScrollToElementUsingUiScrollable("text", "Digital\n" +
                        "Gold");
            } else {
                iOSScrollToElementByName(digitalGold, "up", "Digital\n" +
                        "Gold");
            }
        }
        click(digitalGold);
    }

    public void setSipDuration(String duration) {
        clear(sipDuration);
        sendKeys(sipDuration, duration);
    }

    public void setInvestmentAmount(String investmentAmounts) {
        clear(investmentAmount);
        sendKeys(investmentAmount, investmentAmounts);
        if (Objects.equals(params.getPlatformName(), "iOS")) {
            new BasePage().clickDone();
        }
    }

    public void selectState(String states) throws Exception {
        click(state);
        Thread.sleep(2000);
        new BasePage().clickByText(states);
    }

    public void clickFinancialGoal() {
        click(financialGoal);
    }

    public void enterFullName(String fullNames) {
        sendKeys(fullName, fullNames);
    }

    public void enterMobileNumber(String mobileNumbers) {
        clear(mobileNumber);
        sendKeys(mobileNumber, mobileNumbers);
        if (Objects.equals(params.getPlatformName(), "iOS")) {
            new BasePage().clickDone();
        }
    }

    public void changeTheIntervalFor(String mobileNumber) {
        String[] mobNo = mobileNumber.split(" ");
        if (Objects.equals(params.getPlatformName(), "Android")) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://dev.floatr.in/api/testing/deletedata"))
                    .timeout(Duration.ofMinutes(2))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString("{  \"type\" : \"changeinterval\",\n" +
                            "    \"contact\": \"" + mobNo[0] + "\",\n" +
                            "    \"account_type\": \"Personal\"\n" +
                            "}"))
                    .build();
            HttpClient client = HttpClient.newBuilder().build();
            try {
                HttpResponse<String> resp = client.send(request, HttpResponse.BodyHandlers.ofString());
                System.out.println("Floatr API Status Code: " + resp.statusCode());
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else if (Objects.equals(params.getPlatformName(), "iOS")) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://dev.floatr.in/api/testing/deletedata"))
                    .timeout(Duration.ofMinutes(2))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString("{  \"type\" : \"changeinterval\",\n" +
                            "    \"contact\": \"" + mobNo[2] + "\",\n" +
                            "    \"account_type\": \"Personal\"\n" +
                            "}"))
                    .build();
            HttpClient client = HttpClient.newBuilder().build();
            try {
                HttpResponse<String> resp = client.send(request, HttpResponse.BodyHandlers.ofString());
                System.out.println("Floatr API Status Code: " + resp.statusCode());
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void enterOTPSellGold() {
        String otp = sellGoldOTPText.getText().split("Verification Code")[1].trim();
        sendKeys(sendGiftOTP, otp);
    }

    public void clickMoveTo() {
        click(moveTo);
    }

    public void clickTransactionType() {
        click(selectTransactionType);
    }

    public void clickPortfolio() {
        click(selectPortofolio);
    }

    public void clickBuyInGrams() {
        click(buyInGrams);
    }

    public void clickBuyInRupees() {
        click(buyInRupees);
    }

    public void clickView() {
        new BasePage().click(viewInTransactionHistory);
    }

    public void clickSellInGrams() {
        click(sellInGrams);
    }

    public void clickMutualGoal(String text) throws Exception {
        String xpath = "";
        if (Objects.equals(params.getPlatformName(), "Android")) {
            xpath = "//*[contains(@text, '" + text + "')]";
        } else if (Objects.equals(params.getPlatformName(), "iOS")) {
            xpath = "(//XCUIElementTypeOther[contains(@name, '" + text + "')])[last()]";
        }
        getElement(xpath).click();
    }

    public void click(String text) throws Exception {
        String xpath = "";
        if (Objects.equals(params.getPlatformName(), "Android")) {
            xpath = "//*[contains(@text, '" + text + "')]";
        } else if (Objects.equals(params.getPlatformName(), "iOS")) {
            xpath = "(//XCUIElementTypeOther[contains(@name, '" + text + "')])[last()]";
        }
        getElement(xpath).click();
    }

    public void clickWeeklySIP() {
        click(weeklySIP);
    }

    public void clickRemoveButton() throws Exception {
        if (isVisible(cartIsEmpty)) {
            new MutualFundPage().goBackFromScreen("Cart Summary");
        } else {
            String numberOfCoins = new BasePage().getText(numberOfCoinsInCartSummaryScreen, "number of coins in ad to cart is : ");
            int nocOfCoins = Integer.parseInt(numberOfCoins);
            while (isVisible(removeCoinFromAddToCart)) {
                for (int i = 0; i < nocOfCoins + 1; i++) {
                    clickIfExist(removeCoinFromAddToCart);
                }
            }
            new MutualFundPage().goBackFromScreen("Cart Summary");
        }
    }

    public void clickSimulateSuccess() {
        click(simulateSuccess);
    }

    public String verifyTransactionSta() throws Exception {
        clickByText("View");
        Thread.sleep(4000);
        return transactionstatus.getText();
    }

    public void reeditShippingAdd() throws Exception {
        click(editBtnShippingAdd);
        click(stateInShippAdd);
        clickStaticText("Andaman and Nicobar");
        click(districtInShippAdd);
        clickStaticText("Nicobar");
        clear(areaPinCodeShippAdd);
        sendKeys(areaPinCodeShippAdd, "500084");
        clickStaticText("Area PIN Code");
    }

    public void editShippingAdd() throws Exception {
        click(editBtnShippingAdd);
        click(stateInShippAdd);
        clickStaticText("Andhra Pradesh");
        click(districtInShippAdd);
        clickStaticText("Anantapur");
        clear(areaPinCodeShippAdd);
        sendKeys(areaPinCodeShippAdd, "943476");
        clickStaticText("Area PIN Code");

    }

    public void verifyGoldOrderHis(DataTable dataTable) throws Exception {
        Thread.sleep(10000);
        List<Map<String, String>> userMap = dataTable.asMaps(String.class, String.class);
        String transactionFor = userMap.get(0).get("TransactionFor");
        Assert.assertEquals(transactionfor.getText(), transactionFor + " ");
        String transactionType = userMap.get(0).get("TransactionType");
        Assert.assertEquals(transactiontype.getText(), transactionType);
        String transactionDate = transactiondate.getText();
        Assert.assertEquals(transactionDate, getCurrentDate());
        String transactionStatus = userMap.get(0).get("TransactionStatus");
        Assert.assertEquals(transactionStatus, verifyTransactionSta());
    }

    public void verifyGoldBuyHis(DataTable dataTable) {
        List<Map<String, String>> userMap = dataTable.asMaps(String.class, String.class);
        String transactionFor = userMap.get(0).get("TransactionFor");
        Assert.assertEquals(transactionfor.getText(), transactionFor + " ");
        String transactionType = userMap.get(0).get("TransactionType");
        Assert.assertEquals(transactiontype.getText(), transactionType);
        String transactionDate = transactiondate.getText();
        Assert.assertEquals(transactionDate, getCurrentDate());
    }

    public void verifyGoldSellHis(DataTable dataTable) {
        List<Map<String, String>> userMap = dataTable.asMaps(String.class, String.class);
        String transactionFor = userMap.get(0).get("TransactionFor");
        Assert.assertEquals(transactionfor.getText(), transactionFor + " ");
        String transactionType = userMap.get(0).get("TransactionType");
        Assert.assertEquals(transactionTypeSell.getText(), transactionType);
        String transactionDate = transactiondate.getText();
        Assert.assertEquals(transactionDate, getCurrentDate());
    }

    public void verifyGoldGiftHis(DataTable dataTable) throws Exception {
        Thread.sleep(10000);
        List<Map<String, String>> userMap = dataTable.asMaps(String.class, String.class);
        String transactionFor = userMap.get(0).get("TransactionAmount");
        Assert.assertEquals(transactionamount1.getText(), transactionFor);
        String transactionType = userMap.get(0).get("TransactionType");
        Assert.assertEquals(transactiontype.getText(), transactionType);
        String transactionDate = transactiondate.getText();
        Assert.assertEquals(transactionDate, getCurrentDate());

    }

    public void selectFinancialGoalDi(String text) throws Exception {
        click(selectFiGoBx);
        String xpath = "";
        if (Objects.equals(params.getPlatformName(), "Android")) {
            xpath = "//*[contains(@text, '" + text + "')]";
        } else if (Objects.equals(params.getPlatformName(), "iOS")) {
            xpath = "(//XCUIElementTypeOther[contains(@name, '" + text + "')])[last()]";
        }
        getElement(xpath).click();
    }

    public void clickOnWealthGoal() {
        click(wealthGoal);
    }

    public void closePromotionPopup() throws InterruptedException {
        if (isVisible(closePromotion)) {
            click(closePromotion);
        }
    }

    public void enterSellAmt(String value) {
        clear(sellGoldBx);
        sendKeys(sellGoldBx, value);
        if (Objects.equals(params.getPlatformName(), "iOS")) {
            new BasePage().clickDone();
        } else {
            pressEnter();
        }
    }

    public void enterValue(String value) {
        clear(enterValue);
        sendKeys(enterValue, value);
        if (Objects.equals(params.getPlatformName(), "iOS")) {
            new BasePage().clickDone();
        }
    }

    public void enterWeight(String weight) {
        clear(enterWeight);
        sendKeys(enterWeight, weight);
        if (Objects.equals(params.getPlatformName(), "iOS")) {
            new BasePage().clickDone();
        }
    }

    public void clickGiftInGrams() {
        click(giftInGrams);
    }

    public void clickGiftInRS() {
        click(giftIn₹);
    }

    public boolean verifyBuyerName() {
        return isVisible(buyerName);
    }

    public void paymentForGoldSilver() throws Exception {
        waitForVisibility(netBankDropDn, 30);
        if (isVisible(iciciNetBank)) {
            click(iciciNetBank);
        } else {
            click(netBankDropDn);
            click(bankName);
        }
        Thread.sleep(3000);
        click("Success");
    }

    public void selectBankForSIP() {
        click(bankAccList);

    }

    public void enterGoldSilverValue(String value) {
        clear(goldSilverAmtBx);
        sendKeys(goldSilverAmtBx, value);
        if (Objects.equals(params.getPlatformName(), "iOS")) {
            new BasePage().clickDone();
        }
    }

    public void waitForGoldSilverSuccessSc() {
        if (!isVisible(purchaseSuccessSc)) {
            waitForVisibility(purchaseSuccessSc, 8);
        }
    }

    public void waitForGoldSilverSellOtpSc() {
        if (!isVisible(sellGoldOTPText)) {
            waitForVisibility(sellGoldOTPText, 8);
        }
    }

    public void waitPortfolioSc() {
        if (!isVisible(goldPortfolio)) {
            waitForVisibility(goldPortfolio, 8);
        }
    }

    public void waitReceiverScreen() {
        if (!isVisible(receiverDetails)) {
            waitForVisibility(receiverDetails, 8);
        }
    }

    public void waitForOrderSuccessScr() {
        if (!isVisible(purchaseSuccessSc)) {
            waitForVisibility(purchaseSuccessSc, 8);
        }
    }

    public void waitForWealthScr() {
        if (!isVisible(goldWealthSc)) {
            waitForVisibility(goldWealthSc, 8);
        }
    }

    public String[] getNameMobile() {
        return new String[]{fullName.getText(), mobileNumber.getText()};
    }

    public void selectShippingAddress() throws Exception {
        click(shippingAddressBx);
        if (isVisible(pleaseEditAddress)) {
            editShippingAdd();
            clickByText("Save Address");
            click(shippingAddressBx);
        }
    }
}

