package com.qa.adminpages;

import com.qa.utils.DriverManager;
import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WebBasePage {
    TestUtils utils = new TestUtils();
    GlobalParams globalParams = new GlobalParams();
    private WebDriver driver;

    public WebBasePage() {
        this.driver = new DriverManager().getWebDriver();
        PageFactory.initElements(driver, this);
    }

    public void waitForVisibility(WebElement e) {
        WebDriverWait wait = new WebDriverWait(driver, TestUtils.WAIT);
        wait.until(ExpectedConditions.visibilityOf(e));
    }

    public void sendKeys(WebElement e, String txt) {
        waitForVisibility(e);
        e.sendKeys(txt);
    }

    public void click(WebElement e) {
        waitForVisibility(e);
        e.click();
    }

    public boolean isVisible(WebElement e) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            return wait.until(ExpectedConditions.visibilityOf(e)).isDisplayed();
        } catch (Exception error) {
            return false;
        }
    }
    public List<WebElement> getRows(WebElement table) {
        return table.findElements(By.tagName("tr"));
    }
    public List<WebElement> getColumn(WebElement table){
        return table.findElements(By.tagName("th"));
    }

    public void clear(WebElement e) {
        waitForVisibility(e);
        e.clear();
    }

    public void clickIfExist(WebElement e) {
        if (isVisible(e)) {
            e.click();
        }
    }

    public void click(WebElement e, String msg) {
        waitForVisibility(e);
        utils.log().info(msg);
        e.click();
    }

    public void sendKeys(WebElement e, String txt, String msg) {
        waitForVisibility(e);
        utils.log().info(msg);
        e.sendKeys(txt);
    }

    public void enterUsingJavaScript(WebElement e, String txt) {
        waitForVisibility(e);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeAsyncScript("arguments[0].value='" + txt + "'", e);
    }

    public void clickUsingJavaScript(WebElement e, String msg) {
        waitForVisibility(e);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        utils.log().info(msg);
        js.executeAsyncScript("arguments[0].click();", e);
    }

    public void clickUsingJavaScript(WebElement e) {
        waitForVisibility(e);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeAsyncScript("arguments[0].click();", e);
    }

    public void doubleClick(WebElement e) {
        Actions action = new Actions(driver);
        action.doubleClick(e).perform();
    }

    public void doubleClick(WebElement e, String msg) {
        Actions action = new Actions(driver);
        utils.log().info(msg);
        action.doubleClick(e).perform();
    }

    public void rightClick(WebElement e) {
        Actions action = new Actions(driver);
        action.contextClick(e).perform();
    }

    public void rightClick(WebElement e, String msg) {
        Actions action = new Actions(driver);
        utils.log().info(msg);
        action.contextClick(e).perform();
    }

    public String getAttribute(WebElement e, String attribute) {
        waitForVisibility(e);
        return e.getAttribute(attribute);
    }

    public String getAttribute(WebElement e, String attribute, String msg) {
        waitForVisibility(e);
        utils.log().info(msg);
        return e.getAttribute(attribute);
    }

    public String getText(MobileElement e, String msg) {
        String txt;
        waitForVisibility(e);
        switch (new GlobalParams().getPlatformName()) {
            case "Android":
                txt = getAttribute(e, "text");
                break;
            case "iOS":
                txt = getAttribute(e, "label");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + new GlobalParams().getPlatformName());
        }
        utils.log().info(msg + txt);
        return txt;
    }

    public WebElement getElement(String xpath) throws Exception {
        try {
            Thread.sleep(1000);
            WebElement element = driver.findElement(By.xpath(xpath));
            waitForVisibility(element);
            return element;
        } catch (Exception e) {
            throw new Exception("WebElement not found with xpath: " + xpath);
        }
    }

    public void switchToFrame(int indexOfFrame) {
        driver.switchTo().frame(indexOfFrame);
    }

    public void switchToFrame(String frameName) {
        driver.switchTo().frame(frameName);
    }

    public void switchToFrame(WebElement element) {
        driver.switchTo().frame(element);
    }

    public String getPageTitle() throws InterruptedException {
        Thread.sleep(2000);
        return driver.getTitle();
    }

    public void clickLinkText(String text) throws Exception {
        String xpath = "//*[text()='" + text + "']";
        getElement(xpath).click();
    }

    public void scrollDownToElement(WebElement element) throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeAsyncScript("arguments[0].scrollIntoView();", element);
    }

    public void scrollDown() throws InterruptedException {

        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));
            js.executeAsyncScript("window.scrollBy(0,400)", "");
        } catch (ScriptTimeoutException e) {
            e.printStackTrace();
        }
    }
}
