package com.qa.runners;

import com.qa.utils.DriverManager;
import com.qa.utils.GlobalParams;
import com.qa.utils.ReportUpdater;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.apache.logging.log4j.ThreadContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import java.util.Random;

/**
 * An example of using TestNG when the test class does not inherit from
 * AbstractTestNGCucumberTests but still executes each scenario as a separate
 * TestNG test.
 */
@CucumberOptions(
        plugin = {"pretty",
                "html:target/Failed_Web/cucumber",
                "summary",
                "me.jvt.cucumber.report.PrettyReports:target/Failed_Web/cucumber-html-reports",
                "rerun:target/failedrerun.txt"
        }
//        ,dryRun = true
        , monochrome = true
//        , tags = "@Regression"
        , glue = {"com.qa.adminstepdef","com.qa.stepdef","com.qa.floatrstepdef"}
        , features = {"@target/failedrerun.txt"}
)
public class FailedRunTest extends AbstractTestNGCucumberTests {

        private String cucumberTags;
        GlobalParams params = new GlobalParams();

        @Parameters({"platformName", "deviceName", "mobileNumber", "browserType", "environment"})
        @BeforeMethod(alwaysRun = true)
        public void setUpClass(String platformName, String deviceName, String mobileNumber, String browserType, String environmentType) throws Exception {

                Class<?> clazz = getClass();
                CucumberOptions cucumberOptions = clazz.getAnnotation(CucumberOptions.class);
                cucumberTags = cucumberOptions.tags();
                String[] arr = new ReportUpdater().moduleNameUpdater(cucumberTags);
                ThreadContext.put("ROUTINGKEY", browserType + "_" + "Browser");

                Random rand = new Random();
                params.setPlatformName(platformName);
                params.setDeviceName(deviceName);
                params.setMobileNumber(mobileNumber);
                params.setBrowserType(browserType);
                params.setEnvironment(environmentType);
                params.setRandomNumber(String.valueOf(rand.nextInt(2000)));

        }

        @Override
        @DataProvider(parallel = true)
        public Object[][] scenarios() {
                return super.scenarios();
        }

        @AfterMethod(alwaysRun = true)
        public void tearDownClass() {
//        else{
//            DriverManager driver=new DriverManager();
//            driver.getWebDriver().quit();
//        }
                DriverManager driverManager = new DriverManager();

                if (driverManager.getWebDriver() != null) {
                        driverManager.getWebDriver().quit();
                        driverManager.setWebDriver(null);
                }


        }
//        if (testNGCucumberRunner != null) {
//            getRunner().finish();
//            testNGCucumberRunner.finish();
//        }

}
