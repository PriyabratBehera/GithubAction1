package com.qa.runners;
import io.cucumber.testng.CucumberOptions;

/**
 * An example of using TestNG when the test class does not inherit from
 * AbstractTestNGCucumberTests but still executes each scenario as a separate
 * TestNG test.
 */
@CucumberOptions(
        plugin = {"pretty",
                "html:target/Pixel5/cucumber",
                "summary",
                "me.jvt.cucumber.report.PrettyReports:target/Pixel5/cucumber-html-reports",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        }
//        ,dryRun = true
        , monochrome = true
        , tags = "@MutualFundRegression"
        , glue = {"com.qa.stepdef"}
        , features = {"src/test/resources/features"}
)
public class Pixel5TestNGRunnerTest extends RunnerBase {

}