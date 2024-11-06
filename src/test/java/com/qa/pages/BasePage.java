package com.qa.pages;

import com.github.javafaker.Faker;
import com.google.common.collect.ImmutableMap;
import com.qa.utils.DriverManager;
import com.qa.utils.GlobalParams;
import com.qa.utils.PropertyManager;
import com.qa.utils.TestUtils;
import io.appium.java_client.*;
import io.appium.java_client.android.appmanagement.AndroidTerminateApplicationOptions;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static io.appium.java_client.remote.AndroidMobileCapabilityType.APP_PACKAGE;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class BasePage {
    @iOSXCUITFindBy(iOSNsPredicate = "label BEGINSWITH 'Done'")
    private MobileElement done;
    TestUtils utils = new TestUtils();
    GlobalParams globalParams = new GlobalParams();

    private AppiumDriver<?> driver;

    public BasePage() {
        this.driver = new DriverManager().getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }

    public List<MobileElement> getElements(String xpath) throws Exception {
        try {
            Thread.sleep(1000);
            List<MobileElement> element = (List<MobileElement>) driver.findElementsByXPath(xpath);
            waitForVisibility((MobileElement) element);
            return element;
        } catch (Exception e) {
            throw new Exception("MobileElements not found with xpath: " + xpath);
        }
    }
    public void waitForVisibility(MobileElement e) {
        WebDriverWait wait = new WebDriverWait(driver, TestUtils.WAIT);
        wait.until(ExpectedConditions.visibilityOf(e));
    }
    public void clickDone() {
        click(done);
    }

    public void waitForVisibility(MobileElement e, long time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOf(e));
    }

    public void waitForVisibility(By e) {
        WebDriverWait wait = new WebDriverWait(driver, TestUtils.WAIT);
        wait.until(ExpectedConditions.visibilityOfElementLocated(e));
    }

    public void pressEnter() {
        driver.getKeyboard().sendKeys(Keys.ENTER);
    }

    public boolean isVisible(MobileElement e) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            return wait.until(ExpectedConditions.visibilityOf(e)).isDisplayed();
        } catch (Exception error) {
            return false;
        }
    }

    public void clear(MobileElement e) {
        waitForVisibility(e);
        e.clear();
    }

    public void click(MobileElement e) {
        waitForVisibility(e);
        e.click();
    }

    public void clickOnAPoint(int xPoint, int yPoint) {
        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(PointOption.point(xPoint, yPoint)).perform();

    }

    public void click(MobileElement e, String msg) {
        waitForVisibility(e);
        utils.log().info(msg);
        e.click();
    }

    public void click(By e, String msg) {
        waitForVisibility(e);
        utils.log().info(msg);
        driver.findElement(e).click();
    }

    public void clickIfExist(MobileElement e) {
        if (isVisible(e)) {
            e.click();
        }
    }

    public void sendKeys(MobileElement e, String txt) {
        waitForVisibility(e);
        e.sendKeys(txt);
    }

    public void sendKeys(MobileElement e, String txt, String msg) {
        waitForVisibility(e);
        utils.log().info(msg);
        e.sendKeys(txt);
    }

    public void sendKeysJavaScript(MobileElement e, String txt) {
        waitForVisibility(e);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeAsyncScript("arguments[0].value='" + txt + "'", e);
    }

    public Keyboard getKeyBoard() {
        return driver.getKeyboard();
    }

    public void hideKeyBoard() {
        driver.hideKeyboard();
    }

    public void doubleClick(WebElement e) {
        Actions action = new Actions(driver);
        action.doubleClick();
    }

    public void setToggle(MobileElement e, String value) {
        waitForVisibility(e);
        if (e.getText().equalsIgnoreCase(value))
            utils.log().info("Toggle already selected as" + value);
        else e.click();
    }

    public String getAttribute(MobileElement e, String attribute) {
        waitForVisibility(e);
        return e.getAttribute(attribute);
    }

    public String getAttribute(By e, String attribute) {
        waitForVisibility(e);
        return driver.findElement(e).getAttribute(attribute);
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

    public String getText(By e, String msg) {
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

    public MobileElement getElement(String xpath) throws Exception {
        try {
            Thread.sleep(1000);
            MobileElement element = (MobileElement) driver.findElementByXPath(xpath);
            waitForVisibility(element);
            return element;
        } catch (Exception e) {
            throw new Exception("MobileElement not found with xpath: " + xpath);
        }
    }

    public int getElementCount(String xpath) throws Exception {
        try {
            Thread.sleep(3000);
            List<MobileElement> element = (List<MobileElement>) driver.findElementsByXPath(xpath);
            return element.size();
        } catch (Exception e) {
            throw new Exception("MobileElement not found with xpath: " + xpath);
        }
    }

    public boolean isElementExist(String xpath) {
        try {
            Thread.sleep(3000);
            MobileElement element = (MobileElement) driver.findElementByXPath(xpath);
            waitForVisibility(element);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void closeApp() throws IOException {
        Properties props = new PropertyManager().getProps();
        ((InteractsWithApps) driver).terminateApp(props.getProperty("androidAppPackage"));
    }

    public boolean terminateApp() {
        boolean isTerminated = false;
        try {
            Properties props = new PropertyManager().getProps();
            isTerminated = driver.terminateApp(props.getProperty("androidAppPackage"), new AndroidTerminateApplicationOptions().withTimeout(Duration.ofMillis(1500)));
        } catch (WebDriverException | IOException e) {
            e.printStackTrace();
        }
        return isTerminated;
    }

    public void removeApp() throws IOException {
        Properties props = new PropertyManager().getProps();
        ((InteractsWithApps) driver).removeApp(props.getProperty("androidAppPackage"));
    }

    public void launchApp() throws IOException {
        Properties props = new PropertyManager().getProps();
//        ((InteractsWithApps) driver).terminateApp(props.getProperty("androidAppPackage"));
        ((InteractsWithApps) driver).activateApp(props.getProperty("androidAppPackage"));
    }

    public void reLaunchApp() throws Exception {
        Properties props = new PropertyManager().getProps();
//        ((InteractsWithApps) driver).terminateApp(props.getProperty("androidAppPackage"));
        ((InteractsWithApps) driver).activateApp(props.getProperty("androidAppPackage"));
    }

    public MobileElement andScrollToElementUsingUiScrollable(String childLocAttr, String childLocValue) {
        return (MobileElement) ((FindsByAndroidUIAutomator) driver).findElementByAndroidUIAutomator(
                "new UiScrollable(new UiSelector()" + ".scrollable(true)).scrollIntoView("
                        + "new UiSelector()." + childLocAttr + "(\"" + childLocValue + "\"));");
    }

    public MobileElement iOSScrollToElementByName(MobileElement e, String direction, String name) {
        HashMap<String, Object> scrollObject = new HashMap<>();
        scrollObject.put("direction", direction);
        scrollObject.put("name", name);
        driver.executeScript("mobile:scroll", scrollObject);

//        driver.executeScript("mobile: scroll", ImmutableMap.of("direction", direction));

        return e;
    }
    public void iOSScrollToElementByName(String direction, String name) {
        driver.executeScript("mobile: scroll", ImmutableMap.of("direction", direction),ImmutableMap.of("name", name));
    }

    public By iOSScrollToElementUsingMobileScrollParent(MobileElement parentE, String predicateString) {
        RemoteWebElement parent = (RemoteWebElement) parentE;
        String parentID = parent.getId();
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("element", parentID);
//	  scrollObject.put("direction", "down");
        scrollObject.put("predicateString", predicateString);
//        scrollObject.put("ios class chain ", predicateString);
//	  scrollObject.put("name", "test-ADD TO CART");
//        scrollObject.put("toVisible", "sdfnjksdnfkld");
        driver.executeScript("mobile:scroll", scrollObject);
        By m = MobileBy.iOSNsPredicateString(predicateString);
//        By m=MobileBy.iOSClassChain(predicateString);
        System.out.println("Mobilelement is " + m);
        return m;
    }

    public MobileElement scrollToElement(MobileElement element, String direction, MobileElement refElement) throws Exception {
        Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.width * 0.5);
        int endX = (int) (size.width * 0.5);
        int startY = 0;
        int endY = 0;
        boolean isFound = false;

        switch (direction) {
            case "up":
//                endY = (int) (size.height * 0.4);
//                startY = (int) (size.height * 0.9);
                startY = refElement.getLocation().getY();
                startX = refElement.getLocation().getX();
                endX = startX;
                endY = refElement.getLocation().getY() - 800;
                break;

            case "down":
//                endY = (int) (size.height * 0.6);
//                startY = (int) (size.height * 0.4);
                startY = refElement.getLocation().getY();
                startX = refElement.getLocation().getX();
                endX = startX;
                endY = refElement.getLocation().getY() + 800;
                break;

            case "right":
                startY = refElement.getLocation().getY();
                startX = refElement.getLocation().getX();
                endX = refElement.getLocation().getX() + 400;
                endY = startY;

                break;

            case "left":
                startY = refElement.getLocation().getY();
                startX = refElement.getLocation().getX() + 600;
                endX = refElement.getLocation().getX() + 20;
                endY = startY;
        }

        for (int i = 0; i < 10; i++) {
            if (find(element, 3)) {
                swipe(startX, startY, endX, endY, 1000);
                isFound = true;
                break;
            } else {
                swipe(startX, startY, endX, endY, 1000);
            }
        }
        if (!isFound) {
            throw new Exception("Element not found after scrolling");
        }
        return element;
    }
    public void scrolldownInAnd(String text){
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text('"+text+"'));"));

    }
    public  void scrollDown1() {
        int startX = driver.manage().window().getSize().width / 2;
        int startY = (int) (driver.manage().window().getSize().height * 0.8);
        int endY = (int) (driver.manage().window().getSize().height * 0.2);

        TouchAction<?> touchAction = new TouchAction<>(driver);
        touchAction.press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();
    }

    public MobileElement scrollToElement(MobileElement element, String direction, MobileElement refElement, int speed, int time) throws Exception {
        Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.width * 0.5);
        int endX = (int) (size.width * 0.5);
        int startY = 0;
        int endY = 0;
        boolean isFound = false;

        switch (direction) {
            case "up":
//                endY = (int) (size.height * 0.4);
//                startY = (int) (size.height * 0.9);
                startY = refElement.getLocation().getY();
                startX = refElement.getLocation().getX();
                endX = startX;
                endY = refElement.getLocation().getY() - 800;
                break;

            case "down":
//                endY = (int) (size.height * 0.6);
//                startY = (int) (size.height * 0.4);
                startY = refElement.getLocation().getY();
                startX = refElement.getLocation().getX();
                endX = startX;
                endY = refElement.getLocation().getY() + 800;
                break;

            case "right":
                startY = refElement.getLocation().getY();
                startX = refElement.getLocation().getX();
                endX = refElement.getLocation().getX() + 400;
                endY = startY;

                break;

            case "left":
                startY = refElement.getLocation().getY();
                startX = refElement.getLocation().getX() + 600;
                endX = refElement.getLocation().getX() + 20;
                endY = startY;
        }

        for (int i = 0; i < time; i++) {
            swipe(startX, startY, endX, endY, speed);
            Thread.sleep(3000);
            if (isVisible(element)) {
                break;
            }
        }

        if (!isVisible(element)) {
            throw new Exception("Element not found after scrolling");
        }
        return element;
    }

    public By scrollToElement(By element, String direction) throws Exception {
        Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.width * 0.5);
        int endX = (int) (size.width * 0.5);
        int startY = 0;
        int endY = 0;
        boolean isFound = false;

        switch (direction) {
            case "up":
                endY = (int) (size.height * 0.4);
                startY = (int) (size.height * 0.6);
                break;

            case "down":
                endY = (int) (size.height * 0.6);
                startY = (int) (size.height * 0.4);
                break;

            case "right":
                startY = (int) (size.height / 2);
                startX = (int) (size.width * 0.90);
                endX = (int) (size.width * 0.05);
                break;

            case "left":
                startY = (int) (size.height / 2);
                startX = (int) (size.width * 0.05);
                endX = (int) (size.width * 0.90);

                startX = (int) (size.width * 0.5);
                endX = (int) (size.width * 0.5);
                startY = 0;
                endY = 0;


                break;
        }

        for (int i = 0; i < 3; i++) {
            if (find(element, 1)) {
                isFound = true;
                break;
            } else {
                swipe(startX, startY, endX, endY, 1000);
            }
        }
        if (!isFound) {
            throw new Exception("Element not found after scrolling");
        }
        return element;
    }

    public boolean find(final MobileElement element, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            return wait.until(new ExpectedCondition<Boolean>() {
                @Override
                public Boolean apply(WebDriver driver) {
                    if (element.isDisplayed()) {
                        return true;
                    }
                    return false;
                }
            });
        } catch (Exception e) {
            return false;
        }
    }

    public boolean find(final By element, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            return wait.until(new ExpectedCondition<Boolean>() {
                @Override
                public Boolean apply(WebDriver driver) {
                    if (driver.findElement(element).isDisplayed()) {
                        return true;
                    }
                    return false;
                }
            });
        } catch (Exception e) {
            return false;
        }
    }


    public void swipe(int startX, int startY, int endX, int endY, int millis)
            throws InterruptedException {
        TouchAction t = new TouchAction(driver);
        t.press(point(startX, startY)).waitAction(waitOptions(ofMillis(millis))).moveTo(point(endX, endY)).release()
                .perform();
    }
    public void iOSSwSwipeipe(MobileElement row,String direction,MobileElement target) throws InterruptedException {
        Dimension size = row.getSize();
        int xShift = (int) (size.getWidth() * 0.20);
        int xStart = size.getWidth() - xShift;
        if(direction.equals("left")){
            int xEnd = (size.getWidth() * -1);
            swipeForCoordinate(row,xStart, xEnd,target);
        }
        else if(direction.equals("right")){
            int xEnd = (size.getWidth() * 3);
                swipeForCoordinate(row,xStart, xEnd,target);
    }
        else if(direction.equals("up")){
            Dimension size1 = driver.manage().window().getSize();
            int startX = (int) (size1.width * 0.5);
            int endX = (int) (size1.width * 0.5);
            int startY = 0;
            int endY = 0;
            boolean isFound = false;

                    startY = row.getLocation().getY();
                    startX = row.getLocation().getX();
                    endX = startX;
                    endY = row.getLocation().getY() - 800;
//                    break;
            for (int i = 0; i < 30; i++) {
                new TouchAction(driver).longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();
                if (isVisible(target)) {
                    break;
                }
            }
        }
        else if(direction.equals("down")){
            Dimension size1 = driver.manage().window().getSize();
            int startX = (int) (size1.width * 0.5);
            int endX = (int) (size1.width * 0.5);
            int startY = 0;
            int endY = 0;
                startY = row.getLocation().getY();
                startX = row.getLocation().getX();
                endX = startX;
                endY = row.getLocation().getY() + 800;
//                break;
            for (int i = 0; i < 30; i++) {
                new TouchAction(driver).longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();
                if (isVisible(target)) {
                    break;
                }
            }
        }

    }

    public void swipeForCoordinate(MobileElement row,int xStart, int xEnd,MobileElement targetElement) {
            int y = row.getSize().getHeight() / 2;
            for (int i = 0; i < 30; i++) {
                new TouchAction<>(driver)
                        .press(ElementOption.element(row, xStart, y))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(ElementOption.element(row, xEnd, y))
                        .release()
                        .perform();
                if(isVisible(targetElement)){
                    break;
                }
            }
        }

    public void clickReturnIosKeyboard() throws Exception {
        String xpath = "//XCUIElementTypeButton[@name='Return']";
        clickIfExist(getElement(xpath));
    }

    public void clickDoneIosKeyboard() throws Exception {
        String xpath = "//XCUIElementTypeButton[@name=\"Done\"]";
        click(getElement(xpath));
    }

    public void clickTypeKeyDelete() throws Exception {
        String xpath = "//XCUIElementTypeKey[@name='Delete']";
        click(getElement(xpath));
    }

    public void clickByText(String text) throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            xpath = "//*[@text='" + text + "']";
        } else {
            xpath = "//XCUIElementTypeOther[@name='" + text + "']";
        }
        getElement(xpath).click();
    }

    public void clickStaticText(String text) throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            xpath = "//*[@text='" + text + "']";
        } else if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "//XCUIElementTypeStaticText[@name='" + text + "']";
        }
        getElement(xpath).click();
    }

    public void clickByTextContains(String text) throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            xpath = "//*[contains(@text, '" + text + "')]";
        } else if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "(//XCUIElementTypeOther[contains(@name, '" + text + "')])[last()]";
        }
        getElement(xpath).click();
    }

    public void clickPartialStaticText(String text) throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            xpath = "//*[contains(@text,'" + text + "')]";
        } else if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "//XCUIElementTypeStaticText[contains(@name,'" + text + "')]";

        }
        getElement(xpath).click();
    }
    public void iOSSwipe(MobileElement row,String direction,MobileElement target) throws InterruptedException {
        Dimension size = row.getSize();
        int xShift = (int) (size.getWidth() * 0.20);
        int xStart = size.getWidth() - xShift;
        if(direction.equals("left")){
            int xEnd = (size.getWidth() * -1);
            swipeForCoordinate(row,xStart, xEnd,target);
        }
        else if(direction.equals("right")){
            int xEnd = (size.getWidth() * 3);
            swipeForCoordinate(row,xStart, xEnd,target);
        }
        else if(direction.equals("up")){
            Dimension size1 = driver.manage().window().getSize();
            int startX = (int) (size1.width * 0.5);
            int endX = (int) (size1.width * 0.5);
            int startY = 0;
            int endY = 0;
            boolean isFound = false;

            startY = row.getLocation().getY();
            startX = row.getLocation().getX();
            endX = startX;
            endY = row.getLocation().getY() - 800;
//                    break;
            for (int i = 0; i < 30; i++) {
                new TouchAction(driver).longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();
                if (isVisible(target)) {
                    break;
                }
            }
        }
        else if(direction.equals("down")){
            Dimension size1 = driver.manage().window().getSize();
            int startX = (int) (size1.width * 0.5);
            int endX = (int) (size1.width * 0.5);
            int startY = 0;
            int endY = 0;
            startY = row.getLocation().getY();
            startX = row.getLocation().getX();
            endX = startX;
            endY = row.getLocation().getY() + 800;
//                break;
            for (int i = 0; i < 30; i++) {
                new TouchAction(driver).longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();
                if (isVisible(target)) {
                    break;
                }
            }
        }

    }


    public void verifyText(String text) throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            xpath = "//*[@text='" + text + "']";
        } else if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "//XCUIElementTypeOther[@name='" + text + "']";
        }
        Assert.assertTrue(new BasePage().isElementExist(xpath));
    }

    public void verifyStaticText(String text) throws Exception {
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            xpath = "//*[@text='" + text + "']";
        } else if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "//XCUIElementTypeStaticText[@name='" + text + "']";

        }
        String ele=getElement(xpath).getText();
        Assert.assertTrue(new BasePage().isElementExist(xpath));
