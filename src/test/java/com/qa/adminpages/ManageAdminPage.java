package com.qa.adminpages;

import com.qa.utils.DriverManager;
import com.qa.utils.TestUtils;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.IOException;
import java.util.*;

public class ManageAdminPage extends WebBasePage {
    WebBasePage basePage = new WebBasePage();
    TestUtils utils = new TestUtils();
    @FindBy(xpath = "//a[@id='transaction_history']")
    private WebElement amcs;
    @FindBy(xpath = "//img[@id='logofile']")
    private WebElement fileUpload;
    @FindBy(xpath = "//a[contains(span, 'Users')]")
    private WebElement User;
    @FindBy(id = "kycmodule")
    private WebElement User_KYC;

    @FindBy(xpath = "//table[@class='table table-striped mt-3']/descendant::tr")
    private List<WebElement> rows;
    @FindBy(xpath = "//table[@class='table table-striped mt-3']/descendant::tr/th")
    private List<WebElement> cols;
    @FindBy(xpath = "//table[@class='table table-striped mt-3']")
    private WebElement tableData;

    @FindBy(xpath = "//tbody/tr")
    private List<WebElement> wenTab;



    public void isDisplayPageTitle(String PgTitle) throws InterruptedException {
        Assert.assertEquals(PgTitle, basePage.getPageTitle());
    }

    public void clickAmcs() {
        click(amcs);
    }

    public void fileUpload() throws IOException, InterruptedException {
        click(fileUpload);
        Thread.sleep(3000);
        Runtime.getRuntime().exec("/Users/litanbehera/Downloads/amclogo.png");
    }

    public void Click_Users() throws InterruptedException {
        Thread.sleep(8000);
        click(User);
    }

    public void Click_KYC() {
        click(User_KYC);
    }

    public List<Object> compareData(DataTable dataTable) throws InterruptedException {
        Thread.sleep(5000);
//        new DriverManager().getWebDriver().findElement(By.xpath("(//span[text()='Users'])[1]")).click();
//        Thread.sleep(3000);
//        new DriverManager().getWebDriver().findElement(By.xpath("(//span[text()='Users'])[2]")).click();
//        Thread.sleep(3000);
        WebElement tableBody = new DriverManager().getWebDriver().findElement(By.xpath("//table"));
        List<String> headersList = new ArrayList<>();
        List<Map<String, String>> userMap = dataTable.asMaps(String.class, String.class);
        List<Object> l = new ArrayList<>();
        for (int rowIndex = 0; rowIndex < userMap.size(); rowIndex++) {
            headersList.addAll(userMap.get(rowIndex).keySet());
        }
        for (int rowIndex = 0; rowIndex < userMap.size(); rowIndex++) {
            WebElement row = getRows(tableBody).get(rowIndex + 1);
            List<WebElement> cells = row.findElements(By.tagName("td"));
            int u = 0;
            for (int i = 0; i < getColumn(tableBody).size(); i++) {
                if (!getColumn(tableBody).get(i).getText().isEmpty()) {
                    String ce = cells.get(i).getText();
                    String hd = userMap.get(rowIndex).get(headersList.get(u));
                    l.add(hd);
                    if (ce.isEmpty()) {
                        ce = null;
                    }
                    Assert.assertEquals(ce, hd);
                    u++;

                }
            }
        }
        return l;
    }
    public WebElement getWebtable(){
        WebElement tableBody = new DriverManager().getWebDriver().findElement(By.xpath("//table"));
        return tableBody;
    }
    public List<WebElement> getWebTabCols(){
        WebElement tableBody = new DriverManager().getWebDriver().findElement(By.xpath("//table"));
        List<WebElement> el=getColumn(tableBody);
        return el;
    }
    public List<String> getData() {
        List<String> list = new ArrayList<>();
        WebElement tableBody = new DriverManager().getWebDriver().findElement(By.xpath("//table"));
        for (int rowIndex = 0; rowIndex < getRows(tableBody).size(); rowIndex++) {
            WebElement row;
            if(rowIndex==(getRows(tableBody).size()-1)){
                row = getRows(tableBody).get(rowIndex);
            }
            else{
                row = getRows(tableBody).get(rowIndex + 1);
            }
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (int i = 0; i < getColumn(tableBody).size(); i++) {
                if (!getColumn(tableBody).get(i).getText().isEmpty()) {
                    String ce = cells.get(i).getText();
                    if (! ce.isEmpty()) {
                        list.add(ce);
                    }
                }
            }
        }
        return list;
    }
    public void getSize(){
        System.out.println(wenTab.size());
    }

}








