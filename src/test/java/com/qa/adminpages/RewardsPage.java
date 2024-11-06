package com.qa.adminpages;

import com.qa.utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class RewardsPage extends WebBasePage {
    @FindBy(xpath = "//a[@id='transaction_history']")
    private WebElement addMembership;
    @FindBy(xpath = "//input[@id='name']")
    private WebElement membershipName;
    @FindBy(xpath = "//input[@id='points']")
    private WebElement points;
    @FindBy(xpath = "//input[@id='redemption_limit']")
    private WebElement redemptionLimit;
    @FindBy(xpath = "//input[@id='redemption_ratio']")
    private WebElement redemptionRatio;
    @FindBy(xpath = "//input[@id='minimum_redemption']")
    private WebElement minimumRedemption;
    @FindBy(xpath = "//input[@id='maximum_redemption']")
    private WebElement maximumRedemption;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submit;
    @FindBy(xpath = "//a[text()='Edit']")
    private WebElement editLink;
    @FindBy(xpath = "//a[text()='Delete']")
    private WebElement deleteLink;
    @FindBy(xpath = "//a[text()='Digilocker']")
    private WebElement digilocker;
    @FindBy(xpath = "//a[text()='adityaBirla']")
    private WebElement adityaBirla;
    @FindBy(xpath = "//button[text()='Confirm']")
    private WebElement confirmDelete;

    public void clickAddMember() {
        click(addMembership);
    }

    public void enterMemberName(String memberName) {
        clear(membershipName);
        sendKeys(membershipName, memberName);
    }

    public void enterPoints() {
        clear(points);
        sendKeys(points, "18200");

    }

    public void enterRedemptionLimit() {
        clear(redemptionLimit);
        sendKeys(redemptionLimit, "180");

    }

    public void enterRedemptionRatio() {
        clear(redemptionRatio);
        sendKeys(redemptionRatio, "10");
    }

    public void enterMinRedemption() {
        clear(minimumRedemption);
        sendKeys(minimumRedemption, "30");
    }

    public void enterMaxRedemption() {
        clear(maximumRedemption);
        sendKeys(maximumRedemption, "50");
    }

    public void clickSubmit() {
        click(submit);
    }

    public void editMembership(String memberShipName) {
        WebDriver driver = new DriverManager().getWebDriver();
        Actions actions = new Actions(driver);
        List<WebElement> numberOfRows = driver.findElements(By.xpath("//tbody[@id='level_listpage']/tr"));
        List<WebElement> numberOfColumns = driver.findElements(By.xpath("//table[@id='filtertable']/tbody/tr[1]/td"));
        for (int i = 1; i < numberOfRows.size() + 1; i++) {
            if (driver.findElement(By.xpath("//tbody[@id='level_listpage']/tr[" + i + "]/td[2]")).getText().equals(memberShipName)) {
                WebElement element = driver.findElement(By.xpath("//tbody[@id='level_listpage']/tr[" + i + "]/td[8]"));
                actions.moveToElement(element).build().perform();
                actions.moveToElement(editLink).click().build().perform();
                break;
            }
        }
    }

    public void deleteMembership(String memberShipName) {
        WebDriver driver = new DriverManager().getWebDriver();
        Actions actions = new Actions(driver);
        List<WebElement> numberOfRows = driver.findElements(By.xpath("//tbody[@id='level_listpage']/tr"));
        List<WebElement> numberOfColumns = driver.findElements(By.xpath("//table[@id='filtertable']/tbody/tr[1]/td"));
        for (int i = 1; i < numberOfRows.size() + 1; i++) {
            if (driver.findElement(By.xpath("//tbody[@id='level_listpage']/tr[" + i + "]/td[2]")).getText().equals(memberShipName)) {
                WebElement element = driver.findElement(By.xpath("//tbody[@id='level_listpage']/tr[" + i + "]/td[8]"));
                actions.moveToElement(element).build().perform();
                actions.moveToElement(deleteLink).click().build().perform();
                click(confirmDelete);
                break;
            }
        }
    }

    public void addMembSuccess() {
        Assert.assertTrue(isVisible(digilocker));
    }

    public void editMembSuccess() {
        Assert.assertTrue(isVisible(adityaBirla));
    }

    public void deleteMembSuccess() {
        Assert.assertFalse(isVisible(adityaBirla));
    }
}