//        Assert.assertEquals("Your SIP has been stooped","Your SIP has been stooped");
    }

    public void verifyPartialStaticText(String text) throws Exception {
        Thread.sleep(3000);
        String xpath = "";
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            xpath = "//*[contains(@text,'" + text + "')]";
        } else if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
            xpath = "//XCUIElementTypeStaticText[contains(@name,'" + text + "')]";
        }
        Assert.assertTrue(new BasePage().isElementExist(xpath));
    }

    public void verifyPartialText(String text) throws Exception {
        Thread.sleep(3000);
        String xpath;
        if (Objects.equals(globalParams.getPlatformName(), "Android")) {
            xpath = "//*[contains(@text,'" + text + "')]";
        } else {
            xpath = "//XCUIElementTypeOther[contains(@name,'" + text + "')]";
        }
        Assert.assertTrue(new BasePage().isElementExist(xpath));
        String x=getElement(xpath).getText();
        utils.log().info(x);
    }

    public String generateRandomMobileNumber() {
        Faker faker = new Faker();
        String[] prefixes = {"91", "98"};
        String randomPrefix = prefixes[faker.random().nextInt(prefixes.length)];

        StringBuilder randomNumber = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            randomNumber.append(faker.number().digit());
        }

        return randomPrefix + randomNumber.toString();
    }

    public String getCurrentDate() {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        String formattedDate = today.format(formatter);
        return formattedDate;
    }

    public void tapOn(int xPoint, int yPoint) {
        TouchAction t = new TouchAction(driver);
        t.tap(PointOption.point(xPoint, yPoint)).perform();
    }

    public void scrollInAndroid(MobileElement e, int x1, int y1, int x2, int y2) {
        for (int i = 0; i < 10; i++) {
            new TouchAction(driver).longPress(PointOption.point(x1, y1)).moveTo(PointOption.point(x2, y2)).release().perform();
            if (isVisible(e)) {
                break;
            }
        }
    }
    public void androidSwipe(MobileElement refElement,MobileElement element,MobileElement target){
        Point location = refElement.getLocation();
        int x1 = location.getX();
        int y1 = location.getY();
        Point location1 = element.getLocation();
        int x2 = location1.getX();
        int y2 = location1.getY();
        for (int i = 0; i < 10; i++) {
            new TouchAction(driver).longPress(PointOption.point(x1, y1)).moveTo(PointOption.point(x2, y2)).release().perform();
            if (isVisible(target)) {
                break;
            }
        }
    }
    public void swipeElementToElement(WebElement startElement, WebElement endElement) {
        TouchAction<?> touchAction = new TouchAction<>(driver);

        touchAction.press(ElementOption.element(startElement))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(ElementOption.element(endElement))
                .release()
                .perform();
    }

    public void scrollInAndroid(MobileElement source, MobileElement target) {
        new TouchAction(driver).longPress(ElementOption.element(source)).moveTo(ElementOption.element(target)).release().perform();
    }

    public MobileElement andIosScroll(MobileElement element, String direction, MobileElement refElement) throws Exception {
        Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.width * 0.5);
        int endX = (int) (size.width * 0.5);
        int startY = 0;
        int endY = 0;
        boolean isFound = false;

        switch (direction) {
            case "up":
//                endY = (int) (size.height * 0.4);
//                startY = (int) (size.height * 0.9);
                startY = refElement.getLocation().getY();
                startX = refElement.getLocation().getX();
                endX = startX;
                endY = refElement.getLocation().getY() - 800;
                break;

            case "down":
//                endY = (int) (size.height * 0.6);
//                startY = (int) (size.height * 0.4);
                startY = refElement.getLocation().getY();
                startX = refElement.getLocation().getX();
                endX = startX;
                endY = refElement.getLocation().getY() + 800;
                break;

            case "right":
                startY = refElement.getLocation().getY();
                startX = refElement.getLocation().getX();
                endX = refElement.getLocation().getX() + 400;
                endY = startY;

                break;

            case "left":
                startY = refElement.getLocation().getY();
                startX = refElement.getLocation().getX() + 600;
                endX = refElement.getLocation().getX() + 20;
                endY = startY;
        }

        for (int i = 0; i < 10; i++) {
            new TouchAction(driver).longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();
            if (isVisible(element)) {
                break;
            }
        }

        if (!isVisible(element)) {
            throw new Exception("Element not found after scrolling");
        }
        return element;
    }

    public MobileElement andIosScroll(MobileElement element, String direction, MobileElement refElement, int time) throws Exception {
        Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.width * 0.5);
        int endX = (int) (size.width * 0.5);
        int startY = 0;
        int endY = 0;
        boolean isFound = false;

        switch (direction) {
            case "up":
//                endY = (int) (size.height * 0.4);
//                startY = (int) (size.height * 0.9);
                startY = refElement.getLocation().getY();
                startX = refElement.getLocation().getX();
                endX = startX;
                endY = refElement.getLocation().getY() - 800;
                break;

            case "down":
//                endY = (int) (size.height * 0.6);
//                startY = (int) (size.height * 0.4);
                startY = refElement.getLocation().getY();
                startX = refElement.getLocation().getX();
                endX = startX;
                endY = refElement.getLocation().getY() + 800;
                break;

            case "right":
                startY = refElement.getLocation().getY();
                startX = refElement.getLocation().getX();
                endX = refElement.getLocation().getX() + 400;
                endY = startY;

                break;

            case "left":
                startY = refElement.getLocation().getY();
                startX = refElement.getLocation().getX() + 600;
                endX = refElement.getLocation().getX() + 20;
                endY = startY;
        }

        for (int i = 0; i < time; i++) {
            new TouchAction(driver).longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();
            if (isVisible(element)) {
                break;
            }
        }

        if (!isVisible(element)) {
            throw new Exception("Element not found after scrolling");
        }
        return element;
    }
    public MobileElement waitForEitherElementToBeVisible(MobileElement locator1, MobileElement locator2, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        try {
            return wait.until(driver -> {
                try {
                    if (locator1.isDisplayed()) {
                        return locator1;
                    }
                } catch (Exception e) {
                    utils.log().info("Element1 not became visible within the timeout");
               }

                try {
                    if (locator2.isDisplayed()) {
                        return locator2;
                    }
                } catch (Exception e) {
                    utils.log().info("Element2 not became visible within the timeout");
                }

                return null;
            });
        } catch (TimeoutException e) {
            utils.log().info("Neither element1 nor element2 became visible within the timeout");
            return null;
        }
    }
    public String getPreviousYear(){
        LocalDate today = LocalDate.now();
        LocalDate previousYearDate = today.minusYears(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
        String formattedDate = previousYearDate.format(formatter);
        return formattedDate;
    }
}


