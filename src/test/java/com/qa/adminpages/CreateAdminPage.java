package com.qa.adminpages;

import com.qa.utils.DriverManager;
import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Objects;

public class CreateAdminPage extends WebBasePage {
    TestUtils testUtils = new TestUtils();
    GlobalParams params = new GlobalParams();
    @FindBy(xpath = "//span[@id='select2-role-container']")
    private WebElement selectRole;
    @FindBy(xpath = "//ul[@id='select2-role-results']/li[6]")
    private WebElement selectSoftwareQa;
    
    @FindBy(xpath = "//input[@id='inputNanme4']")
    private WebElement userName;
    @FindBy(xpath = "//input[@id='first_name']")
    private WebElement firstName;
    @FindBy(xpath = "//input[@id='list_name']")
    private WebElement lastName;
    @FindBy(xpath = "//input[@id='contact']")
    private WebElement contact;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;
    @FindBy(xpath = "//button[text()='Submit']")
    private WebElement submitBtn;
    @FindBy(xpath = "//*[text()='Priyabrat ']")
    private WebElement priyabrat;
    @FindBy(xpath = "//td[text()='litan ']")
    private WebElement litan;
    @FindBy(xpath = "(//input[@id='contact'])[2]")
    private WebElement referralCode;
    @FindBy(xpath = "//table[@id='filtertable']/tbody/tr")
    private WebElement numberOfUsers;
    //div[@id='toolbarContainer']/following-sibling::span/descendant::span[2]/input
    @FindBy(xpath = "//div[@id='toolbarContainer']/following-sibling::span/descendant::span[2]/input")
    private WebElement RoleInputBx;

    public void selectRole() throws InterruptedException {

        if (Objects.equals(globalParams.getBrowserType(), "Edge")) {
            Thread.sleep(2000);
        }
        click(selectRole);
        sendKeys(RoleInputBx, "software");
        RoleInputBx.sendKeys(Keys.ENTER);
    }

    public void enterUserName(String usrName) {
        clear(userName);
        sendKeys(userName, "Priyabrat@1234");
    }

    public void enterFirstName(String fstName) {
        clear(firstName);
        sendKeys(firstName, fstName);
    }

    public void enterLastName(String lstName) {
        clear(lastName);
        sendKeys(lastName, lstName);
    }

    public void enterContact(String mobNo) {
        clear(contact);
        sendKeys(contact, mobNo);
    }

    public void enterPassword(String passWord) {
        clear(password);
        sendKeys(password, passWord);
    }

    public void clickOnSubmit() {
        click(submitBtn);
    }

    public void UserCreateSuccess() {
        Assert.assertTrue(isVisible(priyabrat));
    }

    public void editUserSuccess() {
        Assert.assertTrue(isVisible(litan));
    }

