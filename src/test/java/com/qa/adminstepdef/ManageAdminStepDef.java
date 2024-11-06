package com.qa.adminstepdef;

import com.google.gson.Gson;
import com.qa.adminpages.ManageAdminPage;
import com.qa.adminpages.MutualFundPage;
import com.qa.adminpages.WebBasePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;

import java.io.FileReader;
import java.util.List;
import java.util.Map;

//public class ManageAdminStepDef extends TestContext{
public class ManageAdminStepDef{
    Map<String, Map<String, String>> users;

    public ManageAdminStepDef() {
        // Load fixture data (JSON) into the users map

        try {
            FileReader reader = new FileReader("src/test/resources/fixtures/users.json");
            Gson gson = new Gson();
            users = gson.fromJson(reader, Map.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String resolveFixture(String value) {
        if (value.startsWith("fixture:")) {
            String key = value.split(":")[1];
            return users.get(key).get("username");  // This will extract "username" or "password"
        }
        return value;
    }




    WebBasePage basePage = new WebBasePage();
    ManageAdminPage manageAdminPage = new ManageAdminPage();
    MutualFundPage mutualFundPage = new MutualFundPage();
//    TestContext testContext = new TestContext();

    @And("user is in {string} page")
    public void userIsInPage(String pageTitle) throws InterruptedException {
        manageAdminPage.isDisplayPageTitle(pageTitle);
    }

    @Given("Admin Clicks on User Kyc Module")
    public void adminClicksOnUserKycModule() throws InterruptedException {
        manageAdminPage.Click_Users();
        manageAdminPage.Click_KYC();
    }

    @And("user verify bellow table data")
    public void userVerifyBellowTableData(DataTable dataTable) throws InterruptedException {
//        manageAdminPage.printTableHeaders(dataTable);
        manageAdminPage.compareData(dataTable);
    }

    @Given("user go to page")
    public void userGoToPage() {
        mutualFundPage.dataStore.put("Name", "Priyabrat");
    }

    @And("user get map")
    public void userGetMap() {
//        System.out.println(mutualFundPage.dataStore.get("Name"));
    }

    @And("I store the data")
    public void iStoreTheData() {
        List<WebElement> column = manageAdminPage.getWebTabCols();
        List<String> obj = manageAdminPage.getData();
        for (int c = 1; c <= new WebBasePage().getRows(manageAdminPage.getWebtable()).size(); c++) {
            if (c == 1) {
                for (int i = 0; i < column.size(); i++) {
//                    testContext.datastore.put(column.get(i).getText(), obj.get(i));
                }
                break;
            }
        }
    }




    @And("user click Fixture:manas")
    public void userClickFixtureManas() {
    }

    @And("I retrieve data")
    public void iRetrieveData() {
//        String firstName = testContext.datastore.get("First Name");
//        String age = testContext.datastore.get("Age");
//        String lastName = testContext.datastore.get("Last Name");
//        String email = testContext.datastore.get("Email");
//        String salary = testContext.datastore.get("Salary");
//        String department = testContext.datastore.get("Department");

//        System.out.println(firstName);
//        System.out.println(lastName);
//        System.out.println(age);
//        System.out.println(email);
//        System.out.println(salary);
//        System.out.println(department);


    }

    @Given("user enters fixture:username for username and fixture:password for password")
    public void userEntersFixtureUsernameForUsernameAndFixturePasswordForPassword() {
        resolveFixture("jbji");
    }

    @And("user get front size")
    public void userGetFrontSize() throws InterruptedException {
//        System.out.println(manageAdminPage.getFrontSize());
    }
}
