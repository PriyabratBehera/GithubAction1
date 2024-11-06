package com.qa.adminpages;

import com.qa.utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.List;

public class MutualFundPage extends WebBasePage {
    @FindBy(xpath = "//span[@id='select2-amclist-container']")
    private WebElement amcDropDwn;
    @FindBy(xpath = "//li[text()='SBI']")
    private WebElement amcSBI;
    @FindBy(xpath = "//li[text()=' SBI']")
    private WebElement editAmcSBI;
    @FindBy(xpath = "//input[@id='inputNanme4']")
    private WebElement schemesName;
    @FindBy(xpath = "//span[@id='select2-role-container']")
    private WebElement categoryDropDwn;
    @FindBy(xpath = "//span[@id='select2-fundcategory-container']")
    private WebElement editCategoryDropDwn;
    @FindBy(xpath = "//li[text()='Equity']")
    private WebElement equityCategory;
    @FindBy(xpath = "//li[text()=' Equity']")
    private WebElement editEquityCategory;
    @FindBy(xpath = "//span[@id='select2-fundsubcategory-container']")
    private WebElement subCategoryDropDwn;
    @FindBy(xpath = "//li[text()='Large Cap']")
    private WebElement largeCap;
    @FindBy(xpath = "//input[@id='isin_code']")
    private WebElement isinCode;
    @FindBy(xpath = "//input[@name='amfi_code']")
    private WebElement amfiCode;
    @FindBy(xpath = "//input[@id='name']")
    private WebElement amcName;
    @FindBy(xpath = "//input[@id='file-upload']")
    private WebElement amcLogo;
    @FindBy(xpath = "//input[@id='mf']")
    private WebElement schemeActiveNow;
    @FindBy(xpath = "//input[@id='submit']")
    private WebElement submitBtn;
    @FindBy(xpath = "//BUTTON[@id='submit']")
    private WebElement submit;
    @FindBy(xpath = "//a[text()='Edit']")
    private WebElement editLink;
    @FindBy(xpath = "//a[text()='Delete']")
    private WebElement deleteLink;



    public void selectAmc() throws InterruptedException {
        click(amcDropDwn);
        click(amcSBI);
    }

    public void editAmc() {
        click(amcDropDwn);
        click(editAmcSBI);
    }

    public void enterSchemeName(String schemeName) {
        clear(schemesName);
        sendKeys(schemesName, schemeName);
    }

    public void selectCategory() {
        click(categoryDropDwn);
        click(equityCategory);
    }

    public void editCategory() {
        click(editCategoryDropDwn);
        click(equityCategory);
    }

    public void selectSubCategory() throws InterruptedException {
        Thread.sleep(4000);
        click(subCategoryDropDwn);
        click(largeCap);
    }

    public void editSubCategory() throws InterruptedException {
        Thread.sleep(4000);
        click(subCategoryDropDwn);
        click(largeCap);
    }

    public void enterISINCode(String isinCod) {
        clear(isinCode);
        sendKeys(isinCode, isinCod);
    }

    public void enteramfi(String amfiCod) {
        clear(amfiCode);
        sendKeys(amfiCode, amfiCod);
    }

    public void clickSchemeActiveChk() throws InterruptedException {
        ((JavascriptExecutor) new DriverManager().getWebDriver()).executeScript("arguments[0].scrollIntoView(true);", schemeActiveNow);
        Thread.sleep(5000);
        click(schemeActiveNow);
    }

    public void clickSubmit() {
        click(submitBtn);
    }

    public void clickSubmitBtn() {
        click(submit);
    }

    public void editMfSchemes(String schemesName) {
        WebDriver driver = new DriverManager().getWebDriver();
        Actions actions = new Actions(driver);
        java.util.List<WebElement> numberOfRows = driver.findElements(By.xpath("//tbody[@id='scheme']/tr"));
        List<WebElement> numberOfColumns = driver.findElements(By.xpath("//table[@id='filtertable']/tbody/tr[1]/td"));
        for (int i = 1; i < numberOfRows.size() + 1; i++) {
            if (driver.findElement(By.xpath("//tbody[@id='scheme']/tr[" + i + "]/td[2]")).getText().equals(schemesName)) {
                WebElement element = driver.findElement(By.xpath("//tbody[@id='scheme']/tr[" + i + "]/td[11]"));
                actions.moveToElement(element).build().perform();
                actions.moveToElement(editLink).click().build().perform();
                break;
            }
        }
    }

    public void deleteMfSchemes(String schemesName) throws InterruptedException {
        WebDriver driver = new DriverManager().getWebDriver();
        Actions actions = new Actions(driver);
        Thread.sleep(6000);
        WebElement element = driver.findElement(By.xpath("//tbody[@id='scheme']/tr[1]/td[11]"));

        click(element);
        actions.moveToElement(deleteLink).click().build().perform();
        driver.switchTo().alert().accept();

    }
    public HashMap<String, String> dataStore = new HashMap<>();

}