    public void deleteUserSuccess() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertFalse(isVisible(litan));
    }

    public boolean isUserExist(String adminName) {
        WebDriver driver = new DriverManager().getWebDriver();
        List<WebElement> numberOfRows = driver.findElements(By.xpath("//table[@id='filtertable']/tbody/tr"));
        List<WebElement> numberOfColumns = driver.findElements(By.xpath("//table[@id='filtertable']/tbody/tr[1]/td"));
        boolean b = false;
        for (int i = 1; i < numberOfRows.size() + 1; i++) {
            if (driver.findElement(By.xpath("//table[@id='filtertable']/tbody/tr[" + i + "]/td[2]")).getText().equals(adminName)) {
                b = true;
                break;
            }
        }
        return b;
    }

    public void editAdminDetails(String adminName) throws Exception {
        if (Objects.equals(params.getBrowserType(), "Chrome")) {
            WebDriver driver = new DriverManager().getWebDriver();
            List<WebElement> numberOfRows = driver.findElements(By.xpath("//table[@id='filtertable']/tbody/tr"));
            List<WebElement> numberOfColumns = driver.findElements(By.xpath("//table[@id='filtertable']/tbody/tr[1]/td"));
            for (int i = 1; i < numberOfRows.size() + 1; i++) {
                if (driver.findElement(By.xpath("//table[@id='filtertable']/tbody/tr[" + i + "]/td[2]")).getText().equals("Priyabrat")) {
                    driver.findElement(By.xpath("//table[@id='filtertable']/tbody/tr[" + i + "]/td[7]/descendant::a")).click();
                    break;
                }
            }
        } else {
            WebDriver driver = new DriverManager().getWebDriver();
            List<WebElement> numberOfRows = driver.findElements(By.xpath("//table[@id='filtertable']/tbody/tr"));
            List<WebElement> numberOfColumns = driver.findElements(By.xpath("//table[@id='filtertable']/tbody/tr[1]/td"));
            for (int i = 1; i < numberOfRows.size() + 1; i++) {
                if (driver.findElement(By.xpath("//table[@id='filtertable']/tbody/tr[" + i + "]/td[2]")).getText().equals("Priyabrat ")) {
                    driver.findElement(By.xpath("//table[@id='filtertable']/tbody/tr[" + i + "]/td[7]/descendant::a")).click();
                    break;
                }
            }
        }
    }

    public void deleteAdminDetails(String adminName) {
        if (Objects.equals(params.getBrowserType(), "Chrome")) {
            WebDriver driver = new DriverManager().getWebDriver();
            List<WebElement> numberOfRows = driver.findElements(By.xpath("//table[@id='filtertable']/tbody/tr"));
            List<WebElement> numberOfColumns = driver.findElements(By.xpath("//table[@id='filtertable']/tbody/tr[1]/td"));
            for (int i = 1; i < numberOfRows.size() + 1; i++) {
                if (driver.findElement(By.xpath("//table[@id='filtertable']/tbody/tr[" + i + "]/td[2]")).getText().equals("litan")) {
                    driver.findElement(By.xpath("//table[@id='filtertable']/tbody/tr[" + i + "]/td[7]/descendant::a[2]")).click();
                    driver.switchTo().alert().accept();
                    break;
                }
            }
        } else {
            WebDriver driver = new DriverManager().getWebDriver();
            List<WebElement> numberOfRows = driver.findElements(By.xpath("//table[@id='filtertable']/tbody/tr"));
            List<WebElement> numberOfColumns = driver.findElements(By.xpath("//table[@id='filtertable']/tbody/tr[1]/td"));
            for (int i = 1; i < numberOfRows.size() + 1; i++) {
                if (driver.findElement(By.xpath("//table[@id='filtertable']/tbody/tr[" + i + "]/td[2]")).getText().equals("litan ")) {
                    driver.findElement(By.xpath("//table[@id='filtertable']/tbody/tr[" + i + "]/td[7]/descendant::a[2]")).click();
                    driver.switchTo().alert().accept();
                    break;
                }
            }
        }
    }

    public void checkExitingAdmin(String adminName) {
        WebDriver driver = new DriverManager().getWebDriver();
        List<WebElement> numberOfRows = driver.findElements(By.xpath("//table[@id='filtertable']/tbody/tr"));
        List<WebElement> numberOfColumns = driver.findElements(By.xpath("//table[@id='filtertable']/tbody/tr[1]/td"));
        for (int i = 1; i < numberOfRows.size() + 1; i++) {
            if (driver.findElement(By.xpath("//table[@id='filtertable']/tbody/tr[" + i + "]/td[2]")).getText().equals(adminName)) {
                driver.findElement(By.xpath("//table[@id='filtertable']/tbody/tr[" + i + "]/td[7]/descendant::a[2]")).click();
                driver.switchTo().alert().accept();
                break;
            }
        }
    }

    public void enterReferralCode(String referCode) {
        clear(referralCode);
        sendKeys(referralCode, referCode);
    }

    public void verifyExitingUser(String admin) {
        if (isUserExist(admin)) {
            deleteAdminDetails(admin);
        }
    }

    public void userCheckToEdit() throws Exception {
        if (Objects.equals(params.getBrowserType(), "Chrome")) {
            if (isUserExist("litan")) {
                WebDriver driver = new DriverManager().getWebDriver();
                List<WebElement> numberOfRows = driver.findElements(By.xpath("//table[@id='filtertable']/tbody/tr"));
                List<WebElement> numberOfColumns = driver.findElements(By.xpath("//table[@id='filtertable']/tbody/tr[1]/td"));
                for (int i = 1; i < numberOfRows.size() + 1; i++) {
                    if (driver.findElement(By.xpath("//table[@id='filtertable']/tbody/tr[" + i + "]/td[2]")).getText().equals("litan")) {
                        driver.findElement(By.xpath("//table[@id='filtertable']/tbody/tr[" + i + "]/td[7]/descendant::a[2]")).click();
                        driver.switchTo().alert().accept();
                        break;
                    }
                }
            }
            if (isUserExist("Priyabrat")) {
                WebDriver driver = new DriverManager().getWebDriver();
                List<WebElement> numberOfRows = driver.findElements(By.xpath("//table[@id='filtertable']/tbody/tr"));
                List<WebElement> numberOfColumns = driver.findElements(By.xpath("//table[@id='filtertable']/tbody/tr[1]/td"));
                for (int i = 1; i < numberOfRows.size() + 1; i++) {
                    if (driver.findElement(By.xpath("//table[@id='filtertable']/tbody/tr[" + i + "]/td[2]")).getText().equals("Priyabrat")) {
                        driver.findElement(By.xpath("//table[@id='filtertable']/tbody/tr[" + i + "]/td[7]/descendant::a")).click();
                        break;
                    }
                }
            } else {
                clickLinkText("Create New");
                selectRole();
                enterUserName("Priyabrat@1234");
                enterFirstName("Priyabrat");
                enterLastName("Behera");
                enterContact("9014537342");
                enterPassword("Value*12");
                clickOnSubmit();
            }

        } else {
            if (isUserExist("litan ")) {
                WebDriver driver = new DriverManager().getWebDriver();
                List<WebElement> numberOfRows = driver.findElements(By.xpath("//table[@id='filtertable']/tbody/tr"));
                List<WebElement> numberOfColumns = driver.findElements(By.xpath("//table[@id='filtertable']/tbody/tr[1]/td"));
                for (int i = 1; i < numberOfRows.size() + 1; i++) {
                    if (driver.findElement(By.xpath("//table[@id='filtertable']/tbody/tr[" + i + "]/td[2]")).getText().equals("litan ")) {
                        driver.findElement(By.xpath("//table[@id='filtertable']/tbody/tr[" + i + "]/td[7]/descendant::a[2]")).click();
                        driver.switchTo().alert().accept();
                        break;
                    }
                }
            }
            if (isUserExist("Priyabrat ")) {
                WebDriver driver = new DriverManager().getWebDriver();
                List<WebElement> numberOfRows = driver.findElements(By.xpath("//table[@id='filtertable']/tbody/tr"));
                List<WebElement> numberOfColumns = driver.findElements(By.xpath("//table[@id='filtertable']/tbody/tr[1]/td"));
                for (int i = 1; i < numberOfRows.size() + 1; i++) {
                    if (driver.findElement(By.xpath("//table[@id='filtertable']/tbody/tr[" + i + "]/td[2]")).getText().equals("Priyabrat ")) {
                        driver.findElement(By.xpath("//table[@id='filtertable']/tbody/tr[" + i + "]/td[7]/descendant::a")).click();
                        break;
                    }
                }
            } else {
                clickLinkText("Create New");
                selectRole();
                enterUserName("Priyabrat@1234");
                enterFirstName("Priyabrat");
                enterLastName("Behera");
                enterContact("9014537342");
                enterPassword("Value*12");
                clickOnSubmit();
            }
        }

    }

}


