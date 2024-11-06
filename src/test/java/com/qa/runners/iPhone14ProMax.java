package com.qa.runners;
import io.cucumber.testng.CucumberOptions;

/**
 * An example of using TestNG when the test class does not inherit from
 * AbstractTestNGCucumberTests but still executes each scenario as a separate
 * TestNG test.
 */
@CucumberOptions(
        plugin = {"pretty",
                "html:target/iPhone14ProMax/cucumber",
                "summary",
                "me.jvt.cucumber.report.PrettyReports:target/iPhone14ProMax/cucumber-html-reports",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }
//        ,dryRun = true
        , monochrome = true
        , tags = "@KYCRegression"
        , glue = {"com.qa.stepdef"}
        , features = {"src/test/resources/features"}
)
public class iPhone14ProMax extends RunnerBase {

}

