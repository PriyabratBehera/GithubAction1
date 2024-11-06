package com.qa.pages;

import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class TrackExpensesPage extends BasePage {
    TestUtils utils = new TestUtils();
    GlobalParams globalParams = new GlobalParams();
    @AndroidFindBy(xpath = "//*[@text='Transaction']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Transaction\"]")
    private MobileElement addTransaction;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Track Expense\"]")
    @AndroidFindBy(xpath = "//*[@text='Track Expenses']")
    private MobileElement trackExpeses;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Select Sub-Category\"]")
    @AndroidFindBy(xpath = "//*[@text='Select Sub-Category']")
    private MobileElement subCategory;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Amount\"]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/descendant::XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//*[@text='Amount']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.EditText")
    private MobileElement budAmtBx;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Date of Transaction\"]/following-sibling::XCUIElementTypeOther")
    @AndroidFindBy(xpath = "//*[@text='Date of Transaction']/following-sibling::android.view.ViewGroup[1]/descendant::android.widget.ImageView")
    private MobileElement dateOfTranBx;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Search\"]/parent::XCUIElementTypeOther/XCUIElementTypeOther[1]/descendant::XCUIElementTypeOther[1]")
    @AndroidFindBy(xpath = "//*[@text='Search']/parent::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup[1]")
    private MobileElement currentMonth;
    @AndroidFindBy(xpath = "//*[@text=\"S\"]/preceding-sibling::android.view.ViewGroup/child::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"S\"])[1]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeOther[1]")
    private MobileElement calBackwardBtn;
    @AndroidFindBy(xpath = "//*[@text=\"Date of Transaction\"]/following-sibling::android.view.ViewGroup/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Date of Transaction\"]/following-sibling::XCUIElementTypeOther")
    private MobileElement datOfTran;
    @AndroidFindBy(xpath = "//*[@text=\"S\"]/preceding-sibling::android.view.ViewGroup/child::android.view.ViewGroup[3]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"S\"])[1]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeOther[2]")
    private MobileElement calForwardBtn;
    @AndroidFindBy(xpath = "//*[@text=' Goals']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"S\"])[1]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeOther[2]")
    private MobileElement plusIconInDash;
    @AndroidFindBy(xpath = "//*[@text='2023 Oct']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"2023 Oct\"]")
    private MobileElement lastYearMar;
    @AndroidFindBy(xpath = "//*[@text='2023 Jul']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"2023 Jul\"]")
    private MobileElement lastYearJul;
    @AndroidFindBy(xpath = "//*[@text=\"S\"]/preceding-sibling::android.view.ViewGroup/child::android.view.ViewGroup[2]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"S\"])[1]/parent::XCUIElementTypeOther/preceding-sibling::XCUIElementTypeOther")
    private MobileElement currentYear;
    @AndroidFindBy(xpath = "//*[@text=\"scroll down\"]/preceding-sibling::android.widget.ScrollView/descendant::android.view.ViewGroup[4]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"scroll down\"]/preceding-sibling::XCUIElementTypeOther[2]/descendant::XCUIElementTypeOther[8]")
    private MobileElement dtPicker;
    @AndroidFindBy(xpath = "//*[@text='Select Category']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Select Category\"])[3]")
    private MobileElement selectCategory;
    @AndroidFindBy(xpath = "//*[@text=\"2023\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"scroll up\"]/following-sibling::XCUIElementTypeOther[2]/descendant::XCUIElementTypeOther[5]")
    private MobileElement lastyr;
    @AndroidFindBy(xpath = "//*[@text=\"Investment\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[contains(@name,\"Investment Equity ₹30,000\")])[21]")
    private MobileElement investmentEquity;
    @AndroidFindBy(xpath = "//*[@text='Edit Transaction']/following-sibling::android.view.ViewGroup")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Edit Transaction\"])[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
    private MobileElement deleteExpense;
    @AndroidFindBy(xpath = "//*[@text='Transaction']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Edit Transaction\"])[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
    private MobileElement expanseScreen;

    public void clickAddTransaction() {
        click(addTransaction);
    }

    public void clickTrackExpenses() {
        if (!isVisible(trackExpeses)) {
            if (Objects.equals(globalParams.getPlatformName(), "Android")) {
                andScrollToElementUsingUiScrollable("text", "Track Expenses");
            } else {
//                iOSScrollToElementByName(mutualFunds, "up", "Top Mutual Fund Baskets");
            }
        }
        click(trackExpeses);
    }

    public void selectTranType(String trType) throws Exception {
        clickByText(trType);
    }

    public void selectCate(String cateType) throws Exception {
        click(selectCategory);
        clickByText(cateType);

    }

    public void selectSubCate(String subCate) throws Exception {
        if (isVisible(subCategory)) {
            click(subCategory);
            clickByText(subCate);
        }
    }

    public void enterBudAmt(String amt) throws Exception {
        if(Objects.equals(globalParams.getPlatformName(),"iOS")){
            if(budAmtBx.getText().equals("₹0")){
                sendKeys(budAmtBx, amt);
                clickDoneIosKeyboard();
            }
            else{
                clear(budAmtBx);
                sendKeys(budAmtBx, amt);
                clickDoneIosKeyboard();
            }
        }
        else{
            if(budAmtBx.getText().equals("₹0")){
                sendKeys(budAmtBx, amt);
                clickByText("Amount");
            }
            else{
                clear(budAmtBx);
                sendKeys(budAmtBx, amt);
                clickByText("Amount");
            }
        }
    }

    public void dateOfTranCurMon() throws Exception {
        click(dateOfTranBx);
        clickByText("OK");
    }

    public void dateOfTranOneMonBac() throws Exception {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM / yyyy");
        String formattedDate1 = formatter.format(now);
        String xpath=" ";
        click(dateOfTranBx);
        click(calBackwardBtn);
        if(Objects.equals(globalParams.getPlatformName(),"iOS")){
            xpath="(//XCUIElementTypeOther[@name='1'])[2]";
        }
        else{
            xpath="(//*[@text='1'])[2]";
        }
        click(getElement(xpath));
        clickByText("OK");
        Thread.sleep(3000);
        if(datOfTran.getText().contains(formattedDate1)){
            click(dateOfTranBx);
            click(calBackwardBtn);
        }
        if(Objects.equals(globalParams.getPlatformName(),"Android")){
            xpath="(//*[@text='1'])[1]";
        }
        else{
            xpath="(//XCUIElementTypeOther[@name='1'])[1]";
        }
        click(getElement(xpath));
        clickByText("OK");

    }

    public void dateOfTranLastYear() throws Exception {
        click(dateOfTranBx);
        click(currentYear);
        if(! isVisible(lastyr)){
            if (Objects.equals(globalParams.getPlatformName(), "Android")) {
                andScrollToElementUsingUiScrollable("text", "2023");
                click(lastyr);
            } else {
                scrollToElement(lastyr, "up", dtPicker, 20000, 10);
                click(lastyr);
            }
        }
        else{
            click(lastyr);
        }
        for (int i = 0; i < 25; i++) {
            if (!isVisible(lastYearMar)) {
                click(calForwardBtn);
            } else {
                break;
            }
        }
        clickByText("1");
        clickByText("OK");
    }

    public void dateOfTranLastYearJul() throws Exception {
        click(dateOfTranBx);
        click(currentYear);
        String xpath="";
        if(Objects.equals(globalParams.getPlatformName(),"Android")){
            xpath="//*[@text='"+getPreviousYear()+"']";
            if(! isElementExist(xpath)){
                if (Objects.equals(globalParams.getPlatformName(), "Android")) {
                    andScrollToElementUsingUiScrollable("text", getPreviousYear());
                    clickByText(getPreviousYear());
                } else {
                    scrollToElement(lastyr, "up", dtPicker, 20000, 10);
                    click(lastyr);
                }
            }
            else{
                click(lastyr);
            }
            for (int i = 0; i < 25; i++) {
                if (!isVisible(lastYearJul)) {
                    click(calForwardBtn);
                } else {
                    break;
                }
            }
            clickByText("1");
            clickByText("OK");
        }

    }
    public void selectLastMonth(String duration) throws Exception {
        click(currentMonth);
        if(Objects.equals(globalParams.getPlatformName(),"iOS")){
            if(! isElementExist("(//XCUIElementTypeOther[@name='"+duration+"'])[2]")){
                clickByText(duration);
            }
            else{
                clickByText(duration);
            }
        }
        else{
            if(! isElementExist("//*[@text='"+duration+"']")){
                andScrollToElementUsingUiScrollable("text",duration);
                clickByText(duration);
            }
            else{
                clickByText(duration);
            }
        }
    }
    public void clickInvEquity(){
        click(investmentEquity);
    }

    public void clickDeleteExpense(){
        click(deleteExpense);
    }

    public boolean unableToSeeEquityTran(){
        return isVisible(investmentEquity);
    }

    public void clickPlusIconDash(){
        if(Objects.equals(globalParams.getPlatformName(),"iOS")){
            tapOn(213,860);
        }
        else{
            click(plusIconInDash);
        }

    }
    public void verifyBudgetTransaction(String text) throws Exception {
        if(Objects.equals(globalParams.getPlatformName(),"iOS")){
            verifyPartialText(text);
        }
        else{
            verifyText(text.split(" ")[0]);
        }
    }
    public void verifyBudgetIncome() throws Exception {
        if(Objects.equals(globalParams.getPlatformName(),"iOS")){
            verifyText("Budgeted Income Yet to Receive:  ₹4,72,000 Received ₹28,000 of ₹5,00,000 5%");
        }
        else{
            verifyText("Received ₹28,000 of ₹5,00,000");
        }
    }
    public void verifyInvestBudget() throws Exception {
        if(Objects.equals(globalParams.getPlatformName(),"iOS")){
            verifyText("Investment Remaining ₹5,65,000  Spent ₹35,000 of ₹6,00,000 5.83%");
        }
        else{
            verifyText("Spent ₹35,000 of ₹6,00,000");
        }
    }
    public void verifyHouseHoldBudget() throws Exception {
        if(Objects.equals(globalParams.getPlatformName(),"iOS")){
            verifyText("Household Remaining ₹0  Spent ₹1,000 of ₹1,000 100.00%");
        }
        else{
            verifyText("Spent ₹1,000 of ₹1,000");
        }
    }
    public void waitForExpenseSc(){
        if (!isVisible(expanseScreen)) {
            waitForVisibility(expanseScreen, 8);
        }
    }
}

