package com.qa.adminpages;

import com.qa.utils.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NPSPage extends WebBasePage {
    @FindBy(xpath = "//input[@id='company_name']")
    private WebElement companyName;
    @FindBy(xpath = "//input[@id='brand_name']")
    private WebElement brandName;
    @FindBy(xpath = "//span[@id='select2-category_name-container']")
    private WebElement craDropDwn;
    @FindBy(xpath = "//li[text()='PROTEAN']")
    private WebElement protean;
    @FindBy(xpath = "//span[@id='select2-state_name-container']")
    private WebElement stateDropDwn;
    @FindBy(xpath = "//ul[@id='select2-state_name-results']/li[1]")
    private WebElement AP;
    @FindBy(xpath = "//input[@id='city_name']")
    private WebElement city;
    @FindBy(xpath = "//input[@id='pin_code']")
    private WebElement pin;
    @FindBy(xpath = "//input[@id='cho_number']")
    private WebElement choNumber;
    @FindBy(xpath = "//input[@id='cbo_online_number']")
    private WebElement cboOnline;
    @FindBy(xpath = "//input[@id='cbo_offline_number']")
    private WebElement cboOffline;
    @FindBy(xpath = "//span[@id='select2-subscriber_fee-container']/following-sibling::span")
    private WebElement subscribeFeesDropDwn;
    @FindBy(xpath = "//li[text()='₹350']")
    private WebElement subFeeAmount;
    @FindBy(xpath = "//span[@id='select2-contribution_fees-container']")
    private WebElement contributionFeesDropDwn;
    @FindBy(xpath = "//li[text()='0.40%']")
    private WebElement contributeFeeAmount;
    @FindBy(xpath = "//span[@id='select2-initial_contribution-container']")
    private WebElement initialInvestDropDwn;
    @FindBy(xpath = "//li[text()='Pay later']")
    private WebElement initialAmount;
    @FindBy(xpath = "//input[@id='activation_date']")
    private WebElement activationDt;
    @FindBy(xpath = "//input[@id='company_email']")
    private WebElement companyMail;
    @FindBy(xpath = "//input[@id='retirement-age']")
    private WebElement retirementAge;
    @FindBy(xpath = "//span[@id='select2-retirement-date-container']")
    private WebElement retirementDate;
    @FindBy(xpath = "//li[text()='End of the month']")
    private WebElement endOfMonth;
    @FindBy(xpath = "//span[@id='select2-corporate-contributor-container']")
    private WebElement coContributor;
    @FindBy(xpath = "//li[text()='No']")
    private WebElement coContributeNo;
    @FindBy(xpath = "//span[@id='select2-Investment-Preference-container']")
    private WebElement investmentPreference;
    @FindBy(xpath = "//li[text()='Subscriber']")
    private WebElement investPrefSubscribe;
    @FindBy(xpath = "//input[@id='nodal_name']")
    private WebElement nodalOfficerName;
    @FindBy(xpath = "//input[@id='altr_nodal_mobile']")
    private WebElement alterNodalMob;
    @FindBy(xpath = "//div[@id='toolbarContainer']/following-sibling::span/descendant::span/input")
    private WebElement stateInputBx;

    public void enterCompanyName(String name) {
        clear(companyName);
        sendKeys(companyName, name);
    }

    public void enterBrandName(String name) {
        clear(brandName);
        sendKeys(brandName, name);
    }

    public void selectCRA() {
        click(craDropDwn);
        click(protean);
    }

    public void selectState() {
        click(stateDropDwn);
        sendKeys(stateInputBx, "ap");
        stateInputBx.sendKeys(Keys.ENTER);
    }

    public void enterCity(String cityName) {
        sendKeys(city, cityName);
    }

    public void enterPin(String Pin) {
        sendKeys(pin, Pin);
    }

    public void enterCho(String choNum) {
        sendKeys(choNumber, choNum);
    }

    public void enterCboOnline(String cboonline) {
        sendKeys(cboOnline, cboonline);
    }

    public void enterCboOffline(String cbooffline) {
        sendKeys(cboOffline, cbooffline);
    }

    public void selectSubscribeFee() throws InterruptedException {
        ((JavascriptExecutor) new DriverManager().getWebDriver()).executeScript("arguments[0].scrollIntoView(true);", subscribeFeesDropDwn);
        Thread.sleep(5000);
        click(subscribeFeesDropDwn);
        Thread.sleep(5000);
        click(subFeeAmount);
    }

    public void selectContributeFee() {
        click(subscribeFeesDropDwn);
        click(subFeeAmount);
    }

    public void selectInitialInvestAmt() {
        click(initialInvestDropDwn);
        click(initialAmount);
    }

    public void enterCompanyEmail(String id) {
        clear(companyMail);
        sendKeys(companyMail, id);
    }

    public void enterRetirementAge(String age) {
        clear(retirementAge);
        sendKeys(retirementAge, age);
    }

    public void selectRetirementDate() {
        click(retirementDate);
        click(retirementDate);
    }

    public void selectCoContribute() throws InterruptedException {
        Thread.sleep(5000);
        click(contributionFeesDropDwn);
        Thread.sleep(5000);
        click(contributeFeeAmount);
    }

    public void selectInvestPref() {
        click(investmentPreference);
        click(investPrefSubscribe);
    }

    public void scrollDownPage() throws InterruptedException {
        scrollDown();
    }

    public void enterActivationDt() throws InterruptedException {
        String value = "02/10/2023";
        Thread.sleep(5000);
        sendKeys(activationDt, value);

    }
}
