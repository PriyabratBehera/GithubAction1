package com.qa.runners;

import com.qa.pages.BasePage;
import com.qa.pages.LoginPage;
import com.qa.utils.*;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import org.apache.logging.log4j.ThreadContext;
import org.testng.annotations.*;

import java.util.Objects;
import java.util.Random;

public class RunnerBase {

    private static final ThreadLocal<TestNGCucumberRunner> testNGCucumberRunner = new ThreadLocal<>();

    public static void initializeRunner() {
        if (testNGCucumberRunner.get() == null) {
            testNGCucumberRunner.set(new TestNGCucumberRunner(RunnerBase.class));
        }
    }

    public static TestNGCucumberRunner getRunner() {
        if (testNGCucumberRunner.get() == null) {
            initializeRunner();  // Ensure runner is initialized
        }
        return testNGCucumberRunner.get();
        // return testNGCucumberRunner.get();
    }

    private static void setRunner(TestNGCucumberRunner testNGCucumberRunner1) {
        testNGCucumberRunner.set(testNGCucumberRunner1);
    }

    private String cucumberTags;

    GlobalParams params = new GlobalParams();

    @Parameters({"platformName", "udid", "deviceName", "mobileNumber", "environment"})
    @BeforeClass(alwaysRun = true)
    public void setUpClass( @Optional("Android") String platformName, @Optional("emulator-5554")String udid, @Optional("Pixel_5_API_34")String deviceName, @Optional("9900123123")String mobileNumber, @Optional("TEST")String environmentType) throws Exception {
//    public void setUpClass(String platformName, String udid, String deviceName, String mobileNumber, String environmentType) throws Exception {
//        XmlTest currentXmlTest = context.getCurrentXmlTest();
//        CucumberPropertiesProvider properties = currentXmlTest::getParameter;

        Class<?> clazz = getClass();
        CucumberOptions cucumberOptions = clazz.getAnnotation(CucumberOptions.class);
        cucumberTags = cucumberOptions.tags();
        String[] arr = new ReportUpdater().moduleNameUpdater(cucumberTags);
        ThreadContext.put("ROUTINGKEY", platformName + "_" + deviceName);
        Random rand = new Random();
        params.setPlatformName(platformName);
        if(Objects.equals(System.getProperty("BitbucketBranch"), "master") && (Objects.equals(params.getPlatformName(), "iOS"))) {
            udid = "6C778C1A-23AE-48A1-AD8A-1F0E91A65346";
        }else if (Objects.equals(System.getProperty("BitbucketBranch"), "master") && (Objects.equals(params.getPlatformName(), "Android"))) {
            udid = "emulator-5554";
        }
        if(Objects.equals(System.getProperty("BitbucketBranch"), "release") && (Objects.equals(params.getPlatformName(), "iOS"))) {
            udid = "D26B628B-9BB8-4D50-BB9B-AB5AB784C4EA";
        }else if (Objects.equals(System.getProperty("BitbucketBranch"), "release") && (Objects.equals(params.getPlatformName(), "Android"))) {
            udid = "emulator-5554";
        }
        params.setUDID(udid);
        System.out.println("udid is : " + udid);
        params.setDeviceName(deviceName);
        params.setMobileNumber(mobileNumber);
        params.setEnvironment(environmentType);
        params.setRandomNumber(String.valueOf(rand.nextInt(2000)));
//        params.setRandomNumber(String.valueOf(232));
        if (Objects.equals(params.getPlatformName(), "Android")) {
            new DeviceManager().openEmulator();
        }
        new DeviceManager().cucumberReportingPropertiesUpdater(arr[0], arr[1]);
        new DeviceManager().extentPropertiesUpdater();
        new ServerManager().startServer();
        new DriverManager().initializeDriver();
        if (Objects.equals(params.getPlatformName(), "iOS")) {
            Thread.sleep(5000);
        }
        new LoginPage().login("", "");
        setRunner(new TestNGCucumberRunner(this.getClass()));

    }

    @Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
    public void scenario(PickleWrapper pickle, FeatureWrapper cucumberFeature) {
        getRunner().runScenario(pickle.getPickle());
    }

    @DataProvider
    public Object[][] scenarios() {
        TestNGCucumberRunner runner = getRunner();
        if (runner == null) {
            throw new NullPointerException("TestNGCucumberRunner not initialized");
        }
        return runner.provideScenarios();
        // return getRunner().provideScenarios();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        new BasePage().removeApp();
        DriverManager driverManager = new DriverManager();
        if (driverManager.getDriver() != null) {
            driverManager.getDriver().quit();
            driverManager.setDriver(null);
        }
        ServerManager serverManager = new ServerManager();
        if (serverManager.getServer() != null) {
            serverManager.getServer().stop();
        }

        if (testNGCucumberRunner != null) {
            getRunner().finish();
        }
//        if (Objects.equals(params.getPlatformName(), "iOS")) {
//            new DeviceManager().closeSimulator();
//        }
//        if (Objects.equals(params.getPlatformName(), "Android")) {
//            new DeviceManager().closeEmulator();
//        }
    }

}
